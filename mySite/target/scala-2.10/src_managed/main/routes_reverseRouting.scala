// @SOURCE:/Users/jonathandavis/MySite/mySite/conf/routes
// @HASH:c27ee9feea95a52528d6448df79b2cad5d14b943
// @DATE:Tue May 06 14:25:45 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:21
class ReverseAdmin {
    

// @LINE:27
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:26
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:21
def admin(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "admin")
}
                                                

// @LINE:25
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def education(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "education")
}
                                                

// @LINE:12
def jobs(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jobs")
}
                                                

// @LINE:15
def gitHub(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "github")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:21
class ReverseAdmin {
    

// @LINE:27
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:26
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:21
def admin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.admin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
      }
   """
)
                        

// @LINE:25
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Admin.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def education : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.education",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "education"})
      }
   """
)
                        

// @LINE:12
def jobs : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jobs",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jobs"})
      }
   """
)
                        

// @LINE:15
def gitHub : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.gitHub",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "github"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:21
// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:21
class ReverseAdmin {
    

// @LINE:27
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.logout(), HandlerDef(this, "controllers.Admin", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:26
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.authenticate(), HandlerDef(this, "controllers.Admin", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:21
def admin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.admin(), HandlerDef(this, "controllers.Admin", "admin", Seq(), "GET", """ Admin""", _prefix + """admin""")
)
                      

// @LINE:25
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Admin.login(), HandlerDef(this, "controllers.Admin", "login", Seq(), "GET", """ Login""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:6
class ReverseApplication {
    

// @LINE:18
def education(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.education(), HandlerDef(this, "controllers.Application", "education", Seq(), "GET", """ Education""", _prefix + """education""")
)
                      

// @LINE:12
def jobs(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jobs(), HandlerDef(this, "controllers.Application", "jobs", Seq(), "GET", """ Jobs""", _prefix + """jobs""")
)
                      

// @LINE:15
def gitHub(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.gitHub(), HandlerDef(this, "controllers.Application", "gitHub", Seq(), "GET", """ GitHub""", _prefix + """github""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    