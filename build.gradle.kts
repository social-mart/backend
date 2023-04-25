buildscript {
    // load the dependency libraries to rootProject
    apply(from = "dependencies/build.gradle")
}
plugins {
    id("project.java-conventions")
    id("com.savvasdalkitsis.module-dependency-graph") version "0.10"
    id("com.github.kt3k.coveralls") version "2.12.2"
}
allprojects {
    group = "io.mart"
    version = if (project.hasProperty("VERSION")) project.property("VERSION")!! else "0.0.1-SNAPSHOT"
}
