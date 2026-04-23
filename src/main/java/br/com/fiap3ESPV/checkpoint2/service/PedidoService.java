package br.com.fiap3ESPV.checkpoint2.service;

import br.com.fiap3ESPV.checkpoint2.PedidoDTO.CreatePedidoDTO;
import br.com.fiap3ESPV.checkpoint2.PedidoDTO.UpdatePedidoDTO;
import br.com.fiap3ESPV.checkpoint2.model.Pedido;
import br.com.fiap3ESPV.checkpoint2.repository.PedidoRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Transactional
    public Pedido create(@RequestBody @Valid CreatePedidoDTO data) {
        Pedido entity = new Pedido(data.clienteNome(), data.valorTotal());
        return pedidoRepository.save(entity);
    }

    public Pedido findById(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    @Transactional
    public Pedido update(@RequestBody @Valid UpdatePedidoDTO data, Long id) {
        Pedido pedido = pedidoRepository.findById(id).orElse(null);
        pedido.updateValues(data);
        return pedidoRepository.save(pedido);
    }

    @Transactional
    public void deleteById(Long id) {
        Pedido pedido = pedidoRepository.findById(id).orElse(null);
        pedidoRepository.delete(pedido);
    }
}
