package com.moteadev.taskManagementApi.models;

public class AddingTaskRequestBody {

    private final String title;
    private final String description;
    private final boolean isDone;

    public AddingTaskRequestBody(String title, String description, boolean isDone) {
        this.title = title;
        this.description = description;
        this.isDone = isDone;
    }
    public  Task createTaskModel(){
        return new Task(title,description,isDone);
    }
}
