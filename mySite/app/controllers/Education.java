package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Education extends Controller{
	
	public static Result index() {
        return ok(education.render("My Site Will Be Here."));
    }

}
