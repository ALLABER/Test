plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinKapt)
    id(BuildPlugins.hiltAndroid)
}

android {
    namespace = "com.allaber.test"
    compileSdk = ConfigData.compileSdk

    defaultConfig {
        applicationId = "com.allaber.test"
        minSdk = ConfigData.minSdk
        targetSdk = ConfigData.targetSdk
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ConfigData.proguardAndroid),
                ConfigData.proguardRules
            )
        }
    }

    compileOptions {
        sourceCompatibility = ConfigData.sourceCompatibility
        targetCompatibility = ConfigData.targetCompatibility
    }

    kotlinOptions {
        jvmTarget = ConfigData.jvmTarget
    }
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(projects.core.navigation)
    implementation(projects.ui.assets)
    implementation(projects.ui.localization)
    implementation(projects.ui.system)
    implementation(projects.feature.home)
    implementation(projects.feature.intro)
    implementation(projects.feature.test)
    implementation(projects.feature.result)

    implementation(Deps.coreKtx)
    implementation(Deps.appcompat)
    implementation(Deps.material)
    implementation(Deps.constraintLayout)
    implementation(Deps.fragment)

    hilt()
    lifecycle()
}
