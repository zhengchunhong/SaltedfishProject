<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
	<base href="<%=basePath%>">
	<meta charset="UTF-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<title>注册</title>
	<style>
		*{
			padding: 0;
			margin: 0;
		}
		body{
				background:url("image/bgd.jpg");
            }
		.box{
			margin-top: 5px;
			width: 350px;
			height: 500px;
			padding: 0 20px;
			border: 2px solid #FFFFFF;
			background-color:#FFFFFF;
            margin-right: auto;
			margin-left: auto;
		}
		.tit{
			margin-top: 5px;
			margin-bottom: 30px;
		}
		.tit2{
			margin-top: -15px;
			margin-bottom: 30px;
		}
		a:link {
			font-size: 16px;
			color: #000000;
			text-decoration: none;
		}
		a:visited {
			font-size: 16px;
			color: #000000;
			text-decoration: none;
		}
		a:hover {
			font-size: 16px;
			color: #CE0000;
			font-weight:bold;
		}
		.brand{
			color: #000000;
			font-size: 18px;
			margin-left:110px;
		}
		.word1{
			margin-left:70px;
		}
		.word2{
			margin-left:70px;
			color: #CE0000;
		}
		.inp{
			width: 100%;
			height: 40px;
			text-indent: 8px;
		}
		.notice{
			height: 30px;
			line-height: 30px;
			font-size: 12px;
			color:#A52A2A;
		}
		.warn{
			margin-top:10px;
		}
		.btn{
			background: #2F4F4F;
			color:#F5F5F5;
			width: 100%;
			height: 40px;
			border: none;
			margin-top: 8px;
			color: #000;
			border-radius: 3px;
			font-size: 20px;
			letter-spacing: 20px;
			color:#F0F0F0;
		}

	</style>
</head>
<body>
	<div class="biggest">
	<div class="box">
		<p class="tit">
			<span class="brand">SaltedFishTest</span>
		</p>
		<p class="tit2">
			<span class="word1"><a href="login.jsp">用户登录</a></span>
			<span class="word2">用户注册</span>
		</p>
<form action="check2.jsp" method="post"
				onSubmit="return isValid(this);">
		<input class="inp" type="text" name="username"placeholder="用户名">
		<p class="notice"></p>

		<input class="inp" type="password" name="pwd" placeholder="密码">
		<p class="notice"></p>

		<input class="inp" type="password" name="pwd2" placeholder="确认密码">
		<p class="notice"></p>

		<input class="inp" type="phone" placeholder="注册手机号">
		<p class="notice"></p>
		
		<div class="warn">
		<input type="checkbox" checked>
		<span>我已阅读并确认该使用条款和隐私政策的内容。</span>
		</div>

		<button class="btn">注册</button>
		</form>
	</div>
	</div>
</body>
<script type="text/javascript">
	
	var btn = document.getElementsByClassName("btn");
	var inp = document.getElementsByClassName("inp");
	var notice = document.getElementsByClassName("notice");


    	inp[0].onclick = function(){
        	notice[0].innerHTML = "请输入4-10位用户名";
    	}
    	inp[0].onblur = function(){
        	notice[0].innerHTML = "";
    	}

    	inp[1].onclick = function(){
        	notice[1].innerHTML = "请输入6-12位的密码";
    	}
    	inp[1].onblur = function(){
        	notice[1].innerHTML = "";
    	}

    	inp[2].onclick = function(){
        	notice[2].innerHTML = "请再次输入您的密码";
    	}
    	inp[2].onblur = function(){
        	notice[2].innerHTML = "";
    	}

    	inp[3].onclick = function(){
        	notice[3].innerHTML = "请输入11位手机号";
    	}
    	inp[3].onblur = function(){
        	notice[3].innerHTML = "";
    	}

		btn[0].onclick = function(){
			var test1 = 1;
			var test2 = 1;
			var test3 = 1;
			var test4 = 1;
			var idName = inp[0].value;
			var idPassword = inp[1].value;
			var idPassword2 = inp[2].value;
			var idPhone = inp[3].value;

			if(idName.length < 4 || idName.length > 10){
				notice[0].innerHTML = "用户名位数不对，请重新输入";
				test1 = 0;
			}
			if(idPassword.length < 6 || idPassword.length > 12){
				notice[1].innerHTML = "密码位数不对，请重新输入";
				test2 = 0;
			}
			if(pwd2.value != pwd.value){
				notice[2].innerHTML = "两次密码不一致，请重新输入";
				test3 = 0;
			}
			if(idPhone.length < 11 || idPhone.length > 11){
				notice[3].innerHTML = "手机号位数不对，请重新输入";
				test4 = 0;
			}

		}
</script>
</html>