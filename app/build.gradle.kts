plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
    kotlin("kapt")
}

android {
    namespace = "com.example.weatherapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.weatherapp"
        minSdk = 22
        targetSdk = 33
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

        buildFeatures{
            dataBinding = true
            viewBinding = true
        }
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

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")

    implementation ("com.android.volley:volley:1.2.1")


    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3") // Ensure correct version

    implementation ("io.reactivex.rxjava3:rxjava:3.1.7")
    implementation ("io.reactivex.rxjava3:rxandroid:3.0.2")
    implementation ("com.squareup.retrofit2:adapter-rxjava3:2.9.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("io.reactivex.rxjava3:rxjava:3.1.6")
    implementation ("io.reactivex.rxjava3:rxandroid:3.0.2")

    // ViewModel and LiveData
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")  // For ViewModel with Kotlin extensions
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1") // For LiveData with Kotlin extensions

// Activity KTX (for viewModels delegate)
    implementation ("androidx.activity:activity-ktx:1.7.0")  // Required for activity.viewModels delegate

    implementation ("com.google.code.gson:gson:2.10")

    implementation("com.squareup.retrofit2:retrofit:2.9.0") // Core Retrofit library
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") // Gson converter for JSON parsing
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0") // OkHttp logging interceptor

    implementation("com.google.android.gms:play-services-location:21.3.0")

    //crashlutics
    implementation(platform("com.google.firebase:firebase-bom:33.6.0"))
    implementation("com.google.firebase:firebase-crashlytics")
    implementation("com.google.firebase:firebase-analytics")

    val room_version = "2.6.1"

    implementation("androidx.room:room-runtime:$room_version")
    kapt("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-ktx:$room_version")
    implementation("androidx.work:work-runtime-ktx:2.8.1")

    implementation ("com.google.android.gms:play-services-location:21.0.1")




}