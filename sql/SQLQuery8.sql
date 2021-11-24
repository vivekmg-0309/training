select e.ename,e.HIREDATE,j.startdate,j.enddate
from emp e, jobhist j
where e.HIREDATE between j.startdate and j.enddate;


select e.ename,d.LOC
from emp e, dept d
where d.DEPTNO=30;

select e.ename, e.deptno,j.deptno,j.DNAME
from emp e, dept j
where e.deptno = j.deptno


select e.ename, e.deptno,j.deptno,j.LOC
from emp e, dept j
where e.deptno = j.deptno


select e.ename , c.ename
from emp e , emp c
where e.empno = c.mgr and e.HIREDATE < c.HIREDATE;

