package com.moteadev.taskManagementApi.data;

import com.moteadev.taskManagementApi.models.Task;
import com.moteadev.taskManagementApi.repos.MainRepository;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.logging.log4j2.SpringBootConfigurationFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class FakeDataSource implements MainRepository {
    private final List<Task> taskList=new ArrayList<Task>();

    @Override
    public boolean addTask(Task task) {
        this.taskList.add(task);
        return true;
    }

    @Override
    public boolean updateTask(Task task) {
        int taskIndex=this.taskList.indexOf(task);
        System.out.println("Tasks : "+this.taskList.size());
        System.out.println("Index : "+taskIndex);
        if(taskIndex==-1){
            return false;
        }
        this.taskList.set(taskIndex,task);
        return true;
    }

    @Override
    public boolean deleteTask(Task task) {
        this.taskList
                .remove(task);
        return false;
    }

    @Override
    public boolean doneTask(Task task) {
        int index=this.taskList.indexOf(task);
        if(index==-1)return false;
        task.setDone(true);
        this.taskList.set(index,task);
        return true;
    }

    @Override
    public List<Task> getAllTasks() {

        return  this.taskList;
    }

    @Override
    public List<Task> getAllDoneTasks() {
        return this.taskList
                .stream().filter(
                        task -> task.isDone()
                ).toList();
    }

    @Override
    public List<Task> getAllUndoneTasks() {
        return this.taskList
                .stream().filter(
                        task -> !task.isDone()
                ).toList();
    }



}
