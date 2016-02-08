/* You are given a variable marks. Your task is to print: 

- AA if marks is greater than 90. 
- AB if marks is greater than 80 and less than or equal to 90. 
- BB if marks is greater than 70 and less than or equal to 80. 
- BC if marks is greater than 60 and less than or equal to 70. 
- CC if marks is greater than 50 and less than or equal to 60. 
- CD if marks is greater than 40 and less than or equal to 50. 
- DD if marks is greater than 30 and less than or equal to 40. 
- FF if marks is less than or equal to 30.

Note
Do not declare the variable marks. It is declared inside our code checker.
Use console.log for printing statements to the console.
*/

if (marks > 90) {
    console.log("AA");
} else if (marks > 80) {
    console.log("AB");
} else if (marks > 70) {
    console.log("BB");
} else if (marks > 60) {
    console.log("BC");
} else if (marks > 50) {
    console.log("CC");
} else if (marks > 40) {
    console.log("CD");
} else if (marks > 30) {
    console.log("DD");
} else {
    console.log("FF");
}