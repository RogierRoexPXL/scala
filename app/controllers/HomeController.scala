package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    val title = "Home"
    Ok(views.html.index())
  }

  def electron() = Action { implicit request: Request[AnyContent] =>
    val title = "Electron"
    Ok(views.html.electron())
  }

  def rust() = Action { implicit request: Request[AnyContent] =>
    val title = "Rust"
    Ok(views.html.rust())
  }

  def scala() = Action { implicit request: Request[AnyContent] =>
    val title = "Scala"
    Ok(views.html.scala())
  }

  def devops() = Action { implicit request: Request[AnyContent] =>
    val title = "DevOps"
    Ok(views.html.devops())
  }

  def eindreflectie() = Action { implicit request: Request[AnyContent] =>
    val title = "Eindreflectie"
    Ok(views.html.eindreflectie())
  }
}
