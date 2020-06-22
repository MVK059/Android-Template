plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
}
apply(plugin = "kotlin-kapt")
apply(plugin = "dagger.hilt.android.plugin")

android {
    compileSdkVersion(Sdk.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(Sdk.MIN_SDK_VERSION)
        targetSdkVersion(Sdk.TARGET_SDK_VERSION)

        applicationId = AppCoordinates.APP_ID
        versionCode = AppCoordinates.APP_VERSION_CODE
        versionName = AppCoordinates.APP_VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {

        }
    }

    lintOptions {
        isWarningsAsErrors = true
        isAbortOnError = true
    }

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk7"))

    implementation(SupportLibs.ANDROIDX_APPCOMPAT)
    implementation(SupportLibs.ANDROIDX_CONSTRAINT_LAYOUT)
    implementation(SupportLibs.ANDROIDX_CORE_KTX)
    implementation(SupportLibs.ANDROID_MATERIAL_DESIGN)
    implementation(SupportLibs.ANDROIDX_RECYCLER_VIEW)
    implementation(SupportLibs.ANDROIDX_CARD_VIEW)
    implementation(SupportLibs.ANDROIDX_LIFECYCLE)
    annotationProcessor(SupportLibs.ANDROIDX_LIFECYCLE_COMPILER)
    implementation(SupportLibs.ANDROIDX_MULTIDEX)
    implementation(SupportLibs.ANDROID_GLIDE)
    annotationProcessor(SupportLibs.ANDROID_GLIDE_COMPILER)
    implementation(SupportLibs.ANDROID_RETROFIT)
    implementation(SupportLibs.ANDROID_RETROFIT_GSON)
    implementation(SupportLibs.ANDROID_OK_HTTP)
    implementation(SupportLibs.ANDROID_RETROFIT_ADAPTER)
    implementation(SupportLibs.ANDROID_RX_JAVA)
    implementation(SupportLibs.ANDROID_RX_JAVA_ANDROID)
    implementation(SupportLibs.ANDROID_TIMBER)
    implementation(SupportLibs.ANDROID_GSON)
    implementation(SupportLibs.ANDROID_ACTIVITY_KTX)
    implementation(SupportLibs.ANDROID_DAGGER_HILT)
    annotationProcessor(SupportLibs.ANDROID_DAGGER_HILT_COMPILER)
    implementation(SupportLibs.ANDROID_DAGGER_HILT_VIEWMODEL)
    annotationProcessor(SupportLibs.ANDROIDX_DAGGER_HILT_COMPILER)
    implementation(SupportLibs.ANDROID_COROUTINE)
    implementation(SupportLibs.ANDROID_COROUTINE_CORE)

    testImplementation(TestingLib.JUNIT)

    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_EXT_JUNIT)
    androidTestImplementation(AndroidTestingLib.ANDROIDX_TEST_RULES)
    androidTestImplementation(AndroidTestingLib.ESPRESSO_CORE)
}
