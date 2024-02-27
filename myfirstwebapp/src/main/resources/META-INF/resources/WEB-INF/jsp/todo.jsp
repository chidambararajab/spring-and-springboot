<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
   <head>
         <meta charset="UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0">

         <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >

      <title>Add Todos Page</title>
   </head>
   <body>
   <div class="container">
      <div>
         Welcome, ${name}
      </div>
      <hr />
      <div>
         Add a todo below,
      </div>
      <form:form method="post" modelAttribute="todo">
            <form:input type="text" path="description" />
            <form:input type="hidden" path="id" />
            <form:input type="hidden" path="isDone" />
            <input type="submit" class="btn btn-success"></input>
       </form:form>
    </div>

      <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
      <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
   </body>
</html>