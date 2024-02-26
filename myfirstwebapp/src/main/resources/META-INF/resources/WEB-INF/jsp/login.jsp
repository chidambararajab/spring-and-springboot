<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Form</title>
<style>
    body {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .login-container {
        text-align: center;
    }

    .login-container input[type="text"],
    .login-container input[type="password"],
    .login-container input[type="submit"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }

    .login-container input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        cursor: pointer;
    }
</style>
</head>
<body>

<div class="login-container">
    <h1>Welcome, ${name}</h1>
    <h2>Login Form</h2>
    <form action="/login" method="post">
        <input type="text" name="username" placeholder="Username"><br>
        <input type="password" name="password" placeholder="Password"><br>
        <input type="submit" value="Login">
    </form>
</div>

</body>
</html>
