/*
10. Conversor de Temperatura com Opção de Escala 
Faça um programa que solicite ao usuário a escala de temperatura que está utilizando (C 
para Celsius, F para Fahrenheit, ou K para Kelvin) e o valor da temperatura. 
Com base na escala fornecida, converta para as outras duas e exiba os resultados. 
Use estruturas condicionais if-else ou switch-case para tratar cada caso.  
*/
import java.util.Scanner;
class Exercicio10
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a escala de temperatura (C, F ou K): ");
        String escala = sc.nextLine();
        System.out.println("Digite o valor da temperatura: ");
        double temperatura = sc.nextDouble();
        switch(escala)
        {
            case "C":
            {
                System.out.println("A temperatura em Celsius é: " + temperatura);
                System.out.println("A temperatura em Fahrenheit é: " + (temperatura * 9.0 / 5.0 + 32));
                System.out.println("A temperatura em Kelvin é: " + (temperatura + 273.15));
                break;
            }
            case "F":
            {
                System.out.println("A temperatura em Celsius é: " + ((temperatura - 32) / 1.8));
                System.out.println("A temperatura em Fahrenheit é: " + temperatura);
                System.out.println("A temperatura em Kelvin é: " + ((temperatura - 32) * 5.0 / 9.0 + 273.15));
                break;
            }
            case "K":
            {
                System.out.println("A temperatura em Celsius é: " + (temperatura - 273.15));
                System.out.println("A temperatura em Fahrenheit é: " + ((temperatura - 273.15) * 9.0 / 5.0 + 32));
                System.out.println("A temperatura em Kelvin é: " + temperatura);
                break;
            }
        }
    }
}
