<html lang="en" class="no-js">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Automated cafe</title>
    <meta name="author" content="Codrops"/>
    <link rel="stylesheet" href="css/cafe_style.css">
    <link rel="stylesheet" type="text/css" href="css/normalize.css"/>
    <link rel="stylesheet" type="text/css" href="css/icons.css"/>
    <link rel="stylesheet" type="text/css" href="css/style5.css"/>
    <script src="js/modernizr.custom.js"></script>
    <link rel="stylesheet" href="css/style_main.css" media="screen" type="text/css"/>

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
    </style>
</head>

<body>
<nav class="top-menu">
    <ul class="menu-main">
        <li class="left-item"><a href="index.jsp">Main</a></li>
        <li class="left-item"><a href="">About</a></li>
        <li class="left-item"><a href="">Story</a></li>
        <li class="right-item"><a href="contacts.html">Contact</a></li>
        <li class="right-item"><a href="admin.html">Admin</a></li>
        <li class="right-item"><a href="gallery.html">Gallery</a></li>
    </ul>
</nav>

<!--    <div class="container">-->
<nav id="bt-menu" class="bt-menu">
    <br><br><br>
    <a href="#" class="bt-menu-trigger"><span>Меню</span></a>
    <ul>
        <br><br>
        <li><a href="#">Menu</a></li>
        <li><a href="#">Bar</a></li>
        <li><a href="#">Breakfast</a></li>
        <li><a href="#">Lunch</a></li>
        <li><a href="admin.html">Admin</a></li>
        <li><a href="contacts.html">Contacts</a></li>
    </ul>
    <ul>
        <li><a href="#" class="bt-icon icon-twitter">Twitter</a></li>
        <li><a href="#" class="bt-icon icon-gplus">Google+</a></li>
        <li><a href="#" class="bt-icon icon-facebook">Facebook</a></li>
        <li><a href="#" class="bt-icon icon-github">icon-github</a></li>
    </ul>
</nav>
<!--    </div> /container -->
</body>
<script src="js/classie.js"></script>
<script src="js/borderMenu.js"></script>


<jsp:include page="js/font.js"></jsp:include>
</html>
