-- Exercise 1 Scenario 1

BEGIN
   FOR c IN (SELECT CustomerID,
                    FLOOR(MONTHS_BETWEEN(SYSDATE,DOB)/12) AGE
             FROM Customers)
   LOOP

      IF c.AGE > 60 THEN

         UPDATE Loans
         SET InterestRate = InterestRate - 1
         WHERE CustomerID = c.CustomerID;

      END IF;

   END LOOP;

   COMMIT;
END;
/
-- Scenario 2

BEGIN

   UPDATE Customers
   SET IsVIP='TRUE'
   WHERE Balance>10000;

   COMMIT;

END;
/
-- Scenario 3

BEGIN

   FOR c IN(

      SELECT Name,
             EndDate

      FROM Customers c

      JOIN Loans l

      ON c.CustomerID=l.CustomerID

      WHERE EndDate<=SYSDATE+30

   )

   LOOP

      DBMS_OUTPUT.PUT_LINE(
      'Reminder sent to '||c.Name);

   END LOOP;

END;
/
// Exercise 2
CREATE OR REPLACE PROCEDURE SafeTransferFunds(

p_from NUMBER,
p_to NUMBER,
p_amount NUMBER

)

IS

v_balance NUMBER;

BEGIN

SELECT Balance
INTO v_balance
FROM Accounts
WHERE AccountID=p_from;

IF v_balance<p_amount THEN

RAISE_APPLICATION_ERROR(-20001,'Insufficient Funds');

END IF;

UPDATE Accounts

SET Balance=Balance-p_amount

WHERE AccountID=p_from;

UPDATE Accounts

SET Balance=Balance+p_amount

WHERE AccountID=p_to;

COMMIT;

EXCEPTION

WHEN OTHERS THEN

ROLLBACK;

DBMS_OUTPUT.PUT_LINE(SQLERRM);

END;
/
 //Exercise 3 
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest

IS

BEGIN

UPDATE Accounts

SET Balance=Balance+(Balance*0.01)

WHERE AccountType='Savings';

COMMIT;

END;
/

//Exercise 4 
CREATE OR REPLACE FUNCTION CalculateAge(

p_dob DATE

)

RETURN NUMBER

IS

BEGIN

RETURN FLOOR(MONTHS_BETWEEN(SYSDATE,p_dob)/12);

END;
/

//Exercise 5 
CREATE OR REPLACE TRIGGER UpdateCustomerLastModified

BEFORE UPDATE

ON Customers

FOR EACH ROW

BEGIN

:new.LastModified:=SYSDATE;

END;
/

//Exercise 6
DECLARE

CURSOR c_accounts IS

SELECT AccountID,Balance

FROM Accounts;

BEGIN

FOR acc IN c_accounts LOOP

UPDATE Accounts

SET Balance=Balance-100

WHERE AccountID=acc.AccountID;

END LOOP;

COMMIT;

END;
/

//Exercise 7 
CREATE OR REPLACE PACKAGE CustomerManagement

IS

PROCEDURE AddCustomer(

id NUMBER,

name VARCHAR2

);

FUNCTION GetBalance(

id NUMBER

)

RETURN NUMBER;

END CustomerManagement;
/

CREATE OR REPLACE PACKAGE BODY CustomerManagement

IS

PROCEDURE AddCustomer(

id NUMBER,

name VARCHAR2

)

IS

BEGIN

INSERT INTO Customers(

CustomerID,

Name

)

VALUES(

id,

name

);

END;

FUNCTION GetBalance(

id NUMBER

)

RETURN NUMBER

IS

bal NUMBER;

BEGIN

SELECT Balance

INTO bal

FROM Customers

WHERE CustomerID=id;

RETURN bal;

END;

END CustomerManagement;
/
