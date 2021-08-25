package br.com.zup;

public class Exercicio6 {
    public static void main(String[] args){
        float salarioPorHora = 12.50F;
        float qtdDeHoras = 160F;
        float totalDoSalario = salarioPorHora * qtdDeHoras;
        float valorPgImpostoRenda = totalDoSalario *11 / 100;
        float valorPgInss = totalDoSalario *8 / 100;
        float valorPgSindicato = totalDoSalario *5 /100;
        float salarioLiquido = totalDoSalario - valorPgImpostoRenda - valorPgInss - valorPgSindicato;

        System.out.println("Valor bruto do sálario é: R$ " + totalDoSalario);
        System.out.println("Valor pago para o INSS é: R$" + valorPgInss);
        System.out.println("Valor pago para o sindicato é: R$ " + valorPgSindicato);
        System.out.println("O salário líquido do funcionário é: R$ " + salarioLiquido);


    }
}