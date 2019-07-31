package com.riahi.api

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.http.Url

class GithubApi {
    private val client = HttpClient()

    private val membersUrl = Url("https://api.github.com/orgs/google/members")

    suspend fun getMembers(): String {
        val result: String = client.get {
            url(this@GithubApi.membersUrl.toString())
        }
        return result
    }
}