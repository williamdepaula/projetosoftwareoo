package io.github.williamdepaula.projetosoftwareoo;

import io.github.williamdepaula.projetosoftwareoo.domain.Categoria;
import io.github.williamdepaula.projetosoftwareoo.domain.Cidade;
import io.github.williamdepaula.projetosoftwareoo.domain.Estado;
import io.github.williamdepaula.projetosoftwareoo.domain.Produto;
import io.github.williamdepaula.projetosoftwareoo.repositories.CategoriaRepository;
import io.github.williamdepaula.projetosoftwareoo.repositories.CidadeRepository;
import io.github.williamdepaula.projetosoftwareoo.repositories.EstadoRepository;
import io.github.williamdepaula.projetosoftwareoo.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProjetosoftwareooApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetosoftwareooApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "Camisas");
        Categoria cat2 = new Categoria(null, "Vestidos");

        Produto p1 = new Produto(null, "Vestido", 200.0);
        Produto p2 = new Produto(null, "Camiseta", 40.0);

        cat2.getProdutos().add(p1);
        cat1.getProdutos().add(p2);

        p1.getCategorias().add(cat2);
        p2.getCategorias().add(cat1);

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
        produtoRepository.saveAll(Arrays.asList(p1, p2));


        Estado est1 = new Estado(null, "Mato Grosso do Sul");
        Estado est2 = new Estado(null, "São Paulo");

        Cidade cid1 = new Cidade(null, "Coxim", est1);
        Cidade cid2 = new Cidade(null, "Campo Grande", est1);
        Cidade cid3 = new Cidade(null, "São Paulo", est2);

        est1.setCidades(Arrays.asList(cid1, cid2));
        est2.setCidades(Arrays.asList(cid3));

        estadoRepository.saveAll(Arrays.asList(est1, est2));
        cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
    }
}
