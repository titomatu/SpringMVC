<%-- 
    Document   : registroAlumno
    Created on : 3 ago. 2021, 08:18:39
    Author     : titonitola-maturana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Alumno</title>
    </head>
    <body>
        <form:form action="registroAlumnoConfirmado" modelAttribute="nuevoAlumno">  
            Nombre: <form:input path="nombre" />
            <br><br>
            Apellido: <form:input path="apellido" />
            <br><br>
            Asignatura Optativa: 
            <form:select path="optativa">
                <form:option value="ProgramacionI" value="Programacion I"/>
                <form:option value="ProgramacionII" value="Programacion II"/>
                <form:option value="ProgramacionII" value="Programacion III"/>
            </form:select>    
            <br><br>
            Inglés<form:checkbox path="idiomas" value="Inglés"/>
            Francés<form:checkbox path="idiomas" value="Francés"/>
            Alemán<form:checkbox path="idiomas" value="Alemán"/>
            Mandarín<form:checkbox path="idiomas" value="Mandarín"/>
            <br><br>
            <input type="submit" value="Enviar">
        </form:form>
    </body>
</html>
