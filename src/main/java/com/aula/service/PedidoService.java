package com.aula.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.entidade.Pedido;
import com.aula.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	PedidoRepository repo;
	
	public Pedido salvar (Pedido pedido) {
		Pedido p = repo.save(pedido);
				//aqui fazemos a injeção de nosso produto
		return p;
	}

}
