package com.riahi.githubkmp

import android.app.Application
import com.riahi.api.GithubApi
import com.riahi.model.MembersDataRepository
import com.riahi.presentation.DataRepository

class GithubKMPApplication : Application() {
    val dataRepository: DataRepository by lazy {
        MembersDataRepository(GithubApi())
    }
}