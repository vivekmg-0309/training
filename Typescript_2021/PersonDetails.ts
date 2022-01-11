import { PersonInterface } from "./PersonInterface";
class PersonDetail implements PersonInterface{
    
    first:string;
    last:string;

    getFullName():string{
        return this.first + this.last;
    }
}

var p1 = new PersonDetail();
p1.first = "vivek"
p1.last = "dolu"
console.log(p1,getFullName());
function getFullName(): any {
    throw new Error("Function not implemented.");
}

