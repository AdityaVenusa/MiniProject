package id.ac.polinema.miniproject.fragment;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.polinema.miniproject.R;

public class FragmentData extends Fragment {
   public FragmentData(){
   }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View Input = inflater.inflate(R.layout.fragment_data, container, false);
        return Input;
    }


}
