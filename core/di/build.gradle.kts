plugins {
    id(BuildPlugins.androidLibrary)
    id(BuildPlugins.kotlinAndroid)
}

android {
    namespace = "com.allaber.di"
    compileSdk = 33

    defaultConfig {
        minSdk = ConfigData.minSdk
        consumerProguardFiles(ConfigData.proguardRules)
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
    implementation(Deps.coreKtx)
}
