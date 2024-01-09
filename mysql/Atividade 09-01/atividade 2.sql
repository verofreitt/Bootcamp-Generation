CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categorias (
    id_categoria INT PRIMARY KEY,
    nome_categoria VARCHAR(50) NOT NULL,
    descricao_categoria VARCHAR(255) NOT NULL
);

INSERT INTO tb_categorias (id_categoria, nome_categoria, descricao_categoria) VALUES
(1, 'Salgada', 'Pizzas salgadas tradicionais'),
(2, 'Doce', 'Pizzas doces e saborosas'),
(3, 'Vegetariana', 'Pizzas com ingredientes vegetarianos'),
(4, 'Especial', 'Pizzas especiais com ingredientes exclusivos'),
(5, 'Calzone', 'Calzones recheados');

CREATE TABLE tb_pizzas (
    id_pizza INT PRIMARY KEY,
    nome_pizza VARCHAR(50) NOT NULL,
    valor DECIMAL(5,2) NOT NULL,
    ingredientes TEXT NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

INSERT INTO tb_pizzas (id_pizza, nome_pizza, valor, ingredientes, id_categoria) VALUES
(1, 'Margarita', 35.90, 'Molho de tomate, mussarela e manjericão', 1),
(2, 'Quatro Queijos', 45.50, 'Molho de tomate, mussarela, parmesão, gorgonzola e catupiry', 1),
(3, 'Chocolate Lover', 55.00, 'Chocolate, morango e chantilly', 2),
(4, 'Vegetariana Suprema', 48.90, 'Molho de tomate, abobrinha, berinjela, cogumelos e pimentões', 3),
(5, 'Frango com Catupiry', 38.50, 'Molho de tomate, frango desfiado e catupiry', 1),
(6, 'Calzone de Calabresa', 42.00, 'Calabresa, molho de tomate e mussarela', 5),
(7, 'Banana Caramelada', 49.90, 'Banana, creme de baunilha e calda de caramelo', 2),
(8, 'Especial da Casa', 65.00, 'Ingredientes exclusivos da casa', 4);

SELECT * FROM tb_pizzas WHERE valor > 45.00;

SELECT * FROM tb_pizzas WHERE valor BETWEEN 50.00 AND 100.00;

SELECT * FROM tb_pizzas WHERE nome_pizza LIKE '%M%';

SELECT * FROM tb_pizzas INNER JOIN tb_categorias ON tb_pizzas.id_categoria = tb_categorias.id_categoria;

SELECT * FROM tb_pizzas
INNER JOIN tb_categorias ON tb_pizzas.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria = 'Doce';