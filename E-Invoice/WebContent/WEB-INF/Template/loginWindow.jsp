<%-- headre.jsp --%>
<%@ include file="/WEB-INF/Template/header.jsp"%>
<body>
		<div class="container-fluid">
		<div class="row-fluid">
		
			<div class="row-fluid">
				<div class="span12 center login-header">
					<h2>${lang["Welcome_to_E-Invoice"]}</h2>
				</div><!--/span-->
			</div><!--/row-->
		</div><!--/fluid-row-->
			
			<!-- Login content -->
			<%@ include file="/WEB-INF/User/loginView.jsp" %>
			<!-- End login content -->
		
	</div><!--/.fluid-container-->

	<!-- external javascript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<%@ include file="/WEB-INF/Template/externalJavaScripts.jsp"%>
</body>
</html>
