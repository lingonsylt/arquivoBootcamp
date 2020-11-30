CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

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
	"Aços",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Madeiras",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Blocos/Tijolos",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Ferramentas",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Louças",
    TRUE
);

SELECT * FROM tb_categoria;

INSERT INTO tb_produto (
	nome_produto,
    preco,
    disponivel,
    id_categoria
) VALUES (
	"Arame",
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
	"Tirante",
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
	"Tábua",
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
	"Cavalete",
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
	"Bloco de cerâmica",
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
	"Marreta",
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
	"Bacia sanitária",
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
WHERE nome_produto LIKE '%CI%';

SELECT tb_produto.nome_produto, tb_categoria.nome_categoria
FROM tb_produto INNER JOIN tb_categoria
ON tb_produto.id_categoria = tb_categoria.id;

SELECT tb_produto.nome_produto, tb_categoria.nome_categoria
FROM tb_produto INNER JOIN tb_categoria
ON tb_produto.id_categoria = tb_categoria.id
WHERE tb_categoria.id = 5;