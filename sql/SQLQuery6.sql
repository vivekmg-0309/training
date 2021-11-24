select job,
max (SAL) as 'max sal analyst'
from emp
where job like 'analyst'
group by job;
  
  select min(sal) as 'min sal'
  from emp
  where deptno ='10';
  
  select job,
sum (SAL) as 'tot sal sm'
from emp
where job like 'salesman'
group by job;


select *
from jobhist;