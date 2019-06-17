package greg.com.kotlinstudy

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import greg.com.kotlinstudy.R.id.tv
import kotlinx.android.synthetic.main.activity_main.*

open class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tv).setText("哈哈哈")
        tv.setText("ssd")
        test()
    }

    fun test() {

        var p1=Person("sss", 1)
        var p2=Person("sss", 1)


        var data1=TestData("1")
        var data2=TestData("1")
        var data1Copy=data1.copy()
        Log.d("t88",data1.name)
        Log.d("t88",data1Copy.name)
        Log.d("t88","data1==data1Copy : ${p1==p2} ")
        data1.name="4444"
        Log.d("t88",data1.name)
        Log.d("t88",data1Copy.name)
    }

    class Person(name:String,age:Int){
        var name:String
        init {
            this.name=name
        }
        var age=age

        operator fun component1():Int{
            return age;
        }

    }

    data class TestData(var name:String)

    class TestB(var name:String){}


}
