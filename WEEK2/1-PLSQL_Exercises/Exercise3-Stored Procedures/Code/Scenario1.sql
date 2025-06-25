CREATE OR replace PROCEDURE MonthlyInterest
IS     
   cnt number :=0;   
BEGIN  
    UPDATE ACCOUNTS
    SET Balance = BALANCE * 1.01
    where ACCOUNTTYPE ='Savings';

    cnt :=SQL%ROWCOUNT;

    DBMS_OUTPUT.PUT_LINE('Total ' || cnt || ' account(s) updated with monthly interest of 1%.');
END;

BEGIN
    MonthlyInterest;
END;

