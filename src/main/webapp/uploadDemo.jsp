<%--
  Created by IntelliJ IDEA.
  User: robertpicyu
  Date: 2017/3/7
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <title>Upload File Request Page</title>
</head>
<body>
<form method="POST" action="uploadFile" enctype="multipart/form-data">
    File to upload: <input type="file" name="file">

    Name: <input type="text" name="name">

    <input type="submit" value="Upload"> Press here to upload the file!
</form>
</body>
</html>
