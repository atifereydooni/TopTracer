object Dependencies {
    const val androidxCore = "androidx.core:core-ktx:${Versions.androidxCore}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val androidMaterial = "com.google.android.material:material:${Versions.androidMaterial}"
    const val androidxLifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.androidxLifecycle}"

    // hilt
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigation}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltAndroidTest = "com.google.dagger:hilt-android-testing:${Versions.hilt}"

    //compose
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val composeUI = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composeNavigation = "androidx.navigation:navigation-compose:${Versions.composeNavigation}"
    const val accompanistNavigation = "com.google.accompanist:accompanist-navigation-animation:${Versions.accompanistNavigation}"

    //retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.converterGson}"
    const val interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.interceptor}"

    //coil
    const val coilGif = "io.coil-kt:coil-gif:${Versions.coil}"
    const val coil = "io.coil-kt:coil:${Versions.coil}"
    const val coilCompose = "io.coil-kt:coil-compose:${Versions.coil}"

    // testing
    const val jUnit = "junit:junit:${Versions.jUnit}"

}
