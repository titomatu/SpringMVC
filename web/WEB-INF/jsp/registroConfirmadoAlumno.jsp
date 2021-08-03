<%-- 
    Document   : registroConfirmadoAlumno
    Created on : 3 ago. 2021, 08:39:04
    Author     : titonitola-maturana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmación Registro Alumno</title>
    </head>
    <body>
        <h1>Registro del alumno ${nuevoAlumno.nombre} ${nuevoAlumno.apellido} exitoso!</h1>
        <h2>Se registró la optativa ${nuevoAlumno.optativa}</h2>
        <h2>Los idiomas seleccionados son ${nuevoAlumno.idiomas}</h2>
    </body>
</html>
