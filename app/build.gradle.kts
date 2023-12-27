plugins {
    id("java")
    application
    `java-library`
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "hexlet.code.App"
}

tasks.compileJava {
    options.release = 20
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}