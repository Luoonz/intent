package com.example.myapplication

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toLiBtn.setOnClickListener {

            val data = edt.text.toString()

            Log.i("TTT", "A" + data + "A");
            if(data.equals("")){
                makeA()
            }else{
                val intent = Intent(this@MainActivity, LinearActivity::class.java)
                intent.putExtra("data", data)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(intent)
            }
        }
    }

    fun makeA(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("알림창")
        builder.setMessage("숫자를 입력해주세요")
        builder.setPositiveButton("승인") { dialogInterface: DialogInterface, i: Int ->
            toast("Positive")
        }
        builder.setNegativeButton("거부") { dialogInterface: DialogInterface, i: Int ->
            toast("Negative")
        }
        builder.setNeutralButton("취소") { dialogInterface: DialogInterface, i: Int ->
            toast("Neutral")
        }
        builder.show()
    }

    fun toast(message:String){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}