<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Automated cafe</title>
    <link rel="stylesheet" href="css/contacts_style.css">
    <link rel="stylesheet" href="css/cafe_style.css">
    <link rel="stylesheet" type="text/css" href="css/normalize.css"/>
    <link rel="stylesheet" type="text/css" href="css/icons.css"/>
    <link rel="stylesheet" type="text/css" href="css/style5.css"/>
    <script src="js/modernizr.custom.js"></script>
    <link rel="stylesheet" href="css/style_main.css" media="screen" type="text/css"/>

    <!--таблица-->
    <link rel="stylesheet" type="text/css" href="css/themes_table/easyui.css">
    <link rel="stylesheet" type="text/css" href="css/themes_table/icon.css">
    <link rel="stylesheet" type="text/css" href="css/themes_table/demo.css">
    <script type="text/javascript" src="js/table/jquery.min.js"></script>
    <script type="text/javascript" src="js/table/jquery.easyui.min.js"></script>
    <!--таблица-->

    <style>
        canvas {
            padding: 0;
            margin: 0;
        }

        div.btnbg {
            position: fixed;
            left: 0;
            top: 130px;
        }

        .top-menu {
            position: relative;
            background: rgba(34, 34, 34, 0.2);
        }

        .menu-main {
            list-style: none;
            margin: 0;
            padding: 0;
        }

        .menu-main:after {
            content: "";
            display: table;
            clear: both;
        }

        .left-item {
            float: left;
        }

        .right-item {
            float: right;
        }

        .navbar-logo {
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%, -50%);
        }

        .menu-main a {
            text-decoration: none;
            display: block;
            line-height: 80px;
            padding: 0 20px;
            font-size: 18px;
            letter-spacing: 2px;
            font-family: 'Arimo', sans-serif;
            font-weight: bold;
            color: white;
            transition: .3s linear;
        }

        .menu-main a:hover {
            background: rgba(0, 0, 0, 0.3);
        }

        @media (max-width: 830px) {
            .menu-main {
                padding-top: 90px;
                text-align: center;
            }

            .navbar-logo {
                position: absolute;
                left: 50%;
                top: 10px;
                transform: translateX(-50%);
            }

            .menu-main li {
                float: none;
                display: inline-block;
            }

            .menu-main a {
                line-height: normal;
                padding: 20px 15px;
                font-size: 16px;
            }
        }

        @media (max-width: 630px) {
            .menu-main li {
                display: block;
            }
        }

        .decor-1 {
            position: absolute;
            margin-left: 36%;
            margin-right: 36%;
        }

        .decor-2 {
            position: absolute;
            margin-top: 450px;
            margin-left: 36%;
            margin-right: 36%;
        }

        /*новый фон*/
        body {
            overflow-y: scroll;
            background-image: url(im/font.jpg);
            background-size: 100% 100%;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }

        /*        новый фон*/
        /*        футер*/
        #footer {
            margin-top: 36.5%;
            background: #665;
            color: #fff;
            font-size: 75%;
            padding: 5px;
            clear: both;
            text-align: center;
            clear: both;
        }

        /*        футер*/
    </style>
</head>
<body>


<table align="center" class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
               data-options="singleSelect:true,collapsible:true,url:'/servlet/DataGrid',method:'get'">
    <thead>
    <tr>
        <th data-options="field:'id_waiter',width:50, align:'right'">ID waiter</th>
        <th data-options="field:'first_name',width:150, align:'right'">First name</th>
        <th data-options="field:'last_name',width:150,align:'right'">Last name</th>
        <th data-options="field:'age',width:35,align:'right'">Age</th>
        <th data-options="field:'employment_date',width:150, align:'right'">Employment date</th>
        <th data-options="field:'position ',width:150,align:'right'">Position</th>
    </tr>
    </thead>
</table>

<div class="container">
    <nav id="bt-menu" class="bt-menu">
        <br><br><br>
        <a href="#" class="bt-menu-trigger"><span>Меню</span></a>
        <ul>
            <br><br>
            <li><a href="admin_staff.jsp">Персонал</a></li>
            <li><a href="#">Зарплаты</a></li>
            <li><a href="#">Отчеты</a></li>
            <li><a href="#">Отчеты</a></li>
            <li><a href="#">Отчеты</a></li>
            <li><a href="admin_camera.html">Camera</a></li>
            <li><a href="index.jsp">EXIT</a></li>
        </ul>
        <ul>
            <li><a href="#" class="bt-icon icon-twitter">Twitter</a></li>
            <li><a href="#" class="bt-icon icon-gplus">Google+</a></li>
            <li><a href="#" class="bt-icon icon-facebook">Facebook</a></li>
            <li><a href="#" class="bt-icon icon-github">icon-github</a></li>
        </ul>
    </nav>
</div><!-- /container -->


<form class="decor" class="decor-1" action="${pageContext.request.contextPath}/addWaiter" method="GET">
    <div class="form-left-decoration"></div>
    <div class="form-right-decoration"></div>
    <div class="circle"></div>
    <div class="form-inner">
        <h3>Add employee</h3>
        <input type="text" name="first_name" placeholder="Name">
        <input type="text" name="last_name" placeholder="Second name">
        <input type="text" name="age" placeholder="Age">
        <input type="text" name="employment_date" placeholder="Employment date">
        <input type="text" name="position" placeholder="Position">
        <input type="submit" value="Add">
    </div>
</form>

<form class="decor" class="decor-2" action="${pageContext.request.contextPath}/deleteWaiterServlet" method="GET">
    <div class="form-left-decoration"></div>
    <div class="form-right-decoration"></div>
    <div class="circle"></div>
    <div class="form-inner">
        <h3>Delete employee</h3>
        <input type="text" name="name_delete" placeholder="Name">
        <input type="text" name="second_name_delete" placeholder="Second name">
        <input type="submit" value="Delete">
    </div>
</form>
<div id="footer">
    <p>Automated cafe © 2018. All rights reserved.</p>
</div>
</body>
<script src="js/classie.js"></script>
<script src="js/borderMenu.js"></script>

</html>
