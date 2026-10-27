package com.example.apptally

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform