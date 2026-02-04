package org.br.unipds.projetodeimplementacaojavaelite;

import org.br.unipds.projetodeimplementacaojavaelite.aulas.Modulo0ExerciciosPraticos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoDeImplementacaoJavaEliteApplication {

    static void main(String[] args) {
        SpringApplication.run(ProjetoDeImplementacaoJavaEliteApplication.class, args);
        Modulo0ExerciciosPraticos.ex1();
        Modulo0ExerciciosPraticos.meuContato();
        System.out.println();
        System.out.println(Modulo0ExerciciosPraticos.calculadoraIMCSemParametros());
        System.out.println(Modulo0ExerciciosPraticos.isAdult(17));
    }

}
