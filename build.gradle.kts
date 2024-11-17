plugins {
    kotlin("jvm") version "2.0.21"
}

group = "com.example"
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        mavenLocal()
        maven {
            setUrl("https://maven.aliyun.com/repository/public/")
        }
        maven {
            setUrl("https://mirrors.huaweicloud.com/repository/maven/")
        }
        mavenCentral()
    }
}

repositories {
    mavenLocal()
    maven {
        setUrl("https://maven.aliyun.com/repository/public/")
    }
    maven {
        setUrl("https://mirrors.huaweicloud.com/repository/maven/")
    }
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.google.protobuf:protobuf-kotlin:4.28.3")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}

