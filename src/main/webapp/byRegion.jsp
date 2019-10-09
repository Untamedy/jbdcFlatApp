<%-- 
    Document   : byParameter
    Created on : Oct 9, 2019, 1:22:00 PM
    Author     : YBolshakova
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search flat by:</title>
    </head>
    <form action="selectByRegion" method="Post"  >
        <body>

            <label>Region:
                <select name ="region">
                    <option>west</option>
                    <option>east</option>
                    <option>south</option>
                </select>
            </label>


            <br>
            <button type="submit">Select</button>
            <br>
            <br>    
    </form>>
</body>
</html>
