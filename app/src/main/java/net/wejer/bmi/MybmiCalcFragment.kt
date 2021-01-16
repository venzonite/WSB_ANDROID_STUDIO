package net.wejer.bmi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.fragment_mybmi_calc.view.*;

class MybmiCalcFragment : Fragment() {

    lateinit var mView:View;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mView = inflater.inflate(R.layout.fragment_mybmi_calc, container, false)
        mView.btnOblicz.setOnClickListener {

            val waga = mView.txtWaga.text.toString().toDouble();
            val wzrost = mView.txtWzrost.text.toString().toDouble();

            val bmi = waga / wzrost / wzrost * 10000;

            Toast.makeText(context, "Twoje bmi to:" + bmi.round(2), Toast.LENGTH_LONG).show()
        }





        return mView;
    }

    fun Double.round(decimals: Int = 2): Double = "%.${decimals}f".format(this).toDouble()

}