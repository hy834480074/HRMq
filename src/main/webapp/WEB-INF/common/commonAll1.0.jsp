<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>common</title>
    <!-- load CSS -->

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300">  <!-- Google web font "Open Sans" -->
    <link rel="stylesheet" href="/js/common/css/bootstrap.min.css">                                  <!-- https://getbootstrap.com/ -->
    <link rel="stylesheet" href="/js/common/fontawesome/css/fontawesome-all.min.css">                <!-- https://fontawesome.com/ -->
    <link rel="stylesheet" type="text/css" href="/js/common/slick/slick.css"/>                       <!-- http://kenwheeler.github.io/slick/ -->
    <link rel="stylesheet" type="text/css" href="/js/common/slick/slick-theme.css"/>
    <link rel="stylesheet" href="/js/common/css/tooplate-style.css">
    <script type="text/javascript" src="/js/common/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="/js/common/jquery-1.7.2.js"></script>

</head>

<body>
<div id="tm-bg"></div>
<div id="tm-wrap">
    <div class="tm-main-content">
        <div class="container tm-site-header-container">
            <div class="row">
                <div class="col-sm-12 col-md-6 col-lg-6 col-md-col-xl-6 mb-md-0 mb-sm-4 mb-4 tm-site-header-col">
                    <div class="tm-site-header">
                        <h1 class="mb-4">身处朝堂权术露</h1>
                        <img src="/js/common/img/underline.png" class="img-fluid mb-4">
                        <p>要 四 处 游 山 玩 水 。。。吃 遍 天 下 珍 味 看 遍 人 间 美 景</p>
                    </div>
                </div>

                <div class="col-sm-12 col-md-6 col-lg-6 col-xl-6">
                    <div class="content">
                        <div class="grid">
                            <div class="grid__item" id="home-link">
                                <div class="product">
                                    <div class="tm-nav-link">
                                        <i class="fas fa-home fa-3x tm-nav-icon"></i>
                                        <span class="tm-nav-text">查看 仙缘</span>

                                        <div class="product__bg" >工资</div>

                                    </div>
                                    <div class="product__description">
                                        <div class="row mb-3">
                                            <div class="col-12">
                                                <h2 class="tm-page-title">您的目前工资记录</h2>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                                <p>
                                                    <table>
                                                      <tr>
                                                          <td>基本工资compensationBasicBonus</td>
                                                          <td>特殊贡献奖compensationSpecialBonus</td>
                                                          <td>社保compensationSocialSecurity</td>
                                                          <td>总工资compensationAll</td>
                                                      </tr>
                                                <c:forEach items="${sessionScope.compensations}" var="compensation">
                                                      <tr>
                                                              <td>${compensation.compensationBasicBonus}</td>
                                                              <td>${compensation.compensationSpecialBonus}</td>
                                                              <td>${compensation.compensationSocialSecurity}</td>
                                                              <td>${compensation.compensationAll}</td>
                                                      </tr>
                                                </c:forEach>
                                                    </table>
                                                </p>


                                                <form action="/message/messageOnself" method="post" class="contact-form">
                                                    <button type="submit" class="btn btn-primary tm-btn-submit" id="sss">工资有异议</button>
                                                </form>
                                            </div>
                                            <div class="col-sm-12 col-md-6 col-lg-6 col-xl-6">
                                                <p>

                                                </p>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </div>

                            <div class="grid__item" id="team-link">
                                <div class="product">
                                    <div class="tm-nav-link">
                                        <i class="fas fa-users fa-3x tm-nav-icon"></i>
                                        <span class="tm-nav-text">查看 部门</span>

                                        <div class="product__bg">部门</div>

                                    </div>
                                    <div class="product__description">
                                        <div class="p-sm-4 p-2">
                                            <div class="row mb-3">
                                                <div class="col-12">
                                                    <h2 class="tm-page-title">Background of Our Team</h2>
                                                </div>
                                            </div>
                                            <div class="row tm-reverse-sm">
                                                <div class="col-sm-12 col-md-8 col-lg-8 col-xl-8">
                                                    <p class="mb-4">
                                                    <table>
                                                        <tr>
                                                            <td>部门名字</td>
                                                            <td>部门成立时间</td>
                                                            <td>查看部门的职位</td>
                                                        </tr>
                                                    <from action ="javascript:void(0)">
                                                        <c:forEach items="${sessionScope.departments}" var="department">
                                                            <tr>
                                                                <input type="hidden" id="departmentId" value="${department.id}"/>
                                                                <td>${department.departmentName}</td>
                                                                <td>${department.departmentCreateTime}</td>
                                                                <td><button id="${department.id}" class="pos">查看职位</button></td>
                                                            </tr>
                                                        </c:forEach>
                                                    </from>
                                                    </table>
                                                    </p>

                                                </div>
                                                <div class="col-sm-12 col-md-4 col-lg-4 col-xl-4 mb-lg-0 mb-sm-4 mb-4">
                                                    <Iframe src="/message/messageSaffer" width="200px" height="200px" scrolling="Auto" frameborder="0"></iframe>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>


                            <div class="grid__item">
                                <a href="/common/common2">
                                    <div class="product">
                                        <div class="tm-nav-link">
                                            <i class="fas fa-comments fa-3x tm-nav-icon"></i>
                                            <span class="tm-nav-text">上 班</span>
                                            <div class="product__bg"></div>
                                        </div>
                                        <div class="product__description">

                                        </div>
                                    </div>
                                </a>
                            </div>


                            <div class="grid__item">
                                <a href="/leaveOff/leaveOffice">
                                    <div class="product">
                                        <div class="tm-nav-link">
                                            <i class="fas fa-handshake fa-3x tm-nav-icon"></i>
                                            <span class="tm-nav-text">离 职</span>
                                            <div class="product__bg"></div>
                                        </div>
                                        <div class="product__description">
                                            请稍等!!!
                                        </div>
                                    </div>
                                </a>
                            </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <footer>
            <p class="small tm-copyright-text">垃圾垃圾垃圾 <span class="tm-current-year">2018</span> 垃圾垃圾垃圾

                卡哇伊卡哇伊 <a rel="nofollow" href="#/view/2097-pop" class="tm-text-highlight">我还是点击事件 </a> 疯癫疯癫 <a href="http://www.cssmoban.com/" target="_blank" >我在干嘛</a> 留的超链接啦 <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">点击事件</a></p>
        </footer>
    </div>
</div>

<script src="/js/common/slick/slick.min.js"></script>
<script src="/js/common/js/anime.min.js"></script>
<script src="/js/common/js/main.js"></script>
<script src="/js/common/js/long.js"></script>

<script type="text/javascript">
$(function(){
    $("#ooee").click(function(){
    alert("aaaa")
    })

    $(".pos").on("click",function(){
        alert("h")
        console.log(123)
        })
    })
</script>

</body>
</html>
