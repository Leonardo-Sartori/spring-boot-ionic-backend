package com.projeto.backend;

import com.projeto.backend.domain.*;
import com.projeto.backend.domain.enums.EstadoPagamento;
import com.projeto.backend.domain.enums.TipoCliente;
import com.projeto.backend.repositories.*;
import com.projeto.backend.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

    @Autowired
	private CategoriaRepository categoriaRepository;
    @Autowired
	private ProdutoRepository produtoRepository;
    @Autowired
	private EstadoRepository estadoRepository;
    @Autowired
	private CidadeRepository cidadeRepository;
    @Autowired
	private ClienteRepository clienteRepository;
    @Autowired
	private EnderecoRepository enderecoRepository;
    @Autowired
	private PedidoRepository pedidoRepository;
    @Autowired
	private PagamentoRepository pagamentoRepository;
    @Autowired
	private ItemPedidoRepository itemPedidoRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args)throws Exception {

	}

}
