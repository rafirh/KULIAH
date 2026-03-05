import java.util.ArrayList;
import java.util.List;

public class TodoListModel {
  private List<TodoItem> todoItems;

  public TodoListModel() {
    this.todoItems = new ArrayList<>();
  }

  public void addTodo(String task) {
    if (task != null && !task.trim().isEmpty()) {
      todoItems.add(new TodoItem(task.trim()));
    }
  }

  public void removeTodo(int index) {
    if (index >= 0 && index < todoItems.size()) {
      todoItems.remove(index);
    }
  }

  public void toggleComplete(int index) {
    if (index >= 0 && index < todoItems.size()) {
      TodoItem item = todoItems.get(index);
      item.setCompleted(!item.isCompleted());
    }
  }

  public void clearAll() {
    todoItems.clear();
  }

  public List<TodoItem> getTodoItems() {
    return new ArrayList<>(todoItems);
  }

  public int getSize() {
    return todoItems.size();
  }
}
