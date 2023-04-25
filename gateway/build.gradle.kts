plugins {
    id("project.java-conventions")
    id("project.kotlin-conventions")
    id("project.springboot-conventions")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
}

tasks {
    withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
        this.enabled = true
        this.archiveFileName.set("${archiveBaseName.get()}-${archiveVersion.get()}-boot.${archiveExtension.get()}")
    }
}
