package net.gtl.librarytester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import net.gtl.libtest.LibRegClassTest
import net.gtl.libtest.LibTest
import net.gtl.libtest.callMethodFromClass
import net.gtl.libtest.justAnotherFunction

class MainActivity : LibTest() {
    val libtester = LibRegClassTest()
    override fun testlog(message: String) {
       Log.e("testing",libtester.regFuncCall())
        justAnotherFunction()
        callMethodFromClass()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
