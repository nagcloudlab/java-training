<!DOCTYPE html>
<%@page import="com.example.demo.model.Txn"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>txr service</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body class="container">

	<hr />
	<h1>Money Transfer System</h1>
	<hr />

	<ul class="nav nav-pills">
		<li class="nav-item">
			<a class="nav-link" href="txr-form.html">Transfer</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="">Statement</a>
		</li>
	</ul>
	<hr />
	
	<table class="table table-bordered">
	<thead>
	<tr>
		<td>Id</td>
		<td>Amount</td>
		<td>Date & Time</td>
		<td>Remarks</td>
	</tr>
	</thead>
	<tbody>
	<%
		List<Txn> txns=(List<Txn>)request.getAttribute("txns");
		for(Txn txn:txns){
	%>
	
	<tr>
		<td><%=txn.getId() %></td>
		<td>&#8377;<%=txn.getAmount() %></td>
		<td><%=txn.getLocalDateTime() %></td>
		<td><%=txn.getRemarks() %></td>
	</tr>
	
	<%
		}
	%>
	</tbody>
	</table>

</body>
</html>