package com.acme.dennis.circleindicator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by DENNIS on 05/07/2015.
 */
public class LayoutDos extends Fragment {


    public static LayoutDos newInstance(){
        LayoutDos dos=new LayoutDos();
        return dos;
    }

    public LayoutDos(){

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root=inflater.inflate(R.layout.layout_dos,null);
        return root;
    }
}
