function getArray12<T>(items : T[] : t[]){
    return new Array<T>().concat(items);
}

let myNumArr12 = getArray12<number>([100,200,300]);
let myStrArr12 = getArray12<string>(["hello","world"]);

myNumArr12.push(400);
myStrArr12.push("hello typesxript");

myNumArr.push("hi");
myStrArr.push(400);

console.log(myStrArr12);
console.log(myStrArr12);