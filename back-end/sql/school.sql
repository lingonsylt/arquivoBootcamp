CREATE DATABASE db_school;

USE db_school;

CREATE TABLE tb_students (
	id INT AUTO_INCREMENT,
    full_name VARCHAR (64) NOT NULL,
    grade INT NOT NULL,
    score float (2.1),
    foreign_language VARCHAR (16),
    is_active BOOLEAN,
    PRIMARY KEY (id)
);

INSERT INTO tb_students (
	full_name,
    grade,
    score,
    foreign_language,
    is_active
) VALUES (
	"Immanuel Kant",
    3,
    8.6,
    "German",
    TRUE
);

INSERT INTO tb_students (
	full_name,
    grade,
    score,
    foreign_language,
    is_active
) VALUES (
	"Friedirich Nietzsche",
    4,
    5,
    "German",
    FALSE
);

INSERT INTO tb_students (
	full_name,
    grade,
    score,
    foreign_language,
    is_active
) VALUES (
	"Jean Paul Sartre",
    5,
    6.7,
    "French",
    FALSE
);

INSERT INTO tb_students (
	full_name,
    grade,
    score,
    foreign_language,
    is_active
) VALUES (
	"Simone de  Beauvoir",
    5,
    10,
    "French",
    TRUE
);

INSERT INTO tb_students (
	full_name,
    grade,
    score,
    foreign_language,
    is_active
) VALUES (
	"Hannah Arendt",
    2,
    9.8,
    "German",
    TRUE
);

INSERT INTO tb_students (
	full_name,
    grade,
    score,
    foreign_language,
    is_active
) VALUES (
	"Denise Ferreira da Silva",
    2,
    10,
    "Portuguese",
    TRUE
);

INSERT INTO tb_students (
	full_name,
    grade,
    score
    foreign_language,
    is_active
) VALUES (
	"Seyla Benhabib",
    5,
    8.5,
    "Turkish",
    TRUE
);

INSERT INTO tb_students (
	full_name,
    grade,
    score,
    foreign_language,
    is_active
) VALUES (
	"Karl Marx",
    5,
    11,
    "German",
    FALSE
);

SELECT * FROM tb_students;

SELECT * FROM tb_students
WHERE score > 7;

SELECT * FROM tb_students
WHERE score < 7;

UPDATE tb_students
SET score = 10, is_active = TRUE
WHERE id = 1;