<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>挂号</title>
<script type="text/javascript">
function isNumber(oNum){
	if(!oNum) return false;
	var strP=/^\d+(\.\d+)?$/;
	if(!strP.test(oNum)) 
	return false;
	try{
		if(parseFloat(oNum)!=oNum){ 
			return false;
		}
	}catch(ex){
		return false;
	}
	return true;
} 
//表单验证
function cheForm(){
	//验证姓名
	var department = document.register.department.value;
	var kahao = document.register.kahao.value;
	var reservationType = document.register.reservationType.value;
	
	//显示 表单
	alert("卡号："+kahao+
		"\r\n科室："+department+
		"\r\n类型："+reservationType);
}
</script>
<style type="text/css">
*{
	margin:0px;
	padding:0px;
	}
table{
	width:700px;
	height:200px;
	background:#ECE9D8;
	}
table tr td{
	font-size:12px;
	color:#00C;
	}
table tr td input{
	width:140px;
	}
</style>
</head>
<body>
<form name="register" action="ReserveServlet" method=="post" onSubmit="return cheForm()">
<table width="727">
<tr align="center">
<td width="78" height="65">就诊卡号:</td>
<td width="148"><input type="text" name="kahao" value=""/></td>
<td width="70">身份证:</td>
<td width="138"><input type="text" name="id" value="" /></td>
<td width="78">费用类型:</td>
<td width="139"><input type="text" name="meony" value="自费" /></td>
</tr>
<tr align="center">
<td height="70">科室:</td>
<td>
<select id="department" name="department">
	<option value="0">中医科</option>
	<option value="1">中西医结合科</option>
	<option value="2">外科</option>
	<option value="3">推拿针灸科</option>
</select>
</td>
<td>医生:</td>
<td>
<select id="doctor" name="doctor">
	<option value="0">普通号</option>
	<option value="1">专家号-余勤</option>
	<option value="2">专家号-胡正刚</option>
	<option value="3">专家号-董襄国</option>
	<option value="4">专家号-张卓文</option>
	<option value="5">专家号-杨米雄</option>
	<option value="6">专家号-金国梁</option>
	<option value="7">专家号-王伟</option>
	<option value="8">专家号-徐珊</option>
	<option value="9">专家号-俞景茂</option>
	<option value="10">专家号-鲁贤昌</option>
	<option value="11">专家号-陈培丰</option>
	<option value="12">专家号-李虹</option>
	<option value="13">专家号-江依法</option>
</select>
</td>
<td>类型:</td>
<td>
<select id="reservationType" name="reservationType">
	<option value="0">普通号</option>
	<option value="1">专家号</option>
</select>
</td>
</tr>
<tr align="center" >
	  <td height="49"></td><td></td><td></td><td></td>
      <td ><input type = "submit" value = "挂号" id = "submit"></td>
      <td ><input type="reset" value="重置"/></td>
</tr>
</table>
</form>

</body>
</html>