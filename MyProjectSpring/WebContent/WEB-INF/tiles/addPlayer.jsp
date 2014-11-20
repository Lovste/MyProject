<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/static/css/main.css"
	rel="stylesheet" type="text/css">
<title>Inserisci Giocatore</title>
</head>



<body>

	<form method="post" action="${pageContext.request.contextPath}/doAdd">
		<div id=form>

			<label>Nome:</label> <input id="name" type="text" name="name"><br>

			<label>Cognome:</label> 
				<input id="surname" type="text"	name="surname"><br> 
			
			<label>Data di Nascita:</label> 
				<input id="birthdate" type="text" name="birthdate"><br> <br>
			
			<label> Ruolo:</label> 
				<select id="role" name="role">
					<option>Playmaker</option>
					<option>Guardia</option>
					<option>Ala Piccola</option>
					<option>Ala Grande</option>
					<option>Centro</option>
				</select><br> 
			
			<label>Numero Maglia:</label> 
				<input id="jerseynumber" type="text" name="jerseynumber"><br> 
			
			<label>Squadra:</label>
			<input id="team" type="text" name="team"><br> <br>
			
			
			<input id=submit type="submit" value="save" onclick="return validateFields()">
			<input id=submit type="reset" value="reset">
		</div>
	</form>

</body>
</html>