CREATE DATABASE empresa_rh;

use empresa_rh;

CREATE TABLE colaboradores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    cargo VARCHAR(50),
    salario DECIMAL(10, 2),
    departamento VARCHAR(50),
    data_contratacao DATE
);

INSERT INTO colaboradores (nome, cargo, salario, departamento, data_contratacao)
VALUES 
    ('João Silva', 'Analista de RH', 2500.00, 'Recursos Humanos', '2022-01-01'),
    ('Maria Souza', 'Desenvolvedor', 1800.00, 'TI', '2021-05-15'),
    ('Carlos Oliveira', 'Gerente de Vendas', 3000.00, 'Vendas', '2021-02-10'),
    ('Ana Santos', 'Analista Financeiro', 2200.00, 'Financeiro', '2021-09-20'),
    ('Pedro Rocha', 'Assistente Administrativo', 1900.00, 'Administração', '2022-03-05');

SELECT * FROM colaboradores WHERE salario > 2000;

SELECT * FROM colaboradores WHERE salario < 2000;

UPDATE colaboradores SET salario = 2100.00 WHERE id = 2;

