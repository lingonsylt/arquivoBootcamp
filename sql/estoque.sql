CREATE DATABASE db_ecommerce2;

USE db_ecommerce2;

CREATE TABLE tb_categoria (
	id INT AUTO_INCREMENT,
    nome_categoria VARCHAR (32) NOT NULL,
    vendendo BOOLEAN,
    PRIMARY KEY (id)
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Tecidos",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Tintas",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Incensos",
    FALSE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Iluminação",
    FALSE
);

INSERT INTO tb_categoria (
	nome_categoria,
    vendendo
) VALUES (
	"Aviamentos",
    TRUE
);

SELECT * FROM tb_categoria;

CREATE TABLE tb_produto (
	id INT AUTO_INCREMENT,
    nome_produto VARCHAR (32) NOT NULL,
    disponivel BOOLEAN,
    em_estoque INT NOT NULL,
    id_categoria INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id)
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Lâmpada",
    TRUE,
    25,
    4
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Malha",
    TRUE,
    8,
    1
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Cetim",
    TRUE,
    20,
    1
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Tricoline",
    TRUE,
    12,
    1
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Canvas",
    FALSE,
    0,
    1
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Córdoba",
    FALSE,
    0,
    1
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Vela",
    TRUE,
    25,
    1
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Aquarela",
    TRUE,
    6,
    2
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Acrílica",
    TRUE,
    35,
    2
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Alfinete de segurança",
    TRUE,
    42,
    5
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Dedal",
    TRUE,
    5,
    5
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Desmancha ponto",
    TRUE,
    25,
    5
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Palo santo",
    FALSE,
    0,
    3
);

INSERT INTO tb_produto (
	nome_produto,
    disponivel,
    em_estoque,
    id_categoria
) VALUES (
	"Patchouli",
    TRUE,
    27,
    3
);

SELECT * FROM tb_produto;

SELECT * FROM tb_produto
WHERE em_estoque > 10;

SELECT * FROM tb_produto
WHERE em_estoque < 10;

SELECT * FROM tb_produto
WHERE nome_produto LIKE '%C%';