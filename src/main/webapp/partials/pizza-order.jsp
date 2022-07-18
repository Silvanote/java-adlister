<%--
  Created by IntelliJ IDEA.
  User: juansfolder
  Date: 7/15/22
  Time: 4:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Palace</title>
</head>
<body>
<form action="pizza-order" method="post">
    <select name="size" id = "size-pizza">
        <option value ="small"> small  pizza </option>
        <option value ="medium"> medium  pizza </option>
        <option value ="large"> large  pizza </option>
    </select>
</form>
<select name="crust" id = "crust-pizza">
    <option value ="thin">thin crust </option>
    <option value ="hand-tossed"> hand-tossed crust</option>
    <option value ="chicago"> chicago style </option>
</select>
<select name="sauce" id = "sauce-type">
    <option value ="marinara">thin crust </option>
    <option value ="alfredo"> hand-tossed crust</option>
    <option value ="no sauce"> chicago style </option>
</select>
<input type="text" name = "address">
<button>Next</button>

</form>
</body>
</html>
