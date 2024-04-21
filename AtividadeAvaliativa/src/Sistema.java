import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private static List<Animal> listaAnimais = new ArrayList<>();

    public static void main(String[] args) {
        
    }

    public static void executarProjeto() {
        boolean continuar = true;
        
        while (continuar) {
            int opcao = exibirMenu();
            
            switch (opcao) {
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
                    buscarAnimal();
                    break;
                case 3:
                    listarAnimais();
                    break;
                case 4:
                    excluirAnimal();
                    break;
                case 5:
                    excluirTodosAnimais();
                    break;
                case 6:
                    editarAnimal();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        }
    }

    public static int exibirMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1 - Cadastrar Animal");
        System.out.println("2 - Buscar Animal");
        System.out.println("3 - Listar Animais");
        System.out.println("4 - Excluir Animal");
        System.out.println("5 - Excluir todos os Animais");
        System.out.println("6 - Editar Animal");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        return Console.lerInt();
    }

    public static void cadastrarAnimal() {
        System.out.println("Cadastro de Animal");
        System.out.print("Nome do animal: ");
        String nome = Console.lerString();
        System.out.print("Idade do animal: ");
        int idade = Console.lerInt();
        System.out.print("Peso do animal: ");
        float peso = Console.lerFloat();
        System.out.print("Tipo do animal (Réptil, Ave, Mamífero): ");
        String tipo = Console.lerString();
        
        Animal animal = new Animal(nome, idade, peso, tipo);
        listaAnimais.add(animal);
        
        System.out.println("Animal cadastrado com sucesso!\n");
    }

    public static void buscarAnimal() {
        System.out.println("Buscar Animal:");
        System.out.print("Informe o nome do animal: ");
        String nome = Console.lerString();

        boolean encontrado = false;
        for (Animal animal : listaAnimais) {
            if (animal.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Animal encontrado:");
                System.out.println(animal);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Animal não encontrado.");
        }
    }

    public static void listarAnimais() {
        if (listaAnimais.isEmpty()) {
            System.out.println("\nNão há animais cadastrados...");
            return;
        }
    
        System.out.println("\nAnimais Cadastrados:");
        for (Animal animal : listaAnimais) {
            System.out.println("Nome: " + animal.getNome() + ", Tipo: " + animal.getTipo());
        }
    }

    private static void excluirAnimal() {
        System.out.println("Opção de exclusão de animal selecionada.");
        System.out.print("Digite o nome do animal a ser excluído: ");
        String nomeAnimal = Console.lerString();
    
        boolean removido = false;
        for (Animal animal : listaAnimais) {
            if (animal.getNome().equalsIgnoreCase(nomeAnimal)) {
                listaAnimais.remove(animal);
                System.out.println("Animal removido com sucesso!");
                removido = true;
                break;
            }
        }
    
        if (!removido) {
            System.out.println("Nenhum animal encontrado com o nome \"" + nomeAnimal + "\".");
        }
    }

    private static void excluirTodosAnimais() {
        if (listaAnimais.isEmpty()) {
            System.out.println("Não há animais para excluir.");
        } else {
            listaAnimais.clear();
            System.out.println("Todos os animais foram excluídos com sucesso!");
        }
    }
    
    private static void editarAnimal() {
        System.out.println("Opção de edição de animal selecionada.");
        System.out.print("Digite o nome do animal a ser editado: ");
        String nomeAnimal = Console.lerString();

        boolean encontrado = false;
        for (Animal animal : listaAnimais) {
            if (animal.getNome().equalsIgnoreCase(nomeAnimal)) {
                System.out.println("Animal encontrado:");
                System.out.println(animal);

                System.out.println("Digite os novos dados do animal:");
                System.out.print("Novo nome: ");
                animal.setNome(Console.lerString());
                System.out.print("Nova idade: ");
                animal.setIdade(Console.lerInt());
                System.out.print("Novo peso: ");
                animal.setPeso(Console.lerFloat());

                System.out.println("Animal editado com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum animal encontrado com o nome \"" + nomeAnimal + "\".");
        }
    }
}
