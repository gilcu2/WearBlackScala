package com.gilcu2.wearblackscala

import android.app.Activity
import android.os.Bundle
import android.support.wearable.view.WatchViewStub
import android.widget.TextView

/**
 * Created by gilcu2 on 4/30/16.
 */
class MainActivityScala extends Activity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val stub: WatchViewStub = findViewById(R.id.watch_view_stub).asInstanceOf[WatchViewStub]
    stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
      def onLayoutInflated(stub: WatchViewStub) {
        val mTextView = stub.findViewById(R.id.text).asInstanceOf[TextView]
      }
    })
  }
}
