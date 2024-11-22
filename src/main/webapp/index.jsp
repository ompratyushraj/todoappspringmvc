<% response.sendRedirect(request.getContextPath()+"/home"); %>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Hello, World! - Dark Mode</title>
  
  <!-- Link to Material UI CDN -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@mui/material@5.0.0-alpha.43/dist/material-ui.min.css">
  
  <!-- Google font for Material UI theme -->
  <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">

  <style>
    body {
      background-color: #121212; /* Dark background */
      color: #e0e0e0; /* Light text color */
      font-family: 'Roboto', sans-serif;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }
    .MuiContainer-root {
      background-color: #1c1c1c; /* Dark card background */
      padding: 40px;
      border-radius: 8px;
    }
    h1 {
      color: #fff;
      text-align: center;
    }
  </style>
</head>
<body>
  
  <!-- Material UI Container -->
  <div class="MuiContainer-root">
    <h1>Hello !<br>\\ Pratyush Raj Srivastava //<br> Welcome, on this Spring MVC project building TODO App.  </h1>
  </div>

  <!-- Material UI script CDN -->
  <script src="https://cdn.jsdelivr.net/npm/@mui/material@5.0.0-alpha.43/dist/material-ui.min.js"></script>
</body>
</html>

