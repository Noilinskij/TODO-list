plugins {
    `java-gradle-plugin`
    alias(libs.plugins.springframework.boot)
    alias(libs.plugins.spring.dependency)
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(gradleApi())
    implementation(libs.bundles.spring.libraries)
}

gradlePlugin{
    plugins {
        register("MyPlugin") {
            id = "plugins.myplugin"
            implementationClass = "plugins.MyPlugin"
        }
    }
}