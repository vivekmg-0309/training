"use strict";
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(code, name) {
        var _this = this;
        this.display = function () { console.log(_this.empCode + '' + _this.empName); };
        this.empName = name;
        this.empCode = code;
    }
    return Employee;
}());
exports.Employee = Employee;
var emp = new Employee(1, 'Ram');
emp.display();
