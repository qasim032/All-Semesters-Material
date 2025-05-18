BEGIN;

-- Insert a new order
INSERT INTO Orders (OrderID, UserID, OrderDate)
VALUES (105, 31, '2025-04-20');

-- Insert order details
INSERT INTO OrderDetails (OrderDetailID, OrderID, BookID, Quantity)
VALUES (5, 105, 12, 1);

-- Update stock of the book
UPDATE Books SET Stock = Stock - 1 WHERE BookID = 12;

COMMIT;

SELECT * FROM Orders WHERE OrderID = 105 FOR UPDATE;



SET TRANSACTION ISOLATION LEVEL SERIALIZABLE;









