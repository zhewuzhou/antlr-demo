/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.7/userguide/building_java_projects.html
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
}

repositories {
    // Use JCenter for resolving dependencies.
    jcenter()
}




dependencies {
    //versions go here
    val junitJupiterVersion = "5.6.0"

    // Align versions of all Kotlin components
    platform("org.jetbrains.kotlin:kotlin-bom")

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use JUnit Jupiter API for testing.
    testImplementation("org.junit.jupiter:junit-jupiter-api:${junitJupiterVersion}")
    testImplementation("org.junit.jupiter:junit-jupiter-params:${junitJupiterVersion}")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:${junitJupiterVersion}")
    testImplementation("org.hamcrest:hamcrest-all:1.3")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    //Antlr
    implementation("org.antlr:antlr4-runtime:4.8-1")
    implementation("org.antlr:antlr4:4.8-1")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:29.0-jre")
}

application {
    // Define the main class for the application.
    mainClass.set("antlr.book.code.App")
}

tasks.test {
    // Use junit platform for unit tests.
    useJUnitPlatform()
}
