package controllers;

import models.HelloWorld;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
    return ok(index.render(HelloWorld.HELLO_WORLD));
  }
  
}