package controllers;

import models.user.User;
import play.*;
import play.data.Form;
import play.mvc.*;
import static play.data.Form.*;
import models.user.*;
import views.html.user.*;


public class Admin extends Controller{
	@Security.Authenticated(Secured.class)
	public static Result admin(){
		return ok(admin.render(User.find.all()));
	}
	
	public static Result login(){
		return ok(login.render(Form.form(Login.class)));
	}
	

	public static Result authenticate() {
	    Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
	    if (loginForm.hasErrors()) {
	        return badRequest(login.render(loginForm));
	    } else {
	        session().clear();
	        session("email", loginForm.get().email);
	        return redirect(
	            routes.Admin.admin()
	        );
	    }
	}

	
	public static class Login{
		public String email;
		public String password;
		public String validate() {
		    if (User.authenticate(email, password) == null) {
		      return "Invalid user or password";
		    }
		    return null;
		}	
	}

	public static Result logout() {
	    session().clear();
	    flash("success", "You've been logged out");
	    return redirect(
	        routes.Admin.login()
	    );
	}

}
