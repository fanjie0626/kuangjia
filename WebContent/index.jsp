<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="from"%>
<!DOCTYPE html>
<html>
  <head>
	<meta charset="UTF-8">
	<title>首页</title>
  </head>
  <body>
    <form action="showName" method="post">
      <table>
        <tr>
          <td>用户ID</td>
          <td><input name="id" type="text"/></td>
        </tr>
        <tr>
          <td colspan="2"><input type="submit" value="查询"/></td>
        </tr>
      </table>
    </form>
  </body>
</html>