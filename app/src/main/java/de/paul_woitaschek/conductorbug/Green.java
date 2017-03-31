package de.paul_woitaschek.conductorbug;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.bluelinelabs.conductor.Controller;


public class Green extends Controller {

  @NonNull @Override protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
    Button popButton = new Button(getActivity());
    popButton.setText("POP");
    popButton.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        getRouter().popController(Green.this);
      }
    });

    FrameLayout frameLayout = new FrameLayout(getActivity());
    frameLayout.setBackgroundColor(Color.GREEN);
    FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    params.gravity = Gravity.CENTER;
    frameLayout.addView(popButton, params);
    return frameLayout;
  }
}
