<%--
  Created by IntelliJ IDEA.
  User: kimhankyeol
  Date: 2020-09-09
  Time: 오후 8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src=" https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script>
        function login(){
            $.ajax({
                url:'/user/login',
                method:'get',
                data:{
                    'email':$('#email').val(),
                    'password':$('#password').val()
                },
                success:function(resp){
                    var cont="";
                    var cont2="";
                    if(resp=="success"){
                        cont +="<iframe style='width:300px; height:300px' src='/code/generate/"+$('#email').val()+"'></iframe>";
                        cont2 +="이메일<input id='authEmail' type='text' value='"+$('#email').val()+"'/>";
                        cont2 +="키<input id='key' type='text'/>";
                        cont2 +="<button id='' onclick='login2()'>otp 로그인</button>";
                        $('#logInfo').hide();
                        $('#qrcode').html(cont);
                        $('#auth').html(cont2);
                    }else{
                        alert("아이디와 비밀번호가 일치하지않습니다.");
                        return false;
                    }
                }
            })
        }
        function login2(){
            $.ajax({
                url:'/code/validate/key',
                method:'post',
                data:{
                    'username':$('#authEmail').val(),
                    'code':$('#key').val()
                },
                success:function(resp){
                    if(resp.valid){
                        alert('로그인 성공');
                        location.href="/user/login?useremail="+$('#authEmail').val();
                    }else{
                        alert('로그인 실패');
                        return false;
                    }
                }
            })
        }
    </script>
</head>
<body>
<div id="logInfo">
아이디<input id="email" type="text"/>
패스워드<input id="password" type="password"/><button id="oneLogin" onclick="login()">로그인</button>
</div>


<div id="qrcode"></div>
<div id="auth"></div>
</body>
</html>
