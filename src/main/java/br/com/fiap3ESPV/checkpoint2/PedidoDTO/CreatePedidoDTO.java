package br.com.fiap3ESPV.checkpoint2.PedidoDTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreatePedidoDTO(

        @NotBlank
        String clienteNome,

        @NotNull
        Double valorTotal
) {
}
