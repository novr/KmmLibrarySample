package com.github.novr.kmmlibrarysample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform