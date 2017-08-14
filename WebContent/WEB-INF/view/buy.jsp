<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   This Is Buy Page.
   <form action="" method="post">
     商品编号：<input type="text" name="pid" value="${order.product.pid }">
     商品名：<input type="text" name="pname" value="${order.product.pname }">
   </form>
</body>
</html>