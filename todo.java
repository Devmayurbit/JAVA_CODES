import java.util.ArrayList;
import java.util.Scanner;
class Task {
    private String description;
    public Task(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
class TodoListManager {
    private ArrayList<Task> tasks; // List to store tasks
    public TodoListManager() {
        tasks = new ArrayList<>();
    }
    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added: " + description);
    }
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("\nTo-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).getDescription());} } }

    public void removeTask(int taskNumber) {
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            System.out.println("Removed: " + tasks.get(taskNumber - 1).getDescription());
            tasks.remove(taskNumber - 1);
        } else {
            System.out.println("Invalid task number.");}}}

public class todo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoListManager manager = new TodoListManager(); // Using the TodoListManager  
        int choice;
        do {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    manager.addTask(description);
                    break;
                case 2:
                    manager.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    manager.removeTask(taskNumber);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
        scanner.close();}}