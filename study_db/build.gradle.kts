plugins {
    java
    application
}

application {
    mainClassName = "DataBase"
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.intellij:annotations:12.0")
    implementation("org.flywaydb:flyway-core:6.1.4")
    implementation("org.postgresql:postgresql:42.2.9")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}