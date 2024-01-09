CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classes (
    id_classe INT PRIMARY KEY,
    nome_classe VARCHAR(50) NOT NULL,
    tipo_classe VARCHAR(50) NOT NULL
);

INSERT INTO tb_classes (id_classe, nome_classe, tipo_classe) VALUES
(1, 'Guerreiro', 'Tank'),
(2, 'Mago', 'DPS'),
(3, 'Arqueiro', 'DPS'),
(4, 'Ladrão', 'Assassino'),
(5, 'Cleric', 'Curandeiro');

CREATE TABLE tb_personagens (
    id_personagem INT PRIMARY KEY,
    nome_personagem VARCHAR(50) NOT NULL,
    poder_ataque INT NOT NULL,
    poder_defesa INT NOT NULL,
    id_classe INT,
    FOREIGN KEY (id_classe) REFERENCES tb_classes(id_classe)
);

INSERT INTO tb_personagens (id_personagem, nome_personagem, poder_ataque, poder_defesa, id_classe) VALUES
(1, 'Aragorn', 2500, 1800, 1),
(2, 'Gandalf', 3000, 1500, 2),
(3, 'Legolas', 2200, 1200, 3),
(4, 'Smeagol', 1800, 800, 4),
(5, 'Healer123', 1200, 2200, 5),
(6, 'WarriorX', 2800, 2000, 1),
(7, 'ShadowRogue', 2000, 1000, 4),
(8, 'ArcherQueen', 2400, 1600, 3);

SELECT * FROM tb_personagens WHERE poder_ataque > 2000;

SELECT * FROM tb_personagens WHERE poder_defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens WHERE nome_personagem LIKE '%C%';

SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_personagens.id_classe = tb_classes.id_classe;

SELECT * FROM tb_personagens 
INNER JOIN tb_classes ON tb_personagens.id_classe = tb_classes.id_classe
WHERE tb_classes.nome_classe = 'Arqueiro';