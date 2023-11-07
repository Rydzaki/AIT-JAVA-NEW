package home_work_38.to_do_list;

import java.util.Objects;

public class Task implements Comparable<Task> {

    private int id;
    private String task;
    private int taskNumber;

    private static int addId = 1; // переменная для начала отчета ID

    public Task(String task, int taskNumber) {
        this.id = addId++; // todo увеличиваем id при создании задачи
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

        Task task = (Task) object;

        return id == task.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Task o) {
        return Integer.compare(taskNumber, o.taskNumber); //
    }
}
