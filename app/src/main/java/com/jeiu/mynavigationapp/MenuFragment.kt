package com.jeiu.mynavigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.jeiu.mynavigationapp.databinding.FragmentMenuBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuFragment : Fragment() {
    // TODO: Rename and change types of parameters
       private var _binding: FragmentMenuBinding? = null
     private val binding
         get() = _binding!!




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMenuBinding.bind(view)

        binding.btnAndroid.setOnClickListener {
            moveToDetail(subject = "kotlin")
        }


        binding.btnBackHome.setOnClickListener {
            findNavController().popBackStack()
        }


    }


    private fun moveToDetail(subject: String) {
        
        val bundle = Bundle()
        bundle.putString("subject", subject)
        findNavController().navigate(R.id.action_menuFragment_to_detailFragment, bundle)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}