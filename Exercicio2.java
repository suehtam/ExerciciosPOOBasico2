/*
2. Número Positivo, Negativo ou Zero
Crie um programa que peça ao usuário para inserir um número inteiro.
Utilize uma estrutura if-else para informar se o número é positivo, negativo ou igual a
zero.
*/
import java.util.Scanner;
class Exercicio2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        if(numero > 0)
        {
            System.out.println("O número é positivo.");
        }
        else if(numero < 0)
        {
            System.out.println("O número é negativo.");
        }
        else if(numero == 0)
        {
            System.out.println("O número é 0.");
        }
    }
}
