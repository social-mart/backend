plugins {
    id("project.java-conventions")
    id("project.kotlin-conventions")
    id("project.springboot-conventions")
    id("project.common-dependencies-conventions")
//    application
}

// application {
//    mainClass.set("io.mart.ApplicationKt")
// }

dependencies {
    // get the central dependencies library
    @Suppress("UNCHECKED_CAST")
    val projectDependencies = rootProject.ext["libraries"] as Map<String, String>

    implementation(project(":gateway-adapters"))

    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
}
