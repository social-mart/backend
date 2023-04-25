import org.gradle.kotlin.dsl.kotlin

plugins {
    kotlin("jvm")
}
dependencies {
    @Suppress("UNCHECKED_CAST")
    val projectDependencies = rootProject.ext["libraries"] as Map<String, String>

    // logging libraries
    implementation(projectDependencies["kotlinLogging"]!!)
    implementation(projectDependencies["logbackClassic"]!!)

    // tests libraries
    testImplementation(platform(projectDependencies["junit5Bom"]!!))
    testRuntimeOnly(projectDependencies["junit5JupiterEngine"]!!)
    testImplementation(projectDependencies["junit5JupiterApi"]!!)
    testImplementation(projectDependencies["junit5JupiterParams"]!!)
    testImplementation(projectDependencies["assertjCore"]!!)
    testImplementation(projectDependencies["mockk"]!!)
}
