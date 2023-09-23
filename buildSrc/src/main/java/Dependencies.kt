import org.gradle.api.artifacts.dsl.DependencyHandler

object BuildPlugins {
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kotlinKapt = "kotlin-kapt"
    const val hiltAndroid = "dagger.hilt.android.plugin"
}

object Deps {
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val appcompat by lazy { "androidx.appcompat:appcompat:${Versions.appcompat}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val hilt by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hilt}" }
    val daggerCompiler by lazy { "com.google.dagger:dagger-compiler:${Versions.hilt}" }
    val daggerProcessor by lazy { "com.google.dagger:dagger-android-processor:${Versions.daggerProcessor}" }
    val fragment by lazy { "androidx.fragment:fragment-ktx:${Versions.fragment}" }
    val lifecycleViewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}" }
    val lifecycleLivedata by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}" }

    val room by lazy { "androidx.room:room-runtime:${Versions.room}" }
    val roomCompiler by lazy { "androidx.room:room-compiler:${Versions.room}" }
    val roomKtx by lazy { "androidx.room:room-ktx:${Versions.room}" }
}

fun DependencyHandler.implementation(dependencyList: List<String>) {
    dependencyList.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.implementation(dependency: String) {
    add("implementation", dependency)
}

fun DependencyHandler.kapt(dependency: String) {
    add("kapt", dependency)
}

fun DependencyHandler.kapt(dependencyList: List<String>) {
    dependencyList.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.annotationProcessor(dependency: String) {
    add("annotationProcessor", dependency)
}

fun DependencyHandler.annotationProcessor(dependencyList: List<String>) {
    dependencyList.forEach { dependency ->
        add("annotationProcessor", dependency)
    }
}

fun DependencyHandler.hilt() {
    implementation(Deps.hilt)
    kapt(Deps.hiltCompiler)
    kapt(Deps.daggerCompiler)
    annotationProcessor(Deps.daggerCompiler)
}

fun DependencyHandler.lifecycle() {
    implementation(Deps.lifecycleViewModel)
    implementation(Deps.lifecycleLivedata)
}

fun DependencyHandler.room() {
    implementation(Deps.room)
    kapt(Deps.roomCompiler)
    implementation(Deps.roomKtx)
}