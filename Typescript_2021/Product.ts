class Product {
    pid:number;
    pname:string;
    price:number

    display (){
        console.log(this.pid);
        console.log(this.pname);
        console.log(this.price);

    }
}

var pr1 = new Product();
pr1.pid=123;
pr1.pname="vivek";
pr1.price=123.45;
pr1.display();