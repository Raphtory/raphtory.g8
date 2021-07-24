package $package$

import $package$.graphbuilders.$classname_prefix$GraphBuilder
import $package$.spouts.$classname_prefix$Spout
import com.raphtory.RaphtoryGraph
import com.raphtory.algorithms.{ConnectedComponents, DegreeBasic}

object Runner extends App {

  val source = new $classname_prefix$Spout()
  val builder = new $classname_prefix$GraphBuilder()
  val graph = RaphtoryGraph[String](source, builder)
  val arguments = Array[String]()

  graph.rangeQuery(ConnectedComponents(), start = 1, end = 32674, increment = 100, arguments)
  graph.rangeQuery(ConnectedComponents(), start = 1, end = 32674, increment = 100, window = 100, arguments)
  graph.rangeQuery(ConnectedComponents(), start = 1, end = 32674, increment = 100, windowBatch = Array(100, 50, 10), arguments)

  graph.viewQuery(DegreeBasic(), timestamp = 10000, arguments)
  graph.viewQuery(DegreeBasic(), timestamp = 10000, window = 100, arguments)
  graph.viewQuery(DegreeBasic(), timestamp = 10000, windowBatch = Array(100, 50, 10), arguments)

}
