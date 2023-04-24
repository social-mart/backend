import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

apply(from = "../repositories.gradle.kts")

tasks.named<ShadowJar>("shadowJar") {
    archiveFileName.set("gateway.jar")
}