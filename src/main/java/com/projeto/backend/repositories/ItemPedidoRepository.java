package com.projeto.backend.repositories;

import com.projeto.backend.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository  extends JpaRepository<ItemPedido, Integer> {
}
