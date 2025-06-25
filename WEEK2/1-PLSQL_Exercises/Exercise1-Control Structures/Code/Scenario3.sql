-- select * from LOANS
DECLARE
      cnt number :=0;
BEGIN
    
    FOR tmp IN (
        SELECT L.LoanID,L.EndDate,C.name FROM 
        LOANS L JOIN CUSTOMERS C ON L.CUSTOMERID=C.CUSTOMERID
        Where L.ENDDATE Between SYSDATE and SYSDATE+30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE('REMINDER!!!: Mr/Ms ' || tmp.name || ',Loan-ID: '||tmp.LoanID|| ' your loan is due on ' || tmp.EndDate);
        cnt :=cnt +1;
    END LOOP;
      DBMS_OUTPUT.PUT_LINE('Total ' ||cnt ||' Reminders sent!');
END;

