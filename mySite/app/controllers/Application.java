package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("My Site Will Be Here."));
    }
    
    public static Result education() {
        return ok(education.render("My Site Will Be Here."));
    }
    
    public static Result gitHub() {
        return ok(github.render("My Site Will Be Here."));
    }
    
    public static Result jobs() {
        return ok(jobs.render("My Site Will Be Here."));
    }

}
