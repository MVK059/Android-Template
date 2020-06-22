object Sdk {
    const val MIN_SDK_VERSION = 21
    const val TARGET_SDK_VERSION = 29
    const val COMPILE_SDK_VERSION = 29
}

object Versions {
    const val ANDROIDX_TEST_EXT = "1.1.1"
    const val ANDROIDX_TEST = "1.2.0"
    const val APPCOMPAT = "1.1.0"
    const val CONSTRAINT_LAYOUT = "1.1.3"
    const val CORE_KTX = "1.2.0"

    const val SUPPORT_LIBRARY = "1.1.0"
    const val LIFECYCLE = "2.2.0"
    const val MULTIDEX = "2.0.1"
    const val GLIDE = "4.11.0"
    const val GLIDE_COMPILER = "4.8.0"
    const val RETROFIT = "2.8.1"
    const val RETROFIT_GSON = "2.7.1"
    const val OK_HTTP = "4.7.2"
    const val RETROFIT_ADAPTER = "1.0.0"
    const val RX_JAVA = "2.2.3"
    const val RX_JAVA_ANDROID = "2.1.1"
    const val TIMBER = "4.7.1"
    const val GSON = "2.8.6"
    const val ACTIVITY_KTX = "1.1.0"
    const val DAGGER_HILT = "2.28-alpha"
    const val DAGGER_HILT_LIFECYCLE = "1.0.0-alpha01"
    const val COROUTINE = "1.3.6"

    const val ESPRESSO_CORE = "3.2.0"
    const val JUNIT = "4.13"
    const val KTLINT = "0.36.0"
}

object BuildPluginsVersion {
    const val AGP = "4.0.0"
    const val DETEKT = "1.9.1"
    const val KOTLIN = "1.3.72"
    const val KTLINT = "9.2.1"
    const val VERSIONS_PLUGIN = "0.28.0"
    const val DAGGER_HILT = "2.28-alpha"
}

object SupportLibs {
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "com.android.support.constraint:constraint-layout:${Versions.CONSTRAINT_LAYOUT}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val ANDROID_MATERIAL_DESIGN = "com.google.android.material:material:${Versions.SUPPORT_LIBRARY}"
    const val ANDROIDX_RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.SUPPORT_LIBRARY}"
    const val ANDROIDX_CARD_VIEW = "androidx.cardview:cardview:${Versions.SUPPORT_LIBRARY}"
    const val ANDROIDX_LIFECYCLE = "androidx.lifecycle:lifecycle-extensions:${Versions.LIFECYCLE}"
    const val ANDROIDX_LIFECYCLE_COMPILER = "androidx.lifecycle:lifecycle-compiler:${Versions.LIFECYCLE}"
    const val ANDROIDX_MULTIDEX = "androidx.multidex:multidex:${Versions.MULTIDEX}"
    const val ANDROID_GLIDE = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
    const val ANDROID_GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${Versions.GLIDE_COMPILER}"
    const val ANDROID_RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val ANDROID_RETROFIT_GSON = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT_GSON}"
    const val ANDROID_OK_HTTP = "com.squareup.okhttp3:okhttp:${Versions.OK_HTTP}"
    const val ANDROID_RETROFIT_ADAPTER = "com.jakewharton.retrofit:retrofit2-rxjava2-adapter:${Versions.RETROFIT_ADAPTER}"
    const val ANDROID_RX_JAVA = "io.reactivex.rxjava2:rxjava:${Versions.RX_JAVA}"
    const val ANDROID_RX_JAVA_ANDROID = "io.reactivex.rxjava2:rxandroid:${Versions.RX_JAVA_ANDROID}"
    const val ANDROID_TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"
    const val ANDROID_GSON = "com.google.code.gson:gson:${Versions.GSON}"
    const val ANDROID_ACTIVITY_KTX = "androidx.activity:activity-ktx:${Versions.ACTIVITY_KTX}"
    const val ANDROID_DAGGER_HILT = "com.google.dagger:hilt-android:${Versions.DAGGER_HILT}"
    const val ANDROID_DAGGER_HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.DAGGER_HILT}"
    const val ANDROID_DAGGER_HILT_VIEWMODEL = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.DAGGER_HILT_LIFECYCLE}"
    const val ANDROIDX_DAGGER_HILT_COMPILER = "androidx.hilt:hilt-compiler:${Versions.DAGGER_HILT_LIFECYCLE}"
    const val ANDROID_COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINE}"
    const val ANDROID_COROUTINE_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINE}"
}

object TestingLib {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
}

object AndroidTestingLib {
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_EXT_JUNIT = "androidx.test.ext:junit:${Versions.ANDROIDX_TEST_EXT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
}
