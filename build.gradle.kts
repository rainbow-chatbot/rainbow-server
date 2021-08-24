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
    val ktorVersion = "1.6.2"
    implementation("io.ktor:ktor-server-core:$ktorVersion")
    implementation("io.ktor:ktor-server-netty:$ktorVersion")
    implementation("io.ktor:ktor-freemarker:$ktorVersion")

    implementation ("org.slf4j:slf4j-simple:1.7.26")
}