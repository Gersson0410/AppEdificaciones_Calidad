plugins {
    alias(libs.plugins.android.application) apply false
    id("org.sonarqube") version "4.4.1.3373"
}

allprojects {
    apply(plugin = "org.sonarqube")
}

sonar {
    properties {
        property("sonar.projectKey", "AppEdificaciones")
        property("sonar.projectName", "AppEdificaciones")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.token", System.getenv("SONAR_TOKEN"))
        property("sonar.sourceEncoding", "UTF-8")
        property("sonar.language", "java")
        property("sonar.gradle.skipCompile", "true")
        // Eliminar o comentar esta línea problemática:
        // property("sonar.scanner.metadataFilePath", "")
    }
}

// Configurar solo el módulo app
project(":app") {
    sonar {
        properties {
            property("sonar.sources", "src/main/java")
            property("sonar.tests", "src/test/java,src/androidTest/java")
            property("sonar.java.binaries", "build/intermediates/javac/debug/compileDebugJavaWithJavac/classes")
            property("sonar.exclusions", "**/R.java,**/BuildConfig.java")
        }
    }
}
