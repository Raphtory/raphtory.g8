## raphtory.g8

A minimal [giter8](http://www.foundweekends.org/giter8/index.html) seed template for raphtory based project.

## Usage
1. Unfold this template into a new project use following command:
    ```sh
    $ sbt new Raphtory/raphtory.g8
    ```

2. Download the raphtory.jar [here](https://github.com/Raphtory/Raphtory/releases/download/0.11/raphtory-v0.11.jar), create a `lib` directory under `root` directory. Move the downloaded jar into the `lib` directory.

    ```sh
    $ mkdir lib
    $ cd lib
    $ wget https://github.com/Raphtory/Raphtory/releases/download/0.11/raphtory-v0.11.jar
    ```

3. After making changes to your classes, run your analysis as shown below. 
    ```
    $ sbt run
    ```

    **Note**: Refer sample examples [here](https://github.com/Raphtory/Examples).

