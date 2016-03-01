/*
You are given a variable my_height. Your task is to throw errors under the following conditions:

notANumberError - When my_height is NaN.
hugeHeightError - When my_height is greater than 10.
tinyHeightError - When my_height is less than 4.
If none of the errors exist, print my_height.
*/
function processData(my_height) {
    try {

        if(isNaN(my_height)){
            throw new Error("notANumberError");
        } else if (my_height > 10) {
            throw new Error("hugeHeightError");
        } else if (my_height < 4) {
            throw new Error("tinyHeightError");
        }
        console.log(my_height);

    } catch (err) {
        console.log(err.message);
    }
}
