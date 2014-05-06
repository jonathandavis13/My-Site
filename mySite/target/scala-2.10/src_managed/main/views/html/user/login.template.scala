
package views.html.user

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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Admin.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Admin.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""


<html>
    <head>
        <title>Jonathan Davis</title>
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Application.index)),format.raw/*10.47*/("""" id="logo"></a>
        </header>
      """),_display_(Seq[Any](/*12.8*/helper/*12.14*/.form(routes.Admin.authenticate)/*12.46*/ {_display_(Seq[Any](format.raw/*12.48*/("""
   		<h1>Sign in</h1>

   		<p>
       		<input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*16.71*/form("email")/*16.84*/.value)),format.raw/*16.90*/("""">
   		</p>
   		<p>
       		<input type="password" name="password" placeholder="Password">
   		</p>
   		<p>
       		<button type="submit">Login</button>
   		</p>
		""")))})),format.raw/*24.4*/("""
		
		"""),_display_(Seq[Any](/*26.4*/if(form.hasGlobalErrors)/*26.28*/ {_display_(Seq[Any](format.raw/*26.30*/("""
    	<p class="error">
        	"""),_display_(Seq[Any](/*28.11*/form/*28.15*/.globalError.message)),format.raw/*28.35*/("""
    	</p>
		""")))})),format.raw/*30.4*/("""
		"""),_display_(Seq[Any](/*31.4*/if(flash.contains("success"))/*31.33*/ {_display_(Seq[Any](format.raw/*31.35*/("""
    		<p class="success">
        		"""),_display_(Seq[Any](/*33.12*/flash/*33.17*/.get("success"))),format.raw/*33.32*/("""
    		</p>
		""")))})),format.raw/*35.4*/("""
    
    </body>
</html>"""))}
    }
    
    def render(form:Form[Admin.Login]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Admin.Login]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 06 14:25:25 EDT 2014
                    SOURCE: /Users/jonathandavis/MySite/mySite/app/views/user/login.scala.html
                    HASH: f3c9ab0a95d3d06445f6e3e4a1489d6bfd7bdb5f
                    MATRIX: 790->1|909->26|1066->147|1081->153|1121->171|1198->213|1213->219|1254->251|1294->253|1433->356|1455->369|1483->375|1686->547|1728->554|1761->578|1801->580|1871->614|1884->618|1926->638|1971->652|2010->656|2048->685|2088->687|2162->725|2176->730|2213->745|2259->760
                    LINES: 26->1|29->1|38->10|38->10|38->10|40->12|40->12|40->12|40->12|44->16|44->16|44->16|52->24|54->26|54->26|54->26|56->28|56->28|56->28|58->30|59->31|59->31|59->31|61->33|61->33|61->33|63->35
                    -- GENERATED --
                */
            