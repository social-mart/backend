plugins {
    `kotlin-dsl`
}
repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
}

val kotlinVersion = "1.8.21"
dependencies {
// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
//     _____  _             _             _____                            _                 _              //
//    |  __ \| |           (_)           |  __ \                          | |               (_)             //
//    | |__) | |_   _  __ _ _ _ __  ___  | |  | | ___ _ __   ___ _ __   __| | ___ _ __   ___ _  ___  ___    //
//    |  ___/| | | | |/ _` | | '_ \/ __| | |  | |/ _ \ '_ \ / _ \ '_ \ / _` |/ _ \ '_ \ / __| |/ _ \/ __|   //
//    | |    | | |_| | (_| | | | | \__ \ | |__| |  __/ |_) |  __/ | | | (_| |  __/ | | | (__| |  __/\__ \   //
//    |_|    |_|\__,_|\__, |_|_| |_|___/ |_____/ \___| .__/ \___|_| |_|\__,_|\___|_| |_|\___|_|\___||___/   //
//                     __/ |                         | |                                                    //
//                    |___/                          |_|                                                    //
// /////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////////////////////////////
// /////////////////////////////      https://plugins.gradle.org/      \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
// /////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////////////////////////

    // kotlin('jvm')
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

    // kotlin('all-open')
    // kotlin('spring')
    implementation("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")

    // kotlin("no-args")
    implementation("org.jetbrains.kotlin:kotlin-noarg:$kotlinVersion")

    // id("org.jlleitschuh.gradle.ktlint")
    implementation("org.jlleitschuh.gradle:ktlint-gradle:11.3.1")

    // id("org.owasp.dependencycheck")
    implementation("org.owasp:dependency-check-gradle:8.2.1")

    // id("com.jfrog.artifactory")
    implementation("org.jfrog.buildinfo:build-info-extractor-gradle:4.31.9")

    // id("org.springframework.boot")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.0.5")

    // id("io.spring.dependency-management")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.0")
}
