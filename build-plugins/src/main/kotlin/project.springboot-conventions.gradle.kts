import org.gradle.kotlin.dsl.kotlin
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    kotlin("jvm")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}
tasks {
    withType<BootJar> {
        /**
         * Whenever you include this plugin-convention to any module, you just state that this module will have Spring,
         * but it will not be eventually assembled as Spring boot jar with all its dependencies.
         * E.g. in "application" module, which is an entry point to Sprint application, we need to explicitly set enabled=true
         * to eventually have a bootable jar
         * tasks {
         *     withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
         *         this.enabled = true
         *         this.archiveFileName.set("${archiveBaseName.get()}-${archiveVersion.get()}-boot.${archiveExtension.get()}")
         *     }
         * }
         */
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