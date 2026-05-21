let n = 10;
n += 5;
n *= 2;
console.log(n);

const obj = { name: "Aman", address: { city: "Delhi" } };
console.log(obj.address?.city);
console.log(obj.contact?.phone);
const user = {
    dog: {
        name: "Alex"
    }
};

console.log(user.cat?.name); //undefined
console.log(user.dog?.name); //Alex
