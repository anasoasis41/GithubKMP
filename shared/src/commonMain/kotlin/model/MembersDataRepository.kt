package com.riahi.model

import com.riahi.api.GithubApi
import com.riahi.api.UpdateProblem
import com.riahi.presentation.DataRepository

class MembersDataRepository(private val api: GithubApi): DataRepository {

    override var members: String? = null

    override var onRefreshListener: List<() -> Unit> = emptyList()

    override suspend fun update() {
        val newMembers = try {
            api.getMembers()
        } catch (cause: Throwable) {
            throw UpdateProblem()
        }

        if (newMembers != members) {
            members = newMembers
            callRefreshListeners()
        }
    }

    private fun callRefreshListeners() {
        onRefreshListener.forEach { it() }
    }

}