**Simple Task Management API 📝**   
A straightforward and lightweight RESTful API for managing tasks, built with Java and Spring Boot. This project uses an in-memory List as a fake data source to demonstrate basic CRUD (Create, Read, Update, Delete) functionalities.

__✨ Main Features__  
__Add New Tasks__: Create and add new tasks.

__Update Existing Tasks__: Modify the title and description of a task.

__Delete Tasks__: Remove a task from the list.

__Mark as Done__: Change the status of a task to complete.

__View Tasks__: Retrieve all tasks, or filter them by their completion status (done/undone).

__📦 Data Model__  
The Task object has the following structure:

JSON
```
{
  "id": "9f327068-3475-4d77-ae0e-9941311dc01b",
  "title": "Implement the API",
  "description": "Finish all the endpoints for the task management project.",
  "createdAt": "2025-10-16T07:20:30.123Z",
  "isDone": false
}
```
__🚀 API Endpoints__
Here are the available endpoints to interact with the API.

__Get All Tasks__  
Retrieves a list of all tasks.

Method: GET
```
Endpoint: /tasks/alltasks
```
JSON
```
[
    {
        "id": "9f327068-3475-4d77-ae0e-9941311dc01b",
        "title": "task1",
        "description": "task1 description",
        "createdAt": 1760586471427,
        "done": true
    },
    {
        "id": "9023b38d-2dc9-431f-87b3-c425b7d97af6",
        "title": "task2",
        "description": "task2 description",
        "createdAt": 1760586481159,
        "done": false
    }
]
```
__Get All Done/Undone Tasks__  
Retrieves a list of tasks based on their completion status.
Method: GET
```
Endpoints:

/tasks/doneTasks

/tasks/undoneTasks
```
Success Response (200 OK): A JSON array of task objects matching the filter.

__Add a New Task__  
Adds a new task to the list. The id and createdAt are generated automatically.

__Method__: POST
```
Endpoint: /tasks/addtask
```
Request Body:
JSON
```
{
  "title": "My New Task",
  "description": "A detailed description."
  "done": false
}
```
Success Response (201 Created):  
__Response__ :true    

__Update a Task__  
Updates the title and/or description of an existing task by its id.

__Method__: PUT
```
Endpoint: /tasks/updateTask
```
Request Body:  
JSON
```
  {
        "id": "6c0356c5-8754-4da0-844f-d48f9f0969b2",
        "title": " update task2",
        "description": "update task2 description",
        "createdAt": 1760525635933,
        "done": false
    }
```
Success Response (200 OK):  
JSON

true  
__Mark a Task as Done__  

Sets the isDone flag of a task to true.  

__Method__: PUT
```
Endpoint: /tasks/doneTask
```
Success Response (200 OK):

JSON

true
__Delete a Task__  

Removes a task from the list.

__Method__: DELETE
```
__Endpoint__: /tasks/deleteTask
```
Success Response (200 OK):

JSON

true
__🛠️ Technologies Used__
__Java__: Core programming language.

__Spring Boot__: Framework for creating the RESTful API.

__Maven__: Build and dependency management tool.

▶️ How to Run
Clone the repository:
```
Bash

git clone <your-repository-url>
```
Navigate to the project directory:


cd <your-project-directory>
Run the application using Maven:


```
./mvnw spring-boot:run
```

The API will be available at http://localhost:8080. You can now use a tool like Postman or curl to interact with the endpoints.
