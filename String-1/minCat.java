// https://codingbat.com/prob/p105745

// Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, 
// omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.


// minCat("Hello", "Hi") → "loHi"
// minCat("Hello", "java") → "ellojava"
// minCat("java", "Hello") → "javaello"

public String minCat(String a, String b) {
    if(a.length()==0 || b.length()==0){
        return "";
    }
    else{
        int indexS = (a.length()<=b.length())? a.length(): b.length();
        if(indexS == a.length()){
            return a + b.substring(Math.abs(b.length()-indexS), b.length());
        }
        else{
            return a.substring(Math.abs(a.length()-indexS), a.length()) + b;
        }
    }
}