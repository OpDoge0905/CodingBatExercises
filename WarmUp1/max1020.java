// https://codingbat.com/prob/p177372

// Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, 
// or return 0 if neither is in that range.


// max1020(11, 19) → 19
// max1020(19, 11) → 19
// max1020(11, 9) → 11

public int max1020(int a, int b) {
    int max = a>=b ?a :b;
    int min = a<=b ?a :b;
    if(10<=max && max<=20){
        return max;
    }
    else if(10<=min && min<=20){
        return min;
    }
    else{
        return 0;
    }
}
