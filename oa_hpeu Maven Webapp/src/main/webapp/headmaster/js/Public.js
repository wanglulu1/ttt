//保留菜单不动
document.write('<style>.documentBody{height:' + (document.documentElement.clientHeight - 32) + 'px;width:100%;overflow:auto;position:absolute;top: 32px;} </style> ');

//显示和隐藏div
function showObj(odiv) {
	if(document.getElementById(odiv).style.display == "none") {
		document.getElementById(odiv).style.display = "block";
	} else {
		document.getElementById(odiv).style.display = "none";
	}
}

//框架收缩
var DisplayStatus = "0";

function DisplayAndHide() {
	if(DisplayStatus == "0") {
		DisplayStatus = "1"
	} else {
		DisplayStatus = "0"
	}
}

var navigationBarStatus = "0";

function displayNavigationBar() {
	if(navigationBarStatus == "0") {
		top.frmWorkSpace.cols = "1,14,*";
		NavigationMenu.imgChange.src = 'FrameImages/kuozhan.jpg'
		navigationBarStatus = "1";
	} else {
		top.frmWorkSpace.cols = "226,14,*";
		NavigationMenu.imgChange.src = 'FrameImages/sousuo.jpg'
		navigationBarStatus = "0";
	}
}

//限制用户输入并提示；
function isOver(ContorlName, sText, len) {
	var intlen = sText.value.length;
	if(intlen > len) {
		sText.select();
		alert('“' + ContorlName + '”输入内容太多，超过限制。请调整为长度' + len + ',否则系统出错！');
		//sText.focus();
	}
}

//产生全屏的滚动

function CheckFileTypeJPG(objFileUpload) {
	var FileName = new String(objFileUpload.value); //文件名
	var extension = new String(FileName.substring(FileName.lastIndexOf(".") + 1, FileName.length)); //文件扩展名

	if(extension.toUpperCase() != "JPG" && extension.toUpperCase() != "JPEG" && extension.toUpperCase() != "PNG") //你可以添加扩展名
	{
		alert("本附件只支持jpg、png、gif格式！");
		objFileUpload.outerHTML = objFileUpload.outerHTML;
	}
}