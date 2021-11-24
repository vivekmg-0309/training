select e.ename,d.dname
from emp e
join
dept d
on(e.DEPTNO = d.DEPTNO);




select e.ename,j.loc
from emp e
join dept j
on( e.deptno = j.deptno )
order by LOC



select e.ename,d.loc
from emp e
join
dept d
on( e.deptno = d.deptno )
where d.loc='chicago'





select manager.ename , employee.ename
from emp manager
join emp employee
on( manager.deptno = employee.deptno )
where manager.empno = employee.mgr and manager.HIREDATE < employee.HIREDATE;



select e.ename,e.HIREDATE,j.startdate,j.enddate
from emp e
join jobhist j
on( e.deptno = j.deptno )
where e.hiredate between j.startdate and j.enddate;



select e.ename,j.loc
from emp e
join dept j
on (e.deptno = j.deptno)
where e.deptno = j.deptno