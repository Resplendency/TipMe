package com.rsp.tipme;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menu) {
      switch (menu.getItemId()) {
      case R.id.starttipme:
			Toast.makeText(this, "You selected the camera option", Toast.LENGTH_SHORT).show();
			break;   	  
      }

        getMenuInflater().inflate(R.menu.main, (Menu) menu);
        return true;
    }
}
   
