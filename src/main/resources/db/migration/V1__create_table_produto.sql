CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE produto (
    id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(500) NOT NULL,
    complementar VARCHAR(255),
    valor NUMERIC(10,2) NOT NULL
);