
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
object jobs extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("")/*3.10*/ {_display_(Seq[Any](format.raw/*3.12*/("""

    <header>
        <hgroup>
            <h1>Employment</h1>
        </hgroup>
    </header>
    
    <body>
        <div class="job1">
        The Home Depot – Java Developer<br>
        Aug 2013 – Nov 2013	
        	<ul>
        	<li>
        	Customer Order Management Team<br>
        	Home Depot uses Sterling order management.  
        	Home Depot’s Customer Order Management (COM) 
        	is a façade between Sterling and other Home 
        	Depot Systems.  The portion I worked on is 
        	between the Delivery Management System and Sterling.
        	</li>
        	<li>
        	Technologies Used : <br>Java/J2EE, XML, XSD, IBM MQ, RESTful web services, TomCat Server, Eclipse, Subversion 
        	</li>
        	</ul>
        
            
        </div>
        
        <div class="job2">
        Accenture – Java Developer<br>
        March 2013 – Aug 2013
        	
        	<ul>
        	<li>
        	New Look<br>
        	The New Look project is a web-platform helping a non-profit 
        	organization staff track user activity and stake-holders.  
        	The New Look project consists of three projects which are 
        	the services, domain, and portal.  The services and domain 
        	are Maven projects, and the portal is a Play Framework project.  
        	The application is deployed to Heroku with Cloudbees. 
        	</li>
        	<li>
        	Technologies Used : <br>Java, Spring Framework,  Apache Maven, Hibernate, Play Framework , Heroku, Cloudbees, JavaScript, CoffeeScript, 
        	Backbone.js, Git, Sencha Ext-js, jQuery, Eclipse 
        	</li>
        	</ul>
        
            
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
                    DATE: Tue May 06 12:39:36 EDT 2014
                    SOURCE: /Users/jonathandavis/MySite/mySite/app/views/jobs.scala.html
                    HASH: 68992971001651652a331b048a53b03b9b9ca301
                    MATRIX: 773->1|884->18|921->21|937->29|976->31
                    LINES: 26->1|29->1|31->3|31->3|31->3
                    -- GENERATED --
                */
            