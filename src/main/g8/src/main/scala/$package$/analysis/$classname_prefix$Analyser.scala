package $package$.analysis

import com.raphtory.api.Analyser

import scala.collection.mutable.ArrayBuffer
import scala.collection.parallel.ParIterable
import scala.util.control.NonFatal

object $classname_prefix$Analyser {
  def apply(): $classname_prefix$Analyser = new $classname_prefix$Analyser(Array())
}

class $classname_prefix$Analyser(args: Array[String]) extends Analyser(args) {

  override def analyse(): Unit = ???

  override def setup(): Unit = ???

  override def returnResults(): Any = ???

  override def defineMaxSteps(): Int = ???

  override def processResults(results: ArrayBuffer[Any], timeStamp: Long, viewCompleteTime: Long): Unit = ???

}
