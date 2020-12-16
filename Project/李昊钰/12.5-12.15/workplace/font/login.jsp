<%@ page language="java" import="java.util.*"
	contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>用户登录</title>
<style>
* {
	padding: 0;
	margin: 0;
}

body {
	background: url("image/bgd.jpg");
}

.box {
	width: 300px;
	height: 360px;
	padding: 0 20px;
	border: 2px solid #FFFFFF;
	background-color: #FFFFFF;
	margin: 50px auto;
}

.tit {
	margin-top: 5px;
	margin-bottom: 30px;
}

.tit2 {
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
	font-weight: bold;
}

.brand {
	color: #000000;
	font-size: 18px;
	margin-left: 85px;
}

.word1 {
	margin-left: 50px;
	color: #CE0000;
	font-weight:border;
}

.word2 {
	margin-left: 50px;
}

.inp {
	width: 100%;
	height: 40px;
	text-indent: 8px;
}

.notice {
	height: 30px;
	line-height: 30px;
	font-size: 12px;
	color: #A52A2A;
}

.warn {
	margin-top: 10px;
}

.btn {
	background: #2F4F4F;
	color: #F5F5F5;
	width: 100%;
	height: 40px;
	border: none;
	margin-top: 8px;
	color: #000;
	border-radius: 3px;
	font-size: 20px;
	letter-spacing: 20px;
	color: #F0F0F0;
}

.word3 {
	padding-top: 10px;
	margin-left: 70px;
}
</style>
</head>
<body>
	<div class="biggest">
		<div class="box">
			<form action="check.jsp" method="post">
				<p class="tit">
					<span class="brand">SaltedFishTest</span>
				</p>
				<p class="tit2">
					<span class="word1">用户登录</span> 
					<span class="word2"><a href="register.jsp"> 用户注册</a></span>
				</p>

				<input class="inp" type="text" name="username" placeholder="用户名">
				<p class="notice"></p>

				<input class="inp" type="password" name="pwd" placeholder="密码">
				<p class="notice"></p>

				<button class="btn" type="submit">登录</button>
			</form>
			<div class="word3">
				<span>新用户？<a href="register.jsp">注册一个账户</a></span>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	var number;
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

		btn[0].onclick = function(){
			var test1 = 1;
			var test2 = 1;
			var idName = inp[0].value;
			var idPassword = inp[1].value;

			if(idName.length < 4 || idName.length > 10){
				notice[0].innerHTML = "用户名位数不对，请重新输入";
				test1 = 0;
			}
			if(idPassword.length < 6 || idPassword.length > 12){
				notice[1].innerHTML = "密码位数不对，请重新输入";
				test2 = 0;
			}					
		}
</script>
</html>