import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDoList = new ArrayList();

    public void add(String todo) {
        toDoList.add(todo);
        System.out.println("Добавлено дело " + todo);
    }

    public void add(int index, String todo) {
        if (index < 0 || index >= toDoList.size()) {
            this.add(todo);
        } else {
            toDoList.add(index, todo);
            System.out.println("Добавлено дело " + todo);
        }
    }

    public void edit(String todo, int index) {
        if (index < 0 || index >= toDoList.size()) {
            return;
        } else {
            String oldToDo = toDoList.get(index);
            toDoList.set(index, todo);
            System.out.println("Дело " + oldToDo + " заменено на " + todo);
        }
    }

    public void delete(int index) {
        if (index < 0 || index >= toDoList.size()) {
            System.out.println("Дело с таким номером не существует");
            return;
        } else {
            String oldToDo = toDoList.get(index);
            toDoList.remove(index);
            System.out.println("Дело" + oldToDo + " удалено");
        }
    }

    public ArrayList getTodos() {
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " - " + toDoList.get(i));
        }
        return toDoList;
    }
}