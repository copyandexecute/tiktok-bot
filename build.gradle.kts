plugins {
    id("java")
}

group = "de.hglabor"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.sealedtx:java-youtube-downloader:3.1.0")
}
