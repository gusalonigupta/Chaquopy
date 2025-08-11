plugins {
    id("com.android.application")
    id("com.chaquo.python")
}

android {
    namespace = "com.example.ytdlpdemo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ytdlpdemo"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        ndk {
            abiFilters += listOf("arm64-v8a")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

chaquopy {
    defaultConfig {
        version = "3.12"
        pip {
            options("--upgrade")
            install("yt-dlp")
            install("pycryptodomex")
            install("certifi")
            install("mutagen")
            install("websockets")
            install("brotli")
            install("aria2p")
            install("PySocks")
            install("httpx")
            install("pyOpenSSL")
            install("pycurl")
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
}