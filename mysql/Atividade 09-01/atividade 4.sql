CREATE DATABASE db_cidade_das_carnes;
USE db_cidade_das_carnes;

CREATE TABLE tb_categorias (
    id_categoria INT PRIMARY KEY,
    nome_categoria VARCHAR(50) NOT NULL,
    descricao_categoria VARCHAR(255) NOT NULL
);

INSERT INTO tb_categorias (id_categoria, nome_categoria, descricao_categoria) VALUES
(1, 'Carnes', 'Diversos tipos de carnes para churrasco e cozinha'),
(2, 'Aves', 'Frangos e outras aves para preparo culinário'),
(3, 'Peixes', 'Variedade de peixes frescos'),
(4, 'Frutas', 'Frutas frescas e sazonais'),
(5, 'Verduras', 'Diversas verduras e folhas para saladas e cozimento');

CREATE TABLE tb_produtos (
    id_produto INT PRIMARY KEY,
    nome_produto VARCHAR(50) NOT NULL,
    valor DECIMAL(5,2) NOT NULL,
    descricao_produto VARCHAR(255) NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

INSERT INTO tb_produtos (id_produto, nome_produto, valor, descricao_produto, id_categoria) VALUES
(1, 'Picanha Angus', 79.90, 'Corte nobre para churrasco', 1),
(2, 'Peito de Frango', 12.50, 'Frango para grelhados e assados', 2),
(3, 'Salmão Fresco', 65.00, 'Peixe fresco e saudável', 3),
(4, 'Maçã Gala', 4.99, 'Maçãs frescas e doces', 4),
(5, 'Alface Crespa', 2.50, 'Folhas de alface para saladas', 5),
(6, 'Costela Suína', 25.00, 'Costela suína para assados', 1),
(7, 'Banana Prata', 3.99, 'Bananas maduras e saborosas', 4),
(8, 'Abobrinha Verde', 3.20, 'Abobrinhas frescas para cozimento', 5);

SELECT * FROM tb_produtos WHERE valor > 50.00;

SELECT * FROM tb_produtos WHERE valor BETWEEN 50.00 AND 150.00;

SELECT * FROM tb_produtos WHERE nome_produto LIKE '%C%';

SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria;

SELECT * FROM tb_produtos
INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria IN ('Aves', 'Frutas');
