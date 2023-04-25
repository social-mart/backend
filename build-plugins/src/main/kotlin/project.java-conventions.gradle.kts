import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    id("java")
    id("org.owasp.dependencycheck")
    `java-library`
}

repositories {
    mavenLocal()
    mavenCentral()
}

extensions.configure(JavaPluginExtension::class.java) {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.compilerArgs.add("-Xlint:deprecation")
}

tasks {
    getByName<Jar>("jar") {
        enabled = true
    }

    withType<JavaExec> {
        jvmArgs = listOf("-noverify", "-XX:TieredStopAtLevel=1")
    }

    withType<Test> {
        @Suppress("UnstableApiUsage")
        useJUnitPlatform()
        this.testLogging {
            events = setOf(
                TestLogEvent.FAILED, TestLogEvent.PASSED, TestLogEvent.STANDARD_ERROR
            )
        }
    }
}