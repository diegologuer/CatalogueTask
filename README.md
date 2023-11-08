# REST API

## PLEASE EDIT THE CONFIGURATION FILE IN ORDER TO SET A DATABASE

## Users

### administrator user
username: `admin` 

password: `admin@pa$$w0rd`

### developer user
username: `developer` 

password: `developer@pa$$w0rd`

# Shopping Cart API Design

## Entities:

1. **User:** Represents a user of the shopping cart system. Attributes include a unique identifier, username, email, and a list of shopping carts associated with the user.

2. **Product:** Represents items available for purchase. Attributes include a unique identifier, name, description, price, and quantity available.

3. **Shopping Cart:** Represents a user's cart where they can add and manage products. Attributes include a unique identifier, a reference to the user who owns the cart, and a list of products added to the cart.

## Operations:

### User Operations:

- Create a new user (POST)
- Retrieve a specific user by ID (GET)
- Update user information (PUT)
- Delete a user by ID (DELETE)
- List all users (GET), with optional filters for username and email.
- Paginate the list of users.

### Product Operations:

- Create a new product (POST)
- Retrieve a specific product by ID (GET)
- Update product information (PUT)
- Delete a product by ID (DELETE)
- List all products (GET), with optional filters for name and price.
- Paginate the list of products.

### Shopping Cart Operations:

- Create a new shopping cart for a user (POST)
- Retrieve a specific shopping cart by ID (GET)
- Add a product to a shopping cart (POST)
- Remove a product from a shopping cart (DELETE)
- List products in a shopping cart (GET)
- Update the quantity of a product in a shopping cart (PUT)
- Complete a purchase (POST), which clears the shopping cart and records the transaction.

These are the primary entities and operations that the API must support
 for a Shopping Cart system. Each operation is represented with an HTTP
 method (e.g., POST, GET, PUT, DELETE), and these operations allow u
sers to interact with the User, Product, and Shopping Cart entities 
as described. The API should include error handling, authentication, 
pagination, and caching as necessary to provide a robust and user-friendly experience.
