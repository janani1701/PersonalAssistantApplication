import java.util.PriorityQueue;

class TaskQueue {
    private PriorityQueue<Task> taskQueue = new PriorityQueue<>((t1, t2) -> t2.getPriority() - t1.getPriority());

    public void addTask(String description, int priority) {
        Task task = new Task(description, priority);
        taskQueue.offer(task);
    }

    public void processTasks() {
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Task: " + task.getDescription() + " (Priority: " + task.getPriority() + ")");
        }
    }

    public boolean isEmpty() {
        return taskQueue.isEmpty();
    }
    public void viewTasks() {
        if (taskQueue.isEmpty()) {
            System.out.println("Task queue is empty.");
        } else {
            System.out.println("Tasks in the priority queue:");
            for (Task task : taskQueue) {
                System.out.println("Task: " + task.getDescription() + " (Priority: " + task.getPriority() + ")");
            }
        }
    }
}
