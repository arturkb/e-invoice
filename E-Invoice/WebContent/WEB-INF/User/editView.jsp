<div class="row-fluid">
	<div class="box span12">
		<div class="box-header well" data-original-title>
			<h2>
				<i class="icon-edit"></i> ${lang["UserEdit.Title"]}
			</h2>

		</div>
		<div class="box-content">
			<form class="form-horizontal" action="/E-Invoice/user/edit.sec" method="post">
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="inputUserName">${lang["UserEdit.Username"]}</label>
						<div class="controls">
							<input type="email" id="inputUserName" placeholder=""
								value="${user.username}" readonly>
						</div>
					</div>
					<div class="control-group ${requestScope.view.cssClasses['email']}">
						<label class="control-label" for="inputEmail">${lang["UserEdit.Email"]}</label>
						<div class="controls">
							<input type="email" id="inputEmail" placeholder=""
								value="${user.email}" name="email" required>
								${requestScope.view.valMsg["email"]}
						</div>
					</div>
					<div class="control-group ${requestScope.view.cssClasses['mobile']}">
						<label class="control-label" for="inputMobile">${lang["UserEdit.Mobile"]}</label>
						<div class="controls">
							<input type="tel" id="inputMobile" placeholder=""
								value="${user.mobile}" required>
								${requestScope.view.valMsg["mobil"]}
						</div>
					</div>
					<div class="form-actions">
						<button type="submit" class="btn btn-primary">${lang["UserEdit.Save_changes"]}</button>
						<button class="btn">${lang["UserEdit.Cancle"]}</button>
					</div>
				</fieldset>
			</form>
		</div>
		<!-- /box-content -->
	</div>
	<!-- /span12 -->
</div>
<!--/row-->