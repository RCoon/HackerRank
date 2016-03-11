/*
Task:
Write a myFiltermyFilter function that takes 2 parameters: my_array and callback. 
Here, my_array is an array of strings and callback is a function that takes the 
elements of my_array as its parameter and returns a boolean true if the element
is even or false if the element is odd. 
The myFilter function should return the filtered array.

Sample Input:
4 5 6 7 8 9

Sample Output:
[ 4, 6, 8 ]
*/
function myFilter(my_array, callback){
    return my_array.filter(callback);
}

function processData(inputArray) {
    console.log(myFilter(inputArray, (x) => (x % 2 === 0)));   
} 