package org.br.unipds.projetodeimplementacaojavaelite.aulas;

import java.util.ArrayList;

public class Modulo0ExerciciosPraticos {
    public static void ex1() {
        String texto = "Nome: Kayky Flávio Juvenal\nIdade: 22\nCidade: São Carlos\n";
        System.out.println(texto);
    }
    public static void meuContato(){
        String nome = "Nome: Kayky Flávio Juvenal ";
        String telefone = "| Email: neguito.juvenal@gmail.com ";
        String email = "| Telefone: 16982149333";
        System.out.println(nome);
        System.out.println(telefone);
        System.out.println(email);
        System.out.print(nome);
        System.out.print(telefone);
        System.out.print(email);
    }
    public static double calculadoraIMCSemParametros(){
        double peso = 130.2;
        double altura = 1.95;
        return Math.round(peso / (altura * altura));
    }
    public static String isAdult(int idade){
        if (idade >=  18){
            return "Acesso Permitido!";
        }else{
            return "Acesso Negado!";
        }
    }


    //1. Lista de Compras: Crie um array de String chamado listaDeCompras e
//inicialize-o com 5 itens que você precisa comprar. Em seguida, use um laço
//for-each para imprimir no console a frase "Não esquecer de comprar:
//[item]" para cada item da lista.
//2. Calculando a Média de Notas: Crie um array de double com 5 notas de um
//aluno (ex: 8.5, 9.0, 7.2, 6.0, 10.0). Utilize um laço for clássico para somar
//todas as notas e, ao final, calcule e imprima a média aritmética das notas
// no console.
//"""
    public static void retornaAvisoCompras(){
        var listaDeCompras = new ArrayList<String>();
        listaDeCompras.add("Presunto");
        listaDeCompras.add("Queijo");
        listaDeCompras.add("Arroz");
        listaDeCompras.add("Feijão");
        listaDeCompras.forEach(s -> System.out.println("Não esquecer de comprar: " + s));
    }
    public static double retornaMediaDeNotas(){
        ArrayList<Double>  listaDeNotas = new ArrayList<Double>();
        listaDeNotas.add(5.0);
        listaDeNotas.add(10.0);
        listaDeNotas.add(6.5);
        listaDeNotas.add(9.8);
        double valorTotal = 0.0;
        double quantidadeTotal = listaDeNotas.size();
        for(int i = 0; i < listaDeNotas.size();i++) {
            valorTotal += listaDeNotas.get(i);
        };
        return Math.round(valorTotal/quantidadeTotal);
    }

}

