/*
8. Caixa Eletrônico – Saque em Notas 
Peça ao usuário para inserir um valor inteiro em reais (entre 1 e 1000). 
Utilize condicionais para calcular a quantidade mínima de notas necessárias de R$100, R$50, 
R$20, R$10, R$5 e R$2. 
Exiba a quantidade de cada nota usada.
*/
import java.util.Scanner;
class Exercicio8
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor entre 1 e 1000: ");
        int valorReais = sc.nextInt();
        int nota2 = 0;
        int nota5 = 0;
        int nota10 = 0;
        int nota20 = 0;
        int nota50 = 0;
        int nota100 = 0;
        if(valorReais >=1 && valorReais <= 1000)
        {
            if(valorReais >= 100)
            {
                nota100 = valorReais / 100;
                valorReais %= 100;
            }
            if(valorReais >= 50)
            {
                nota50 = valorReais / 50;
                valorReais %= 50;
            }
            if(valorReais >= 20)
            {
                nota20 = valorReais / 20;
                valorReais %= 20;
            }
            if(valorReais >= 10)
            {
                nota10 = valorReais / 10;
                valorReais %= 10;
            }
            if(valorReais >= 5)
            {
                nota5 = valorReais / 5;
                valorReais %= 5;
            }
            if(valorReais >= 2)
            {
                nota2 = valorReais / 2;
                valorReais %= 2;
            }
            System.out.println("Notas de 2: " + nota2);
            System.out.println("Notas de 5: " + nota5);
            System.out.println("Notas de 10: " + nota10);
            System.out.println("Notas de 20: " + nota20);
            System.out.println("Notas de 50: " + nota50);
            System.out.println("Notas de 100: " + nota100);
            if (valorReais > 0)
            {
                System.out.println("Sobrou " + valorReais);
            }
        }
        else
        {
            System.out.println("Valor inválido.");
        }
    }
}
