<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:include page="common/meta.jsp"/>
        <jsp:include page="common/style.jsp"/>

    </head>

    <body>
        <jsp:include page="common/header.jsp"/>

        <div class="container-fluid">
            <div class="row-fluid">

                <jsp:include page="common/menu.jsp"/>

                <jsp:include page="common/noscript.jsp"/>

                <div id="content" class="span10">
                    <!-- content starts -->


                    <div>
                        <ul class="breadcrumb">
                            <li>
                                <a href="#">Home</a> <span class="divider">/</span>
                            </li>
                            <li>
                                <a href="#">Dashboard</a>
                            </li>
                        </ul>
                    </div>
                    <div class="sortable row-fluid">
                        <a data-rel="tooltip" title="6 new members." class="well span3 top-block" href="#">
                            <span class="icon32 icon-red icon-user"></span>
                            <div>Total Members</div>
                            <div>507</div>
                            <span class="notification">6</span>
                        </a>

                        <a data-rel="tooltip" title="4 new pro members." class="well span3 top-block" href="#">
                            <span class="icon32 icon-color icon-star-on"></span>
                            <div>Pro Members</div>
                            <div>228</div>
                            <span class="notification green">4</span>
                        </a>

                        <a data-rel="tooltip" title="$34 new sales." class="well span3 top-block" href="#">
                            <span class="icon32 icon-color icon-cart"></span>
                            <div>Sales</div>
                            <div>$13320</div>
                            <span class="notification yellow">$34</span>
                        </a>

                        <a data-rel="tooltip" title="12 new messages." class="well span3 top-block" href="#">
                            <span class="icon32 icon-color icon-envelope-closed"></span>
                            <div>Messages</div>
                            <div>25</div>
                            <span class="notification red">12</span>
                        </a>
                    </div>

                    <div class="row-fluid">
                        <div class="box span12">
                            <div class="box-header well">
                                <h2><i class="icon-info-sign"></i> Introduction</h2>
                                <div class="box-icon">
                                    <a href="#" class="btn btn-setting btn-round"><i class="icon-cog"></i></a>
                                    <a href="#" class="btn btn-minimize btn-round"><i class="icon-chevron-up"></i></a>
                                    <a href="#" class="btn btn-close btn-round"><i class="icon-remove"></i></a>
                                </div>
                            </div>
                            <div class="box-content">
                                <h1>Charisma <small>free, premium quality, responsive, multiple skin admin template.</small></h1>
                                <p>Its a live demo of the template. I have created Charisma to ease the repeat work I have to do on my projects. Now I re-use Charisma as a base for my admin panel work and I am sharing it with you :)</p>
                                <p><b>All pages in the menu are functional, take a look at all, please share this with your followers.</b></p>

                                <p class="center">
                                    <a href="http://usman.it/free-responsive-admin-template" class="btn btn-large btn-primary"><i class="icon-chevron-left icon-white"></i> Back to article</a> 
                                    <a href="http://usman.it/free-responsive-admin-template" class="btn btn-large"><i class="icon-download-alt"></i> Download Page</a>
                                </p>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                               
                    <!-- content ends -->
                </div><!--/#content.span10-->
            </div><!--/fluid-row-->
            
            <hr>          

            <jsp:include page="common/footer.jsp"/>

        </div><!--/.fluid-container-->

        <jsp:include page="common/javascript.jsp"/>
    </body>
</html>
