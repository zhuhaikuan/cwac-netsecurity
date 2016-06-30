package com.commonsware.cwac.netseccfg.test.pub;

import android.os.Build;
import com.commonsware.cwac.netseccfg.TrustManagerBuilder;

public class UseDefaultTest extends SimpleHTTPSTest {
  @Override
  protected TrustManagerBuilder getBuilder() throws Exception {
    return(new TrustManagerBuilder().useDefault());
  }

  // on N+, fail because of manifest config
  @Override
  protected boolean isPositiveTest() {
    return(Build.VERSION.SDK_INT<Build.VERSION_CODES.N);
  }
}