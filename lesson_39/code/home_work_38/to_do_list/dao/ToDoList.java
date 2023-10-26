package home_work_38.to_do_list.dao;

import home_work_38.to_do_list.Task;

public interface ToDoList {

    boolean addNote (Task task);
    void seeAllPosts(Task[] tasks);
    Task deleteEntry (int id);
    void goOut ();

}
