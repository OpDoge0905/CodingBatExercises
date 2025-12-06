// https://codingbat.com/prob/p172267

// Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


// firstHalf("WooHoo") → "Woo"
// firstHalf("HelloThere") → "Hello"
// firstHalf("abcdef") → "abc"

public String firstHalf(String str) {
    if(str.length()%2 == 1){
        return str;
    }
    else{
        return str.substring(0, str.length()/2);
    }
}
