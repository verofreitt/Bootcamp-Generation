CREATE DATABASE e_commerce;
USE e_commerce;

CREATE TABLE produtos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    categoria VARCHAR(50),
    preco DECIMAL(10, 2),
    quantidade_estoque INT,
    marca VARCHAR(50)
);

INSERT INTO produtos (nome, categoria, preco, quantidade_estoque, marca)
VALUES 
    ('Smartphone XYZ', 'Eletrônicos', 1200.00, 50, 'XYZ Electronics'),
    ('Notebook ABC', 'Informática', 2500.00, 30, 'ABC Tech'),
    ('Camisa Polo', 'Moda', 80.00, 100, 'Fashion Style'),
    ('Tênis Esportivo', 'Calçados', 150.00, 40, 'Sporty Feet'),
    ('Câmera DSLR', 'Fotografia', 1800.00, 20, 'Photo Master'),
    ('Fone de Ouvido Bluetooth', 'Eletrônicos', 100.00, 60, 'SoundBlast'),
    ('Mochila para Notebook', 'Acessórios', 60.00, 80, 'TechGear'),
    ('Relógio Inteligente', 'Acessórios', 300.00, 35, 'SmartWear');
    
SELECT * FROM produtos WHERE preco > 500;

SELECT * FROM produtos WHERE preco < 500;

UPDATE produtos SET preco = 550.00 WHERE id = 3;
    