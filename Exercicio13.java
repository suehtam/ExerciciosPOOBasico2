/*
13. Triagem de Sintomas
Escreva um programa que pergunte ao usuário:
• Sua temperatura (em graus Celsius)
• Se está com secreção nasal (S ou N)
• Se está com tosse (S ou N)
• Se está com dor no corpo (S ou N)
Com base nas respostas, exiba uma das seguintes mensagens:
• “Exames Especiais”, se temperatura ≥ 37 e todas as respostas forem “S”
• “Exames Básicos”, se temperatura ≥ 37 e as demais forem “N”
• “Liberado”, se temperatura < 37 e todas forem “N”
• “Exames Básicos”, se temperatura < 37 e houver pelo menos um “S”
• “Entrada inválida”, se qualquer resposta for diferente de “S” ou “N”
Use if-else e validação de entrada.
*/
import java.util.Scanner;
class Exercicio13
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua temperatura: ");
        double temperatura = sc.nextDouble();
        System.out.println("Você está com secreção? S ou N");
        String secrecao = sc.next();
        System.out.println("Você está com tosse? S ou N");
        String tosse = sc.next();
        System.out.println("Você está com dor no corpo? S ou N");
        String dorNoCorpo = sc.next();
    }
}
