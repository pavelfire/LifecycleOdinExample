package com.vk.directop.lifecycleodinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


private const val TAG = "MyTag: "
private const val VALUE_ONE: String = ""

private var num: Int = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1
        Log.d(TAG, "Ты видел деву на скале " +
                "В одежде белой над волнами,")
        if (savedInstanceState != null) {
            //helloTextView.text = savedInstanceState.getString(VALUE_ONE)
        } else {
            //randomize()
        }
    }

    override fun onStart() {
        super.onStart()
        //2
        Log.d(TAG, "Когда, бушуя в бурной мгле, " +
                "Играло море с берегами,")
    }

    override fun onResume() {
        super.onResume()
        //3
        Log.d(TAG, "Когда луч молний озарял " +
                "Ее всечасно блеском алым")
    }

    override fun onPause() {
        super.onPause()
        //4
        Log.d(TAG, "И ветер бился и летал " +
                "С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        //5
        Log.d(TAG, "Прекрасно море в бурной мгле " +
                "И небо в блесках без лазури;")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "")
    }

    override fun onDestroy() {
        super.onDestroy()
        //6
        Log.d(TAG, "Но верь мне: дева на скале " +
                "Прекрасней волн, небес и бури.")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(VALUE_ONE, "helloTextView.toString()")
        Log.d(TAG, "")
    }
}

/*

вывести с помощью жизненного цикла стих из 12 строк
1
Ты видел деву на скале
В одежде белой над волнами,
2
Когда, бушуя в бурной мгле,
Играло море с берегами,
3
Когда луч молний озарял
Ее всечасно блеском алым
4
И ветер бился и летал
С ее летучим покрывалом?
5
Прекрасно море в бурной мгле
И небо в блесках без лазури;
6
Но верь мне: дева на скале
Прекрасней волн, небес и бури.
 */