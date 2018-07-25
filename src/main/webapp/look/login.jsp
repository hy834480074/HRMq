<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="/js/loginall/login.css/style1.0.css">
    <link rel="stylesheet" type="text/css" href="/js/loginall/login.css/style2.0.css">
    <link rel="stylesheet" type="text/css" href="/js/loginall/login.css/login1.0.css">
    <script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#Ac").blur(function () {
                var username = $(this).text();
                if (username.length == 0) {
                    $("#fontsize").text("账号不能为空");
                    return;
                }
                if (username.length < 6 || username.length > 18) {
                    $("#fontsize").text("账号长度必须是6-18位");
                    return;
                }
                if (/[\u4e00-\u9fa5]/.test(username)) {
                    $("#fontsize").text("账号不能有中文");
                    return;
                }
                $("#fontsize").text("账号验证通过");
            });

            function remind(set,text){
                $(set).text(text)
                $(set).fadeToggle(1000);
                $(set).fadeToggle(1000);
            }
            function rom(haha,goon){
                setTimeout(function(){
                    $("form").attr(haha,goon);
                    $("form").submit();
                },2500)
            }
            $(":button").click(function(){
                var staffAccount = $(":text[name='staffAccount']").val();
                var staffPassword = $(":text[name='staffPassword']").val();
                var choose = $(this).text();
                $.ajax({
                    url:"/staff/regAndLog",
                    type:"post",
                    dataType:"text",
                    data:{
                        "choose":choose,
                        "staffAccount":staffAccount,
                        "staffPassword":staffPassword
                    },
                    success:function(data){
                        if(data==="registerReg"){
                            remind("#fontsize","欢迎来到江湖");
                            rom("action","${pageContext.request.contextPath}/invite/inviteOneself")
                        }else if(data==="repetitionReg"){
                            remind("#fontsize","账户已经存在");
                            rom("action","javascript:void(0)")
                        } else if(data==="temporaryLog"){
                            remind("#fontsize","口令正确");
                            rom("action","${pageContext.request.contextPath}/invite/inviteOneself")
                        }else if(data==="workinterfaceLog"){
                            remind("#fontsize","新的一天，加油哦！！！");
                            rom("action","${pageContext.request.contextPath}/common/examine")
                        }
                        else if(data==="repetitionLog"){
                            remind("#fontsize","账户或者密码错误");
                            rom("action","javascript:void(0)")
                        }
                    }
                })
            })
        })
    </script>

    <title>不知道在干嘛</title>
<body>
<div class="tyg-div">
    <ul>
        <li>醉</li>
        <li><div style="margin-left:20px;">舞</div></li>
        <li><div style="margin-left:40px;">长</div></li>
        <li><div style="margin-left:60px;">剑</div></li>
        <li><div style="margin-left:80px;">指</div></li>
        <li><div style="margin-left:100px;">星</div></li>
        <li><div style="margin-left:120px;">空</div></li>
    </ul>
</div>
<div id="contPar" class="contPar">
    <div id="page1"  style="z-index:1;">
        <div class="title0">翩翩少年把仙求</div>
        <div class="title1">红颜、宿命、仙缘、仗剑江湖、灵岛</div>
        <div class="imgGroug">
            <ul>
                <img alt="" class="img0 png" src="/js/loginall/img/page1_0.png">
                <img alt="" class="img1 png" src="/js/loginall/img/page1_1.png">
                <img alt="" class="img2 png" src="/js/loginall/img/page1_2.png">
            </ul>
        </div>
        <img alt="" class="img3 png" src="/js/loginall/img/page1_3.jpg">
    </div>
</div>
<div class="tyg-div-denglv">
    <div class="tyg-div-form">
        <form action="javascript:void(0)">
            <h2>登录</h2><p class="tyg-p">The truth is what it is  not what you see</p>
            <div style="margin:5px 0px;">
                <input type="text" id="Ac" name="staffAccount" placeholder="来者何人..." required="required"/>
            </div>
            <div style="margin:5px 0px;">
                <input type="text" name="staffPassword" placeholder="请报口令..." required="required"/>
            </div>
            <div style="margin:5px 0px;">
                <input type="text" style="width:150px;" placeholder="验证身份中..."/>
                <img src="/js/loginall/img/1.png" style="vertical-align:bottom;" alt="验证码"/>
            </div>
            <p><span id="fontsize"></span></p>
            <button type="submit" name="choose">踏入<span style="width:20px;"></span>江湖</button>
            <button type="submit" name="choose">菜<span style="width:20px;"></span>鸟</button>
        </form>
    </div>
</div>

<script type="text/javascript" src="/js/loginall/login.js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="/js/loginall/login.js/com.js"></script>
</body>
</html>
