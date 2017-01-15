<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
  </head>
  <body>
  <h1>Calculando áreas</h1>
  <form action="AreaServlet?area=circulo" method="post">
      <fieldset>
          <legend>Área del círculo</legend>
          Radio: <input type="text" name="radio" value="${param.radio}"/>
          <input type="submit" value="Calcular"/>      
      </fieldset>
  </form>

  <form action="AreaServlet?area=triangulo" method="post">
      <fieldset>
          <legend>Área del Triángulo</legend>
          Altura: <input type="text" name="altura" value="${param.altura}"/><br/>
          Base: <input type="text" name="base" value="${param.base}"/><br/>
          <input type="submit" value="Calcular"/>       
      </fieldset>
  </form>

  </body>
</html>