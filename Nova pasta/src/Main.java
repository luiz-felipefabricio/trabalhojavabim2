import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int proximoId = 1;
    private static ArrayList<Disco> discos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu: \n");
            System.out.println("1. Cadastrar Disco \n");
            System.out.println("2. Listar Discos \n");
            System.out.println("3. Visualizar Disco Específico \n");
            System.out.println("4. Excluir Disco \n");
            System.out.println("5. Editar Disco \n");
            System.out.println("6. Sair \n");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarDisco(scanner);
                    break;
                case 2:
                    listarDiscos();
                    break;
                case 3:
                    visualizarDisco(scanner);
                    break;
                case 4:
                    excluirDisco(scanner);
                    break;
                case 5:
                    editarDisco(scanner);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
        scanner.close();
    }

    private static void cadastrarDisco(Scanner scanner) {
        System.out.println("Digite o tipo de disco (1. CD, 2. Vinil):");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome do disco: ");
        String nome = scanner.nextLine();

        System.out.println("Preço do disco: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Artista do disco:");
        String artista = scanner.nextLine();

        System.out.println("Gênero do disco: ");
        String genero = scanner.nextLine();

        if (tipo == 1) {
            System.out.println("Digite o número de faixas:");
            int numeroDeFaixas = scanner.nextInt();
            scanner.nextLine();
            discos.add(new CD(proximoId++, nome, preco, artista, genero, numeroDeFaixas));
        } else if (tipo == 2) {
            System.out.println("Digite o rpm:");
            double rpm = scanner.nextDouble();
            scanner.nextLine();
            discos.add(new Vinil(proximoId++, nome, preco, artista, genero, rpm));
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    private static void listarDiscos() {
        for (Disco disco : discos) {
            System.out.println(disco);
        }
    }

    private static void visualizarDisco(Scanner scanner) {
        System.out.println("ID do disco: ");
        int idVisualizar = scanner.nextInt();
        Disco discoVisualizar = null;
        
        for (Disco disco : discos) {
            if (disco.getId() == idVisualizar) {
                discoVisualizar = disco;
                break;
            }
        }

        if (discoVisualizar != null) {
            System.out.println(discoVisualizar);
        } else {
            System.out.println("Disco não encontrado.");
        }
    }

    private static void excluirDisco(Scanner scanner) {
        System.out.println("ID do disco: ");
        int idExcluir = scanner.nextInt();
        Disco discoExcluir = null;

        for (Disco disco : discos) {
            if (disco.getId() == idExcluir) {
                discoExcluir = disco;
                break;
            }
        }

        if (discoExcluir != null) {
            discos.remove(discoExcluir);
            System.out.println("Disco excluído com sucesso.");
        } else {
            System.out.println("Disco não encontrado.");
        }
    }

    private static void editarDisco(Scanner scanner) {
        System.out.println("ID do disco: ");
        int idEditar = scanner.nextInt();
        scanner.nextLine();

        Disco discoEditar = null;
        for (Disco disco : discos) {
            if (disco.getId() == idEditar) {
                discoEditar = disco;
                break;
            }
        }

        if (discoEditar != null) {
            System.out.println("Novo nome do disco: ");
            String novoNome = scanner.nextLine();
            
            System.out.println("Novo preço do disco: ");
            double novoPreco = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.println("Novo artista do disco: ");
            String novoArtista = scanner.nextLine();
            
            System.out.println("Novo gênero do disco: ");
            String novoGenero = scanner.nextLine();
            
            discoEditar.setNome(novoNome);
            discoEditar.setPreco(novoPreco);
            discoEditar.setArtista(novoArtista);
            discoEditar.setGenero(novoGenero);
            
            System.out.println("Disco editado com sucesso.");
        } else {
            System.out.println("Disco não encontrado.");
        }
    }
}
