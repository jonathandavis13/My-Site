// @SOURCE:/Users/jonathandavis/MySite/mySite/conf/routes
// @HASH:ddb5223d795c7d0dfe8625f4c22ceccde576b7df
// @DATE:Sun Apr 20 09:34:36 EDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:15
class ReverseGitHub {
    

// @LINE:15
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "github")
}
                                                
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:12
class ReverseJobs {
    

// @LINE:12
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jobs")
}
                                                
    
}
                          

// @LINE:18
class ReverseEducation {
    

// @LINE:18
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "education")
}
                                                
    
}
                          
}
                  


// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

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
              

// @LINE:15
class ReverseGitHub {
    

// @LINE:15
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.GitHub.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "github"})
      }
   """
)
                        
    
}
              

// @LINE:6
class ReverseApplication {
    

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
              

// @LINE:12
class ReverseJobs {
    

// @LINE:12
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Jobs.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jobs"})
      }
   """
)
                        
    
}
              

// @LINE:18
class ReverseEducation {
    

// @LINE:18
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Education.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "education"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:18
// @LINE:15
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:15
class ReverseGitHub {
    

// @LINE:15
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.GitHub.index(), HandlerDef(this, "controllers.GitHub", "index", Seq(), "GET", """ GitHub""", _prefix + """github""")
)
                      
    
}
                          

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:12
class ReverseJobs {
    

// @LINE:12
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Jobs.index(), HandlerDef(this, "controllers.Jobs", "index", Seq(), "GET", """ Jobs""", _prefix + """jobs""")
)
                      
    
}
                          

// @LINE:18
class ReverseEducation {
    

// @LINE:18
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Education.index(), HandlerDef(this, "controllers.Education", "index", Seq(), "GET", """ Education""", _prefix + """education""")
)
                      
    
}
                          
}
        
    