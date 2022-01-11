"use strict";
exports.__esModule = true;
var PersonDetail = /** @class */ (function () {
    function PersonDetail() {
    }
    PersonDetail.prototype.getFullName = function () {
        return this.first + this.last;
    };
    return PersonDetail;
}());
var p1 = new PersonDetail();
p1.first = "vivek";
p1.last = "dolu";
console.log(p1, getFullName());
function getFullName() {
    throw new Error("Function not implemented.");
}
