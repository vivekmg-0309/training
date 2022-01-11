"use strict";
exports.__esModule = true;
exports.Student = void 0;
var Student = /** @class */ (function () {
    function Student(i, n, s) {
        this.stdId = 21259;
        this.stdName = "vivek";
        this.stdMarks = 75;
        this.stdId = i;
        this.stdName = n;
        this.stdMarks = s;
    }
    Student.prototype.display = function () {
        console.log(this.stdId);
        console.log(this.stdName);
        console.log(this.stdMarks);
    };
    return Student;
}());
exports.Student = Student;
var e1 = new Student(21250, "bolu", 66);
e1.display();
