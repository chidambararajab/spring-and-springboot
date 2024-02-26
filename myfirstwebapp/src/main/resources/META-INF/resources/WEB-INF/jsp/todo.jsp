<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Todos Page</title>
   </head>
   <body>
      <div>
         Welcome, ${name}
      </div>
      <hr />
      <div>
         Your todos are
      </div>

      <table>
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
   </body>
</html>