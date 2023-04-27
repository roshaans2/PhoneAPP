<%-- 
    Document   : newjsp
    Created on : 21 Apr, 2023, 8:13:04 AM
    Author     : ROSHAAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,com.example.Service"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/x-icon" href="icon.png">
        <title>PhoneBook App</title>
        <style>
            p{
                font-family: Arial, Helvetica, sans-serif;
                text-align: center;
                font-size:36px;
                color:blueviolet;
            }
            div{
                display:flex;
                align-items: center;
                justify-content: center;
            }
            div a:link, a:visited {
                background-color: white;
                color: black;
                border: 2px solid blueviolet;
                padding: 10px 20px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
              }

            div a:hover, a:active {
                background-color: blueviolet;
                color: white;
            }
        </style>
    </head>
    <body>
        <table border="1">
        <% 
               Service myObject = new Service();
	       
               
               String memory = request.getParameter("memory");
               
               myObject.deleteAll(memory);
               

               %>
                    <p>All contact are deleted successfully!!!</p>
                    <div>
                      <a href="index.html">Go back to home</a>
                    </div>
               <%
         %>
         </table>
      
    </body>
</html>
