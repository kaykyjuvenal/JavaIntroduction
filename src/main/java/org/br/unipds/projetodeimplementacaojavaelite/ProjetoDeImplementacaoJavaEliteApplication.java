package org.br.unipds.projetodeimplementacaojavaelite;

import org.br.unipds.projetodeimplementacaojavaelite.aulas.Aula1ExerciciosPraticos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoDeImplementacaoJavaEliteApplication {

    static void main(String[] args) {
        SpringApplication.run(ProjetoDeImplementacaoJavaEliteApplication.class, args);
        Aula1ExerciciosPraticos.ex1();
        Aula1ExerciciosPraticos.meuContato();
    }

}
