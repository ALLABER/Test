pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "test"
include(":app")
include(":domain")
include(":data")
include(":ui:assets")
include(":ui:localization")
include(":ui:system")
include(":feature:home")
include(":feature:intro")
include(":feature:test")
include(":feature:result")
