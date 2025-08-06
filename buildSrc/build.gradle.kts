repositories {
    gradlePluginPortal()
    mavenCentral()
}

plugins {
    id("java-gradle-plugin")
    alias(libs.plugins.java)
    alias(libs.plugins.springframework.boot)
    alias(libs.plugins.spring.dependency)
}

dependencies {
    implementation(gradleApi())
    implementation(libs.bundles.spring.libraries)
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.2.5")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.4")
}