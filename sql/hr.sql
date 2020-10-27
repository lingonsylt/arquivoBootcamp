CREATE DATABASE db_hr;

USE db_hr;

CREATE TABLE tb_employees (
	id INT AUTO_INCREMENT,
	full_name VARCHAR (64) NOT NULL,
    job_name VARCHAR (64),
    wage FLOAT NOT NULL,
    is_active BOOLEAN,
    PRIMARY KEY (id)
);

INSERT INTO tb_employees (
	full_name,
	job_name,
    wage,
    is_active
) VALUES (
	"Peter Johansson",
    "Chef",
    4698.43,
    TRUE
);

INSERT INTO tb_employees (
	full_name,
	job_name,
    wage,
    is_active
) VALUES (
	"Carmen Bolzano",
    "Sommelier",
    9698.43,
    TRUE
);

INSERT INTO tb_employees (
	full_name,
	job_name,
    wage,
    is_active
) VALUES (
	"Christina Medici",
    "Chef",
    8677.28,
    TRUE
);

INSERT INTO tb_employees (
	full_name,
	job_name,
    wage,
    is_active
) VALUES (
	"Tomas Cordeiro",
    "Cashier",
    998.69,
    TRUE
);

INSERT INTO tb_employees (
	full_name,
	job_name,
    wage,
    is_active
) VALUES (
	"Vanda Strömberg",
    "Waiting staff",
    1358.43,
    TRUE
);

SELECT * FROM tb_employees;

SELECT * FROM tb_employees
WHERE wage > 2000;

SELECT * FROM tb_employees
WHERE wage < 2000;

UPDATE tb_employees
SET job_name = "First chef"
WHERE id = 3;