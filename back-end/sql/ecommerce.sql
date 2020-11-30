CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_products (
	id INT AUTO_INCREMENT,
    product_name VARCHAR (64) NOT NULL,
    price FLOAT NOT NULL,
    is_available BOOLEAN,
    quantity INT,
    PRIMARY KEY (id)
);

INSERT INTO tb_products (
	product_name,
    price,
    is_available,
    quantity
) VALUES (
	"Cabernet Sauvignon",
    459.89,
    TRUE,
    25
);

INSERT INTO tb_products (
	product_name,
    price,
    is_available,
    quantity
) VALUES (
	"Cabernet franc",
    519.19,
    TRUE,
    7
);

INSERT INTO tb_products (
	product_name,
    price,
    is_available,
    quantity
) VALUES (
	"Sauvignon blanc",
    963.89,
    FALSE,
    0
);

INSERT INTO tb_products (
	product_name,
    price,
    is_available,
    quantity
) VALUES (
	"Merlot",
    287.89,
    TRUE,
    41
);

INSERT INTO tb_products (
	product_name,
    price,
    is_available,
    quantity
) VALUES (
	"Pinot noir",
    600.69,
    TRUE,
    3
);

INSERT INTO tb_products (
	product_name,
    price,
    is_available,
    quantity
) VALUES (
	"Mourvèdre",
    400.89,
    TRUE,
    2
);

INSERT INTO tb_products (
	product_name,
    price,
    is_available,
    quantity
) VALUES (
	"Pinot gris",
    789.89,
    TRUE,
    2
);

INSERT INTO tb_products (
	product_name,
    price,
    is_available,
    quantity
) VALUES (
	"Prosseco",
    490.89,
    FALSE,
    0
);

SELECT * FROM tb_products;

SELECT * FROM tb_products
WHERE price > 500;

SELECT * FROM tb_products
WHERE price < 500;

UPDATE tb_products
SET is_available = FALSE, quantity = 0
WHERE id = 6;