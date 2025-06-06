/*
    <GROUP BY>
    그룹기준을 제시할 수 있는 구문(해당 그룹기즌별로 여러 그룹으로 묶을 수 있음)
    여러개의 값들을 하나의 그룹으로 묶어서 처리하는 목적으로 사용

*/

SELECT SUM(SALARY)
FROM EMPLOLYEE; -- 전체사원을 하나의 그룹으로 묶어서 값을 구한 것

--각 부서별로 급여 총 합
--그룹 : 부서

SELECT DEPT_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY(DEPT_CODE);

--각 부서별 사원수
SELECT DEPT_CODE, COUNT(*), SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE
ORDER BY DEPT_CODE;

--각 직급별 총 사원 수, 보너스를 받은 사람 수, 급여합, 평균 급여, 최저시급 (정령 = 직급 내림차순)
SELECT JOB_CODE, COUNT(*), COUNT(BONUS), SUM(SALARY), AVG(SALARY), MIN(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE
ORDER BY JOB_CODE DESC;

--GROUP BY절에서 함수식 사용가능( 그룹을 나눌 수 있는 기주만 넣어주면 된다.
SELECT DECODE(SUBSTR(EMP_NO, 8, 1), '1', '남', '2','여'), COUNT(*)
FROM EMPLOYEE
GROUP BY SUBSTR(EMP_NO, 8, 1);

--GROUP BY절에 여러 컬럼을 기술할 수 있음 --> 서로 겹치는 그룹별로 나타냄
SELECT DEPT_CODE, JOB_CODE, COUNT(*)
FROM EMPLOYEE
GROUP BY DEPT_CODE, JOB_CODE;

/*
    [HAVING]
    그룹에 대한 조건을 제시할 때 사용된느 구문(주로 그룹함수식을 가지고 조건을 만든다.)
*/
--각 부서별 평균 급여(부서코드, 평균 급여)
SELECT DEPT_CODE, ROUND(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_CODE;

--각 부서별 평균 급여가 300만원 이상인 부서들만 조회(부서코드 평균급여)
SELECT DEPT_CODE, ROUND(AVG(SALARY))
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING AVG(SALARY) >= 3000000;

--직급별 직급 코드, 총급여 합( 단, 직급별 총 급여함이 1000만원 이상인 직급만 조회)
SELECT JOB_CODE, SUM(SALARY)
FROM EMPLOYEE
GROUP BY JOB_CODE
HAVING SUM(SALARY) >= 10000000;

--부서별 보너스를 받는 사원이 없는 부서의  부서코드
SELECT DEPT_CODE, COUNT(BONUS)
FROM EMPLOYEE
GROUP BY DEPT_CODE
HAVING COUNT(BONUS) = 0;

---===============================================================================
/*
    SELECT *                              --5
    FROM 테이블                            --1
    WHERE 조건식                           --2
    GROUP BY 그룹의 기준이 되는 컬럼 | 함수식 --3
    HAVING 조건식                          --4
    ORDER BY 정령기준 컬럼                  --6
    (오라클에서는 존재x)LIMIT                --항상 마지막
*/


SELECT DEPT_CODE, AVG(SALARY) AS "AVG_SALARY"
FROM EMPLOYEE
WHERE SALARY > 3000000
GROUP BY DEPT_CODE
HAVING AVG(SALARY) > 5000000;














































