
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
object admin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[models.user.User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users: List[models.user.User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(Seq[Any](/*3.2*/main("")/*3.10*/ {_display_(Seq[Any](format.raw/*3.12*/("""

    <header>
        <hgroup>
            <h1>Admin Page</h1>
            <h2>Add/Edit Jobs</h2>
        </hgroup>
        
        <dl id="user">
        <dt>User</dt>
        <dd>
            <a href=""""),_display_(Seq[Any](/*14.23*/routes/*14.29*/.Admin.logout())),format.raw/*14.44*/("""">Logout</a>
        </dd>
    </dl>
    </header>
    
    <article class="jobs">
    	<ul>
    	"""),_display_(Seq[Any](/*21.7*/for(j <- users) yield /*21.22*/{_display_(Seq[Any](format.raw/*21.23*/("""
    		<li>"""),_display_(Seq[Any](/*22.12*/j/*22.13*/.name)),format.raw/*22.18*/("""</li>
    	""")))})),format.raw/*23.7*/("""
    	<ul>
    	
    </article>
    
    

""")))})))}
    }
    
    def render(users:List[models.user.User]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[models.user.User]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue May 06 14:25:25 EDT 2014
                    SOURCE: /Users/jonathandavis/MySite/mySite/app/views/user/admin.scala.html
                    HASH: bee239e8047f9e600586a78c429d8dfb4aa93410
                    MATRIX: 795->1|920->32|957->35|973->43|1012->45|1254->251|1269->257|1306->272|1440->371|1471->386|1510->387|1558->399|1568->400|1595->405|1638->417
                    LINES: 26->1|29->1|31->3|31->3|31->3|42->14|42->14|42->14|49->21|49->21|49->21|50->22|50->22|50->22|51->23
                    -- GENERATED --
                */
            