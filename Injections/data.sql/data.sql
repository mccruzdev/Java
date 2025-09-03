-- Script inicial de BD
CREATE TABLE productos (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL    -- big decimal por ser un dato más grandre el stock puede ser 99999999999.
);

INSERT INTO productos (nombre, precio, stock) VALUES
('Laptop', 2500.50, 10),
('Mouse', 50.00, 100),
('Teclado', 120.00, 50);
