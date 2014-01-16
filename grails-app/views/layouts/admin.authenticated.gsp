<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>
			<g:layoutTitle default="Grails"/>
		</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
		<link rel="apple-touch-icon" href="${resource(dir: 'images', file: 'apple-touch-icon.png')}">
		<link rel="apple-touch-icon" sizes="114x114" href="${resource(dir: 'images', file: 'apple-touch-icon-retina.png')}">
		
		<r:require module="jquery"/>
		<r:require module="bootstrapjs"/>
		<r:require module="application"/>
		
		<g:layoutHead/>
		<r:layoutResources />
	</head>
	<body>
		<!-- Start: Header -->
		<nav role="navigation" class="navbar navbar-fixed-top">
	      <div class="container-fluid">
	        <div class="navbar-header">
		        <a class="navbar-toggle" data-toggle="collapse" data-target=".ol-nav" href="#options" style="text-decoration:none;">
				    <i class="icon-stack">
		            	<i class="icon-sign-blank icon-stack-base"></i>
		            	<i class="icon-reorder icon-light"></i>
		            </i>
			    </a>
	          <!-- You'll want to use a responsive image option so this logo looks good on devices - I recommend using something like retina.js (do a quick Google search for it and you'll find it) -->
	          <a href="index.html" class="navbar-brand">OnLocation</a>
	        </div>
	
	        <!-- Collect the nav links, forms, and other content for toggling -->
	        <div class="navbar-collapse ol-nav collapse" style="height: 1px;">
	          <ul class="nav navbar-nav navbar-right">
	            <li class="dropdown">
	              <a data-toggle="dropdown" class="dropdown-toggle" href="#">
	              	<span class="ol-layout-username">
	              		<sec:username/>
	              		<i class="icon-caret-down icon-light"></i>
	              	</span> 
	              </a>
	              <ul class="dropdown-menu">
	              	<li role="presentation" class="dropdown-header">Profile</li>
	                <li><a href="sidebar.html">Menu Item</a></li>
	                <li role="presentation" class="divider"></li>
	                <li role="presentation" class="dropdown-header">Options</li>
	                <li>
	                	<g:link mapping="logout">
	                		<i class="icon-off"></i>
	                		Logout
	                	</g:link>
	                </li>
	              </ul>
	            </li>
	          </ul>
	        </div><!-- /.navbar-collapse -->
	      </div><!-- /.container -->
	    </nav>
		<!-- End: Header -->
		<div class="ol-main-content">
			<div class="col-lg-2">
				<div class="well">
					<div class="row">
						<div class="col-xs-5">
								<img alt="company_logo" class="img-rounded img-responsive" src="http://placehold.it/60">
						</div>
						<div class="col-lg-7 ol-container-company-name">
							<h4 class="ol-company-name">Company</h4>
						</div>
					</div>
		            <h4>Menu</h4>
		            <ul class="nav nav-list">  
					    <li>
					    	<a href="#" data-toggle="collapse" data-target="#submenu">
						    	<i class="icon-white icon-home"></i> Home <i class="icon-sort-down"></i>
					    	</a>
					    	<ul id="submenu" class="ol-sublist nav list-unstyled nav-list collapse">
					    		<li>
					    			<a href="#submenu">
					    				<i class="icon-time"></i> Submenu
					    			</a>
					    		</li>
					    		<li>
					    			<a href="#submenu">
					    				<i class="icon-time"></i> Submenu
					    			</a>
					    		</li>
					    	</ul>
					    </li>  
					    <li><a href="#"><i class="icon-book"></i> Library</a></li>  
					    <li><a href="#"><i class="icon-pencil"></i> Applications</a></li>  
					    <li class="nav-header">Another list header</li>  
					    <li><a href="#"><i class="icon-user"></i> Profile</a></li>  
					    <li><a href="#"><i class="icon-cog"></i> Settings</a></li>  
					    <li class="divider"></li>  
						<li><a href="#"><i class="icon-flag"></i> Help</a></li>  
					</ul>  
		        </div>
			</div>
			<div class="col-lg-9">
				<g:layoutBody/>
			</div>
		</div>
		
		
		<div class="footer" role="contentinfo"></div>
		<r:layoutResources />
	</body>
</html>
