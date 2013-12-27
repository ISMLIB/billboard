package controllers.billborad

import spray.routing._
import spray.http._
import MediaTypes._

trait Billborad1_0 extends HttpService {
  
  import scala.language.{implicitConversions}

  val billboradRoute1_0 =  path("" / "") {
    respondWithMediaType(`application/json`) {
      complete {
        """{"data":"hoge"}"""
      }
    }
  }

}
