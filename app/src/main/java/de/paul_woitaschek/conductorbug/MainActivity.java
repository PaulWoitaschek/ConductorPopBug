package de.paul_woitaschek.conductorbug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.changehandler.FadeChangeHandler;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ViewGroup container = (ViewGroup) findViewById(android.R.id.content);
    Router router = Conductor.attachRouter(this, container, savedInstanceState);
    if (!router.hasRootController()) {
      router.setRoot(RouterTransaction.with(new ControllerWithPager()));
    }

    RouterTransaction greenTransaction = RouterTransaction.with(new Green())
        .pushChangeHandler(new FadeChangeHandler());
    router.pushController(greenTransaction);
  }
}
