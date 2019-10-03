package m.vk.k024_calljfragmentfromkotlin.utils.java;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class JUtils {
    public static String onCheckFragmentIsShow(int idFragment, FragmentManager fm){
        String strTag = "";
        Fragment f = fm.findFragmentById(idFragment);
        if (f != null){
            strTag = f.getTag();
        }
        return strTag;
    }

    public static Fragment onFragmentIsShow(int idFragment, FragmentManager fm){
        Fragment f = fm.findFragmentById(idFragment);
        if (f != null){
            return f;
        }
        return null;
    }
}
