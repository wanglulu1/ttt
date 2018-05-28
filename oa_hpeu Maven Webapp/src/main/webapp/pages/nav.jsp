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
<title>请假首页</title>
<script type="text/javascript" src="./headmaster/js/Public.js"></script>
<link href="./headmaster/css/Public.css" rel="stylesheet" type="text/css" />
<link href="./headmaster/css/pb11.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<form name="form1" method="post" action="ApplyLeaveNoHome.aspx"
		id="form1">
		<div>

			<input type="hidden" name="__VIEWSTATEENCRYPTED"
				id="__VIEWSTATEENCRYPTED" value="" />
		</div>
		<div>
			<div class="DivMenu">&nbsp;&nbsp;</div>
			<div class="documentBody">
				<table class="DivTable" cellpadding="3" cellspacing="1" border="0">
					<tr bgcolor="#FFFFFF">
							<td class="EdtTitleBack" style="width: 15%;" height="25" align="right">说明：</td>
							<td height="25" colspan="3" class="EdtBack"> 必须有凭证才能请假或者假期可以请假。
								<a href="SearchLeaveNoHomeConfig.aspx?Address=ApplyLeaveNoHome.aspx"><span style="color: #ff0033">查看假期</span></a>
							</td>
						</tr>
						<tr bgcolor="#FFFFFF">
							<td height="25" align="right" class="EdtTitleBack" style="width: 15%;">当前状态：</td>
							<td height="25" colspan="3" class="EdtBack"> <span id="Status" style="color:Red;">当前无假期，不能提交假期留校申请。</span></td>
						</tr>
						<tr bgcolor="#FFFFFF">
							<td height="25" align="right" class="EdtTitleBack" style="width: 15%;">当前状态：</td>
							<td height="25" colspan="3" class="EdtBack"> <span id="Status" style="color:Red;">由于某原因可以请假</span></td>
						</tr>
						<tr bgcolor="#ffffff">
							<td align="right" height="25" class="EdtTitleBack" style="width: 15%;">假期名称：</td>
							<td height="25" colspan="3" class="EdtBack">
								<span id="HolidayName"></span></td>
						</tr>
						<tr bgcolor="#ffffff">
							<td align="right" height="25" class="EdtTitleBack" style="width: 15%;">放假开始日期：</td>
							<td height="25" class="EdtBack" style="width: 32%;">
								<span id="BeginDate"></span></td>
							<td width="15%" height="25" align="right" class="EdtTitleBack" style="width: 15%;">放假结束日期：</td>
							<td height="25">
								<span id="EndDate"></span></td>
						</tr>
						<tr bgcolor="#ffffff">
							<td align="right" height="25" class="EdtTitleBack" style="width: 15%;">请假原因：</td>
							<td height="25" colspan="3" class="EdtBack">
								<span id="HolidayName"></span></td>
						</tr>
						<tr bgcolor="#ffffff">
							<td align="right" height="25" class="EdtTitleBack" style="width: 15%;">请假开始日期：</td>
							<td height="25" class="EdtBack" style="width: 32%;">
								<span id="LeaveBeginDate"></span></td>
							<td height="25" align="right" class="EdtTitleBack" style="width: 15%;">
								请假截止日期：</td>
							<td height="25" class="EdtBack">
								<span id="LeaveEndDate"></span></td>
						</tr>
						<tr bgcolor="#ffffff">
							<td align="right" height="25" class="EdtTitleBack" style="width: 15%;">备注：</td>
							<td height="25" colspan="3" class="EdtBack">
								<span id="Memo"></span></td>
						</tr>
				</table>
				<div class="DivMain">
					<div class="DivCaption">
						<div style="width: 45%; float: left; text-align: left;">
							&nbsp;&nbsp;<img src="../FrameImages/arrow.gif" />&nbsp;假期留校信息
						</div>
						<div style="float: right; text-align: right; margin: 6px 0 0 0;">
							<div style="width:100%;float:right;margin-right:2px">
								<table id="TPagedInfo1" cellpadding="1">
									<tr>
										<td><span id="TPagedInfo1_myinfolbl">共检索到&nbsp;<font
												color=red>0</font>&nbsp;条记录，每页&nbsp;<font color=red>50</font>&nbsp;条，共&nbsp;<font
												color=red>0</font>&nbsp;页
										</span></td>
									</tr>
								</table>
							</div>
						</div>
					</div>
					<div>
						<table class="white" cellspacing="0" cellpadding="3" border="0"
							id="GridView1"
							style="color:#333333;font-size:9pt;width:100%;border-collapse:collapse;">
							<tr>
								<td colspan="6">未找到相关数据</td>
							</tr>
						</table>
					</div>
					<div style="width:100%;text-align:right;margin:5px 0px;">
						<span id="TPaged1" cellpadding="1" id="TPaged1_lblCurrPage">共检索到&nbsp;<font
							color=red>0</font>&nbsp;条记录，每页&nbsp;<font color=red>50</font>&nbsp;条，第&nbsp;<font
							color=red>1</font>/<font color=red>0</font>&nbsp;页&nbsp;&nbsp;
						</span><input type="submit" name="TPaged1$Fistpage" value="首  页"
							id="TPaged1_Fistpage" disabled="disabled" /> <input
							type="submit" name="TPaged1$Prevpage" value="上一页"
							id="TPaged1_Prevpage" disabled="disabled" /> <input
							type="submit" name="TPaged1$Nextpage" value="下一页"
							id="TPaged1_Nextpage" disabled="disabled" /> <input
							type="submit" name="TPaged1$Lastpage" value="尾  页"
							id="TPaged1_Lastpage" disabled="disabled" /> <span
							id="TPaged1_lbjumppage">跳转到第</span> <input
							name="TPaged1$GotoPage" type="text" id="TPaged1_GotoPage"
							style="width:40px;text-align:center;" /> <span id="TPaged1_lbye">页</span>
						<input type="submit" name="TPaged1$Jump" value="跳  转"
							id="TPaged1_Jump" disabled="disabled" />&nbsp;&nbsp;
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>
