<%-- headre.jsp --%>
<%@ include file="/WEB-INF/Template/header.jsp"%>
<body>
	<%-- navBarTop.jsp --%>
	<%@ include file="/WEB-INF/Template/navBarTop.jsp"%>

	<div class="container-fluid">
		<div class="row-fluid">

			<noscript>
				<div class="alert alert-block span10">
					<h4 class="alert-heading">Warning!</h4>
					<p>
						You need to have <a href="http://en.wikipedia.org/wiki/JavaScript"
							target="_blank">JavaScript</a> enabled to use this site.
					</p>
				</div>
			</noscript>

			<div id="content" class="span10">
				<!-- content starts -->


				<%-- breadcrumb --%>
				<%@ include file="/WEB-INF/Template/breadcrumb.jsp"%>
				<%-- breadcrumb --%>

				<%-- Content --%>
				
				<jsp:include page="${view.viewAdress}" />
					
				<!-- content ends -->
			</div>
			<!--/#content.span10-->
			</div>
		<!--/fluid-row-->

		<hr>

		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">×</button>
				<h3>Settings</h3>
			</div>
			<div class="modal-body">
				<p>Here settings can be configured...</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">Close</a> <a href="#"
					class="btn btn-primary">Save changes</a>
			</div>
		</div>

		<%-- footer --%>
		<%@ include file="/WEB-INF/Template/footer.jsp"%>
	</div>
	<!--/.fluid-container-->

	<!-- external javascript
	================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<%@ include file="/WEB-INF/Template/externalJavaScripts.jsp"%>
</body>
</html>
