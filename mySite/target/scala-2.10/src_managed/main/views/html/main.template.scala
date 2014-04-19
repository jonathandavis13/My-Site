
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.50*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Jonathan Davis</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <script src=""""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*9.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div class="topbar">
            <div class="fill">
                <div class="container">
                    <a class="brand" href=""""),_display_(Seq[Any](/*15.45*/routes/*15.51*/.Application.index())),format.raw/*15.71*/("""">Jonathan Davis</a>
                    <ul class="nav">
                        <li class=""""),_display_(Seq[Any](/*17.37*/("active".when(nav == "Jobs")))),format.raw/*17.67*/("""">
                            <a href=""""),_display_(Seq[Any](/*18.39*/routes/*18.45*/.Jobs.index())),format.raw/*18.58*/("""">Employment</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*20.37*/("active".when(nav == "GitHub")))),format.raw/*20.69*/("""">
                            <a href=""""),_display_(Seq[Any](/*21.39*/routes/*21.45*/.GitHub.index())),format.raw/*21.60*/("""">GitHub</a>
                        </li>
						<li class=""""),_display_(Seq[Any](/*23.19*/("active".when(nav == "Education")))),format.raw/*23.54*/("""">
	                        <a href=""""),_display_(Seq[Any](/*24.36*/routes/*24.42*/.Education.index())),format.raw/*24.60*/("""">Education</a>
	                    </li>
                    </ul>
                </div>
            </div>
        </div>
        
        <div class="container">

            <div class="content">
                
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*36.26*/title)),format.raw/*36.31*/("""</h1>
                </div>

                <div class="row">
                    <div class="span14">
                        """),_display_(Seq[Any](/*41.26*/content)),format.raw/*41.33*/("""
                    </div>
                </div>
                
            </div>

            <footer>
                <p>
                    
                </p>
            </footer>

        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((String,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 19 17:20:31 EDT 2014
                    SOURCE: /Users/jonathandavis/MySite/mySite/app/views/main.scala.html
                    HASH: 5eee6008512eb7916042c49b858062b666d114cb
                    MATRIX: 785->1|927->49|1090->177|1104->183|1159->217|1219->242|1233->248|1299->293|1537->495|1552->501|1594->521|1724->615|1776->645|1853->686|1868->692|1903->705|2022->788|2076->820|2153->861|2168->867|2205->882|2302->943|2359->978|2433->1016|2448->1022|2488->1040|2810->1326|2837->1331|3003->1461|3032->1468
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|43->15|43->15|43->15|45->17|45->17|46->18|46->18|46->18|48->20|48->20|49->21|49->21|49->21|51->23|51->23|52->24|52->24|52->24|64->36|64->36|69->41|69->41
                    -- GENERATED --
                */
            