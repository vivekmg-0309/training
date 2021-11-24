select 
count (deptno) as 'tot dept '
from emp

select job,
count(ename) as 'no of persons'
from emp 
group by job;


select deptno,
min(avg(sal)) as 'minsal'
from emp
group by deptno;