// https://codingbat.com/prob/p199720

// Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' 
// and include the second only if it is 'z', so "ozymandias" yields "oz".


// startOz("ozymandias") → "oz"
// startOz("bzoo") → "z"
// startOz("oxx") → "o"

public String startOz(String str) {
    String strOut = "";
    if (str.length()<1){
        return strOut;
    }
    else{
        if (str.startsWith("o")){
            strOut = strOut + str.charAt(0);
        }
        if (str.startsWith("z", 1)){
            strOut = strOut + str.charAt(1);
        }
    }
    return strOut;
}
