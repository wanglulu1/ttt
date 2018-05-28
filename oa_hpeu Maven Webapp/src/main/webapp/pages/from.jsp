<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'salary.jsp' starting page</title>
<link rel="stylesheet" href="./headmaster/css/style-core.css" />
<link rel="stylesheet" href="./headmaster/css/style-index.css" />
<link rel="stylesheet" href="./headmaster/css/style-idxtab.css" />
<link rel="stylesheet" href="./headmaster/css/style-add.css" />
<script src="./headmaster/js/jquery-2.2.4.min.js"></script>
</head>
<body>
	<div class="main-all" style="margin-left: -300px;">
		<div class="main clearfix">
			<div class="mi-r fr">
				<div class="box-tab">
					<div class="box-tit clearfix">
						<a class='add clearfix' href="javascript:;" onclick="addFor()"><span>添加</span><i></i></a>
						<button>导出excel</button>
					</div>
					<div class="box-page clearfix">
						<dl class="box-dl">
							<dt>
								<a class='clearfix' href="#">10<i></i></a>
							</dt>
							<dd class="first">
								<input type="text"><i></i>
							</dd>
							<dd>
								<a href="#">15</a>
							</dd>
							<dd>
								<a href="#">20</a>
							</dd>
							<dd>
								<a href="#">30</a>
							</dd>
						</dl>
						<span>分页数据</span>
						<div class="box-seach">
							<input type="text" name="" placeholder="输入查询" /> <a href="#"><i></i></a>
						</div>
					</div>
					<table border="0">
						<tr>
							<td>班级编号</td>
							<td>班级人数</td>
							<td>班主任</td>
							<td>讲师</td>
							<td>助教</td>
							<td>班干部</td>
							<td>班级人员</td>
							<td colspan="2">操作</td>
						</tr>
						<tr>
							<td>java5</td>
							<td>44</td>
							<td>xxxx</td>
							<td>袁飞</td>
							<td>助教1号</td>
							<td>正班长</td>
							<td>人员1号</td>
							<td><a href="javascript:;" onclick="modifyOrdel(this)"><i
									class="i-mod"></i></a></td>
							<td><a href="javascript:;" onclick="modifyOrdel(this)"><i
									class="i-del"></i></a></td>
						</tr>
						<tr>
							<td>java5</td>
							<td>44</td>
							<td>xxx</td>
							<td>袁飞</td>
							<td>助教2号</td>
							<td>副班长</td>
							<td>人员2号</td>
							<td><a href="javascript:;" onclick="modifyOrdel(this)"><i
									class="i-mod"></i></a></td>
							<td><a href="javascript:;" onclick="modifyOrdel(this)"><i
									class="i-del"></i></a></td>
						</tr>
						<tr>
							<td>java5</td>
							<td>44</td>
							<td>ccc</td>
							<td>袁飞</td>
							<td>助教3号</td>
							<td>班干3号</td>
							<td>人员3号</td>
							<td><a href="javascript:;" onclick="modifyOrdel(this)"><i
									class="i-mod"></i></a></td>
							<td><a href="javascript:;" onclick="modifyOrdel(this)"><i
									class="i-del"></i></a></td>
						</tr>
						<tr>
							<td>java5</td>
							<td>44</td>
							<td>ccc</td>
							<td>袁飞</td>
							<td>助教4号</td>
							<td>班干4号</td>
							<td>人员4号</td>
							<td><a href="javascript:;" onclick="modifyOrdel(this)"><i
									class="i-mod"></i></a></td>
							<td><a href="javascript:;" onclick="modifyOrdel(this)"><i
									class="i-del"></i></a></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>

	<div id="boxAdd">
		<div class="box-cen">
			<div class="add-tacher">
				<form>
					<ul>
						<li class="clearfix">
							<div class="fr-l fl">班级人员：</div>
							<div class="fr-r fr">
								<input type="text" name="userName">
							</div>
						</li>
						<li class="clearfix">
							<div class="fr-l fl">班干部：</div>
							<div class="fr-r fr">
								<input type="text" name="userName">
							</div>
						</li>
						<li class="clearfix">
							<div class="fr-l fl">班主任：</div>
							<div class="fr-r fr">
								<input type="text" name="userName">
							</div>
						</li>
						<li class="clearfix">
							<button class="close-for">取消</button>
							<button class="save-for">确定</button>
						</li>
					</ul>
				</form>
			</div>
		</div>
	</div>
</body>
<script>
	$(function() {
		var idx = 0;
		$(".box-tab .box-page dl dt").click(function() {
			idx++;
			if (idx % 2) {
				$(".box-tab .box-page dl dd").css("display", "block");
				$(".box-tab .box-page dt i").css('background-image', 'url("./img/back/caret-up.png")');
			} else {
				$(".box-tab .box-page dl dd").css("display", "none");
				$(".box-tab .box-page dt i").css('background-image', 'url("./img/back/caret-down.png")');
			}
		});
		$(".box-tab .box-page dl dd[class !='first']").click(function() {
			$(".box-tab .box-page dl dd").css("display", "none");
		});
	});

	function addFor() {
		$("#boxAdd").css("display", "block");
	}

	function modifyOrdel(obj) {
		$("#boxAdd").css("display", "block");
	}
</script>
</html>
