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
            Nombre: <form:input path="nombre" /> <form:errors path="nombre" style="color:red"/>
            <br><br>
            Apellido: <form:input path="apellido" />
            <br><br>
            Edad: <form:input path="edad" /> <form:errors path="edad" style="color:red"/>
            <br><br>
            Email: <form:input path="email" /> <form:errors path="email" style="color:red"/>
            <br><br>
            Asignatura Optativa: 
            <form:select path="optativa">
                <form:option value="ProgramacionI" value="Programacion I"/>
                <form:option value="ProgramacionII" value="Programacion II"/>
                <form:option value="ProgramacionII" value="Programacion III"/>
            </form:select>    
            <br><br>
            Inglés<form:checkbox path="idiomas" value="Ingles"/>
            Francés<form:checkbox path="idiomas" value="Frances"/>
            Alemán<form:checkbox path="idiomas" value="Aleman"/>
            Mandarín<form:checkbox path="idiomas" value="Mandarin"/>
            <br><br>
            <input type="submit" value="Enviar">
        </form:form>
    </body>
</html>
