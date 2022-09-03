package com.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aula.entidade.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
