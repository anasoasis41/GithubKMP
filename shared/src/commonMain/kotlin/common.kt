package com.riahi

expect fun platformName(): String

class Greeting {
    fun greeting(): String = "Hello, ${platformName()}"
}