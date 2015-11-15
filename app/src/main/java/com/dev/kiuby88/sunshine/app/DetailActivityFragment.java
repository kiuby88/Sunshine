package com.dev.kiuby88.sunshine.app;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        Intent intent= getActivity().getIntent();
        String forecast = intent.getStringExtra(Intent.EXTRA_TEXT);

        TextView textViewForecast = (TextView)view.findViewById(R.id.detail_forecast);
        textViewForecast.setText(forecast);

        return view;

    }
}
