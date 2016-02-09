/*
Task

You are given a variable num. Your task is to print: 

- ONE, if num is equal to 11. 
- TWO, if num is equal to 22. 
- THREE, if num is equal to 33.
- FOUR, if num is equal to 44.
- FIVE, if num is equal to 55.
- SIX, if num is equal to 66.
- SEVEN, if num is equal to 77.
- EIGHT, if num is equal to 88.
- NINE, if num is equal to 99.
- PLEASE TRY AGAIN, if num is none of the above.

Note

Do not declare the variable num. It is declared inside our code checker.
Use console.log for printing statements to the console.
*/
switch (num) {
    case 1:
        console.log("ONE");
        break;
    case 2:
        console.log("TWO");
        break;
    case 3:
        console.log("THREE");
        break;
    case 4:
        console.log("FOUR");
        break;
    case 5:
        console.log("FIVE");
        break;
    case 6:
        console.log("SIX");
        break;
    case 7:
        console.log("SEVEN");
        break;
    case 8:
        console.log("EIGHT");
        break;
    case 9:
        console.log("NINE");
        break;
    default:
        console.log("PLEASE TRY AGAIN");
}