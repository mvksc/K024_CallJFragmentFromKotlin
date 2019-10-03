package m.vk.k024_calljfragmentfromkotlin.utils.kotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.random.Random

class KUtils {
    companion object{
        fun onCheckFragmentIsShow(idFragment : Int,fm: FragmentManager): String {
            var strTag : String = ""
            var f = fm.findFragmentById(idFragment)
            if(f != null){
                strTag = f.tag!!
            }
            return strTag
        }

        fun onFragmentIsShow(idFragment : Int,fm: FragmentManager): Fragment? {
            var f = fm.findFragmentById(idFragment)
            if(f != null){
                return f
            }
            return null
        }

        fun random(): String{
            val num = Random.nextInt(1000,1000000)
            val df = DecimalFormat("#,###.##")
            //df.roundingMode = RoundingMode.UP
            return df.format(num)
        }
    }
}