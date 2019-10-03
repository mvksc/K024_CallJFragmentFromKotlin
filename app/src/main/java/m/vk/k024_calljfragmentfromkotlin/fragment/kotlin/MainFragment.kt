package m.vk.k024_calljfragmentfromkotlin.fragment.kotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import m.vk.k024_calljfragmentfromkotlin.R
import m.vk.k024_calljfragmentfromkotlin.databinding.FragmentMainBinding
import m.vk.k024_calljfragmentfromkotlin.utils.java.JUtils
import m.vk.k024_calljfragmentfromkotlin.fragment.java.OneFragment
import m.vk.k024_calljfragmentfromkotlin.fragment.java.ThreeFragment
import m.vk.k024_calljfragmentfromkotlin.fragment.java.TwoFragment

class MainFragment : Fragment() {
    lateinit var binding : FragmentMainBinding
    private var TAG_OneFragment : String = "TagOneFragment"
    private var TAG_TwoFragment : String = "TagTwoFragment"
    private var TAG_ThreeFragment : String = "TagThreeFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_main, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //call fragment java from kotlin
        binding.tvOne.setOnClickListener {
            //call fun Java(JUtils.onCheckFragmentIsShow) from kotlin
            if (JUtils.onCheckFragmentIsShow(R.id.frameGroup,childFragmentManager).trim() != TAG_OneFragment){
                childFragmentManager.beginTransaction().replace(R.id.frameGroup,
                    OneFragment.newInstance(),TAG_OneFragment).commit()
            }
        }

        //call fragment java from kotlin
        binding.tvTwo.setOnClickListener {
            //call fun Java(JUtils.onCheckFragmentIsShow) from kotlin
            if (JUtils.onCheckFragmentIsShow(R.id.frameGroup,childFragmentManager).trim() != TAG_TwoFragment){
                childFragmentManager.beginTransaction().replace(R.id.frameGroup,
                    TwoFragment.newInstance(),TAG_TwoFragment).commit()
            }
        }

        //call fragment java from kotlin
        binding.tvThree.setOnClickListener {
            //call fun Java(JUtils.onCheckFragmentIsShow) from kotlin
            if (JUtils.onCheckFragmentIsShow(R.id.frameGroup,childFragmentManager).trim() != TAG_ThreeFragment){
                childFragmentManager.beginTransaction().replace(R.id.frameGroup,
                    ThreeFragment.newInstance(),TAG_ThreeFragment).commit()
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment().apply {}
    }
}
