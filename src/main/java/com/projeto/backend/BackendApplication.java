package com.projeto.backend;

import com.projeto.backend.domain.*;
import com.projeto.backend.domain.enums.TipoCliente;
import com.projeto.backend.repositories.*;
import com.projeto.backend.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args)throws Exception{

		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);


		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		Estado est1 = new Estado(null, "Paraná");
		Estado est2 = new Estado(null, "Rio Grande do Sul");

		Cidade c1 = new Cidade(null, "Verê", est1);
		Cidade c2 = new Cidade(null, "Soledade", est2);
		Cidade c3 = new Cidade(null, "Itapejara", est1);

		est1.getCidades().addAll(Arrays.asList(c1, c3));
		est2.getCidades().addAll(Arrays.asList(c2));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

		Cliente cli1 = new Cliente(null, "Leonardo Sartori", "leonardosartori22@hotmail.com", "10157444945", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("999827353", "999222222"));

		Endereco e1 = new Endereco(null, "Linha Barra do Marrecas", "0", "Casa", "Interior", "85585000", cli1, c1);
		Endereco e2 = new Endereco(null, "Linha Barra", "0", "Casa", "Interior", "85580000", cli1, c3);

		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));

		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));

	}

}
