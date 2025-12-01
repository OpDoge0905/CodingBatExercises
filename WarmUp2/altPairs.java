// https://codingbat.com/prob/p121596

// Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

// altPairs("kitten") → "kien"
// altPairs("Chocolate") → "Chole"
// altPairs("CodingHorror") → "Congrr"

public String altPairs(String str) {
    String resultStr = "";
    int plusInd = 1;
    for(int i=0; i<str.length() && str.substring(i, i+1)!=""; i++){
        resultStr += str.substring(i, i+1);
        if(plusInd%2 == 0){
            i += 2;
        }
        plusInd++;
    }
    return resultStr;
}
