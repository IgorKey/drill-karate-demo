import org.jetbrains.kotlin.konan.target.*

plugins {
    java
    application
    id("com.epam.drill.agent.runner.app")
}

val target = HostManager.host.presetName

val agentJavaProject = rootProject

application {
    mainClassName = "org.springframework.boot.loader.JarLauncher"
}

drill {
    agentId = project.properties["agentId"]?.toString() ?: "Petclinic"
    adminHost = "localhost"
    adminPort = 8090
    logLevel = com.epam.drill.agent.runner.LogLevels.TRACE
}

repositories {
    mavenLocal()
    maven("https://dl.bintray.com/drill/drill4j")
}

dependencies {
    compileOnly("org.springframework:spring-context:5.1.8.RELEASE")
    implementation("org.springframework.samples:spring-petclinic:2.1.0") { isTransitive = false }
}