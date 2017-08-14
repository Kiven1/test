<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
   Welcome To TaoBao
   请选择购买的类型：<form action="../product/" method="post">
      <select name="category_id">
        <c:forEach items="${category }" var="bean">
          <option value="${bean.category_id }">${bean.category_name }</option>
        </c:forEach>
      </select>
      <input type="submit" value="搜索">
   </form>
</body>
</html>