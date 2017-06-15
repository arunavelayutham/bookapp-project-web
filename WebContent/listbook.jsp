<!DOCTYPE html>
<%@page import="model.usermodel"%>
<%@page import="java.util.List"%>
<%@page import="dao.bookDAO"%>
<html>
<head>

<title>List books</title>
</head>
<body>
<h3>list books</h3>
<table border ="1">
<thead>
<tr><th>id</th><th>name</th><th>price</th><th>published_date</th>
<th>author name</th>
</thead>
<tbody>
<tr>
<td>1</td>
<td>java</td>
<td>200</td>
<td>2017-12-06</td>
<td>suresh</td>

</tr>
<tr>
<td>2</td>
<td>sql</td>
<td>500</td>
<td>2015-01-06</td>
<td>siva</td>
</tr>
</tbody>
</table>
</body>

<%

bookDAO bookDAO =new bookDAO();
List<usermodel>bookList = bookDAO.listbook();
out.println("Books:"+bookList);
%>
<%
for(usermodel b:bookList){
out.println%>
</html>


