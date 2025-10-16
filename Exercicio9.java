/*
9. Números Pares até N com while 
Escreva um programa que solicite ao usuário que insira um número inteiro N. 
Utilize um loop while para imprimir todos os números pares de 1 até N. 
*/
import java.util.Scanner;
class Exercicio9
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int contador = 1;
        while(contador <= numero)
        {
            if(contador % 2 == 0)
            {
                System.out.println(contador);
            }
            contador++;
        }
    }
}
