// https://codingbat.com/prob/p198640

// Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
// So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

// stringMatch("xxcaazz", "xxbaaz") → 3
// stringMatch("abc", "abc") → 2
// stringMatch("abc", "axc") → 0

public int stringMatch(String a, String b) {
    int countSame = 0;
    if(a.length() <2||b.length() <2){
        countSame = 0;
    }
    else{
        int strLength = a.length()<=b.length()? a.length(): b.length();
        for(int i=0; i<strLength-1; i++){
            if(a.substring(i, i+2).equals(b.substring(i, i+2))){
                countSame++;
            }
        }
    }
    return countSame;
}
