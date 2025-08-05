group = "com.example.taskservice"
version = "1.0.0"

plugins {
    alias(libs.plugins.java)
    alias(libs.plugins.springframework.boot)
    alias(libs.plugins.spring.dependency)

}

dependencies {
    implementation(libs.bundles.spring.libraries)
}