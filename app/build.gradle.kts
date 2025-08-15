plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.fruitflvme.thousandsofcourses"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.fruitflvme.thousandsofcourses"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(project(":data"))
    implementation(project(":domain"))
    implementation(project(":navigation"))

    //App
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity.ktx)

    //Material
    implementation(libs.material)

    //Fonts
    implementation(libs.androidx.ui.text.google.fonts)

    //Compose
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.foundation)
    
    //Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation(libs.hilt.navigation.compose)

    //Room
    implementation(libs.room.runtime)
    implementation(libs.room.ktx)
    ksp(libs.room.compiler)

    //Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)

    //OkHttp
    implementation(libs.okhttp3)
    implementation(libs.okhttp3.logging.interceptor)
    implementation(libs.okhttp3.mockwebserver)
}