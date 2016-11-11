package com.iothook.ele.iothook;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddChannelFragment extends Fragment {


    public AddChannelFragment() {
        // Required empty public constructor
    }

    Spinner method, enctype, device;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add_channel, container, false);

        method = (Spinner) view.findViewById(R.id.method);
        enctype = (Spinner) view.findViewById(R.id.enctype);
        device = (Spinner) view.findViewById(R.id.device);

        ArrayAdapter<CharSequence> method_array = ArrayAdapter.createFromResource(getContext(), R.array.method_array, R.layout.spinner_item);
        method_array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        method.setAdapter(method_array);

        ArrayAdapter<CharSequence> enctype_array = ArrayAdapter.createFromResource(getContext(), R.array.enctype_array, R.layout.spinner_item);
        enctype_array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        enctype.setAdapter(enctype_array);

        ArrayAdapter<CharSequence> device_array = ArrayAdapter.createFromResource(getContext(), R.array.device_array, R.layout.spinner_item);
        device_array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        device.setAdapter(device_array);

        return view;
    }

}
