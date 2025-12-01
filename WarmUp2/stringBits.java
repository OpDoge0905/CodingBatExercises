// https://codingbat.com/prob/p165666

// Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

// stringBits("Hello") → "Hlo"
// stringBits("Hi") → "H"
// stringBits("Heeololeo") → "Hello"

public String stringBits(String str) {
    String finalStr = "";
    if(str.length() == 0){
        return "";
    }
    else if(str.length()<3){
        return str.substring(0, 1);
    }
    else{
        for(int i=0; i<str.length(); i+=2){
            finalStr += str.substring(i, i+1);
        }
    }
    return finalStr;
}
