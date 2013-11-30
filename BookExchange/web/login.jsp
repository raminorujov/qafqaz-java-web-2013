<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="common/meta.jsp"/>
        <jsp:include page="common/style.jsp"/>		
    </head>

    <body>
        <div class="container-fluid">
            <div class="row-fluid">

                <div class="row-fluid">
                    <div class="span12 center login-header">
                        <h2>Welcome to Charisma</h2>
                    </div><!--/span-->
                </div><!--/row-->

                <div class="row-fluid">
                    <div class="well span5 center login-box">
                        <div class="alert alert-info">
                            Please login with your Username and Password.
                        </div>
                        <form class="form-horizontal" action="login" method="post">
                            <fieldset>
                                <div class="input-prepend" title="Username" data-rel="tooltip">
                                    <span class="add-on"><i class="icon-user"></i></span>
                                    <input autofocus class="input-large span10" name="username" id="username" type="text" value="" />
                                </div>
                                <div class="clearfix"></div>

                                <div class="input-prepend" title="Password" data-rel="tooltip">
                                    <span class="add-on"><i class="icon-lock"></i></span>
                                    <input class="input-large span10" name="password" id="password" type="password" value="" />
                                </div>
                                <div class="clearfix"></div>

                                <div class="input-prepend">
                                    <label class="remember" for="remember">
                                        <a href="register.jsp"/>Register</a>
                                    </label>
                                </div>
                                <div class="clearfix"></div>

                                <p class="center span5">
                                    <button type="submit" class="btn btn-primary">Login</button>
                                </p>
                            </fieldset>
                        </form>
                    </div><!--/span-->
                </div><!--/row-->
            </div><!--/fluid-row-->

        </div><!--/.fluid-container-->

        <jsp:include page="common/javascript.jsp"/>
    </body>
</html>
