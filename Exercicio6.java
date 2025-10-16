/*
6. Verificação de Senha 
Faça um programa que peça ao usuário para inserir uma senha. 
Utilize um while para permitir várias tentativas, até que o usuário digite a senha correta 
(por exemplo: "senha123"). 
Ao acertar, exiba a mensagem "Acesso permitido".
*/
import java.util.Scanner;
class Exercicio6
{
    public static void main(String[] args) 
    {
        String senha = "Senha123";
        Scanner sc = new Scanner(System.in);
        String tentativa = "";
        while(!senha.equals(tentativa))
        {
            System.out.println("Digite a sua senha: ");
            tentativa = sc.nextLine();
            if(!senha.equals(tentativa))
            {
                System.out.println("Senha incorreta");
            }
        }
        System.out.println("Acesso permitido");
    }
}
