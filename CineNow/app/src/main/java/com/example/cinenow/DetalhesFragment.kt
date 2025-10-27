package com.example.cinenow

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.cinenow.databinding.FragmentDetalhesBinding

class DetalhesFragment : Fragment(R.layout.fragment_detalhes) {

    private var _binding: FragmentDetalhesBinding? = null
    private val binding get() = _binding!!
    private val args: DetalhesFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDetalhesBinding.bind(view)

        binding.textDetalhes.text = "🎥 Detalhes do filme: ${args.tituloFilme}"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
