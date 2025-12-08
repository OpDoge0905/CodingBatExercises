// https://codingbat.com/prob/p159227

// Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, 
// then return true only if both are negative.


// posNeg(1, -1, false) → true
// posNeg(-1, 1, false) → true
// posNeg(-4, -5, true) → true

public boolean posNeg(int a, int b, boolean negative) {
    return(((a<0 && b<0) && negative) || ((a<0 || b<0) && a<0 != b<0 && !negative ));
}

// 0 0
// 0 1
// 1 0
// 1 1

// and 0 0 0 1  a && b
// or 0 1 1 1   a || b
// nand 1 1 1 0 !(a && b)
// nor 1 0 0 0  !(a || b)
// xor 0 1 1 0  