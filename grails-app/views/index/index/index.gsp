<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="layout" content="index.nonauthenticated"/>
<title>Inicio</title>
</head>
<body>
<script type="text/javascript">
	$('document').ready(function(){
		/*Start : Automatically start the slider */
		$('#olw-carousel').carousel({
		  interval: 4000
		});
	})
</script>

    <!-- Start: MAIN CONTENT -->
    <div class="content">
    
<!-- Start: slider -->
<div id="olw-carousel" style="vertical-align: middle;" class="carousel slide">
  <div class="carousel-inner">
    <div class="item active">
      <img src="http://lorempixel.com/g/1500/600/city/1">
      <div class="container">
        <div class="carousel-caption">
          <h1>Bootstrap 3 Carousel Layout</h1>
          <p>This is an example layout with carousel that uses the Bootstrap 3 styles.
          <a title="Bootstrap 3" href="http://getbootstrap.com" class="">Bootstrap 3 RC 1 is now available!</a></p>
          <p><a class="btn btn-large btn-primary" href="#">Sign up today</a>
        </p></div>
      </div>
    </div>
    <div class="item">
      <img src="http://lorempixel.com/1500/600/abstract">
      <div class="container" style="">
        <div class="carousel-caption">
          <h1>Changes to the Grid</h1>
          <p>Bootstrap 3 still features a 12-column grid, but many of the CSS class names have completely changed.</p>
          <p><a class="btn btn-large btn-primary" href="#">Learn more</a></p>
        </div>
      </div>
    </div>
    <div class="item">
      <img src="http://placehold.it/1500X600">
      <div class="container">
        <div class="carousel-caption">
          <h1>Percentage -based sizing</h1>
          <p>With "mobile-first" there is now only one percentage-based grid.</p>
          <p><a class="btn btn-large btn-primary" href="#">Browse gallery</a></p>
        </div>
      </div>
    </div>
  </div>
  <!-- Controls -->
  <a class="left carousel-control" href="#olw-carousel" data-slide="prev">
  	<i class="icon-chevron-left icon-dark icon-2x olw-buttom-slide"></i>
  </a>
  <a class="right carousel-control" href="#olw-carousel" data-slide="next">
    <span class="icon-chevron-right icon-dark icon-2x olw-buttom-slide"></span>
  </a>  
</div>
      <!-- End: slider -->
      <!-- Start: PRODUCT LIST -->
        <div class="container">
          
          <div class="page-header">
            <h2>Mas Info</h2>
          </div>
          <div class="row">
        <div class="col-md-4">
          <div class="panel panel-default">
            <div class="panel-heading">
            	<g:img file="placeholder-360x200.jpg" class="olw-img-list" alt="product name"/>
            </div>
            <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate. 
            Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis 
            dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan. 
            Aliquam in felis sit amet augue.
            </div>
          </div>
        </div>
      	<div class="col-md-4">
        	<div class="panel panel-default">
            <div class="panel-heading">
            	<g:img file="placeholder-360x200.jpg" class="olw-img-list" alt="product name"/>
            </div>
            <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate. 
            Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis 
            dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan. 
            Aliquam in felis sit amet augue.
            </div>
          </div>
        </div>
      	<div class="col-md-4">
        	<div class="panel panel-default">
            <div class="panel-heading">
            	<g:img file="placeholder-360x200.jpg" class="olw-img-list" alt="product name"/>
            </div>
            <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate. 
            Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis 
            dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan. 
            Aliquam in felis sit amet augue.
            </div>
          </div>
        </div>
        </div>
      <!-- End: PRODUCT LIST -->
    </div>
    <!-- End: MAIN CONTENT -->
  
</body>
</html>