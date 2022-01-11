import { Car } from "./Car";



class Truck extends Car{

    weight:Number;
    regularPrice: number;
    speed: number;
    color: string;

    getSalePrice(): void {

        if(this.weight >2000){

            var prc = this.regularPrice - (this.regularPrice*.1);

            console.log(prc);

        }

        else{

            var prc = this.regularPrice - (this.regularPrice*.2);

            console.log(prc);

        }

    }

}



var t1 = new Truck();

t1.weight=2001;

t1.regularPrice=2000;

t1.speed = 100;

t1.color= "Red";

t1.getSalePrice();