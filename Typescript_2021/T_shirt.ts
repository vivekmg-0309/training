class Tshirt{

    color:string="blue";

    material:string="Rayon";

     design:string="VShaped"

     constructor(i:string,n:string,s:string)

    {

    this.color=i;

    this.material=n;

    this.design=s;

    }

    display() {

    console.log(this.color); console.log(this.material); console.log(this.design);

    }

    }

    var small=new Tshirt("Red","Polyster","Round")

     small.display();

    var large=new Tshirt("Pink","Poly","V Shaped");

    large.display();

    var xs=new Tshirt("Brown","Nylon","Sleeves");

    xs.display();