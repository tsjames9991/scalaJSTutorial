import org.scalajs.dom
import dom.document
import org.querki.jquery._
import scala.scalajs.js.annotation.JSExportTopLevel

object TutorialApp {
  def main(args: Array[String]): Unit = {
    $(() => setupUI())
  }

  def setupUI(): Unit = {
    $("body").append("<p>Hello World</p>")
    $("""<button type="button">Click me!</button>""")
      .click(() => addClickedMessage())
      .appendTo($("body"))
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    $("body").append(document.body, "You clicked the button!")
  }
}
