/*
4. Jogo de Adivinhação
Escreva um programa que gere aleatoriamente um número de 1 a 100.
Solicite ao usuário que tente adivinhar o número e use um do-while para permitir
múltiplas tentativas até que o número seja acertado.
A cada tentativa, informe se o número digitado é maior ou menor que o número
sorteado.
Obs: Importe a biblioteca Random
*/
import java.util.Scanner;
import java.util.Random;
class Exercicio4
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1, 100);
        int numeroDigitado;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número: ");
            numeroDigitado = sc.nextInt();
            if(numeroDigitado > numeroAleatorio)
            {
                System.out.println("O número digitado é maior que o número aleatório.");
            }
            else if(numeroDigitado < numeroAleatorio)
            {
                System.out.println("O número digitado é menor que o número aleatório");
            }
            else if(numeroDigitado == numeroAleatorio)
            {
                System.out.println("O número digitado é igual ao número aleatório");
            }
        }
        while (numeroDigitado != numeroAleatorio);
    }
}
