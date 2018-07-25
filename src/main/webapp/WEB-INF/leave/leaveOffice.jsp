<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/25
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap-theme.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/js/leave/css/information.css" rel="stylesheet">

    <script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function(){
            function seta(name){
                if(name==='删除'){
                    return true
                }else{
                    return false
                }
            }
            function boo(a){
                var falg = confirm(a+"?")
                if(falg){
                    return true
                }else{
                    return false
                }
            }

            $(":button").click(function(){
                var choose = $(this).text()
                if(seta(choose)){
                    boo(choose)
                }else{
                    boo(choose)
                }
            })
        })
    </script>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>
<div class="ak47">
    <form action ="/leaveOff/leaveOneself">
    <table>
        <tr>
            <td colspan="4"><label for="exampleInputPassword1">离职原因</label></td>
        </tr>
        <tr>
            <td colspan="4"><label for="exampleInputPassword1"><h2>我对你不好吗，你要离开我？</h2></label></td>
        </tr>
        <tr>
            <td colspan="4"><label for="exampleInputPassword1"><textarea rows="9" name ="leaveContext"></textarea></label></td>
        </tr>
    <tr>
        <td colspan="2"><label for="exampleInputPassword1"><button name="choose">确认</button></label></td>
        <td colspan="2"><label for="exampleInputPassword1"><a href="#" name="choose">放弃</a></label></td>
    </tr>
    </table>
    </form>
</div>
</body>
</html>
