package com.vk.directop.lifecycleodinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


private const val TAG = "MyTAg: "
private const val VALUE_ONE: String = ""

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "")
        if (savedInstanceState != null) {
            //helloTextView.text = savedInstanceState.getString(VALUE_ONE)
        } else {
            //randomize()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(VALUE_ONE, "helloTextView.toString()")
        Log.d(TAG, "")
    }
}

/*

вывести с помощью жизненного цикла стих из 12 строк

Ты видел деву на скале
В одежде белой над волнами,
Когда, бушуя в бурной мгле,
Играло море с берегами,
Когда луч молний озарял
Ее всечасно блеском алым
И ветер бился и летал
С ее летучим покрывалом?
Прекрасно море в бурной мгле
И небо в блесках без лазури;
Но верь мне: дева на скале
Прекрасней волн, небес и бури.
 */