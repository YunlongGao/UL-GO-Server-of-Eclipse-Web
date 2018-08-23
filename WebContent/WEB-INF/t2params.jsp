<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
${exa }
<body>
<div>
<form action="http://localhost:8080/adserver/test/tsetClass/testParams" method="get"> 
  <table width="448" height="261" border="2">
    <tr>
      <td width="75">roleName</td>
      <td width="355"><label for="textfield"></label>
      <input type="text" name="roleName" id="textfield" value=""/></td>
    </tr>
    <tr>
      <td>note</td>
      <td><label for="textarea"></label>
      <input type="text" name="note" id="textfield" value=""/></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">
        <input type="submit"  id="submit" value="Submmit" />
        <input type="submit"  id="replace" value="Cancle" />
      </div></td>
    </tr>
  </table>
 </form>
</div>
</body>
</html>