package View;

import Control.ControleCliente;
import Control.ControleConta;
import Model.Cliente;
import javax.swing.JOptionPane;

public class BancoApp {
    public static String menu(){
        return "Banco AP2\n\n" +
                "1-Criar Conta\n" +
                "2-Depositar Valor\n" +
                "3-Sacar Valor\n" +
                "4-Consultar Saldo\n" +
                "5-Mostrar Histórico\n" +
                "6-Imprimir Contas\n"+
                "7-Cadastrar Cliente\n"+
                "0-Finalizar\n\n" +
                "Digite a opção desejada:";
    }
    public static void main(String[] args) {
        int op;
        ControleConta cConta = new ControleConta();
        ControleCliente cCliente = new ControleCliente();
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        while (op!=0){
            switch (op){
                case 1:{//criar conta
                    long cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF do cliente:"));
                    Integer option = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de conta deseja?\n1-Corrente\n2-Poupança"));
                    switch(option){
                        case 1:
                            break;
                        case 2:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção Inválida" );
                    }

                    Cliente c = cCliente.pesquisarCliente(cpf);
                    if (c!=null){
                        cConta.cadastrarConta(c);
                        JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!" );
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "CPF inválido" );
                    }

                    break;
                }
                case 2:{//depositar
                    int numConta =
                            Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
                    double valor =
                            Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito:"));
                    cConta.depoistar(numConta, valor);
                    JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso" );
                    break;
                }
                case 3: { //sacar
                    int numConta =
                            Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
                    double valor =
                            Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
                    if (cConta.sacar(numConta, valor)){
                        JOptionPane.showMessageDialog(null, "Saque realizado con sucesso" );
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Valor inválido" );
                    break;
                }
                case 4: {//consultar saldo
                    int numConta =
                            Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
                    JOptionPane.showMessageDialog(null, "Conta: "+ numConta+"\nSaldo: "+cConta.consultarSaldo(numConta));
                    break;
                }
                case 5: {// mostrar histórico
                    int numConta =
                            Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
                    JOptionPane.showMessageDialog(null,
                            cConta.mostrarHistorico(numConta));
                    break;
                }
                case 6: { //imprimir contas
                    JOptionPane.showMessageDialog(null, cConta.imprimirContas() );
                    break;
                }
                case 7: {//Cadastrar Cleinte
                    String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    long cpf = Long.parseLong(JOptionPane.showInputDialog("Digite o CPF:"));
                    cCliente.cadastrarCliente(nome, cpf);
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                }
            }
            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }
}