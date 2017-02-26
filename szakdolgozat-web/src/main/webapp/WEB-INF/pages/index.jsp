<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Szakdolgozat</title>

<link rel="stylesheet" href="lib/css/bootstrap.css">

<script src="lib/js/jquery-3.1.1.js"></script>
<script src="lib/js/bootstrap.js"></script>

<script src="lib/js/angular.js"></script>
<script src="lib/js/ui-router-0-4-2.js"></script>

<script src="app/App.js"></script>
<script src="app/NavigationController.js"></script>

<!-- LOGIN -->
<script src="app/login/LoginController.js"></script>
<script src="app/login/LoginService.js"></script>

<!-- LOGIN -->
<script src="app/about/AboutController.js"></script>
<script src="app/about/AboutService.js"></script>

<%-- <link href="${pageContext.request.contextPath}/lib/css/bootstrap.css" rel="stylesheet"> --%>

</head>
<body ng-app="app">

	
	<div ui-view></div>


	
</body>
</html>