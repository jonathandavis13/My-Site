
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
                            <a href=""""),_display_(Seq[Any](/*18.39*/routes/*18.45*/.Application.jobs())),format.raw/*18.64*/("""">Employment</a>
                        </li>
                        <li class=""""),_display_(Seq[Any](/*20.37*/("active".when(nav == "GitHub")))),format.raw/*20.69*/("""">
                            <a href=""""),_display_(Seq[Any](/*21.39*/routes/*21.45*/.Application.gitHub())),format.raw/*21.66*/("""">GitHub</a>
                        </li>
						<li class=""""),_display_(Seq[Any](/*23.19*/("active".when(nav == "Education")))),format.raw/*23.54*/("""">
	                        <a href=""""),_display_(Seq[Any](/*24.36*/routes/*24.42*/.Application.education())),format.raw/*24.66*/("""">Education</a>
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
                    DATE: Tue May 06 12:39:36 EDT 2014
                    SOURCE: /Users/jonathandavis/MySite/mySite/app/views/main.scala.html
                    HASH: 267f79d31a35b67d337b0fe02d959d14fe17884a
                    MATRIX: 785->1|927->49|1090->177|1104->183|1159->217|1219->242|1233->248|1299->293|1537->495|1552->501|1594->521|1724->615|1776->645|1853->686|1868->692|1909->711|2028->794|2082->826|2159->867|2174->873|2217->894|2314->955|2371->990|2445->1028|2460->1034|2506->1058|2828->1344|2855->1349|3021->1479|3050->1486
                    LINES: 26->1|29->1|36->8|36->8|36->8|37->9|37->9|37->9|43->15|43->15|43->15|45->17|45->17|46->18|46->18|46->18|48->20|48->20|49->21|49->21|49->21|51->23|51->23|52->24|52->24|52->24|64->36|64->36|69->41|69->41
                    -- GENERATED --
                */
            