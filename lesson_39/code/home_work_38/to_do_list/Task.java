package home_work_38.to_do_list;

import java.util.Objects;

public class Task implements Comparable<Task> {

    private int id;
    private String task;
    private int taskNumber;

    public Task(int id, String task, int taskNumber) {
        this.id = id;
        this.task = task;
        this.taskNumber = taskNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", taskNumber=" + taskNumber +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Task task1 = (Task) object;

        if (id != task1.id) return false;
        if (taskNumber != task1.taskNumber) return false;
        return Objects.equals(task, task1.task);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (task != null ? task.hashCode() : 0);
        result = 31 * result + taskNumber;
        return result;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(id, o.id);
    }
}
