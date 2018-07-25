<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/25
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap-theme.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap-theme.min.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <link href="/js/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/js/resume/resumecss/resumeadd.css" rel="stylesheet">
    <script type="text/javascript" src="/js/jquery-1.7.2.js"></script>
    <script type="text/javascript">

        $(function () {
            function isPhoneNo(phone) {
                var pattern = /^1[34578]\d{9}$/;
                return pattern.test(phone);
            }
            $(":text[name='resumeTel']").blur(function() {
                var resumeTel = $(":text[name='resumeTel']").val();
                if(isPhoneNo(resumeTel)==false ){
                    $("#tishi").css("display","block")
                    $("#tishi").text("错误手机号")
                    $("form").attr("action","javascript:void(0)");
                    $("form").submit("");
                }else {
                    $("#tishi").css("display","none")
                    $("form").attr("action","/resume/resumeXiuGaiResume");
                    $("form").submit("");
                }
            })






            $("input[type=button]").click(function () {
                var myReg = /^[\u4e00-\u9fa5]+$/;
                if (myReg.test($("input[type=text]").val())) {
                    alert("输入正确");
                } else {
                    alert("输入错误");
                }
            })
        });
    </script>

</head>
<body>
<div id="background" class="wall"></div>
<div id="midground" class="wall"></div>
<div id="foreground" class="wall">
    <form class="form-inline"  action ="/resume/resumeXiuGaiResume">
        <div class="center-block">
            <table  border="0">

                <tr>
                    <div class="form-group">
                        <td>
                            <label for="exampleInputName2" >姓名:</label>
                        </td>
                        <td>
                            <input type="text" class="form-control" name="resumeName" id="exampleInputName2"  value ="${resume.resumeName}" required="required">
                        </td>

                        <td>
                            <label for="exampleInputName2" >居住城市:</label>
                        </td>
                        <td>
                            <input type="text" name="resumeCity" class="form-control" id="exampleInputName2"  value ="${resume.resumeCity}">
                        </td>
                    </div>
                </tr>
                <tr>
                    <div class="form-group">
                        <td>
                            <label for="exampleInputName2">联系方式:</label>
                        </td>
                        <td>
                            <input type="text" class="form-control" id="exampleInputName2"  name="resumeTel" required="required" value ="${resume.resumeTel}">
                        </td>
                        <td>
                            <label for="exampleInputEmail2" >邮箱:</label>
                        </td>
                        <td>
                            <input type="email" name="resumeEmail" class="form-control" id="exampleInputEmail2" required="required"  value ="${resume.resumeEmail}">
                        </td>
                    </div>
                </tr>




                <tr>
                    <div class="form-group">
                        <td>
                            <label for="exampleInputName2">政治面貌:</label>
                        </td>
                        <td>
                            <select for="exampleInputName2" name="resumeFace">
                                <option>党员</option>
                                <option>团员</option>
                                <option>群众</option>
                            </select>
                        </td>
                        <td>
                            <label for="exampleInputEmail2" >学历:</label>
                        </td>
                        <td>
                            <select for="exampleInputName2" name="resumEducation">
                                <option>本科</option>
                                <option>硕士</option>
                                <option>博士</option>
                                <option>其他</option>
                            </select>
                        </td>
                    </div>
                </tr>





                <tr>
                    <div class="form-group">
                        <td colspan="2">
                            <label for="exampleInputName2" >工作经验:</label>
                        </td>
                        <td colspan="2">
                            <input type="text" name="resumExperient" class="form-control" id="exampleInputName2"  value ="${resume.resumExperient}">

                        </td>

                    </div>
                </tr>


                <tr>
                    <div class="form-group">
                        <td colspan="4">
                            <div style="text-align:center;"><i class="icon-remove" id="tishi" ></i></div>
                        </td>

                    </div>
                </tr>
                <tr>
                    <div class="form-group">
                        <td colspan="4">

                            <div class="btn-group">
                                <button class="btn">提交</button>
                            </div>
                        </td>

                    </div>
                </tr>
                <tr>
                    <div class="form-group">
                        <td colspan="4">

                            <div class="btn-group">
                                <a class="btn" href="/invite/inviteOneself">返回</a>
                            </div>
                        </td>

                    </div>
                </tr>
            </table>
        </div>
    </form></div>



</body>
</html>
