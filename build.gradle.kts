plugins {
    application
    kotlin("jvm") version "1.5.21"
}

group = "rainbow"
version = "1.0.0"

application {
    mainClass.set("rainbow.ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:1.6.2")
    implementation("io.ktor:ktor-server-netty:1.6.2")
}