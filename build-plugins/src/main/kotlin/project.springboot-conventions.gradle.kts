import org.gradle.kotlin.dsl.kotlin
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    kotlin("jvm")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}
tasks {
    withType<BootJar> {
        this.enabled = false
    }
}

dependencies {
    @Suppress("UNCHECKED_CAST")
    val projectDependencies = rootProject.ext["libraries"] as Map<String, String>

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(module = "junit")
        exclude(module = "junit-vintage-engine", group = "org.junit.vintage")
        exclude(group = "io.netty")
    }
    testImplementation(projectDependencies["mockkSpringBoot"]!!)
}