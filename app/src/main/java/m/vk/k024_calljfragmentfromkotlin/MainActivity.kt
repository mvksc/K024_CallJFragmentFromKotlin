package m.vk.k024_calljfragmentfromkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import m.vk.k024_calljfragmentfromkotlin.fragment.kotlin.MainFragment

class MainActivity : AppCompatActivity() {

    private var TAG_MainFragment : String = "TagMainFragment"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.frameMain,
            MainFragment.newInstance(),TAG_MainFragment).commit()
    }
}
