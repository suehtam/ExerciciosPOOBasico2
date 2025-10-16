/*
12. Situação Acadêmica do Aluno
Desenvolva um programa que peça três notas ao usuário (valores entre 0 e 100), calcule
a média e classifique a situação do aluno:
• “Aprovado”, se média entre 70 e 100
• “Reprovado”, se média entre 0 e 40
• “Final”, se média entre 40 e 70
• “Média inválida”, se estiver fora do intervalo de 0 a 100
Use estruturas if-else encadeadas.
*/
import java.util.Scanner;
class Exercicio12
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1(Entre 0 e 100): ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2(Entre 0 e 100): ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3(Entre 0 e 100): ");
        double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média foi: " + media);
        if(media >= 70 && media <= 100)
        {
            System.out.println("Aprovado!");
        }
        else if(media >= 0 && media < 40)
        {
            System.out.println("Reprovado!");
        }
        else if(media >= 40 && media <70)
        {
            System.out.println("Final!");
        }
        else
        {
            System.out.println("Média inválida!");
        }
    }
}
