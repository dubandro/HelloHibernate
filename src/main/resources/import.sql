DROP TABLE product IF EXISTS;
CREATE TABLE IF NOT EXISTS product (id bigserial, title VARCHAR(255), cost decimal, count int, PRIMARY KEY (id));
INSERT INTO product (title, cost, count) VALUES ('milk', 80, 0), ('cheese', 100, 3), ('meet', 200, 5);
