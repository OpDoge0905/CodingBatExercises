// https://codingbat.com/prob/p123384

// Given a string, return a new string where the first and last chars have been exchanged.

// frontBack("code") → "eodc"
// frontBack("a") → "a"
// frontBack("ab") → "ba"

public String frontBack(String str) {
    if(str.length()<=1){
        return str;
    }
    else{
    char charFront = str.charAt(0);
    char charEnd = str.charAt(str.length()-1);
    return charEnd + str.substring(1, str.length()-1) + charFront;
    }
}
