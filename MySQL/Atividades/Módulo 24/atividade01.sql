DROP DATABASE db_generation_game_online;

CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classes (
    id INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    tipo VARCHAR(50),
    PRIMARY KEY (id)
);

CREATE TABLE tb_personagens (
    id INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    pontos_ataque INT,
    pontos_defesa INT,
    pontos_vida INT,
    classe INT,
    PRIMARY KEY (id),
    FOREIGN KEY (classe) REFERENCES tb_classes(id)
);

INSERT INTO tb_classes (nome, tipo) VALUES ('Guerreiro', 'Combate corpo a corpo');
INSERT INTO tb_classes (nome, tipo) VALUES ('Mago', 'Mágico');
INSERT INTO tb_classes (nome, tipo) VALUES ('Arqueiro', 'Distância');
INSERT INTO tb_classes (nome, tipo) VALUES ('Curandeiro', 'Suporte');
INSERT INTO tb_classes (nome, tipo) VALUES ('Assassino', 'Agilidade');

INSERT INTO tb_personagens (nome, pontos_ataque, pontos_defesa, pontos_vida, classe) VALUES ('Felipe', 2200, 1600, 3500, 1);
INSERT INTO tb_personagens (nome, pontos_ataque, pontos_defesa, pontos_vida, classe) VALUES ('Bryan', 1800, 700, 1600, 5);
INSERT INTO tb_personagens (nome, pontos_ataque, pontos_defesa, pontos_vida, classe) VALUES ('Vinicius', 1800, 1500, 2300, 3);
INSERT INTO tb_personagens (nome, pontos_ataque, pontos_defesa, pontos_vida, classe) VALUES ('Pablo', 3000, 500, 1500, 2);
INSERT INTO tb_personagens (nome, pontos_ataque, pontos_defesa, pontos_vida, classe) VALUES ('Gabriel', 500, 1500, 3000, 4);
INSERT INTO tb_personagens (nome, pontos_ataque, pontos_defesa, pontos_vida, classe) VALUES ('Luiza', 1800, 900, 2000, 5);
INSERT INTO tb_personagens (nome, pontos_ataque, pontos_defesa, pontos_vida, classe) VALUES ('Victória', 2500, 1100, 2500, 1);
INSERT INTO tb_personagens (nome, pontos_ataque, pontos_defesa, pontos_vida, classe) VALUES ('Vitor', 800, 800, 1900, 4);

SELECT * FROM tb_personagens WHERE pontos_ataque > 2000;

SELECT * FROM tb_personagens WHERE pontos_defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens WHERE nome LIKE '%C%';

SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_personagens.classe = tb_classes.id;

SELECT * FROM tb_personagens INNER JOIN tb_classes ON tb_personagens.id = tb_classes.id WHERE tb_classes.nome = 'Arqueiro';