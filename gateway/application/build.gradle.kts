plugins {
    id("project.java-conventions")
    id("project.kotlin-conventions")
    id("project.springboot-conventions")
    id("project.common-dependencies-conventions")
}

dependencies {
    // get the central dependencies library
    @Suppress("UNCHECKED_CAST")
    val projectDependencies = rootProject.ext["libraries"] as Map<String, String>

    // gateway specific
    implementation("org.springframework.cloud:spring-cloud-starter-circuitbreaker-resilience4j")
    implementation("org.springframework.cloud:spring-cloud-starter-gateway")

    testImplementation("org.springframework.cloud:spring-cloud-starter-contract-stub-runner")
}

extra["springCloudVersion"] = "2022.0.3"
dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

tasks {
    withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
        this.enabled = true // this is important to build a bootable jar with all dependencies and jars of submodules
        this.archiveFileName.set("${archiveBaseName.get()}-${archiveVersion.get()}-boot.${archiveExtension.get()}")
    }
}
