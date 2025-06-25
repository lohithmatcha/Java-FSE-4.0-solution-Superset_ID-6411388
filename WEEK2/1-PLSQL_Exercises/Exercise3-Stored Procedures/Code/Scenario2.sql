-- -- select * from EMPLOYEES
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept IN VARCHAR2, bonus IN NUMBER
)
IS
 cnt number :=0;
 BEGIN
    UPDATE EMPLOYEES SET 
    Salary = SALARY +(Salary * bonus/100)
    WHERE Department = dept;
    
    cnt:= SQL%ROWCOUNT;
    DBMS_OUTPUT.PUT_LINE('Bonus applied to ' || cnt || ' employee(s) in department: ' || dept);
END;
BEGIN
    UpdateEmployeeBonus('HR',32);
END;


--Bonus applied to 1 employee(s) in department: HR will be the output

