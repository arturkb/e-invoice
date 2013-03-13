			<div class="row-fluid">
				<div class="well span5 center login-box">
					${alert.tag}
					<form class="form-horizontal" action="/E-Invoice/user/login.do" method="POST">
						<fieldset>
							<div class="input-prepend" title=${lang["Username"]} data-rel="tooltip">
								<span class="add-on"><i class="icon-user"></i></span><input autofocus class="input-large span10" name="username" id="username" type="text" value="${user.username}" />
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend" title=${lang["Password"]} data-rel="tooltip">
								<span class="add-on"><i class="icon-lock"></i></span><input class="input-large span10" name="password" id="password" type="password" value="" />
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend">
							<label class="remember" for="remember"><input type="checkbox" id="remember" />${lang["Remember_me"]}</label>
							</div>
							<div class="clearfix"></div>
							
							<div>
								<input type="hidden" name="action" value="auth">
							</div>	
							
							<p class="center span5">
							<button type="submit" class="btn btn-primary">${lang["login"]}</button>
							</p>
						</fieldset>
					</form>											
				</div><!--/span-->
				<div class="well span5 center">
					<form class="form-inline" action="/E-Invoice/changelanguage.do" method="GET">
							<select name="lang">
								<option value="en">${lang["english"]}</option>
								<option value="pl">${lang["polish"]}</option>
							</select>
						<button type="submit" class="btn">${lang["change"]}</button>
					</form>
				</div>	
			</div><!--/row-->
			