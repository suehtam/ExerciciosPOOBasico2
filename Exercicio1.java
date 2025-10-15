/*
1. Faixa Etária
Escreva um programa que solicite ao usuário que insira sua idade. Em seguida, utilize
uma estrutura if-else-if para determinar a faixa etária da pessoa com base nos
seguintes critérios:
• Criança: até 12 anos
• Adolescente: de 13 a 17 anos
• Adulto: de 18 a 59 anos
• Idoso: 60 anos ou mais
O programa deve imprimir a faixa etária correspondente.
*/
import java.util.Scanner;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        if(idade >= 0 && idade <= 12)
        {
            System.out.println("Você é uma criança.");
        }
        else if(idade >=13 && idade <= 17)
        {
            System.out.println("Você é um adolescente.");
        }
        else if(idade >= 18 && idade <= 59)
        {
            System.out.println("Você é um adulto.");
        }
        else if(idade >= 60)
        {
            System.out.println("Você é um idoso.");
        }
        else
        {
            System.out.println("Idade inválida.");
        }
    }
}
