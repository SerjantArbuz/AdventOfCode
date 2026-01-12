plugins {
    alias(libs.plugins.android.app)
    alias(libs.plugins.kotlin)
}

android {
    namespace = "sgtmelon.adventofcode"

    compileSdk = 33
    defaultConfig {
        applicationId = "sgtmelon.advent.of.code"
        minSdk = 25
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation(libs.android.core)
    implementation(libs.android.appcompat)
    implementation(libs.android.material)

    implementation(libs.android.lifecycle.ext)
    implementation(libs.android.lifecycle.vm)
    implementation(libs.android.lifecycle.livedata)

    implementation(libs.koin)

    implementation(libs.retrofit)
    implementation(libs.retrofit.logging)

    implementation(libs.timber)
}