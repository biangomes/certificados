CREATE TABLE Participante (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255),
  email VARCHAR(100),
  telefone VARCHAR(11),
  cpf TEXT NOT NULL UNIQUE
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;

