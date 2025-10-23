import javax.swing.JOptionPane;
public class Main
{
    public static void main(String[] args)
    {
        while(true)
        {
            JOptionPane.showMessageDialog(null, "Sistema para Cálculo da Nota Final");
            String nome = JOptionPane.showInputDialog("Digite seu nome: ");
            double notaProjeto1 = -1;
            double notaProjeto2 = -1;
            double notaProva1 = -1;
            double notaProva2 = -1;
            double notaAtividades = -1;
            double somaTotal = 0;
            double notaMinimaFinal = 0;
            do {
                notaProjeto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do projeto 1: "));
            }
            while (notaProjeto1 < 0 || notaProjeto1 > 2);
            do {
                notaProjeto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do projeto 2: "));
            }
            while (notaProjeto2 < 0 || notaProjeto2 > 2);
            do {
                notaProva1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 1: "));
            }
            while (notaProva1 < 0 || notaProva1 > 2);
            do {
                notaProva2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da prova 2: "));
            }
            while (notaProva2 < 0 || notaProva2 > 2);
            do {
                notaAtividades = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota das atividades: "));
            }
            while (notaAtividades < 0 || notaAtividades > 2);
            somaTotal = notaProjeto1 + notaProjeto2 + notaProva1 + notaProva2 + notaAtividades;
            notaMinimaFinal = 6 - (notaProjeto1 + notaProjeto2 + notaAtividades);
            if (somaTotal >= 7) {
                if ((notaProjeto1 + notaProjeto2 + notaAtividades) < 4) {
                    JOptionPane.showMessageDialog(null, "Nome do aluno: " + nome + "\nSoma das 5 notas: " + somaTotal + "\nSituação: O aluno está reprovado sem direito à final!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nome do aluno: " + nome + "\nSoma das 5 notas: " + somaTotal + "\nSituação: O aluno está aprovado!");
                }
            } else if (somaTotal < 7) {
                if ((notaProjeto1 + notaProjeto2 + notaAtividades) < 4) {
                    JOptionPane.showMessageDialog(null, "Nome do aluno: " + nome + "\nSoma das 5 notas: " + somaTotal + "\nSituação: O aluno está reprovado sem direito à final!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nome do aluno: " + nome + "\nSoma das 5 notas: " + somaTotal + "\nSituação: O Aluno está na final!\n A nota mínima para aprovação é: " + notaMinimaFinal);
                }
            }
            Object[] opcoes = {"Sim", "Não"};
            int escolha = JOptionPane.showOptionDialog
                    (
                            null,
                            "Deseja calcular outro aluno?",
                            "Verificação",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opcoes,
                            opcoes[0]
                    );
            if(escolha != 0)
            {
                JOptionPane.showMessageDialog(null, "Encerrando o programa. Até mais!");
                break;
            }
        }
    }
}
