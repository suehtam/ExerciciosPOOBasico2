import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args)
    {
        // Mostra uma mensagem de boas-vindas em uma caixa de diálogo simples
        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema!");

        // Solicita ao usuário que digite o nome e armazena em uma String
        String nome = JOptionPane.showInputDialog("Digite seu nome:");

        // Solicita a idade como texto, converte para int e armazena em 'idade'
        // Pode lançar NumberFormatException se o usuário digitar texto não numérico
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

        // Mostra uma caixa de diálogo de confirmação com opções Sim, Não, Cancelar
        // Valores retornados: 0 = YES, 1 = NO, 2 = CANCEL
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

        // Verifica o valor retornado e mostra mensagem correspondente
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
            JOptionPane.showMessageDialog(null, "Você escolheu CANCELAR.");
        }

        // Define um array de opções para um diálogo de opção customizado
        Object[] opcoes = {"Cadastrar", "Cancelar", "Ajuda" };

        // Abre um diálogo com título, mensagem e as opções definidas
        // Retorna o índice da opção escolhida (0, 1 ou 2) ou -1 se fechado
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

        // Aqui você poderia tratar 'escolha' com um switch ou if para executar ações
    }
}
