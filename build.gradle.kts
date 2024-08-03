import net.ltgt.gradle.errorprone.errorprone

plugins {
    id("java")
    id("net.ltgt.errorprone") version "4.0.1"
}

group = "com.github.gavlyukovskiy"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jspecify:jspecify:1.0.0")
    errorprone("com.google.errorprone:error_prone_core:2.29.2")
    errorprone("com.uber.nullaway:nullaway:0.11.1")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(22)
    }
}

tasks {
    withType<JavaCompile>().configureEach {
        options.errorprone {
            disableAllChecks = true
            error("NullAway")
            option("NullAway:JSpecifyMode")
            option("NullAway:AnnotatedPackages", "com.github.gavlyukovskiy")
        }
        options.encoding = "UTF-8"
    }
}