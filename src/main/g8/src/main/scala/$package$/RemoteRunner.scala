package $package$

import $package$.graphbuilders.LotrGraphBuilder
import com.raphtory.RaphtoryApp
import com.raphtory.algorithms.generic.centrality.Degree
import com.raphtory.api.input.Source
import com.raphtory.internals.context.RaphtoryContext
import com.raphtory.sinks.FileSink
import com.raphtory.spouts.FileSpout
import com.raphtory.utils.FileUtils

object RemoteRunner extends RaphtoryApp.Remote() {
  override def run(args: Array[String], ctx: RaphtoryContext): Unit =
    ctx.runWithNewGraph() { graph =>
      val path = "/tmp/lotr.csv"
      val url = "https://raw.githubusercontent.com/Raphtory/Data/main/lotr.csv"
      FileUtils.curlFile(path, url)

      val source = Source(FileSpout(path), new LotrGraphBuilder())
      graph.load(source)

      graph
        .execute(Degree())
        .writeTo(FileSink("/tmp/raphtory"))
        .waitForJob()

    }
}
