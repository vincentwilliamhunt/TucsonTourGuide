package com.example.android.tucson;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DineFragment extends Fragment {


    public DineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.topic_list, container, false);

        final ArrayList<Topic> topics = new ArrayList<Topic>();

        topics.add(new Topic(R.string.dine_barrio_brewery, R.drawable.dine_barrio, R.string.dine_barrio_brewery_desc));
        topics.add(new Topic(R.string.dine_cafe_poca_cosa, R.drawable.dine_cafe_poca_cosa, R.string.dine_cafe_poca_cosa_desc));
        topics.add(new Topic(R.string.dine_el_charro, R.drawable.dine_el_charro, R.string.dine_el_charro_desc));

        TopicAdapter adapter = new TopicAdapter(getActivity(), topics);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
