// @SOURCE:/Users/jonathandavis/MySite/mySite/conf/routes
// @HASH:ddb5223d795c7d0dfe8625f4c22ceccde576b7df
// @DATE:Sun Apr 20 09:34:36 EDT 2014


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
private[this] lazy val controllers_Jobs_index2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jobs"))))
        

// @LINE:15
private[this] lazy val controllers_GitHub_index3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("github"))))
        

// @LINE:18
private[this] lazy val controllers_Education_index4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("education"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jobs""","""controllers.Jobs.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """github""","""controllers.GitHub.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """education""","""controllers.Education.index()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Jobs_index2(params) => {
   call { 
        invokeHandler(controllers.Jobs.index(), HandlerDef(this, "controllers.Jobs", "index", Nil,"GET", """ Jobs""", Routes.prefix + """jobs"""))
   }
}
        

// @LINE:15
case controllers_GitHub_index3(params) => {
   call { 
        invokeHandler(controllers.GitHub.index(), HandlerDef(this, "controllers.GitHub", "index", Nil,"GET", """ GitHub""", Routes.prefix + """github"""))
   }
}
        

// @LINE:18
case controllers_Education_index4(params) => {
   call { 
        invokeHandler(controllers.Education.index(), HandlerDef(this, "controllers.Education", "index", Nil,"GET", """ Education""", Routes.prefix + """education"""))
   }
}
        
}

}
     