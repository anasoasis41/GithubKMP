package com.riahi.githubkmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.riahi.Greeting
import com.riahi.api.UpdateProblem
import com.riahi.presentation.MembersPresenter
import com.riahi.presentation.MembersView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MembersView {

    private val repository by lazy { (application as GithubKMPApplication).dataRepository }
    private val presenter by lazy { MembersPresenter(this, repository = repository) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greeting.text = Greeting().greeting()

        presenter.onCreate()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDestroy()
    }

    override var isUpdating = false

    override fun onUpdate(members: String) {
        runOnUiThread {
            Toast.makeText(this, members, Toast.LENGTH_LONG).show()
        }
    }

    override fun showError(error: Throwable) {
        val errorMessage = when (error) {
            is UpdateProblem -> getString(R.string.update_problem)
            else -> getString(R.string.unknown_error)
        }

        Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
    }
}











