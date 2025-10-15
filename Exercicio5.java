/*
5. Números Pares de 1 a 20
Crie um programa que utilize um loop for tradicional para imprimir na tela todos os
números pares de 1 a 20.
*/
class Exercicio5
{
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 20; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
