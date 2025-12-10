<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="/insertprd" method="post"> <br>
    pid: <input type="text" name="pid" id="pid"> <br>
    name: <input type="text" name="name" id="name"><br>
    qty: <input type="text" name="qty" id="qty"> <br>
    price: <input type="text" name="price" id="price"> <br>
    localdate: <input type="date" name="localdate" id="localdate"> <br>
    cid: <input type="text" name="cid" id="cid"> <br>
   <button type="submit" id="btn" value="btn"> click me</button><br>
  </form>

</body>
</html>