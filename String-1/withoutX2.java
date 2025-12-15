// https://codingbat.com/prob/p151359

// Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. 
// This is a little harder than it looks.


// withoutX2("xHi") → "Hi"
// withoutX2("Hxi") → "Hi"
// withoutX2("Hi") → "Hi"

public String withoutX2(String str) {
    boolean wipeChar1 = false, 
            wipeChar2 = false;
    if(str.length()>1){  
        if(str.charAt(0)=='x'){
            wipeChar1 = true;
        }
        if(str.charAt(1)=='x'){
            wipeChar2 = true;
        }
    }
    else if(str.length()==1){
        if(str.charAt(0)=='x'){
            str = "";
        }
    }
    return wipeChar1? (wipeChar2? (str.substring(2, str.length())): (str.substring(1, str.length()))): (wipeChar2? (str.substring(0, 1)+str.substring(2, str.length())): (str));
}
