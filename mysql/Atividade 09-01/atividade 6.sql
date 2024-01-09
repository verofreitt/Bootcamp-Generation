CREATE DATABASE db_curso_da_minha_vida;
USE db_curso_da_minha_vida;

CREATE TABLE tb_categorias (
    id_categoria INT PRIMARY KEY,
    nome_categoria VARCHAR(50) NOT NULL,
    descricao_categoria VARCHAR(255) NOT NULL
);

INSERT INTO tb_categorias (id_categoria, nome_categoria, descricao_categoria) VALUES
(1, 'Programação', 'Cursos relacionados à programação de software'),
(2, 'Design', 'Cursos de design gráfico e web design'),
(3, 'Marketing Digital', 'Cursos sobre estratégias de marketing online'),
(4, 'Idiomas', 'Cursos de aprendizado de idiomas'),
(5, 'Saúde e Bem-Estar', 'Cursos voltados para a saúde física e mental');

CREATE TABLE tb_cursos (
    id_curso INT PRIMARY KEY,
    nome_curso VARCHAR(50) NOT NULL,
    valor DECIMAL(7,2) NOT NULL,
    descricao_curso VARCHAR(255) NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

INSERT INTO tb_cursos (id_curso, nome_curso, valor, descricao_curso, id_categoria) VALUES
(1, 'Java Programming Masterclass', 799.99, 'Aprenda Java do básico ao avançado', 1),
(2, 'Graphic Design Essentials', 599.00, 'Fundamentos essenciais de design gráfico', 2),
(3, 'Digital Marketing Fundamentals', 899.50, 'Princípios básicos de marketing digital', 3),
(4, 'Spanish Language Course', 349.99, 'Curso de espanhol para iniciantes', 4),
(5, 'Mindfulness Meditation', 149.00, 'Técnicas de meditação para o bem-estar mental', 5),
(6, 'Python for Data Science', 699.99, 'Utilize Python para análise de dados', 1),
(7, 'Web Development Bootcamp', 999.00, 'Treinamento intensivo em desenvolvimento web', 1),
(8, 'Healthy Cooking Workshop', 449.50, 'Oficina de culinária saudável', 5);

SELECT * FROM tb_cursos WHERE valor > 500.00;

SELECT * FROM tb_cursos WHERE valor BETWEEN 600.00 AND 1000.00;

SELECT * FROM tb_cursos WHERE nome_curso LIKE '%J%';

SELECT * FROM tb_cursos INNER JOIN tb_categorias ON tb_cursos.id_categoria = tb_categorias.id_categoria;

SELECT * FROM tb_cursos
INNER JOIN tb_categorias ON tb_cursos.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria = 'Programação';
