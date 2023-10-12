plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}0

android {
    namespace = "com.yavuz.cameraxapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.yavuz.cameraxapp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {0
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        dataBinding = true
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //Check for the latest versions
    var camerax_version = "1.0.1"

    // CameraX core library using camera2 implementation
    implementation ("androidx.camera:camera-camera2:$camerax_version")

    // CameraX Lifecycle Library
    implementation ("androidx.camera:camera-lifecycle:$camerax_version")

    // CameraX View class
    implementation ("androidx.camera:camera-view:1.0.0-alpha27")

    // Glide library for image management and loading.
    implementation ("com.github.bumptech.glide:glide:4.12.0")
}