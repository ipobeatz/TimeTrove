plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("kotlin-android")
    id ("com.google.dagger.hilt.android")

    id ("dagger.hilt.android.plugin")
    kotlin("kapt")
    id("kotlin-kapt")
}

android {
    namespace = "com.android.timeTrove"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.android.timeTrove"
        minSdk = 24
        targetSdk = 34
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
    buildFeatures {
        // Enable Jetpack Compose for the project
        compose = true
    }
    composeOptions {
        kotlinCompilerVersion = "1.4.8"
    }


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.runtime.android)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    implementation("io.coil-kt:coil-compose:2.1.0")
    implementation("androidx.activity:activity-compose:1.7.20")
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:1.4.0")
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("androidx.compose.ui:ui:1.4.0")
    implementation("androidx.compose.material:material:1.4.0")
    implementation("androidx.compose.ui:ui-tooling:1.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.4.0")
    debugImplementation("androidx.compose.ui:ui-tooling:1.6.7")
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.7")
    implementation ("androidx.navigation:navigation-compose:2.4.0")
    implementation("com.google.dagger:hilt-android:2.44")
    kapt ("com.google.dagger:hilt-compiler:2.44")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

}