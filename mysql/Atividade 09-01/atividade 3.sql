CREATE DATABASE db_farmacia_bem_estar;
USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias (
    id_categoria INT PRIMARY KEY,
    nome_categoria VARCHAR(50) NOT NULL,
    descricao_categoria VARCHAR(255) NOT NULL
);

INSERT INTO tb_categorias (id_categoria, nome_categoria, descricao_categoria) VALUES
(1, 'Medicamentos', 'Produtos destinados ao tratamento de saúde'),
(2, 'Cosméticos', 'Produtos de cuidado pessoal e estética'),
(3, 'Higiene', 'Produtos para higiene pessoal'),
(4, 'Vitaminas', 'Suplementos vitamínicos e minerais'),
(5, 'Bem-Estar', 'Produtos para o bem-estar geral');

CREATE TABLE tb_produtos (
    id_produto INT PRIMARY KEY,
    nome_produto VARCHAR(50) NOT NULL,
    valor DECIMAL(5,2) NOT NULL,
    descricao_produto VARCHAR(255) NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

INSERT INTO tb_produtos (id_produto, nome_produto, valor, descricao_produto, id_categoria) VALUES
(1, 'Aspirina', 10.99, 'Analgésico e antipirético', 1),
(2, 'Shampoo Revitalizante', 25.50, 'Para cabelos saudáveis e brilhantes', 2),
(3, 'Creme Dental Fresh', 5.90, 'Proteção contra cáries e hálito fresco', 3),
(4, 'Vitamina C 1000mg', 35.00, 'Suplemento antioxidante', 4),
(5, 'Sabonete Líquido Neutro', 8.99, 'Limpeza suave para a pele', 3),
(6, 'Protetor Solar FPS 50', 45.75, 'Proteção contra raios UVB e UVA', 2),
(7, 'Melatonin 5mg', 18.50, 'Auxilia no sono saudável', 5),
(8, 'Loção Hidratante Corporal', 20.00, 'Hidratação intensiva para a pele', 2);

SELECT * FROM tb_produtos WHERE valor > 50.00;

SELECT * FROM tb_produtos WHERE valor BETWEEN 5.00 AND 60.00;

SELECT * FROM tb_produtos WHERE nome_produto LIKE '%C%';

SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria;

SELECT * FROM tb_produtos
INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria = 'Cosméticos';