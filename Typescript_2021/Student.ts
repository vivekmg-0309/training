export class Student {
    stdId:number= 21259;
    stdName:string="vivek";
    stdMarks:number = 75
    constructor (i:number, n:string, s:number){
        this.stdId = i;
        this.stdName= n;
        this.stdMarks = s;
    }
    display(){
        console.log(this.stdId);
        console.log(this.stdName);
        console.log(this.stdMarks);
    }
}

var e1 = new Student(21250, "bolu",66);
e1.display();