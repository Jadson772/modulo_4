package com.example.cinenow

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.cinenow.databinding.FragmentFilmesBinding

class FilmesFragment : Fragment(R.layout.fragment_filmes) {

    private var _binding: FragmentFilmesBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFilmesBinding.bind(view)

        binding.buttonDetalhes.setOnClickListener {
            val titulo = "Batman: O Cavaleiro das Trevas"
            val action = FilmesFragmentDirections
                .actionFilmesFragmentToDetalhesFragment(titulo)
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
