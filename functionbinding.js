let name={
    firstname:"Vaishnavi",
    lastname:"Subramaniam"
}
console.log(name.firstname);
console.log(name.lastname);
let FullName=function(age){ 
    console.log(this.firstname+" "+this.lastname+" "+age);
}
FullName.call(name,20);
FullName.apply(name,[20]);
let name1={
    firstname:"Aishh",
    lastname:"rajesh"
}
FullName.call(name1,20);
FullName.apply(name1,[20]);
let printFullName=FullName.bind(name1,20);
console.log(printFullName);
printFullName(20);

