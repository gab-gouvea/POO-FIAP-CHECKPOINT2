package br.com.fiap3ESPV.checkpoint2.model;

import br.com.fiap3ESPV.checkpoint2.PedidoDTO.UpdatePedidoDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@NoArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String clienteNome;

    @CreatedDate
    private LocalDate dataPedido;

    @PositiveOrZero
    @Column(nullable = false)
    private Double valorTotal;

    public Pedido(String clienteNome, double valorTotal) {
        this.clienteNome = clienteNome;
        this.valorTotal = valorTotal;
    }

    public void updateValues(UpdatePedidoDTO data) {
        if (data.clienteNome() != null) {
            this.clienteNome = data.clienteNome();
        }
        if (data.valorTotal() != null) {
            this.valorTotal = data.valorTotal();
        }
    }
}
