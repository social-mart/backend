import org.gradle.kotlin.dsl.kotlin

plugins {
    kotlin("jvm")
    kotlin("plugin.allopen")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
    id("org.jlleitschuh.gradle.ktlint")
}

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        val javaVersion = JavaVersion.VERSION_17.toString()
        kotlinOptions {
            javaParameters = true
            languageVersion = "1.6"
            jvmTarget = javaVersion
        }
    }
}
dependencies {
    // @ConfigurationProperties(prefix = "....")  and @ConstructorBinding
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
}
