// https://codingbat.com/prob/p151940

// Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


// withoutX("xHix") → "Hi"
// withoutX("xHi") → "Hi"
// withoutX("Hxix") → "Hxi"

public String withoutX(String str) {
    String newStr = str;
    if(str.length()>1){  
        if(newStr.charAt(0)=='x'){
            newStr = newStr.substring(1, newStr.length());
        }
        if(newStr.charAt(newStr.length()-1)=='x'){
            newStr = newStr.substring(0, newStr.length()-1);
        }
    }
    if(str.length()==1){
        if(newStr.charAt(0)=='x'){
            newStr = "";
        }
    }
    return newStr;
}
