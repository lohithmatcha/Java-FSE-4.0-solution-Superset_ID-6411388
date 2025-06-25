ALTER TABLE Customers ADD IsVIP VARCHAR2(5);
BEGIN
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE Balance > 10000;
    DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT || ' customers promoted to VIP status');
END;
SELECT CustomerID, Name, Balance, IsVIP
FROM Customers
WHERE IsVIP = 'TRUE';

