package id.sch.smktelkom_mlg.httpwww.fragment_julian.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.sch.smktelkom_mlg.httpwww.fragment_julian.R;

/**
 * Created by M12RjUL14n on 12/03/2018.
 */

public class KoalaFragment extends Fragment {
    public KoalaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView;
        rootView = inflater.inflate(R.layout.activity_multiple_koala,
                container, false);
        return rootView;
    }
}