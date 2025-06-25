CREATE OR REPLACE PROCEDURE TransferFunds (
    from_id IN number, to_id IN number , amount IN number
)
IS
     before_amt number;
BEGIN
    SELECT Balance INTO before_amt
    FROM ACCOUNTS
    WHERE ACCOUNTID = from_id FOR UPDATE;

    IF before_amt < amount THEN
       DBMS_OUTPUT.PUT_LINE('Insufficient balance');
       RETURN;
    END IF;

    UPDATE ACCOUNTS
    SET BALANCE=BALANCE-amount WHERE ACCOUNTID = from_id;

    UPDATE ACCOUNTS SET
    BALANCE=BALANCE + amount WHERE ACCOUNTID =to_id;
    DBMS_OUTPUT.PUT_LINE('Amount Transfered Succesfully from Account ' || from_id || ' to Account ' || to_id );
END;

BEGIN
    TRANSFERFUNDS(5,4,169);
END;

