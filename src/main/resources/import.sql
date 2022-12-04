BEGIN;

DROP TABLE users IF EXISTS;
CREATE TABLE IF NOT EXISTS users (id bigserial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO users (name) VALUES ('Bob'), ('Jack'), ('John');

DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS product (id bigserial, title VARCHAR(255), cost decimal, count int, PRIMARY KEY (id));
INSERT INTO product (title, cost, count) VALUES ('milk', 80, 0), ('cheese', 100, 3), ('meet', 200, 5);

DROP TABLE users_products IF EXISTS;
CREATE TABLE IF NOT EXISTS users_products (user_id bigint, products_id bigint, FOREIGN KEY (user_id) REFERENCES products (id), FOREIGN KEY (product_id) REFERENCES users (id));
INSERT INTO users_products (user_id, products_id) VALUES
(1, 1),
(1, 2),
(2, 1),
(2, 3),
(3, 1),
(3, 2);

COMMIT;