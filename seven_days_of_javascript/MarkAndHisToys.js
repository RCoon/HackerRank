/*
Mark and Jane are very happy after having their first kid, and Mark wants to buy some
toys for him. There are NN different toys, tagged with their prices, but he has only
$K. He wants to buy the maximum number of toys for his son.

You are Mark's best friend and have to help him buy as many toys as possible.

Input Format:
The first line contains two integers, N and K separated by a space. 
The next line contains N space separated integers indicating the price of each toy.

Output Format:
Output an integer that denotes the maximum number of toys Mark can buy with $K.

Constraints:
1 <= N <= 10^5 
1 <= K <= 10^9 
1 <= price of any toy <= 10^9 
A toy can't be bought multiple times.

Sample Input:
7 50
1 12 5 111 200 1000 10

Sample Output:
4
*/
function processData(input) {
    var rows = input.split('\n');
    var totalMoney = rows[0].split(' ').map(Number)[1];
    var priceArray = rows[1].split(' ').map(Number);
    priceArray = priceArray.sort(function(a, b) { return a-b});
    
    var i = 0;
    while (totalMoney >= 0) {
        totalMoney -= priceArray[i];
        i++;
    }
    console.log(i - 1);
}