package com.example.jnewel200.practicewithmdesigntabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jnewel200 on 11/11/2015.
 */
public class MovieListFragment extends Fragment {
    public MovieListFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_movie_list, container, false);

        ListView listView = (ListView)rootView.findViewById(R.id.list_view_movie);

        List<String> staticItems = Arrays.asList(
                new String[] {"Star Trek","The Big Lebowski","A Clockwork Orange","Hamburger Hill","The Package","The Recruit"}
        );
        ArrayAdapter<String> adapter = new ArrayAdapter<> (getActivity(),
                android.R.layout.simple_list_item_1,
                staticItems);
        listView.setAdapter(adapter);
        return rootView;
    }
}
