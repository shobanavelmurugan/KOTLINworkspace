package mohan.com.mykotlinexperiments.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mohan.com.mykotlinexperiments.basictypes.BasicDataTypes
import mohan.com.mykotlinexperiments.R

class MainActivity : AppCompatActivity() {
    var mAppName :String  = "\tExercise:"
    var mRefernceLink :String = "https://www.tutorialspoint.com/kotlin/kotlin_basic_types.htm"
    var mDocReferenceLink :String = "https://kotlinlang.org/docs/reference/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AccessMyExps()

    }

    fun AccessMyExps(){
        BasicDataTypes().DataTypeFunctions()
        showReferences()
        println("<=------------**********------------=>")
    }


    fun showReferences(){
        println("App Reference Link:"+mRefernceLink)
        println("Document Reference Link:"+mDocReferenceLink)
    }
}