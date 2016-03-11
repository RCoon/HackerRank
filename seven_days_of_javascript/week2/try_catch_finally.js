/*
You are given a variable my_string. 
You have to try reversing the string using my_string.split('').reverse().join('')
and then print the reversed string to the console. 
If the try clause has an error, print the error message to the console. 
Finally, print the typeof of variable my_string to the console.
*/
function processData(my_string) {
    try {
        my_string = my_string.split('').reverse().join('');
        console.log("Reversed string is : " + my_string);
    } catch (err) {
        console.log("Error : " + err.message);
    } finally {
        console.log("Type of my_string is : " + typeof my_string);
    }
}
