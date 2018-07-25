<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap-theme.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/js/invite/invitecss/inviteAll.css" rel="stylesheet">

    <script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
    <script type="text/javascript">


        $(function(){

            self.setInterval(" $.post(\"/messages/readme\",{\},function(data){\n" +
                "                    var count=$.parseJSON(data);\n" +
                "                    var messages=$(\"#showMessages\");\n" +
                "                    messages.css(\"color\",\"red\");\n" +
                "                    var str = \"您有\"+count+\"条未读信息\";\n" +
                "                    messages.text(str);\n" +
                "                })",3000)



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
                remind("#fontsize","请稍等......");
                rom("action","${pageContext.request.contextPath}/resume/resumeOneself")
            })
        })
    </script>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>
<script type="text/javascript" src="/js/invite/invitejs/inviteAll.js"></script>
<div>
       <div id="showw"><h3 id="showMessages"></h3></div>
    <table>
        <tr>
            <td><label for="exampleInputPassword1">招聘标题</label></td>
            <td><label for="exampleInputPassword1"></label></td>
            <td><label for="exampleInputPassword1">招聘信息</label></td>
        </tr>

        <c:forEach items="${requestScope.invites }" var="invi">
            <tr>
                <td><label for="exampleInputPassword1">${invi.inviteTitle }</label></td>
                <td><label for="exampleInputPassword1"></label></td>
                <td><label for="exampleInputPassword1">${invi.inviteContext }</label></td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="3">
            <label for="exampleInputPassword1"><p><span id="fontsize"></span></p></label>
            </td>
        </tr>
        <td colspan="3">
            <form action ="javascript:void(0)">
                <label for="exampleInputPassword1"><button name="choose" type="submit" class="btn btn-warning">填写简历</button></label>
            </form>
        </td>
        </tr>
    </table>
</div>
</body>
</html>
