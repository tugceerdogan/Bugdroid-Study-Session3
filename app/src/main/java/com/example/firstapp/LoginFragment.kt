package com.example.firstapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val loginButton: Button = view.findViewById(R.id.buttonLogin)
        val emailText: EditText = view.findViewById(R.id.editTextEmailAddress)
        val passwordText: EditText = view.findViewById(R.id.editTextPassword)


        loginButton.setOnClickListener(View.OnClickListener {
            val email = emailText.text.toString()
            val password = passwordText.text.toString()

            val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(email, password)
            findNavController().navigate(action)
        })
    }
}