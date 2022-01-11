export class Employee {
    empId:number= 21259;
    empName:string="vivek";
    empSal:number = 24777
    constructor (i:number, n:string, s:number){
        this.empId = i;
        this.empName= n;
        this.empSal = s;
    }
    display(){
        console.log(this.empId);
        console.log(this.empName);
        console.log(this.empSal);
    }
}

var e1 = new Employee(21250, "ananth",12444);
e1.display();