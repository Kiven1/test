<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    This Is Products Page
    
    <table border="1">
      <tr>
        <th>商品编号</th><th>商品名</th>
        <th>商品余量</th>
        <th>商品单价</th>
        <th>商品类型</th>
        <th>操作</th>
      </tr>
      <c:forEach items="${porducts }" var="bean">
        <tr>
          <td>${bean.pid }</td>
          <td>${bean.pname }</td>
          <td>${bean.pquantity }</td>
          <td>${bean.pprice }</td>
          <td>${bean.category.category_name }</td>
          <td>
             <a href="../order/${bean.pid }/sam123456/buy">购买</a>
             <a>加入购物车</a>
          </td>
        </tr>
      </c:forEach>
    </table>
</body>
</html>