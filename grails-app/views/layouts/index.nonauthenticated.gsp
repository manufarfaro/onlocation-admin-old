<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>.:: OnLocation ::. - <g:layoutTitle default="Grails"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
		<link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
		<r:require module="jquery"/>
		<r:require modules="bootstrapjs, nonlogged"/>

		<script type="text/javascript">
			$(document).ready(function() {
				//
				// Events
				/*Start: Prevent the default white background on blur of top navigation */
				$(".dropdown-menu li a").mousedown(function() {
					var dropdown = $(this).parents('.dropdown');
					var link = dropdown.children(':first-child');
					link.css('background-color', "#2E3436");
					link.css('color', 'white');
				});
				/*End: Prevent the default white background on blur of top navigation */
			
			  
				
				$('.dropdown-toggle').dropdown();
				$('.dropdown input, .dropdown label').click(function(e) {
				    e.stopPropagation();
				});
				/*End: Automatically start the slider */
			
			});
		</script>

		<g:layoutHead/>
		<r:layoutResources />
	</head>
	<body>
		<!-- Start: Modals -->
		<g:render template="/index/index/login" model="[]"></g:render>
		<g:render template="/index/index/register" model="[]"></g:render>
		<!-- End: Modals -->
		<!-- Start: HEADER -->
  
	    <header class="navbar navbar-inverse navbar-fixed-top bs-docs-nav">
	      <!-- Start: Navigation wrapper -->
	      <div id="olw-header" class="navbar">
	          <div class="container">
		          <div class="navbar-header">
		            <a href="/" class="brand navbar-brand brand-bootbus">
		            	OnLocation
		            </a>
		            <!-- Below button used for responsive navigation -->
		            <a class="navbar-toggle" data-toggle="collapse" data-target=".nav-collapse" href="#options" style="text-decoration:none;">
		            	<i class="icon-reorder"></i>
		            </a>
		          </div>
		          <!-- Start: Primary navigation -->
		            <nav role="navigation" class="navbar-collapse nav-collapse collapse pull-right" style="height: 1px;">
		              <ul class="nav navbar-nav">
		                <li class="dropdown">
			              <a href="#" class="dropdown-toggle" data-toggle="dropdown">
			              	&iquest;Sos una Empresa? <b class="caret"></b>
			              </a>
			              <ul class="dropdown-menu" style="width:205px;">
			                <li >
			                	<a data-toggle="modal" href="#olm-login">
			                		<i class="icon-star"></i> Ingres&aacute;
			                	</a>
			                </li>
			                <li class="divider"></li>
			                <li>
			                	<a data-toggle="modal" href="#olm-register">
			                		<i class="icon-heart"></i> &iexcl;Registrate!
			                	</a>
			                </li>
			              </ul>
			            </li>
		              </ul>
		            </nav>
	            </div>  
	      </div>
	      <!-- End: Navigation wrapper -->   
	    </header>
	    <!-- End: HEADER -->
		
		<g:layoutBody/>
		
		<!-- Start: FOOTER -->
	    <footer>
	      <div class="container">
	        <div class="row">
	          <div class="col-md-3">
	            <h4><i class="icon-cogs icon-white"></i> Ayuda</h4>
	            <nav>
	              <ul class="quick-links">
	                <li><a href="ayuda.html">Usuario Final</a></li>
	                <li><a href="ayuda.html">Empresas</a></li>
	              </ul>
	            </nav>
	          </div>
	          <div class="col-md-3">
	            <h4><i class="icon-beaker icon-white"></i> Sobre</h4>
	            <nav>
	              <ul class="quick-links">
	                <li><a href="www.ualbisolution.com">Ualabi Solutions</a></li>
	                <li><a href="#">OnLocation</a></li>
	              <ul>
	            </nav>          
	          </div>
	          <div class="col-md-3">
	            <h4><i class="icon-thumbs-up icon-white"></i> Soporte</h4>
	            <nav>
	              <ul class="quick-links">
	                <li><a href="#">Guia</a></li>
	                <li><a href="#">Contactanos</a></li>            
	              </ul>
	            </nav>
	            </div>
	          <div class="col-md-3">
	            <h4><i class="icon-rss-sign"></i> Seguinos</h4>
	            <div class="social-icons-row">
	              <a href="#"><i class="icon-twitter"></i></a>
	              <a href="#"><i class="icon-facebook"></i></a>
				  <a href="#"><i class="icon-google-plus"></i></a>              
	              <a href="mailto:bmoyano@ualabisolutions"><i class="icon-envelope"></i></a>        
	            </div>
	            
	          </div>      
	        </div>
	      </div>
	      <hr class="footer-divider">
	      <div class="container" >
	        <p class="text-right">
	         Proyecto UNLAM <a href="http://www.unlam.edu.ar">Universidad Nacional La Matanza</a> &copy; 2013 Ualabi Solutions. All Rights Reserved.
	        </p>
	      </div>
	    </footer>
	    <!-- End: FOOTER -->

		<r:layoutResources />
	</body>
</html>
