package com.example.designdz.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.designdz.R
import com.example.designdz.databinding.FragmentNewBinding

class NewFragment : Fragment() {
    lateinit var binding: FragmentNewBinding
val sum = arrayOf("10000","15000","20000","25000","30000")
val srok = arrayOf("12","13","14","15","16")
val wallet = arrayOf("Электронный кошелек","Электронный кошелек2","Электронный кошелек3","Электронный кошелек4","Электронный кошелек5")
val provider = arrayOf("Balance","Элсом","О!Деньги","Элкарт",)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewBinding.inflate(inflater, container, false)

        val adapterSum = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, sum)
        binding.spinnerSum.adapter = adapterSum
        val adapterSrok = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, srok)
        binding.spinnerSrok.adapter = adapterSrok
        val adapterWallet = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, wallet)
        binding.spinnerWallet.adapter = adapterWallet
        val adapterProvider = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_dropdown_item, provider)
        binding.spinnerProvider.adapter = adapterProvider

        return binding.root
    }


}