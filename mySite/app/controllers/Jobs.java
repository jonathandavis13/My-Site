package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Jobs extends Controller{

	public static Result index() {
        return ok(jobs.render("My Site Will Be Here."));
    }
}
