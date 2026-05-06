let exmp={
  "name": "Apple MacBook Pro 16",
  "data": {
    "year": 2019,
    "price": 1849.99,
    "CPU model": "Intel Core i9",
    "Hard disk size": "1 TB",
    "color":"silver"
  }
};
async function test(){
    const data=await fetch("https://api.restful-api.dev/objects/ff8081819d82fab6019df24fdba47d7e",{method:'DELETE'});
     let txt=await data.json();
    console.log(txt);
}
test();