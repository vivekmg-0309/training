function getArray(items : any[] : any[]) {
    return new Array().concat(items);
}

let myNumArr = getArray([100,200,300]);
let myStrArr = getArray(["hello","worls"]);

myNumArr.push(400);
myStrArr.push("hello TypeScript");

myNumArr.push("hi");
myStrArr.push(500);

console.log(myNumArr);
console.log(myStrArr)