<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer Management Screen</title>
</head>
<body>
	<div align="center">
		<nav class="controls">
			<a href="#" class="button" onClick="stopwatch.start();">Start</a>
			<a href="#" class="button" onClick="stopwatch.lap();">Lap</a>
			<a href="#" class="button" onClick="stopwatch.stop();">Stop</a>
			<a href="#" class="button" onClick="stopwatch.restart();">Restart</a>
			<a href="#" class="button" onClick="stopwatch.clear();">Clear Laps</a>
		</nav>
		<div class="stopwatch"></div>
		<ul class="results"></ul>
	</div>
 <script type="text/javascript" src="js/stopWatch.js"></script>
</body>
</html>