<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

</head>

<body>
<div class="container">
    <h1>Home Page</h1>
    <textarea rows="10">${author} : ${text} </textarea>

    <form method="post" action="/showMessage">
        <label for="author">Author name:</label>

        <input type="text" id="author" name="author" placeholder="type author"/>
        <br/>
        <br/>
        <label for="text">Message text:</label>

        <input type="text" id="text" name="text" placeholder="type message"/>
        <br/>
        <br/>


        <button type="submit" class="btn btn-large btn-primary">Send message</button>

        <br/><br/><br/>
        <a href="/"> << Back to home</a>

        <c:forEach items="${list}" var="msg">
            ${author}<br>

        </c:forEach>

    </form>
</div>
</body>
</html>