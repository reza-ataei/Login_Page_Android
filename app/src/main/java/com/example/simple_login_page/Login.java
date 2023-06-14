package com.example.simple_login_page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Login extends Fragment {

    TextView tv_register;
    Button btn_submit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.login_activity , container , false);



        tv_register = view.findViewById(R.id.TextButton_register_Login);
        btn_submit = view.findViewById(R.id.Button_submit_Login);

        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Register register = new Register();
                getParentFragmentManager().beginTransaction().addToBackStack(null)
                        .replace(R.id.frameLayout , register).commit();

                // your code ...

            }
        });

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // your code ...
            }
        });

        return view;

    }
}
