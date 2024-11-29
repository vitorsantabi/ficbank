package view;

import controller.ContaController;
import model.conta.Bonificada;
import model.conta.Conta;
import model.conta.Poupanca;

import java.util.Scanner;

public class PrincipalFicrBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MenusFicrBank menus = new MenusFicrBank();
        ContaController contaController = new ContaController();
        String continuar;
        int op;

        do{
            menus.menuPrincipal();
            op = input.nextInt();

            switch (op){
                case 1: contaController.criarConta();  break;
                case 2: contaController.listarTodasContas();    break;
                case 3: contaController.buscarContaPorId(); break;
                case 5: contaController.removerContaPorId(); break;
                default: System.out.println("Opção inválida. Tente novamente!");
            }
            System.out.print("Deseja Continuar?: ");
            continuar = input.next();

        } while (continuar.equalsIgnoreCase("sim"));
    }
}
