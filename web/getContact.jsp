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
            #data {
              font-family: Arial, Helvetica, sans-serif;
              border-collapse: collapse;
              width: 100%;
              margin-bottom: 3%;
            }

            #data td, #data th {
              border: 1px solid balck;
              padding: 8px;
            }

            #data tr:nth-child(even){background-color: #f2f2f2;}

            #data tr:hover {background-color: #ddd;}

            #data th {
              padding-top: 12px;
              padding-bottom: 12px;
              text-align: left;
              background-color: blueviolet;
              color: white;
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
        <table id="data">
            <tr>
                <th>Name</th>
                <th>Phone Number</th>
                <th>Memory</th>
            </tr>
        <% 
               Service myObject = new Service();
	     
               String memory  = request.getParameter("memory");
               out.println(myObject.getAllContacts(memory));
         %>
         </table>
         <div>
                    <a href="index.html">Go back to home</a>
         </div>
         
    </body>
</html>
