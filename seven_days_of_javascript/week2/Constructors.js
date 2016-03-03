/*
Create a constructor function that satisfies the following conditions:

The name of the constructor function should be Car.
It should take three parameters: name, mileage and max_speed.
Store these parameter values in their respective this keywords:
this.name, this.mileage and this.max_speed.
*/
var Car = function(name, mileage, max_speed) {
    this.name = name;
    this.mileage = mileage;
    this.max_speed = max_speed;
}
