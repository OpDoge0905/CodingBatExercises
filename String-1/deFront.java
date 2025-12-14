// https://codingbat.com/prob/p110141

// Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
// The string may be any length. Harder than it looks.


// deFront("Hello") → "llo"
// deFront("java") → "va"
// deFront("away") → "aay"

public String deFront(String str) {    
    String finalStr ="";
    if(str.length()>=2){
        if(str.substring(0, 1).equals("a")){  
            finalStr += "a";
        }
        if(str.substring(1, 2).equals("b")){  
            finalStr += "b";
        }
        finalStr += str.substring(2, str.length());
        return finalStr;
    }
    else{
        return str;
    }
}
