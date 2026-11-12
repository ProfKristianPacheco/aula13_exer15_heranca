import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Ingresso> ingressos = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        boolean continua;
        do{
            System.out.println("MENU:\n1-Cadastrar\n2-Pesquisar\n3-Mostrar Todos\n4-Encerrar");
            int menu = teclado.nextInt();
            switch (menu){
                case 1:
                    //DONE - CADASTRAR
                    cadastrarIngresso(ingressos, teclado);
                    continua = true;
                    break;
                case 2:
                    //TODO - PESQUISAR
                    pesquisarIngresso(ingressos, teclado);
                    continua = true;
                    break;
                case 3:
                    //DONE - MOSTRAR TODOS
                    mostrarTodos(ingressos);
                    continua = true;
                    break;
                case 4:
                    System.out.println("Encerrando!");
                    continua = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continua = true;
                    break; //opcional
            }
        }while (continua);
    }

    private static void mostrarTodos(ArrayList<Ingresso> ingressos) {
        for(Ingresso ingressoTemp: ingressos){
            System.out.println(ingressoTemp + " Valor Final: " + ingressoTemp.calcularValorFinal());
        }
    }

    private static void pesquisarIngresso(ArrayList<Ingresso> ingressos, Scanner teclado) {
    }

    private static void cadastrarIngresso(ArrayList<Ingresso> ingressos, Scanner teclado) {
        System.out.println("Informe o código: ");
        int codigo = teclado.nextInt();
        teclado.nextLine();//limpando o buffer
        System.out.println("Informe o nome: ");
        String nome = teclado.nextLine();
        System.out.println("Informe o evento: ");
        String evento = teclado.nextLine();
        System.out.println("Informe o tipo de ingresso: \n1- Estudante\n2-VIP");
        int tipo = teclado.nextInt();
        if(tipo == 1){
            //DONE - ESTUDANTE
            teclado.nextLine();
            System.out.println("Informe a instituição: ");
            String instituicao = teclado.nextLine();
            System.out.println("Informe a carteirinha: ");
            String carteirinha = teclado.nextLine();
            IngressoEstudante ingressoEstudante = new IngressoEstudante(codigo, nome, evento, instituicao, carteirinha);
            ingressos.add(ingressoEstudante);
        }else{
            //DONE - VIP
            teclado.nextLine();
            System.out.println("Informe se terá acesso ao backstage:\n1-Sim\n2-Não");
            int backstage = teclado.nextInt();
            IngressoVip ingressoVip;
            if(backstage == 1){
                //DONE - COM BACKSTAGE
                ingressoVip = new IngressoVip(codigo, nome, evento,true);
            }else{
                //DONE - SEM BACKSTAGE
                ingressoVip = new IngressoVip(codigo, nome, evento, false);
            }
            ingressos.add(ingressoVip);
        }
        System.out.println("Ingresso cadastrado!");
    }
}