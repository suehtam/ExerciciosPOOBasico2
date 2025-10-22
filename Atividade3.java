import javax.swing.JOptionPane;
public class Main
{
    public static void main(String[] args)
    {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        double notaProjeto1 = -1;
        double notaProjeto2 = -1;
        double notaProva1 = -1;
        double notaProva2 = -1;
        double notaAtividades= -1;
        double somaTotal = 0;
        do
        {
            notaProjeto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do projeto 1: "));
        }
        while(notaProjeto1 < 0 || notaProjeto1 > 2);
        do
        {
            notaProjeto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do projeto 2: "));
        }
        while(notaProjeto2 < 0 || notaProjeto2 > 2);
        do
        {
            notaProva1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 1: "));
        }
        while(notaProva1 < 0 || notaProva1 > 2);
        do
        {
            notaProva2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 2: "));
        }
        while(notaProva2 < 0 || notaProva2 > 2);
        do
        {
            notaAtividades = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota das atividades: "));
        }
        while(notaAtividades < 0 || notaAtividades > 2);
        somaTotal = notaProjeto1 + notaProjeto2 + notaProva1 + notaProva2 + notaAtividades;
    }
}
