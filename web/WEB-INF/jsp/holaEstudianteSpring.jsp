<%-- 
    Document   : holaestudiante
    Created on : 27 jul. 2021, 16:59:01
    Author     : titonitola-maturana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola Estudiante</title>
    </head>
    <body>
        <form action="procesarModeloFormulario" method="get">
            <input type="text" name="nombreAlumno"/>
            <input type="submit" name="enviar"/>
        </form>
    </body>
</html>
