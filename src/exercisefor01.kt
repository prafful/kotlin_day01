/*
use for loop to find the sum of numbers from 1 to n
 */

fun main() {
    //var n = 10
    //1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
    //if n = 5
    //1 + 2 + 3 + 4 + 5
    //if n = 100
    //1 + 2 + 3 + 4 + 5 +..... + 95 + 96 + 97 + 98 + 99 + 100
    var n = 10
    var sum = 0
    for (i in 1 .. n){
        sum += i //sum = sum + i (1 = 0 + 1) (3 = 1 + 2) (6 = 3 + 3) (10 = 6 + 4)
    }



}