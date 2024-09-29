Spring Boot CRUD Application with H2 and JPA
This is a simple Spring Boot application that demonstrates basic CRUD (Create, Read, Update, Delete) operations using Spring Data JPA and H2 in-memory database.

Features:
REST API for managing products
In-memory database (H2) for quick setup and testing
CRUD operations using Spring Data JPA
Sample product data preloaded on startup

API Endpoints:
GET /api/product: Retrieve a list of all products.
GET /api/product/{id}: Retrieve a specific product by its ID.
POST /api/product: Create a new product (send a JSON object in the request body).
PUT /api/product/{id}: Update an existing product by its ID (send a JSON object in the request body).
DELETE /api/product/{id}: Delete a specific product by its ID.

Sample Data Initialization
The following sample products will be inserted into the database when the application starts. Add this to your data.sql file:

sql
Copy code
INSERT INTO product (price, quantity, category, description, name)
VALUES
(150, 10, 'Electronics', 'Wireless earbuds with noise cancellation', 'Earbuds Pro'),
(200, 5, 'Appliances', 'High-efficiency blender for smoothies', 'Blender X200'),
(50, 20, 'Books', 'Science fiction novel', 'The Quantum Realm'),
(120, 8, 'Clothing', 'Cotton t-shirt with logo', 'Logo T-Shirt'),
(300, 2, 'Furniture', 'Ergonomic office chair with lumbar support', 'Office Chair Pro'),
(90, 15, 'Beauty', 'Moisturizing skin cream', 'HydraPlus Cream'),
(600, 3, 'Electronics', 'Smartphone with OLED display', 'Smartphone Z10'),
(25, 50, 'Stationery', 'Pack of 12 black pens', 'Black Pens Pack'),
(75, 12, 'Sports', 'Yoga mat with extra cushioning', 'Comfort Yoga Mat'),
(180, 7, 'Appliances', 'Compact air fryer', 'Air Fryer Mini');

Technologies Used:
Spring Boot
Spring Data JPA
H2 Database
Maven


