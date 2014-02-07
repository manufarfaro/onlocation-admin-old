<!-- Start: Login -->

  <%@page import="org.codehaus.groovy.grails.web.mapping.LinkGenerator"%>
<div class="modal fade" id="olm-login" tabindex="-1" role="dialog" aria-labelledby="olm-loginLabel" aria-hidden="true">
    <div class="modal-dialog">
      <form action="${postUrl}" id="olw-form-login" method="post" role="form" autocomplete="off">
      	  <input type="hidden" name="ajax" value="true" >
	      <div class="modal-content">
	        <div class="modal-header">
	          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
	          	&times;
	          </button>
	          <h4 class="modal-title">
	          	<g:message code="onlocation.auth.login.title"/>
	          </h4>
	        </div>
	        <div class="modal-body">
	        	<div id="ol-login-notification" class="alert alert-danger" style="display:none;"></div>
		        <div class="input-group" style="margin-bottom:10px;">
				  <span class="input-group-addon ">
				  	<i class="icon-user"></i>
				  </span>
				  <input id="ol-username" name="ol-username" class="form-control " type="text" placeholder="Usuario" max="25" />
				</div>
				
		        <div class="input-group" style="margin-bottom:10px;">
				  <span class="input-group-addon">
				  	<i class="icon-key"></i>
				  </span>
				  <input id="ol-password" name="ol-password" class="form-control" type="password" placeholder="Contraseña" max="25" />
				</div>
					
				<div class="input-group ">
				  <input type='checkbox' name='${rememberMeParameter}' id='ol-rememberMe' <g:if test='${hasCookie}'>checked='checked'</g:if>/>
				  <label for='ol-rememberMe'>
				  	<g:message code="springSecurity.login.remember.me.label"/>
				  </label>
				</div>
	        </div>
	        <div class="modal-footer">
				<button type="button" id="olw-btn-login-close" class="btn btn-default ol-login-actions" data-dismiss="modal">
					<g:message code="default.button.close.label"/>
				</button>
				<button type="button" id="olw-btn-login-submit" class="btn btn-primary ol-login-actions">
					<g:message code="springSecurity.login.button"/>
				</button>
	        </div>
	      </div>
      </form>
    </div>
  </div>
  <script type="text/javascript">
  	$(document).ready(function(){
	  	// Estados

	  	// Eventos
	  	$('#olm-login').on('hidden.bs.modal', function () {
	  		$('#ol-login-notification')
  				.hide()
  				.empty()
		})
	  	$('.ol-login-actions').on('click', function(){
	  		$('#ol-login-notification')
	  			.hide()
	  			.empty()
		})
		$('#olw-btn-login-close').on('click', function(){
	  		$('#olw-form-login')[0].reset()
	  	})
	  	$('#olw-btn-login-submit').on('click', function(){
	  		OnLocation.ajax.login.do()
	  	})
  	})
  	
  	// Modulos
  	OnLocation.ajax.login = (function(){
  	  	function showErrorMessage(message){
	  	  	$('#ol-login-notification')
	  			.empty()
	  			.removeClass()
	  			.addClass('alert alert-danger')
	  			.text(message)
	  			.show()
  	  	};
  	  	function showSucceddedMessage(message){
	  	  	$('#ol-login-notification')
				.empty()
				.removeClass()
				.addClass('alert alert-success')
				.text(message)
				.show()
  	  	}
  	  	function onSuccess(response){
  	  	  	if(response.error){
  	  	  		showErrorMessage(response.error)
  	  	  	}
  	  	  	if(response.success){
  	  	  		showSucceddedMessage("${message(code:'springSecurity.login.response.success')}")
  	  	  		location.href = '/home'
  	  	  	}
  	  	};
  	  	function onFailure(){
  	  	  	
  	  		showErrorMessage("${message(code:'springSecurity.errors.login.connection')}")
  	  	}
  	  	return {
  	  	  	do: function(){
  	  	  		$('#olw-form-login').ajaxSubmit({
  	  	  			//dataType: 'json',
  	  	  			async: false,
  	    	  		success: function(xhr){
  	  	    	  		onSuccess(xhr)
  	  	    	  	},
  	    	  		error: function(){
  	  	    	  		onFailure()
  	  	    	  	}
  	  	  	  	})
  	  	  	}
  	  	}
  	})()
  </script>
<!-- End: Login -->
