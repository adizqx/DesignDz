package com.example.designdz.Fragments

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import cn.pedant.SweetAlert.SweetAlertDialog
import com.example.designdz.R
import com.example.designdz.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    var bankImages = intArrayOf(
        R.drawable.bank1,
        R.drawable.bank2,
        R.drawable.bank3,
        R.drawable.bank4,
        R.drawable.bank5
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.carouselView.pageCount = bankImages.size
        binding.carouselView.setImageListener { position, imageView ->
            imageView.setImageResource(bankImages[position])
        }
        binding.carouselView.setImageClickListener { position ->
            Toast.makeText(requireContext(), "clicked", Toast.LENGTH_SHORT).show()
        }
        binding.openWebsiteButton.setOnClickListener {
            val url = "http://www.google.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)}
        binding.regButton.setOnClickListener {
            val dialog = SweetAlertDialog(requireContext(), SweetAlertDialog.SUCCESS_TYPE)
            dialog.progressHelper.barColor = Color.parseColor("#A5DC86")
            dialog.titleText = "OK"
            dialog.setCancelable(false)
            dialog.show()
        }
        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu1,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }


}