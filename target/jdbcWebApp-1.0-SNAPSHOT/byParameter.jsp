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
    <form action="selectByParam" method="Post"  >
        <body>
            <label>By parameter:
                <select name="param">
                    <option>price</option>
                    <option>square</option>
                    <option>room</option>
                </select>
            </label>
            <label>Min value:
                <input type="text" name="min" required placeholder="Min value"><br />
            </label>
            <label>Max value:
                <input type="text" name="max" required placeholder="Max value"><br />
            </label>

            <br>
            <button type="submit">Select</button>
            <br>
            <br>    
    </form>>
</body>
</html>
