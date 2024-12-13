package br.com.luhf;
import br.com.luhf.dao.ClienteMapDAO;
import br.com.luhf.dao.IClienteDAO;
import br.com.luhf.domain.Cliente;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.List;

public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args){
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        
        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null, 
                    "Opção inválida digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                                    "Green dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            if(isOpcaoSair(opcao)) {
                sair();
            }
            else if (isCadrasto(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados dos clientes separado por vírgula, confome o exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            }
            else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF: ", "Consultar", JOptionPane.INFORMATION_MESSAGE);
                consultar(dados);
            }
            else if (isExcluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                            "Digite o CPF do cliente que deseja excluir: ", "excluir", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            }
            else if (isAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                            "Digite o CPF do cliente que deseja Alterar: ", "excluir", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }


            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        }

    }

    private static void alterar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null,
                    "Cliente encontrado: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            String opcaoAlterar = JOptionPane.showInputDialog(null, "Deseja realmente alterar o cliente: " + cliente.getNome(),
                    "Confirmar Alterar", JOptionPane.INFORMATION_MESSAGE);
            if (opcaoAlterar.equalsIgnoreCase("sim")) {
                dados = JOptionPane.showInputDialog(null,
                        "Digite os dados dos clientes separado por vírgula, confome o exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade, Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                String[] dadosSeparados = dados.split(",");
                cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
                iClienteDAO.alterar(cliente);
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!",
                        "alterado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Cliente não encontrado.", "Falha", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void excluir(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null,
                    "Cliente encontrado: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            String opcaoExcluir = JOptionPane.showInputDialog(null, "Deseja realmente excluir o cliente: " + cliente.getNome(),
                    "Confirmar Excluir", JOptionPane.INFORMATION_MESSAGE);
            if (opcaoExcluir.equalsIgnoreCase("sim")) {
                iClienteDAO.excluir(Long.valueOf(dados));
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!",
                        "Excluido", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Cliente não encontrado.", "Falha", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null,
                    "Cliente encontrado: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Cliente não encontrado.", "Falha", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if (isCadastrado) {
                JOptionPane.showMessageDialog(null,
                    "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Cliente já se encontra cadastrado!", "Falha", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static boolean isCadrasto(String opcao) {
        if ("1".equals(opcao)) {
            return true;
        }
        return false;
    }
    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isExcluir(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

     private static boolean isAlterar(String opcao) {
        if ("4".equals(opcao)) {
            return true;
        }
        return false;
     }

    private static boolean isOpcaoSair(String opcao) {
        if ("5".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static void sair() {
        JOptionPane.showInputDialog(null,"Até logo", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoValida(String opcao) {
        if ("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
            return true;
        }
        return false;
    }

}
