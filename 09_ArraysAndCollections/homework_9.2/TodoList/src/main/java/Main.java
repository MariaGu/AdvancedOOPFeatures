public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        todoList.add("buy milk");
        todoList.getTodos();
        todoList.add(-10, "buy sugar");
        todoList.getTodos();
        todoList.add(100, "buy candies");
        todoList.getTodos();
        todoList.edit("take money", 100);
        todoList.getTodos();
        todoList.delete(2);
        todoList.getTodos();
    }
}
