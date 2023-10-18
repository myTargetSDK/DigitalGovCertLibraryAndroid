pluginManagement {
    repositories {
        maven ( url = "https://jitpack.io" )
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven ( url = "https://jitpack.io" )
        google()
        mavenCentral()
    }
}

rootProject.name = "MinCertApilication"
include(":app")
include(":mylibrary")