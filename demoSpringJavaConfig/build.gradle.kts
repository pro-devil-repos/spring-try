import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "pro.devil"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.springframework", "spring-core", "5.2.8.RELEASE")
    implementation("org.springframework", "spring-context", "5.2.8.RELEASE")
    implementation("javax.annotation", "javax.annotation-api", "1.3.2")

    testImplementation(kotlin("test-junit5"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "13"
}