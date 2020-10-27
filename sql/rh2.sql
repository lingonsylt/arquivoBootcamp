CREATE DATABASE db_RH2;

USE db_RH2;

CREATE TABLE tb_cargo (
	id INT AUTO_INCREMENT,
    nome_cargo VARCHAR (32) NOT NULL,
    piso_cargo FLOAT,
    PRIMARY KEY (id)
);

INSERT INTO tb_cargo (
	nome_cargo,
    piso_cargo
) VALUES (
	"Garçom",
    1167.30	
);

INSERT INTO tb_cargo (
	nome_cargo,
    piso_cargo
) VALUES (
	"Pizzaiolo",
    1329.05	
);

INSERT INTO tb_cargo (
	nome_cargo,
    piso_cargo
) VALUES (
	"Maître",
    1569.33		
);

INSERT INTO tb_cargo (
	nome_cargo,
    piso_cargo
) VALUES (
	"Nutricionista",
    2356.38		
);

INSERT INTO tb_cargo (
	nome_cargo,
    piso_cargo
) VALUES (
	"Gerente de compras",
    2461.69			
);

SELECT * FROM tb_cargo;

CREATE TABLE tb_funcionario	(
	id INT AUTO_INCREMENT,
    nome_funcionario VARCHAR (64),
    salario FLOAT NOT NULL,
    contrato BOOLEAN NOT NULL,
    id_cargo INT,
    PRIMARY KEY (id),
    FOREIGN KEY (id_cargo) REFERENCES tb_cargo (id)
);

INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Virginia Wolf",
    3867.89,
    TRUE,
    4
 );

INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Jane Austen",
    1234.71,
    TRUE,
    1
 );

INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Mary Shelley",
    2367.89,
    TRUE,
    3
 );

INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Charlotte",
    6893.19,
    TRUE,
    5
 );

INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Toni Morrison",
    3287.00,
     FALSE,
    2
 );

INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Margaret Atwood",
    867.89,
    TRUE,
    3
 );

INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"George Eliot",
    367.89,
    FALSE,
    1
 );

INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Zora Neale",
    7843.89,
    TRUE,
    3
 );

INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Louisa May",
    14873.90,
    FALSE,
    5
 );
 
 INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Chimamanda Adichie",
    14991.90,
    TRUE,
    3
 );
 
 INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Emily Dickinson",
    873.90,
    TRUE,
    1
 );
 
INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Alice Walker",
    1678,
    FALSE,
    1
 ); 
 
 INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Sylvia Plath",
    4873.90,
    FALSe,
    3
 );

INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Gertrude Stein",
    873.90,
    FALSE,
    1
 );

INSERT INTO tb_funcionario (
	nome_funcionario,
    salario,
    contrato,
    id_cargo
) VALUES (
	"Agatha Christie",
    2873.90,
    TRUE,
    4
 );

 SELECT * FROM tb_funcionario;
 
 SELECT * FROM tb_funcionario
 WHERE salario > 2000;
 
 SELECT * FROM tb_funcionario
 WHERE salario > 1000 AND salario < 2000;
 
SELECT * FROM tb_funcionario
WHERE nome_funcionario LIKE '%C%';