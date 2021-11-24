select job,
 AVG (SAL) as 'avg sal'
from emp
where job like'manager'
group by job;