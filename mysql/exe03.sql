CREATE DATABASE registro_escola;

USE registro_escola;

CREATE TABLE estudantes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    idade INT,
    serie VARCHAR(20),
    nota DECIMAL(3, 1),
    endereco VARCHAR(200)
);

INSERT INTO estudantes (nome, idade, serie, nota, endereco)
VALUES 
    ('Ana Oliveira', 16, '9º Ano', 8.5, 'Rua A, 123'),
    ('Carlos Silva', 15, '8º Ano', 6.8, 'Rua B, 456'),
    ('Mariana Santos', 17, '3º Ano', 7.9, 'Rua C, 789'),
    ('João Souza', 14, '7º Ano', 9.2, 'Rua D, 101'),
    ('Fernanda Lima', 16, '9º Ano', 5.5, 'Rua E, 202'),
    ('Pedro Rocha', 15, '8º Ano', 8.0, 'Rua F, 303'),
    ('Laura Almeida', 17, '3º Ano', 6.3, 'Rua G, 404'),
    ('Gabriel Costa', 14, '7º Ano', 7.8, 'Rua H, 505');
    
    
SELECT * FROM estudantes WHERE nota > 7.0;

SELECT * FROM estudantes WHERE nota < 7.0;

UPDATE estudantes SET nota = 7.5 WHERE id = 5;
