plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.fruitflvme.core"
    compileSdk = 35
    defaultConfig {
        minSdk = 29
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
    implementation(libs.androidx.core.ktx)

    //ImageVector
    implementation(libs.androidx.ui.graphics)

    //Compose
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.material3)

    //DataStore
    implementation(libs.androidx.datastore.preferences)
}