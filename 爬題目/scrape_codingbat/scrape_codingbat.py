import requests
from bs4 import BeautifulSoup
import os
import re

BASE_URL = "https://codingbat.com"

def get_warmup2_problems():
    """抓 Warmup-2 首頁所有題目名稱與連結"""
    url = BASE_URL + "/java/Warmup-2"
    resp = requests.get(url)
    resp.raise_for_status()
    soup = BeautifulSoup(resp.text, 'html.parser')
    problems = []
    for a in soup.select("a[href^='/prob/p']"):
        name = a.text.strip()
        href = a['href']
        problems.append((name, BASE_URL + href))
    return problems

def get_problem_statement(url):
    """抓題目敘述文字"""
    resp = requests.get(url)
    resp.raise_for_status()
    soup = BeautifulSoup(resp.text, 'html.parser')
    prob_div = soup.find("div", class_="prob")
    if prob_div:
        text = prob_div.get_text("\n").strip()
    else:
        # fallback: 全頁文字
        text = soup.get_text("\n").strip()
    # 清理多餘空白
    text = re.sub(r'\n\s*\n', '\n', text)
    return text

def to_java_stub(name, statement):
    """生成 Java class stub"""
    # 轉成合法 Java class 名稱
    class_name = re.sub(r'[^0-9A-Za-z_]', '_', name)
    content = f"""/**\n * Problem: {name}\n *\n * {statement.replace(chr(10), '\\n * ')}\n */\npublic class {class_name} {{\n    // TODO: 實作此題\n}}\n"""
    return class_name, content

def save_to_folder(class_name, content, folder_path):
    """存成 [class_name].java"""
    os.makedirs(folder_path, exist_ok=True)
    path = os.path.join(folder_path, f"{class_name}.java")
    with open(path, 'w', encoding='utf-8') as f:
        f.write(content)
    print(f"Saved: {path}")

def main():
    # 使用者指定資料夾
    folder_path = input("請輸入存檔資料夾路徑，例如 D:/CodingBat/Warmup2: ").strip()
    problems = get_warmup2_problems()
    print(f"找到 {len(problems)} 題 Warmup-2 題目")
    for name, url in problems:
        print("抓取題目:", name)
        stmt = get_problem_statement(url)
        class_name, code = to_java_stub(name, stmt)
        save_to_folder(class_name, code, folder_path)

if __name__ == "__main__":
    main()
