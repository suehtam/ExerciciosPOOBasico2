/*
15. Criativa – Cofrinho Digital          
Crie um programa que simule um cofrinho. Solicite ao usuário: 
• Quantas moedas de R$0,25 ele tem 
• Quantas de R$0,50 
• Quantas de R$1,00 
O programa deve calcular o valor total economizado e exibir a quantia final formatada 
com duas casas decimais. 
Use operadores aritméticos e estrutura simples.
*/
import java.util.Scanner;
class Exercicio15
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de moedas de 25 centavos: ");
        int moedas25 = sc.nextInt();
        System.out.println("Digite a quantidade de moedas de 50 centavos: ");
        int moedas50 = sc.nextInt();
        System.out.println("Digite a quantidade de moedas de 1 real: ");
        int moedas100 = sc.nextInt();
        System.out.println("O valor total economizado foi: " + ((moedas25 * 0.25) + (moedas50 * 0.5) + (moedas100 * 1)));
    }
}
