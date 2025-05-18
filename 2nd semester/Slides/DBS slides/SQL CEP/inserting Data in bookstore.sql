-- Insert into Users
INSERT INTO Users (UserID, UserName, Email) VALUES (29, 'Qasim', 'qasim@gmail.com');

-- Insert into Books
INSERT INTO Books (BookID, Title, Author, Price, Stock)
VALUES (101, 'Learn SQL', 'Ali Khan', 999.99, 10);

-- Insert into Orders
INSERT INTO Orders (OrderID, UserID, OrderDate)
VALUES (1001, 29, '2025-04-20');

-- Insert into OrderDetails
INSERT INTO OrderDetails (OrderDetailID, OrderID, BookID, Quantity)
VALUES (1, 1001, 101, 2);
