/*
14. Calendário de Vacinação Infantil 
Escreva um programa que peça ao usuário o ano da primeira dose de uma vacina e o 
intervalo em anos entre as doses (periodicidade). 
Com base nisso, exiba os anos das 4 doses da vacina, incluindo a primeira. 
Use um loop for para fazer os cálculos.
*/
import java.util.Scanner;
class Exercicio14
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano da sua primeira dose: ");
        int anoInicial = sc.nextInt();
        System.out.println("Digite o intervalo das doses em anos: ");
        int intervalo = sc.nextInt();
        for(int i = 0; i < 4 ; i ++)
        {
            int anoDose = anoInicial + (i * intervalo);
            System.out.println("Dose " + (i + 1) + ":" + anoDose);
        }
    }
}
