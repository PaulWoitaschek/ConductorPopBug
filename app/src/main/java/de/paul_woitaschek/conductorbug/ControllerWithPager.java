package de.paul_woitaschek.conductorbug;

import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;

/**
 * todo
 *
 * @author Paul Woitaschek
 */
public class ControllerWithPager extends Controller {

  @NonNull @Override protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
    ViewPager viewPager = new ViewPager(getActivity());

    YellowAdapter adapter = new YellowAdapter(this);
    viewPager.setAdapter(adapter);

    return viewPager;
  }
}
