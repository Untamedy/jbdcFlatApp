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
    <form action="selectByAddress"method="Post"  >
        <body>
            <label>Street:
                <input type="text" name="street" required placeholder="street"><br />
            </label>
            <label>Build:
                <input type="text" name="build" required placeholder="build"><br />
            </label>

            <br>
            <button type="submit">Select</button>
            <br>
            <br>    
    </form>>
</body>
</html>
