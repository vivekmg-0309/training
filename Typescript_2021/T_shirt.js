var Tshirt = /** @class */ (function () {
    function Tshirt(i, n, s) {
        this.color = "blue";
        this.material = "Rayon";
        this.design = "VShaped";
        this.color = i;
        this.material = n;
        this.design = s;
    }
    Tshirt.prototype.display = function () {
        console.log(this.color);
        console.log(this.material);
        console.log(this.design);
    };
    return Tshirt;
}());
var small = new Tshirt("Red", "Polyster", "Round");
small.display();
var large = new Tshirt("Pink", "Poly", "V Shaped");
large.display();
var xs = new Tshirt("Brown", "Nylon", "Sleeves");
xs.display();
