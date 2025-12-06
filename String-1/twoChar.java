// https://codingbat.com/prob/p144623

// Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define 
// a string length 2, use the first 2 chars. The string length will be at least 2.


// twoChar("java", 0) → "ja"
// twoChar("java", 2) → "va"
// twoChar("java", 3) → "ja"

public String twoChar(String str, int index) {
    if(index < 0 || str.length()-2 < index){
        return str.substring(0, 2);
    }
    else{
        return str.substring(index, index+2);
    }
}
