apply(from = "repositories.gradle.kts")

plugins {
    // configure build process; dep management with curated list of deps and versions;
    // configure classpath; integration with Spring Boot CLI and SBoot Actuator;
    id("org.springframework.boot") version "3.0.5"

    // allows to manage deps using BOM (list of versions that work well together);
    // Instead of specifying versions individually => import BOM;
    // configure dep exclusions;
    id("io.spring.dependency-management") version "1.1.0"

    // created jar with all dependencies (to be used by java -jar)
    id("com.github.johnrengelman.shadow") version "7.1.0"

    // support to build Kotlin based apps
    // Kotlin source set configuration (src/main/kotlin)
    // task to compile Kotlin code; Integration with Java; Testing support (JUnit)
    id("org.jetbrains.kotlin.jvm") version "1.6.10"
}

allprojects {
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "com.github.johnrengelman.shadow")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "org.jetbrains.kotlin.jvm")

    dependencies {
        implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
        implementation(kotlin("stdlib"))
        testImplementation("org.springframework.boot:spring-boot-starter-test")

        testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    }

    tasks.getByName<Test>("test") {
        useJUnitPlatform()
    }
}
