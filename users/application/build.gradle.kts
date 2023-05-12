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

    implementation(project(":users-adapters"))

    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
}

tasks {
    withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
        this.enabled = true // this is important to build a bootable jar with all dependencies and jars of submodules
        this.archiveFileName.set("${archiveBaseName.get()}-${archiveVersion.get()}-boot.${archiveExtension.get()}")
    }
}
