package org.example.todoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoAppApplication.class, args);
    }

}

/*
create todo:
     curl -X POST http://localhost:8080/todos -H "Content-Type: application/json" -d "{""title"":""Learn Spring"",""deadline"":""2026-01-31""}"
Get all todo:
        curl http://localhost:8080/todos

Update:
    curl -X PUT http://localhost:8080/todos/1 -H "Content-Type: application/json" -d "{""title"":""Learn Spring"",""completed"":true,""deadline"":""2026-01-31""}"

delete:
    curl -X DELETE http://localhost:8080/todos/1


*/
