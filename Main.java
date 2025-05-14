import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar Buffer

            switch (opcao) {
                case 1:
                    System.out.println("Descrição de tarefa: ");
                    String descricao = scanner.nextLine();
                    tarefas.add(new Tarefa(descricao));
                    System.out.println("Tarefa adicionada: ");
                    break;
                
                case 2:
                    System.out.println("\nLista de Tarefas: ");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println(i + ". " + tarefas.get(i));
                        }
                    }
                break;
                
                case 3:
                        System.out.println("Índice da tarefa para marcar como concluída: ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < tarefas.size()) {
                            tarefas.get(index).marcarConcluida();
                            System.out.println("Tarefa marcada como concluída!");
                        } else {
                            System.out.println("ìndece inválido.");
                        }
                break;

                case 4:
                    System.out.println("Índice de tarefa para remover: ");
                    int remover = scanner.nextInt();
                    if (remover >= 0 && remover < tarefas.size()) {
                        tarefas.remove(remover);
                        System.out.println("Tarefa removida!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                break;
                
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}