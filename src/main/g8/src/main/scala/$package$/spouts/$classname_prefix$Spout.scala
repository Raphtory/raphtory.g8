package $package$.spouts

import com.raphtory.core.actors.Spout.Spout

import scala.collection.mutable
import scala.io.Source

class $classname_prefix$Spout extends Spout[String] {

  override def setupDataSource(): Unit = ???

  override def generateData(): Option[String] = ???

  override def closeDataSource(): Unit = ???

}
