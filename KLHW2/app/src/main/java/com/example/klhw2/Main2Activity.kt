package com.example.klhw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn_send.setOnClickListener {
            if (ed_drink.length() < 1)
                Toast.makeText(this, "請輸入飲料名稱", Toast.LENGTH_SHORT).show()
            else {
                val b = Bundle()
                b.putString("drink", ed_drink.text.toString())
                b.putString(
                    "sugar", RadioGroup.findViewById<RadioButton>
                        (RadioGroup.checkedRadioButtonId).text.toString()
                )
                b.putString(
                    "ice", radiogroup2.findViewById<RadioButton>
                        (radiogroup2.checkedRadioButtonId).text.toString()
                )

                setResult(Activity.RESULT_OK, Intent().putExtras(b))
                finish()
            }
        }
    }
}
