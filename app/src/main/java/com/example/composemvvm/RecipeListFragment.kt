package com.example.composemvvm

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RecipeListFragment : androidx.fragment.app.Fragment() {
    @Deprecated("Deprecated in Java")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(
            R.layout.fragment_recipe_lists, container,
            false
        )

        return view
    }
}