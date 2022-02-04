import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String command = scanner.next();
            switch (command) {
                case "LIST":
                    todoList.getTodos();
                    break;
                case "ADD":
                    if (scanner.hasNextInt()){
                        todoList.add(scanner.nextInt(), scanner.nextLine());
                    } else{
                        todoList.add(scanner.nextLine());
                    }
                    break;
                case "EDIT":
                    int index = scanner.nextInt();
                    String todo = scanner.nextLine();
                    todoList.edit(todo, index);
                    break;
                case "DELETE":
                    todoList.delete(scanner.nextInt());
            }
        }
    }
}

