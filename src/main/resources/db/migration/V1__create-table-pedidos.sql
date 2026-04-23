CREATE TABLE pedido (
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    cliente_nome VARCHAR(255) NOT NULL,
    data_pedido  DATE,
    valor_total  DOUBLE       NOT NULL CHECK (valor_total >= 0)
);
