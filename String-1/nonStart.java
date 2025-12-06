// https://codingbat.com/prob/p143825

// Given 2 strings, return their concatenation(字串相加), except omit(忽略) the first char of each. 
// The strings will be at least length 1.


// nonStart("Hello", "There") → "ellohere"
// nonStart("java", "code") → "avaode"
// nonStart("shotl", "java") → "hotlava"

public String nonStart(String a, String b) {
    return a.substring(1) + b.substring(1);
}
