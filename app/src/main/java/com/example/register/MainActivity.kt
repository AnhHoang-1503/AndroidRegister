package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.constraint_layout)

        val firstName: TextView = findViewById(R.id.first_name)
        val lastName: TextView = findViewById(R.id.last_name)
        val gender: RadioGroup = findViewById(R.id.gender)
        val birthday: TextView = findViewById(R.id.birth_day)
        val address: TextView = findViewById(R.id.address)
        val email: TextView = findViewById(R.id.email)
        val agree: CheckBox = findViewById(R.id.agree)
        val register: Button = findViewById(R.id.register)

        register.setOnClickListener {
            when {
                firstName.text.toString().trim().isEmpty() -> {
                    Toast.makeText(applicationContext, "Hãy nhập tên!", Toast.LENGTH_SHORT).show()
                }
                lastName.text.toString().trim().isEmpty() -> {
                    Toast.makeText(applicationContext, "Hãy nhập họ!", Toast.LENGTH_SHORT).show()
                }
                gender.checkedRadioButtonId == -1 -> {
                    Toast.makeText(applicationContext, "Hãy chọn giới tính!", Toast.LENGTH_SHORT).show()
                }
                birthday.text.toString().trim().isEmpty() -> {
                    Toast.makeText(applicationContext, "Hãy nhập ngày sinh!", Toast.LENGTH_SHORT).show()
                }
                address.text.toString().trim().isEmpty() -> {
                    Toast.makeText(applicationContext, "Hãy nhập địa chỉ!", Toast.LENGTH_SHORT).show()
                }
                email.text.toString().trim().isEmpty() -> {
                    Toast.makeText(applicationContext, "Hãy nhập email!", Toast.LENGTH_SHORT).show()
                }
                !agree.isChecked -> {
                    Toast.makeText(applicationContext, "Hãy đồng ý với điều khoản sử dụng!", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(applicationContext, "Đăng ký thành công!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}