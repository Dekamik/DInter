package com.dennisvonbargen.dinter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dennisvonbargen.dinter.databinding.FragmentRoutineSelectBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class RoutineSelectFragment : Fragment() {

    private var _binding: FragmentRoutineSelectBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRoutineSelectBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBegin.setOnClickListener {
            findNavController().navigate(R.id.action_RoutineSelectFragment_to_IntervalTimerFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}