package de.paul_woitaschek.conductorbug;

import android.support.annotation.NonNull;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.support.RouterPagerAdapter;


public class YellowAdapter extends RouterPagerAdapter {

  public YellowAdapter(@NonNull Controller host) {
    super(host);
  }

  @Override public void configureRouter(@NonNull Router router, int position) {
    if (!router.hasRootController()) {
      router.setRoot(RouterTransaction.with(new Yellow()));
    }
  }

  @Override public int getCount() {
    return 1;
  }
}
