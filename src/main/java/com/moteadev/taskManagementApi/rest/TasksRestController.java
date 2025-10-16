package com.moteadev.taskManagementApi.rest;

import com.moteadev.taskManagementApi.models.AddingTaskRequestBody;
import com.moteadev.taskManagementApi.models.Task;
import com.moteadev.taskManagementApi.repos.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TasksRestController {
    public MainRepository mainRepository;
    @Autowired
    public TasksRestController(MainRepository mainRepo) {
        mainRepository=mainRepo;
    }

    @PostMapping("/addTask")
    public boolean addTask(@RequestBody AddingTaskRequestBody addingTaskRequestBody){
        Task savedTask=addingTaskRequestBody.createTaskModel();
        return mainRepository.addTask(savedTask);
    }

    @PutMapping("/updateTask")
    public boolean updateTask(@RequestBody Task task){
        return mainRepository.updateTask(task);
    }
    @DeleteMapping("/deleteTask")
    public boolean deleteTask(@RequestBody  Task task){
        return mainRepository.deleteTask(task);
    }
    @PutMapping("/doneTask")
    public boolean doneTask(@RequestBody Task task){
        return mainRepository.doneTask(task);
    }
    @GetMapping("/allTasks")
    public List<Task> getAllTasks(){
        return mainRepository.getAllTasks();
    }
    @GetMapping("/undoneTasks")
    public List<Task> getAllUndoneTasks(){
        return  mainRepository.getAllUndoneTasks();
    }

    @GetMapping("/doneTasks")
    public List<Task> getAllDoneTasks(){
        return mainRepository.getAllDoneTasks();
    }
}
