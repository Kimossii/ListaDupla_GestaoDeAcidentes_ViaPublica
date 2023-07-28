import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Acotecimento acidente = new Acotecimento ();
        Scanner teclado = new Scanner(System.in);

        int opcao;
        do {
            Menu();
            System.out.print("Digite a Opção: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1: {

                    System.out.println("\n==Inserir Dados da Vitima ---");
                    System.out.print("Digite o Nome: ");
                    teclado.nextLine();
                    String nome = teclado.nextLine();
                    System.out.println("Digita idade: ");
                    Integer idade = teclado.nextInt();
                    System.out.println("Digita a Morada: ");
                    teclado.nextLine();
                    String morada = teclado.nextLine();
                    System.out.print("Digite a gravidade de Lesao: ");
                    String lesao = teclado.nextLine();

                    Vitima vitima = new Vitima(nome,idade,morada,lesao);

                    System.out.println("\n==Inserir Dados do Condutor---");
                    System.out.print("Digite o Nome: ");
                    String nome2 = teclado.nextLine();
                    System.out.println("Digita idade: ");
                    Integer idade2 = teclado.nextInt();
                    System.out.println("Digita a Morada: ");
                    teclado.nextLine();
                    String morada2 = teclado.nextLine();
                    System.out.print("Digite o numero da Carta de Conduçao: ");
                    String carta = teclado.nextLine();
                    System.out.print("Digite Valor de Perda: ");
                    Float perda = teclado.nextFloat();
                    Condutor condutor = new Condutor(nome2,idade2,morada2,carta,perda);

                    System.out.println("\n==Inserir Dados do Automovel em Causa ---");
                    System.out.print("Digite o numero de Matrcula: ");
                    teclado.nextLine();
                    String matricula = teclado.nextLine();
                    System.out.println("Digita a Marca do Carro: ");
                    String marca = teclado.nextLine();
                    System.out.println("Digita a Cor do Carro: ");
                    String cor = teclado.nextLine();
                    Automovel automovel = new Automovel(matricula,marca,cor);
                    acidente.addUltimo(new Registrar_Atropelamento( condutor,vitima,automovel));
                    JOptionPane.showMessageDialog(null,"Registro Feito com Sucesso");
                    break;
                }
                case 2: {
                    System.out.println("\n==Inserir Dados da Vitima ---");
                    System.out.print("Digite o Nome: ");
                    teclado.nextLine();
                    String nome = teclado.nextLine();
                    System.out.println("Digita idade: ");
                    Integer idade = teclado.nextInt();
                    System.out.println("Digita a Morada: ");
                    teclado.nextLine();
                    String morada = teclado.nextLine();
                    System.out.print("Digite a gravidade de Lesao: ");
                    String lesao = teclado.nextLine();

                    Vitima vitima = new Vitima(nome,idade,morada,lesao);

                    System.out.println("\n==Inserir Dados do Condutor---");
                    System.out.print("Digite o Nome: ");
                    String nome2 = teclado.nextLine();
                    System.out.println("Digita idade: ");
                    Integer idade2 = teclado.nextInt();
                    System.out.println("Digita a Morada: ");
                    teclado.nextLine();
                    String morada2 = teclado.nextLine();
                    System.out.print("Digite o numero da Carta de Conduçao: ");
                    String carta = teclado.nextLine();
                    System.out.print("Digite Valor de Perda: ");
                    Float perda2 = teclado.nextFloat();
                    Condutor condutor = new Condutor(nome2,idade2,morada2,carta,perda2);

                    System.out.println("\n==Inserir Dados do Automovel em Causa ---");
                    System.out.print("Digite o numero de Matrcula: ");
                    teclado.nextLine();
                    String matricula = teclado.nextLine();
                    System.out.println("Digita a Marca do Carro: ");
                    String marca = teclado.nextLine();
                    System.out.println("Digita a Cor do Carro: ");
                    String cor = teclado.nextLine();
                    Automovel automovel = new Automovel(matricula,marca,cor);


                    acidente.addUltimo(new Registrar_Atropelamento(condutor,vitima,automovel,true));
                    JOptionPane.showMessageDialog(null,"Registro Feito com Sucesso");
                    break;
                }
                case 3: {
                    //Mostrar();
                    //Integer most = teclado.nextInt();
                    if(acidente.estaVAzia()){
                        JOptionPane.showMessageDialog(null,"Não existe Registo de Atropelamneto! ","Lista Vazia",JOptionPane.ERROR_MESSAGE);
                    }else{
                        Mostrar();
                        Integer most = teclado.nextInt();
                        switch (most){
                            case 1:
                               // JOptionPane.showMessageDialog(null," "+acidente,"Lista de Todos Acidentes",JOptionPane.PLAIN_MESSAGE);
                                JOptionPane.showMessageDialog(null," "+acidente,"Lista de Todos Acidentes",JOptionPane.PLAIN_MESSAGE);

                                break;
                            case 2:

                                JOptionPane.showMessageDialog(null," "+acidente.toStringAcintesGraves(),"Acidentes Graves",JOptionPane.PLAIN_MESSAGE);
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null," "+acidente.toStringVitima(),"Dados das Vítimas",JOptionPane.PLAIN_MESSAGE);
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null," "+acidente.toStringCondutor(),"Dados dos Condutores",JOptionPane.PLAIN_MESSAGE);
                                break;
                        }
                    }


                    break;
                }

                case 4:
                    JOptionPane.showMessageDialog(null,"Total: "+acidente.perda()+" Kzs","Valor de Perda",JOptionPane.PLAIN_MESSAGE);

                    break;

                case 5: {
                    System.out.println("\n== Remover Registro de Acidente ==");
                    System.out.println(acidente);
                    System.out.print("Digite o Nome da Vítima: ");
                    teclado.nextLine();
                    String nome = teclado.next();
                    if(acidente.contem(nome)==true){
                        acidente.remove(nome);
                        JOptionPane.showMessageDialog(null,"Registro ["+nome+"] Foi Removido com Sucesso","Eliminado",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Registro ["+nome+"] não existente","Erro ao Remover",JOptionPane.ERROR_MESSAGE);
                    }

                    break;
                }
                case 6: {
                    System.out.println("\n== Colsutar Registro de ACidentes ==");
                    System.out.print("Digite o Nome da Vítima: ");
                    teclado.nextLine();
                    String nome = teclado.next();
                    if(acidente.contem(nome)==true){
                        JOptionPane.showMessageDialog(null,"Registro ["+nome+"] Existente","Consulta Encontrada",JOptionPane.PLAIN_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Registro ["+nome+"] não existente","Erro ao Consultar",JOptionPane.ERROR_MESSAGE);
                    }

                    break;
                }
                case 7: {
                    System.out.println("Saindo do programa!!!");
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null,"Opção inválida","Tente novamente",JOptionPane.ERROR_MESSAGE);
                    //System.out.println("Opção inválida! ");
                    break;
                }
            }
        } while (opcao != 7);
    }

    public static void Menu() {
        System.out.println("----------- MENU -------------");
        System.out.println("[1] -Registar Acidentes normais");
        System.out.println("[2] -Registar Acidentes graves");
        System.out.println("[3] -Mostrar Acidentes");
        System.out.println("[4] -Mostrar o valor Total de Perda ");
        System.out.println("[5] -Remover Acidentes ");
        System.out.println("[6] -Colnsutar Acidentes");
        System.out.println("[7] -Sair");
    }

    public static void Mostrar(){
        System.out.println("\n==Mostar Acidentes de Atropelamentos==");
        System.out.println("[1] Listar Todos Acidentes");
        System.out.println("[2] Listar Acidentes Graves");
        System.out.println("[3] Listar Todas Vítimas");
        System.out.println("[4] Listar Todos Condutores");
        System.out.println("[5] Sair");
    }
}
