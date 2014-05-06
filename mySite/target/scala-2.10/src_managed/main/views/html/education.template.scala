
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object education extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("")/*3.10*/ {_display_(Seq[Any](format.raw/*3.12*/("""

    <header>
        <hgroup>
            <h1>Education</h1>
            <h2>Bachelor of Science, Computer Science</h2>
            <h2>Kennesaw State University</h2>
            <h2>December 2012</h2>
        </hgroup>
    </header>
    
    <body>
        <div class="Courses">
        Computer Science Courses:<br>
        	Programming Principles I, Programming Principles II, Object-Oriented Programming, Database Systems, Operating Systems, Introduction to Data Structures, Computer and Network Architecture, Software Engineering, Computer Applications of Discrete Modeling, Concepts of Programming Languages, Advanced Data Communications, Internet Security, Distributed System Development, Web Applications and Script Programming, Cloud Computing, Advanced Object Oriented Software Development, and Sequential and Parallel Algorithms.
        
            
        </div>
        
        

        </div>
    </body>
    
    

""")))})))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 06 12:39:35 EDT 2014
                    SOURCE: /Users/jonathandavis/MySite/mySite/app/views/education.scala.html
                    HASH: fed53f0180fb91a0e67dde2569291bc4a6cc72b0
                    MATRIX: 778->1|889->18|926->21|942->29|981->31
                    LINES: 26->1|29->1|31->3|31->3|31->3
                    -- GENERATED --
                */
            