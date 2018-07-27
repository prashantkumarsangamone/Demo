<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<html>
  <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sign Up Form</title>
        <link rel="stylesheet" href="css/normalize.css">
        <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="jsp/main.css">
        
        
        
        
        
    </head>
    <body>
            
					<div class="message success">
					<c:out value="${success}" />
				</div>
      <form action="submit" method="post">
      
        <h1>Sign Up</h1>
        
        <fieldset>
          
          <label for="name">Name:</label>
          <input type="text" id="name" name="name">
          
          <label for="mail">Email:</label>
          <input type="email" id="mail" name="email">
          
          <label for="password">Password:</label>
          <input type="password" id="password" name="password">
          
          <label>Age:</label>
           <input type="number" id="age" name="age">
                 </fieldset>
        
         <button type="submit">Sign Up</button>
      </form>
      
    </body>
</html>