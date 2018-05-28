<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'salary.jsp' starting page</title>
	<!--<link rel="stylesheet" type="text/css" href="styles.css">-->
  </head>
  <style>
		table{
			border: 3px solid #f60;
		}
		table tr{
			height: 100px;
			
		}
		tr td{
			border-right: 1px solid red;

			border-top: 1px solid red;
		}
	</style>
  <body>
    <div class="top">
			<table>
				<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>部门</td>
				<td>出勤天数</td>
				<td>实际工资</td>
				<td>补贴工资</td>
				</tr>
				<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>
				<td>6</td>
				</tr>
				<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>
				<td>6</td>
				</tr>
			</table>
		</div>
  </body>
</html>
