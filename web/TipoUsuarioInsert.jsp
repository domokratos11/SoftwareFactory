<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
response.setHeader("Content-Type","text/html; charset=windows-1252");
response.setHeader("Pragma","no-cache");
response.setHeader("Cache-Control","no-store");
response.setHeader("Cache-Control", "must-revalidate");
response.setHeader("Cache-Control","no-cache");
    
    HttpSession actual =request.getSession(true);
    String id = actual.getId();
    String nombre = (String)actual.getAttribute("Logueado");
    
    if(actual.isNew()){
        response.sendRedirect("Login.jsp");
        return;
    }
    
    if(actual == null)
    {
        response.sendRedirect("Login.jsp");
    }
    else
    {
        if(actual.getAttribute("Logueado")==null){
            response.sendRedirect("Login.jsp");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar Tipo Usuario</h1>
        <form action="ServletTipoUsuarioInsert" method="post">            
            <label for="txtDescripcion">Descripcion</label>
            <input type="text" id="txtDescripcion" name="txtDescripcion">
            
            <input type="submit" value="Ingresar Tipo Usuario">
        </form>
        <br><br>
        <a href="Index.jsp">Regresar al Menu</a> 
    </body>
</html>