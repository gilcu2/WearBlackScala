package com.gilcu2.wearblackscala

import android.app.Activity
import android.os.Bundle
import android.support.wearable.view.WatchViewStub
import android.view.View
import android.widget.{Button, TextView}

/**
 * Created by gilcu2 on 4/30/16.
 */
class MainActivityScala extends Activity {

  var count = 0
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val stub: WatchViewStub = findViewById(R.id.watch_view_stub).asInstanceOf[WatchViewStub]
    stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
      def onLayoutInflated(stub: WatchViewStub) {
        val text_counter = stub.findViewById(R.id.count_text).asInstanceOf[TextView]
        val hellow_button = stub.findViewById(R.id.hellow_button).asInstanceOf[Button]
        text_counter.append(" from Scala")
        hellow_button.setOnClickListener(new View.OnClickListener() {
          def onClick(v: View) = {
            count += 1
            text_counter.setText(count.toString)
          }
        })
      }
    })
  }
}
