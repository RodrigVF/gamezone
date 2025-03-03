--V1_create_tb_events.sql
CREATE TABLE tb_events (
    id SERIAL PRIMARY KEY,
    identifier VARCHAR(255) NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    organizer VARCHAR(255) NOT NULL,
    status VARCHAR(255) NOT NULL,
    max_participants INTEGER NOT NULL,
    start_date TIMESTAMP NOT NULL,
    end_date TIMESTAMP NOT NULL,
    description TEXT,
    game VARCHAR(255),
    banner_img_url VARCHAR(255),
    stream_url VARCHAR(255),
    discord_url VARCHAR(255)
);