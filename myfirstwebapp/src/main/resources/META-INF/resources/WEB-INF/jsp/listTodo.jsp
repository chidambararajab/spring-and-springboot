<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">

      <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

      <title>Todos Page</title>
   </head>
   <body>
   <div class="container">
      <div>
         Welcome, ${name}
      </div>
      <hr />
      <div>
         Your todos are
      </div>

      <table class="table">
         <thead>
            <tr>
               <th>Id</th>
               <th>Description</th>
               <th>Date</th>
               <th>Status</th>
            </tr>
         </thead>
         <tbody>
            <c:forEach items="${todos}" var="todo">
               <tr>
                  <td>${todo.id}</td>
                  <td>${todo.description}</td>
                  <td>${todo.date}</td>
                  <td>${todo.isDone}</td>
               </tr>
            </c:forEach>
         </tbody>
      </table>

      <a href="add-todo" class="btn btn-success">Add Todo</a>

      <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
      <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </div>
   </body>
</html>