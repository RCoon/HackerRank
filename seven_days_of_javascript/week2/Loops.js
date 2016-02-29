/*
Task
You are given a string s, consisting of lowercase letters [a-z]. 
Print all the vowels together followed by all the consonants, in the order 
that they appear in the string.

The code for handling the input is given. You have to complete the function
vowelsAndConsonants.
*/
function vowelsAndConsonants(s) {

    var arr = s.toLowerCase().split('');
    var vowels = ['a', 'e', 'i', 'o', 'u'];
    
    for (char of arr) {
        if (vowels.indexOf(char) >= 0) {
            console.log(char);
        }
    }
    for (char of arr) {
        if (vowels.indexOf(char) < 0) {
            console.log(char);
        }
    }
}