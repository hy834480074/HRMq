<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>爱爱爱爱爱</title>
    <link rel="stylesheet" href="/js/invite/invitecss/bootstrap.min.css">
    <link rel="stylesheet" href="/js/invite/invitecss/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="/js/invite/invitecss/zzsc.css">
    <link type="text/css" href="/js/invite/invitecss/main.css" rel="stylesheet">
    <link type="text/css" href="/js/invite/invitecss/0001245c2.css" rel="stylesheet">

    <style type="text/css">

        a:hover,a:focus{
            text-decoration: none;
            outline: none;
        }
        #accordion .panel{
            border: none;
            box-shadow: none;
            border-radius: 0;
            margin-bottom: -5px;
        }
        #accordion .panel-heading{
            padding: 0;
            border-radius: 0;
            border: none;
            text-align: center;
        }
        #accordion .panel-title a{
            display: block;
            padding: 25px 30px;
            font-size: 16px;
            font-weight: bold;
            color: #fff;
            background: #333;
            border-bottom: 1px solid #4a4a4a;
            position: relative;
            transition: all 0.5s ease 0s;
        }
        #accordion .panel-title a:hover{
            background: #4a4a4a;
        }
        #accordion .panel-title a:after,
        #accordion .panel-title a.collapsed:after{
            content: "\f067";
            font-family: FontAwesome;
            font-size: 15px;
            font-weight: 200;
            position: absolute;
            top: 25px;
            left: 15px;
            transform: rotate(135deg);
            transition: all 0.5s ease 0s;
        }
        #accordion .panel-title a.collapsed:after{
            transform: rotate(0deg);
        }
        #accordion .panel-body{
            background: #167ea0;
            padding: 0 0 0 40px;
            border: none;
            position: relative;
        }
        #accordion .panel-body p{
            font-size: 14px;
            color: #fff;
            line-height: 25px;
            background: #3296b7;
            padding: 30px;
            margin: 0;
        }
        #accordion .panel-collapse .panel-body p{
            opacity: 0;
            transform: scale(0.9);
            transition: all 0.5s ease-in-out 0s;
        }
        #accordion .panel-collapse.in .panel-body p{
            opacity: 1;
            transform: scale(1);
        }
    </style>

</head>

<body>
<div id="e_background">
    <div id="e_smallstars"></div>
    <div id="e_moon"></div>
</div>
<div class="demo">

    <div class="container">
        <div class="row">
            <div class="col-md-offset-3 col-md-6">
                <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                    <div class="panel panel-default">
                        <div class="panel-heading" role="tab" id="headingOne">
                            <h4 class="panel-title">
                                <a role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                        <p>乱世群魔招聘现场</p>
                                </a>
                            </h4>
                        </div>
                        <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                            <div class="panel-body">
                                <p>人去楼空,往事如烟,昨日的一切而今却只能是生死相隔,人生就是这样,逝去的永远都追不回来,过去的只能属于永恒的记忆,想想看,人生就象一场戏,一场充满真实的梦境.人活一世,草木一秋,百年之后皆会入土,如烟,何须烦恼重重,何须愁尽世间.快乐大意,爽朗人生,一切的不快,笑笑也就过去了.</p>
                                <p><a href="javascript:void(0)" name="choose">填写简历</a></p>
                            </div>
                        </div>
                    </div>



                    <div class="panel panel-default">

                        <div class="panel-heading" role="tab" id="headingTwo">
                            <h4 class="panel-title">
                                <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                    <c:forEach items="${requestScope.invites }" var="invi">
                                    <p>${invi.inviteTitle }</p>
                                    </c:forEach>
                                </a>
                            </h4>
                        </div>
                        <c:forEach items="${requestScope.invites }" var="invi">
                        <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                            <div class="panel-body">
                                <p>${invi.inviteContext }</p>
                                <p><a href="javascript:void(0)" name="choose">填写简历</a></p>
                            </div>
                        </div>
                        </c:forEach>
                    </div>




                    <div class="panel panel-default">
                        <div class="panel-heading" role="tab" id="headingThree">
                            <h4 class="panel-title">
                                <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                                    SECTION 3
                                </a>
                            </h4>
                        </div>
                        <div id="collapseThree" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                            <div class="panel-body">
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque lacinia lacinia mauris, at ultricies leo ornare nec. Vivamus eu est vel felis dignissim tempor. Nulla facilisi. Duis molestie tortor ac tempor volutpat. Phasellus nec mi aliquet, sollicitudin neque eget, consectetur libero. Vestibulum sollicitudin sapien libero, egestas tempus eros scelerisque eu.</p>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading" role="tab" id="headingFour">
                            <h4 class="panel-title">
                                <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                                    SECTION 4
                                </a>
                            </h4>
                        </div>
                        <div id="collapseFour" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingFour">
                            <div class="panel-body">
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque lacinia lacinia mauris, at ultricies leo ornare nec. Vivamus eu est vel felis dignissim tempor. Nulla facilisi. Duis molestie tortor ac tempor volutpat. Phasellus nec mi aliquet, sollicitudin neque eget, consectetur libero. Vestibulum sollicitudin sapien libero, egestas tempus eros scelerisque eu.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="/js/invite/invitejs/jquery-2.1.1.min.js" type="text/javascript"></script>
<script src="/js/invite/invitejs/bootstrap.min.js"></script>
</body>
</html>
