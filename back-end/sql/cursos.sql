CREATE DATABASE db_cursosDaMinhaVida;

USE db_cursosDaMinhaVida;

CREATE TABLE tb_categoria (
	id INT AUTO_INCREMENT,
    nome_categoria VARCHAR (32) NOT NULL,
    ativo BOOLEAN,
    PRIMARY KEY (id)
);

CREATE TABLE tb_cursos (
	id INT AUTO_INCREMENT,
    nome_produto VARCHAR (32),
    preco DECIMAL (5,2) NOT NULL,
    duracao INT,
    id_categoria INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id)
);

INSERT INTO tb_categoria (
	nome_categoria,
    ativo
) VALUES (
	"Matemática",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    ativo
) VALUES (
	"Ciência da Computação",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    ativo
) VALUES (
	"Filosofia",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    ativo
) VALUES (
	"Física",
    TRUE
);

INSERT INTO tb_categoria (
	nome_categoria,
    ativo
) VALUES (
	"Literatura",
    TRUE
);

SELECT * FROM tb_categoria;

INSERT INTO tb_cursos (
	nome_produto,
    preco,
    duracao,
    id_categoria
) VALUES (
	"Teoria dos conjuntos",
    29,
    7,
    1
);

INSERT INTO tb_cursos (
	nome_produto,
    preco,
    duracao,
    id_categoria
) VALUES (
	"Inequações",
    29,
    2,
    1
);

INSERT INTO tb_cursos (
	nome_produto,
    preco,
    duracao,
    id_categoria
) VALUES (
	"Estrutura de dados",
    27,
    12,
    2
);

INSERT INTO tb_cursos (
	nome_produto,
    preco,
    duracao,
    id_categoria
) VALUES (
	"Organização de computadores",
    41,
    23,
    2
);

INSERT INTO tb_cursos (
	nome_produto,
    preco,
    duracao,
    id_categoria
) VALUES (
	"Filosofia da ciência",
    23,
    9,
    3
);

INSERT INTO tb_cursos (
	nome_produto,
    preco,
    duracao,
    id_categoria
) VALUES (
	"Cálculo integral e diferencial",
    16,
    5,
    4
);

INSERT INTO tb_cursos (
	nome_produto,
    preco,
    duracao,
    id_categoria
) VALUES (
	"Baudelaire e o modernismo",
    139,
    TRUE,
    5
);

SELECT * FROM tb_cursos;

SELECT * FROM tb_cursos
WHERE preco > 50;

SELECT * FROM tb_cursos
WHERE preco > 3 AND preco < 60;

SELECT * FROM tb_cursos
WHERE nome_produto LIKE '%JAV%';

SELECT tb_cursos.nome_produto, tb_categoria.nome_categoria
FROM tb_cursos INNER JOIN tb_categoria
ON tb_cursos.id_categoria = tb_categoria.id;

SELECT tb_cursos.nome_produto, tb_categoria.nome_categoria
FROM tb_cursos INNER JOIN tb_categoria
ON tb_cursos.id_categoria = tb_categoria.id
WHERE tb_categoria.id = 5;