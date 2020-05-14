package id.ac.polinema.miniproject.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.ac.polinema.miniproject.R;

public class FragmentInput extends Fragment {

    public FragmentInput(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View Input = inflater.inflate(R.layout.fragment_input, container, false);
        return Input;
    }
}
