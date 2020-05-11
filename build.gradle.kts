plugins {
    java
    id("com.epam.drill.agent.runner.autotest")
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    testImplementation("com.intuit.karate:karate-junit5:0.9.5")
    testImplementation("com.intuit.karate:karate-apache:0.9.5")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
sourceSets {
    test {
        resources {
            srcDir(file("src/test/java"))
            exclude("**/*.java")
        }
    }
}

drill {
    version = "0.1.5"
    agentId = "Petclinic"
    adminHost = "localhost"
    adminPort = 8090
    logLevel = com.epam.drill.agent.runner.LogLevels.TRACE
}