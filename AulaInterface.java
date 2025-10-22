import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema!");

        String nome = obterNome();
        Integer idade = obterIdade(); // pode ser null se usuário cancelar

        int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (continuar) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Você escolheu SIM.");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Você escolheu NÃO.");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null, "Você escolheu CANCELAR.");
                break;
            default: // JOptionPane.CLOSED_OPTION ou outros
                JOptionPane.showMessageDialog(null, "Janela fechada sem seleção.");
                break;
        }

        Object[] opcoes = {"Cadastrar", "Cancelar", "Ajuda"};
        int escolha = JOptionPane.showOptionDialog(null,
                "O que deseja fazer?",
                "Menu Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        switch (escolha) {
            case 0: // Cadastrar
                if (nome == null) {
                    JOptionPane.showMessageDialog(null, "Cadastro cancelado: nenhum nome informado.");
                } else if (idade == null) {
                    JOptionPane.showMessageDialog(null, "Cadastro cancelado: nenhuma idade informada.");
                } else {
                    // Aqui executaria a lógica de cadastro real
                    JOptionPane.showMessageDialog(null, "Cadastrado:\nNome: " + nome + "\nIdade: " + idade);
                }
                break;
            case 1: // Cancelar
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário.");
                break;
            case 2: // Ajuda
                JOptionPane.showMessageDialog(null, "Ajuda: escolha Cadastrar para registrar nome e idade.");
                break;
            default: // -1 quando fecha a janela
                JOptionPane.showMessageDialog(null, "Menu fechado sem escolha.");
                break;
        }
    }

    private static String obterNome() {
        while (true) {
            String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
            if (nome == null) { // usuário cancelou ou fechou a caixa
                int confirmar = JOptionPane.showConfirmDialog(null,
                        "Nenhum nome informado. Deseja cancelar a operação?", "Confirmar",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirmar == JOptionPane.YES_OPTION) {
                    return null;
                } else {
                    continue; // volta a pedir o nome
                }
            }
            nome = nome.trim();
            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome vazio. Digite um nome válido.");
                continue;
            }
            return nome;
        }
    }

    private static Integer obterIdade() {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, "Digite sua idade:");
            if (entrada == null) { // usuário cancelou ou fechou a caixa
                int confirmar = JOptionPane.showConfirmDialog(null,
                        "Nenhuma idade informada. Deseja cancelar a operação?", "Confirmar",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirmar == JOptionPane.YES_OPTION) {
                    return null;
                } else {
                    continue; // volta a pedir a idade
                }
            }
            entrada = entrada.trim();
            if (entrada.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Entrada vazia. Digite sua idade.");
                continue;
            }
            try {
                int idade = Integer.parseInt(entrada);
                if (idade < 0) {
                    JOptionPane.showMessageDialog(null, "Idade inválida. Informe um número positivo.");
                    continue;
                }
                return idade;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número inteiro para a idade.");
            }
        }
    }
}
