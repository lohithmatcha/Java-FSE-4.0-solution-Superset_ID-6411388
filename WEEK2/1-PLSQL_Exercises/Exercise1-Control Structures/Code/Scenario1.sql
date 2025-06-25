BEGIN 
    UPDATE LOANS L
    set L.INTERESTRATE=L.INTERESTRATE-1
    where L.CUSTOMERID in(
        SELECT C.CUSTOMERID from CUSTOMERS C WHERE MONTHS_BETWEEN(SYSDATE, C.DOB)/12 > 60

    );
    DBMS_OUTPUT.PUT_LINE('1% interest discount applied to customers above 60 years old.');
END;