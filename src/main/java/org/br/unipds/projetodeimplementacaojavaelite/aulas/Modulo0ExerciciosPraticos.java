package org.br.unipds.projetodeimplementacaojavaelite.aulas;


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
    public String isAdult(int idade){
        if (idade >=  18){
            return "Acesso Permitido!";
        }else{
            return "Acesso Negado!";
        }
    }
}
