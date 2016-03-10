/*
Your task is to fill in the blank (_______________________) spaces. 
The multiplier function takes a single parameter, x, and returns an anonymous function
that takes a single parameter, y, and returns the product of x and y (i.e.: x×y).
*/
function multiplier(x) {
  return function(y) {
      return x*y;
  };
}
