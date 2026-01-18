## A REST API that can 

-   Create a todo with a **title + deadline**
    
-   List all todos
    
-   Get a todo by ID
    
-   Update a todo
    
-   Delete a todo



## Project settings
-   Java: **17**
    
-   Build: **Maven**
    
-   Dependencies:
    
    -   Spring Web
        
    -   Spring Data JPA
        
    -   H2 Database
    
##   To run Spring boot app

    mvn spring-boot:run

  ## h2-console:

    http://localhost:8080/h2-console
  

## create todo:  

    curl -X POST http://localhost:8080/todos -H "Content-Type: application/json" -d "{""title"":""Learn Spring"",""deadline"":""2026-01-31""}"

  
##  Get all todo:  


    curl http://localhost:8080/todos

  
  
## Update:  

    curl -X PUT http://localhost:8080/todos/1 -H "Content-Type: application/json" -d "{""title"":""Learn Spring"",""completed"":true,""deadline"":""2026-01-31""}" 

 
  
## delete:  

    curl -X DELETE http://localhost:8080/todos/1

