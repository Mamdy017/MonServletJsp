
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>
</head>
<body>
    <div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <div class="main">  	
		<input type="checkbox" id="chk" aria-hidden="true">

			<div class="signup">

            <form action="" method="POST">
                    <label for="chk" aria-hidden="true" class="mon">Connexion</label>
                    <label for="Pseudo">Pseudo</label>
                    <input type="text" placeholder="Pseudo" required name="pseudo">

                    <label for="password">Mot de passe</label>
                    <input type="password" placeholder="Mot de passe" required name="password">

                    <button class="but" name="connexion"
                    type="submit">Connexion</button>
               </form>
            </div>

    </div>
</body>
</html>
<!-- partial -->

<style media="screen">
      *,
*:before,
*:after{
    padding: 0;
    margin: 0;
    box-sizing: border-box;
}
body{
    background-color: #606060;
    display: flex;
	justify-content: center;
	align-items: center;
}
.but{
background-color: blue;
}
.background{
    width: 430px;
    height: 520px;
    position: absolute;
    transform: translate(-50%,-50%);
    left: 50%;
    top: 50%;
}
.background .shape{
    height: 200px;
    width: 200px;
    position: absolute;
    border-radius: 50%;
}
.shape:first-child{
    background: linear-gradient(
        #1845ad,
        #23a2f6
    );
    left: -80px;
    top: -80px;
}
.shape:last-child{
    background: linear-gradient(
        to right,
        #ff512f,
        #f09819
    );
    right: -30px;
    bottom: -80px;
}
form{
    height: 450px;
    width: 460px;
    background-color: rgba(255,255,255,0.3);
    position: absolute;
    transform: translate(-50%,-50%);
    top: 50%;
    left: 50%;
    border-radius: 10px;
    backdrop-filter: blur(10px);
    border: 2px solid rgba(255,255,255,0.1);
    box-shadow: 0 0 40px rgba(8,7,16,0.6);
    padding: 50px 35px;
}
form *{
    font-family: 'Poppins',sans-serif;
    color: black;
    letter-spacing: 1.2px;
    outline: none;
    border: none;
}
form h3{
    font-size: 32px;
    font-weight: 500;
    line-height: 42px;
    text-align: center;
    color: white;
}

label{
    display: block;
    margin-top: 30px;
    font-size: 16px;
    font-weight: 500;
    color: #fff;
}
input{
    display: block;
    height: 45px;
    width: 100%;
    background-color:#ffffff;
    border-radius: 15px;
    padding: 0 10px;
    margin-top: 8px;
    font-size: 14px;
    font-weight: 300;
}
::placeholder{
    color: black;
}
button{
    margin-top: 50px;
    width: 100%;
    background-color: #ffffff;
    color: #080710;
    padding: 15px 0;
    font-size: 18px;
    font-weight: 600;
    border-radius: 5px;
    cursor: pointer;
}

.main{
	width: 450px;
	height: 650px;
	overflow: hidden;
	
}
#chk{
	display: none;
}
.signup{
	position: relative;
	width:100%;
	height: 100%;
}
.mon{
	color: #fff;
	font-size: 2.3em;
	justify-content: center;
	display: flex;
	margin: 1px;
	font-weight: bold;
	cursor: pointer;
	transition: .5s ease-in-out;
}

.errorWrap {
                                        padding: 10px;
                                        margin: 0 0 20px 0;
                                        background: #fff;
                                        color: red;
                                        border-left: 4px solid #dd3d36;
                                        -webkit-box-shadow: 0 1px 1px 0 rgba(0, 0, 0, .1);
                                        box-shadow: 0 1px 1px 0 rgba(0, 0, 0, .1);
                                   }

                                   .succWrap {
                                        padding: 10px;
                                        margin: 0 0 20px 0;
                                        background: #fff;
                                        border-left: 4px solid #5cb85c;
                                        -webkit-box-shadow: 0 1px 1px 0 rgba(0, 0, 0, .1);
                                        box-shadow: 0 1px 1px 0 rgba(0, 0, 0, .1);
                                   }

    </style>
