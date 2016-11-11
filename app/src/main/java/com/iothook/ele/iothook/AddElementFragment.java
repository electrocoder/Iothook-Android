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
public class AddElementFragment extends Fragment {


    public AddElementFragment() {
        // Required empty public constructor
    }

    Spinner kanal_adi, graphic, element_type;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_add_element, container, false);

        kanal_adi = (Spinner) view.findViewById(R.id.kanal_adi);
        graphic = (Spinner) view.findViewById(R.id.graphic);
        element_type = (Spinner) view.findViewById(R.id.element_type);

        ArrayAdapter<CharSequence> kanal_adi_array = ArrayAdapter.createFromResource(getContext(), R.array.method_array, R.layout.spinner_item);
        kanal_adi_array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        kanal_adi.setAdapter(kanal_adi_array);

        ArrayAdapter<CharSequence> graphic_array = ArrayAdapter.createFromResource(getContext(), R.array.graphic_array, R.layout.spinner_item);
        graphic_array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        graphic.setAdapter(graphic_array);

        ArrayAdapter<CharSequence> element_type_array = ArrayAdapter.createFromResource(getContext(), R.array.element_type_array, R.layout.spinner_item);
        element_type_array.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        element_type.setAdapter(element_type_array);


        return view;
    }

}
