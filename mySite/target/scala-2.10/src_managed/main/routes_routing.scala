// @SOURCE:/Users/jonathandavis/MySite/mySite/conf/routes
// @HASH:c27ee9feea95a52528d6448df79b2cad5d14b943
// @DATE:Tue May 06 14:25:45 EDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:12
private[this] lazy val controllers_Application_jobs2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jobs"))))
        

// @LINE:15
private[this] lazy val controllers_Application_gitHub3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("github"))))
        

// @LINE:18
private[this] lazy val controllers_Application_education4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("education"))))
        

// @LINE:21
private[this] lazy val controllers_Admin_admin5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("admin"))))
        

// @LINE:25
private[this] lazy val controllers_Admin_login6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:26
private[this] lazy val controllers_Admin_authenticate7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:27
private[this] lazy val controllers_Admin_logout8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jobs""","""controllers.Application.jobs()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """github""","""controllers.Application.gitHub()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """education""","""controllers.Application.education()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """admin""","""controllers.Admin.admin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Admin.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Admin.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Admin.logout()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:12
case controllers_Application_jobs2(params) => {
   call { 
        invokeHandler(controllers.Application.jobs(), HandlerDef(this, "controllers.Application", "jobs", Nil,"GET", """ Jobs""", Routes.prefix + """jobs"""))
   }
}
        

// @LINE:15
case controllers_Application_gitHub3(params) => {
   call { 
        invokeHandler(controllers.Application.gitHub(), HandlerDef(this, "controllers.Application", "gitHub", Nil,"GET", """ GitHub""", Routes.prefix + """github"""))
   }
}
        

// @LINE:18
case controllers_Application_education4(params) => {
   call { 
        invokeHandler(controllers.Application.education(), HandlerDef(this, "controllers.Application", "education", Nil,"GET", """ Education""", Routes.prefix + """education"""))
   }
}
        

// @LINE:21
case controllers_Admin_admin5(params) => {
   call { 
        invokeHandler(controllers.Admin.admin(), HandlerDef(this, "controllers.Admin", "admin", Nil,"GET", """ Admin""", Routes.prefix + """admin"""))
   }
}
        

// @LINE:25
case controllers_Admin_login6(params) => {
   call { 
        invokeHandler(controllers.Admin.login(), HandlerDef(this, "controllers.Admin", "login", Nil,"GET", """ Login""", Routes.prefix + """login"""))
   }
}
        

// @LINE:26
case controllers_Admin_authenticate7(params) => {
   call { 
        invokeHandler(controllers.Admin.authenticate(), HandlerDef(this, "controllers.Admin", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:27
case controllers_Admin_logout8(params) => {
   call { 
        invokeHandler(controllers.Admin.logout(), HandlerDef(this, "controllers.Admin", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        
}

}
     