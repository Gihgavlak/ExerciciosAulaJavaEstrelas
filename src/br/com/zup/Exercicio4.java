package br.com.zup;

public class Exercicio4 {
    public static void main(String[] args){
        float qtdHorasTrabalhadas = 160F;
        float salarioPorHora = 12.5F;
        float salarioBruto = qtdHorasTrabalhadas * salarioPorHora;

        System.out.println("Você trabalhou "+ qtdHorasTrabalhadas + "hrs");
        System.out.println("Então o seu salário mensal é: R$" + salarioBruto );
    }
}
