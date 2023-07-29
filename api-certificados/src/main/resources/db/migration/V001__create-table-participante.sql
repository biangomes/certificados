CREATE TABLE Participante (
    id SERIAL PRIMARY KEY,
    nome TEXT,
    email TEXT,
    telefone TEXT,
    cpf TEXT NOT NULL UNIQUE
);