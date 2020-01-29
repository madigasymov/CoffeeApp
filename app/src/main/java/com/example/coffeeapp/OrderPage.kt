package com.example.coffeeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isGone
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_order_page.*

class OrderPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_page)


        val txtLogin = intent.getStringExtra("str1")
        txt_hi.append(txtLogin)

        rbCoffee.setOnClickListener {
            txtCoffeeTypes.isVisible = true
            rgCoffee.isVisible = true
            check3.isVisible = true

            txtTeaTypes.isGone = true
            rgTea.isGone = true
            check2.isGone = true
        }

        rbTea.setOnClickListener {
            txtCoffeeTypes.isGone = true
            rgCoffee.isGone = true

            txtTeaTypes.isVisible = true
            rgTea.isVisible = true
            check2.isVisible = true
            check3.isVisible = true
        }

        greenTea.setOnClickListener {
            check3.isGone = true
        }

        blackTea.setOnClickListener {
            check3.isVisible = true
        }

        btnOrder.setOnClickListener {
            val intent = Intent(this, Result::class.java)
            var result = "123"

            if (rbCoffee.isChecked) {
                result = " * " + rbCoffee.text.toString() + "\n"
                if (cap.isChecked)
                    result += " * " + cap.text.toString() + "\n"
                if (lat.isChecked)
                    result += " * " + lat.text.toString() + "\n"
                if (ame.isChecked)
                    result += " * " + ame.text.toString() + "\n"
                if (esp.isChecked)
                    result += " * " + esp.text.toString() + "\n"
                if (check1.isChecked)
                    result += " * " + check1.text.toString() + "\n"
                if (check3.isChecked)
                    result += " * " + check3.text.toString() + "\n"
            }
            else if (rbTea.isChecked) {
                result = " * " + rbTea.text.toString() + "\n"
                if (blackTea.isChecked)
                    result += " * " + blackTea.text.toString() + "\n"
                if (greenTea.isChecked)
                    result += " * " + greenTea.text.toString() + "\n"
                if (check1.isChecked)
                    result += " * " + check1.text.toString() + "\n"
                if (check2.isChecked)
                    result += " * " + check2.text.toString() + "\n"
                if (check3.isChecked)
                    result += " * " + check3.text.toString() + "\n"
            }

            intent.putExtra("res", result)
            startActivity(intent)
        }
    }
}
