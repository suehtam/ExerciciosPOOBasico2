/*
11. Classificação do pH de uma Solução
Escreva um programa que leia um valor de pH (número decimal) inserido pelo usuário e
classifique a solução como:
• Ácida, se pH < 7
• Neutra, se pH == 7
• Básica, se pH > 7
Use estrutura if-else.
*/
import java.util.Scanner;
class Exercicio11
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do PH: ");
        double valorPH = sc.nextDouble();
        if(valorPH < 7)
        {
            System.out.println("A solução é Ácida");
        }
        else if(valorPH == 7)
        {
            System.out.println("A solução é Neutra");
        }
        else
        {
            System.out.println("A solução é Básica");
        }
    }
}
