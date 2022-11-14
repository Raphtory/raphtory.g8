## raphtory.g8

A minimal [giter8](http://www.foundweekends.org/giter8/index.html) seed template for raphtory based project.

## Usage
Unfold this template into a new project use following command:
    
```bash
$ sbt new Raphtory/raphtory.g8
```

## Run Graph Analysis
Graph can be created locally or on a remote server
- To create and run analysis on a graph locally
    ```bash
    $ sbt "runMain com.pometry.Runner"
    ```

- To create and run analysis on a graph remotely, first start ("Standalone", for instance) server and then connect it using remote context
  ```bash
  $ sbt "runMain com.raphtory.service.Standalone"
  $ sbt "runMain com.pometry.RemoteRunner"
  ```

     **Note**: Refer sample examples [here](https://github.com/Raphtory/Examples).
