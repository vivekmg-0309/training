SELECT 
deptno, sum (sal) as 'total salary'
from emp
group by deptno;

