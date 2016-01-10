package pe.com.tkongr.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/46",
                "Weds - Cloudy - 72/63",
                "Thurds - Rainy - 64/51",
                "Fri - Foggy - 70/46",
                "Sat - Sunny - 76/68"
        };

        List<String> weekForecast = new ArrayList<>(Arrays.asList(forecastArray));
        
       /* ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Today - Sunny - 88/63");
        arrayList.add("Tomorrow - Foggy - 70/46");
        arrayList.add("Weds - Cloudy - 72/63");
        arrayList.add("Thurds - Rainy - 64/51");
        arrayList.add("Fri - Foggy - 70/46");
        arrayList.add("Sat - Sunny - 76/68");*/


        return view;
    }
}
