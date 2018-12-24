<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculatrice</title>
</head>
<body>
	<p>
		${empty calc.nb1 || empty calc.nb2 ? '' : 'le resultat est : ' }
		${empty calc.nb1 || empty calc.nb2 ? '' : resultat }
		
	</p>
	<form method ="post" action="calculer">
		<fieldset>
			<input type="number" name="nb1" id="nb1">
			<select name="operateur" id="operateur">
				<option value = "1">+</option>
				<option value = "2">-</option>
				<option value = "3">*</option>
				<option value = "4">/</option>
			</select>
			<input type="number" name="nb2" id="nb2">
			<input type="submit" value="Resultat">
		</fieldset>
		
	</form>
</body>
</html>