CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categoria (
	id INT AUTO_INCREMENT,
    nome_categoria VARCHAR (32) NOT NULL,
    vendendo BOOLEAN,
    PRIMARY KEY (id)
);

CREATE TABLE tb_produto (
	id INT AUTO_INCREMENT,
    nome_produto VARCHAR (32),
    preco DECIMAL (5,2) NOT NULL,
    disponivel BOOLEAN,
    id_categoria INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id)
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Bovina",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Suína",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Frango",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Peixe",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Alce",
    TRUE
);

SELECT * FROM tb_categoria;

INSERT INTO tb_produto (
	nome_produto,
    preco,
    disponivel,
    id_categoria
) VALUES (
	"Fraldinha",
    62.92,
    TRUE,
    1
);

INSERT INTO tb_produto (
	nome_produto,
    preco,
    disponivel,
    id_categoria
) VALUES (
	"Maminha",
    29.98,
    TRUE,
    1
);

INSERT INTO tb_produto (
	nome_produto,
    preco,
    disponivel,
    id_categoria
) VALUES (
	"Bacon",
    27.90,
    TRUE,
    2
);

INSERT INTO tb_produto (
	nome_produto,
    preco,
    disponivel,
    id_categoria
) VALUES (
	"Presunto",
    41.90,
    TRUE,
    2
);

INSERT INTO tb_produto (
	nome_produto,
    preco,
    disponivel,
    id_categoria
) VALUES (
	"Sassami",
    23.96,
    TRUE,
    3
);

INSERT INTO tb_produto (
	nome_produto,
    preco,
    disponivel,
    id_categoria
) VALUES (
	"Isca",
    16.90,
    TRUE,
    4
);

INSERT INTO tb_produto (
	nome_produto,
    preco,
    disponivel,
    id_categoria
) VALUES (
	"Cuts quarto traseiro",
    139.98,
    TRUE,
    5
);

SELECT * FROM tb_produto;

SELECT * FROM tb_produto
WHERE preco > 50;

SELECT * FROM tb_produto
WHERE preco > 3 AND preco < 60;

SELECT * FROM tb_produto
WHERE nome_produto LIKE '%CO%';

SELECT tb_produto.nome_produto, tb_categoria.nome_categoria
FROM tb_produto INNER JOIN tb_categoria
ON tb_produto.id_categoria = tb_categoria.id;

SELECT tb_produto.nome_produto, tb_categoria.nome_categoria
FROM tb_produto INNER JOIN tb_categoria
ON tb_produto.id_categoria = tb_categoria.id
WHERE tb_categoria.id = 2;
