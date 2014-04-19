package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class GitHub extends Controller{
	
	public static Result index() {
        return ok(github.render("My Site Will Be Here."));
    }

}
