<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>this is a JSP program</title>
</head>

<body>

<form action="pm" method="post">

Name: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id = "name" name = "name"/>
<br><br>

Country :&nbsp;&nbsp;
<Select name = "country">
<option>----Select Country----</option>
<option value = "INDIA">INDIA</option>
<option value ="SOUDI ARABIA">SOUDI ARABIA</option>
<option value = "AMERICA">AMERICA</option>
<option value = "UNITED KINGDOM">UNITED KINGDOM</option>

</Select>
<br>
<br>

Select Marriage status :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" id ="Single" name ="marriage" value = "Single">
<label for="Single">Un Married</label>&nbsp;&nbsp;
<input type="radio" id ="Single" name ="marriage" value = "Married">
<label for="Single">Married</label>&nbsp;&nbsp;
<br/></br>
Party :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<select name="party">
<option>***Select Party***</option>
<option value ="BJP">BJP</option>
<option value ="CNG">Congress</option>
<option value ="AAP">Aam Aadmy Party</option>
</select>
<br>
<br>
<label>Age&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
<input type="text" id="age" name="age"/>
<br><br>

Select Gender :<br>
<input type="radio" id ="gender" name ="gen" value = "male">
<label for="gender">male</label>&nbsp;&nbsp;
<input type="radio" id ="gender" name ="gen" value = "female">
<label for="gender">female</label>&nbsp;&nbsp;
<input type="radio" id ="gender" name ="gen" value ="others">
<label for="gender">others</label><br><br>


Period As: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="time" name="time"/>
<br>
<br>

Times Represented :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<Select name = "rep">
<option>----Times Represented----</option>
<option value = "1">1</option>
<option value ="2">2</option>
<option value = "3">3</option>
<option value = "4">4</option>
<br>
</Select><br><br>

<input type="submit" value="SAVE">
</form>
</body>
</html>