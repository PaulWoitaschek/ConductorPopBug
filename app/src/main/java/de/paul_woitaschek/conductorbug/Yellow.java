package de.paul_woitaschek.conductorbug;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;


public class Yellow extends Controller {

  @NonNull @Override protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
    View view = new View(getActivity());
    view.setBackgroundColor(Color.YELLOW);
    return view;
  }
}
