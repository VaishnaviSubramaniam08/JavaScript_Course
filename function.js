//  4 Basic types of Functions:
// Function declaration
// Function Expression
// Arrow Function
// Immediately invoked Function Expression


//NO input -NO output
let a=100;
let b=200;
function add(){
    let c=a+b;
    console.log(c);
}
add();

//NO input - Output
let a =100;
let b=200;
function add(){
    let c=a+b;
    return c;
}
let addition=add();
console.log(addition);

//Input - NO Output

let a=100;
let b=200;
function add(a,b){
    let c=a+b;
    console.log(c);
}
add(a,b);

//Input - Output

let a=100;
let b=200;
function add(a,b){
  let c=a+b;
  return c;
}
let addition =add(a,b);
console.log(addition);


// NEED FOR FUNCTIONS --> DRY PRINCIPLE(Donot Repeat Yourself);

//Function declaration

function add(a,b){
    let c=a+b;
    return c;
}
console.log(add(10,20));


//Function Expression
let add= function(a,b){
    let c=a+b;
    return c;
}
console.log(add(10,20));

//Arrow function
let add=(a,b)=>{
    let c=a+b;
    return c;
}
console.log(add(10,20));
let add =(a,b)=> a+b;

//Immediately Invoked Function Expression

(function(name){
    console.log("Hello "+name);
})("Vaish");


function orderFood(callback){
    console.log("Preparing food");

    callback();
}

function delivery(){
    console.log("Food delivered");
}

orderFood(delivery);