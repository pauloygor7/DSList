CREATE TABLE tb_game_list (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255)
);

CREATE TABLE tb_game (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    game_year INTEGER NOT NULL,
    genre VARCHAR(255) NOT NULL,
    platforms VARCHAR(255) NOT NULL,
    score DOUBLE NOT NULL,
    img_url VARCHAR(255) NOT NULL,
    short_description TEXT NOT NULL,
    long_description TEXT NOT NULL
);

CREATE TABLE tb_belonging (
    game_id BIGINT,
    list_id BIGINT,
    position INTEGER,
    FOREIGN KEY (game_id) REFERENCES tb_game (id),
    FOREIGN KEY (list_id) REFERENCES tb_game_list (id)
);