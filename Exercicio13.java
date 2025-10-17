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
        String secrecao = "";
        String tosse = "";
        String dorNoCorpo = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua temperatura: ");
        double temperatura = sc.nextDouble();
        while(!secrecao.equals("S") && !secrecao.equals("N"))
        {
            System.out.println("Você está com secreção? S ou N");
            secrecao = sc.next();
        }
        while(tosse != "S" && tosse != "N")
        {
            System.out.println("Você está com tosse? S ou N");
            tosse = sc.next();
        }
        while(dorNoCorpo != "S" && dorNoCorpo != "N")
        {
            System.out.println("Você está com dor no corpo? S ou N");
            dorNoCorpo = sc.next();
        }
    }
}
