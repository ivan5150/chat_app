<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Save User</title>
    <jsp:include page="//Message.jsp"/>
</head>
<body>
<div class="container">
    <h1>Save User</h1>
    <form:form method="post" action="/save/user" commandName="messageForm">
        <%--<input class="form-control" name="id" path="id" value="${messageForm.id}" type="hidden"> --%>

        <div class="form-group">
            <label>Author Name</label>
            <input class="form-control" name="authorName" path="authorName" placeholder="User First Name"
                   value="${messageForm.authorName}">
            <form:errors path="authorName" cssStyle="color: #0002ff;"/>
        </div>
        <div class="form-group">
            <label>Author Text</label>
            <input class="form-control" name="text" path="text" placeholder="User Second Name"
                   value="${messageForm.text}">
            <form:errors path="text" cssStyle="color: #0002ff;"/>
        </div>
        <input class="btn btn-default btn-xs" type="submit" value="save">
        <a class="btn btn-default btn-xs" href="/" role="button">cancel</a>
    </form:form>
</div>
</body>
</html>