package com.moteadev.taskManagementApi.repos;

import com.moteadev.taskManagementApi.models.Task;

import java.util.List;

public interface MainRepository {

    public  boolean addTask(Task task);
    public boolean updateTask(Task task);
    public boolean deleteTask(Task task);
    public boolean doneTask(Task task);
    public List<Task> getAllTasks();
    public List<Task> getAllDoneTasks();
    public List<Task> getAllUndoneTasks();

}
