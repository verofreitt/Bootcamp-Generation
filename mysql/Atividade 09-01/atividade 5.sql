CREATE DATABASE db_construindo_vidas;
USE db_construindo_vidas;

CREATE TABLE tb_categorias (
    id_categoria INT PRIMARY KEY,
    nome_categoria VARCHAR(50) NOT NULL,
    descricao_categoria VARCHAR(255) NOT NULL
);

INSERT INTO tb_categorias (id_categoria, nome_categoria, descricao_categoria) VALUES
(1, 'Ferramentas', 'Diversas ferramentas para construção'),
(2, 'Elétrica', 'Materiais elétricos para instalações'),
(3, 'Hidráulica', 'Produtos para sistemas hidráulicos'),
(4, 'Pintura', 'Tintas e acessórios para pintura'),
(5, 'Madeira', 'Materiais de madeira para construção');

CREATE TABLE tb_produtos (
    id_produto INT PRIMARY KEY,
    nome_produto VARCHAR(50) NOT NULL,
    valor DECIMAL(5,2) NOT NULL,
    descricao_produto VARCHAR(255) NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

INSERT INTO tb_produtos (id_produto, nome_produto, valor, descricao_produto, id_categoria) VALUES
(1, 'Furadeira Bosch', 249.90, 'Furadeira de impacto profissional', 1),
(2, 'Disjuntor 20A', 17.50, 'Disjuntor para proteção elétrica', 2),
(3, 'Tubo PVC 50mm', 8.99, 'Tubo de PVC para sistemas hidráulicos', 3),
(4, 'Tinta Acrílica Suvinil', 120.00, 'Tinta de alta qualidade para paredes', 4),
(5, 'Viga de Madeira 4x6', 89.50, 'Viga de madeira tratada para construção', 5),
(6, 'Serra Circular Makita', 299.00, 'Serra circular para cortes precisos', 1),
(7, 'Registro de Gaveta', 22.75, 'Registro para controle de fluxo de água', 3),
(8, 'Pincel Atlas 3 Polegadas', 6.99, 'Pincel para aplicação de tintas', 4);

SELECT * FROM tb_produtos WHERE valor > 100.00;

SELECT * FROM tb_produtos WHERE valor BETWEEN 70.00 AND 150.00;

SELECT * FROM tb_produtos WHERE nome_produto LIKE '%C%';

SELECT * FROM tb_produtos INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria;

SELECT * FROM tb_produtos
INNER JOIN tb_categorias ON tb_produtos.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria = 'Hidráulica';
