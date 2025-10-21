import javax.swing.JOptionPane;
public class Main
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema!");
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        if(resposta == 0)
        {
            JOptionPane.showMessageDialog(null, "Você escolheu SIM.");
        }
        else if(resposta == 1)
        {
            JOptionPane.showMessageDialog(null, "Você escolheu NÃO.");
        }
        else if(resposta == 2)
        {
            JOptionPane.showMessageDialog(null, "vOCÊ ESCOLHEU CANCELAR.");
        }
        Object[] opcoes = {"Cadastrar", "Cancelar", "Ajuda" };
        int escolha = JOptionPane.showOptionDialog
                (
                        null,
                        "O que deseja fazer?",
                        "Menu Principal",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcoes,
                        opcoes[0]
                );
    }
}
