package com.iothook.ele.iothook;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    public LoginFragment() {
        // Required empty public constructor
    }

    EditText email, pass;
    Button login;
    TextView register;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, container, false);

        email = (EditText) view.findViewById(R.id.editText2);
        pass = (EditText) view.findViewById(R.id.editText3);

        login = (Button) view.findViewById(R.id.button);

        register = (TextView) view.findViewById(R.id.textView3);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                AddChannelFragment addChannelFragment = new AddChannelFragment();
//                FragmentManager manager = getSupportFragmentManager();
//                manager.beginTransaction().replace(R.id.content_main, addChannelFragment, addChannelFragment.getTag()).commit();
            }
        });

        return view;
    }

}
