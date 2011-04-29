package com.aremaitch.testandroidongit;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by IntelliJ IDEA.
 * User: roger
 * Date: 4/28/11
 * Time: 11:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class StartActivity extends Activity {
    private static final int MENU_OPTIONS = Menu.FIRST;
    private static final int MENU_SETTINGS = Menu.FIRST + 1;
    private static final int MENU_STUFF = Menu.FIRST + 2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
    }

    @Override
    protected void onPause() {
        super.onPause();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    protected void onResume() {
        super.onResume();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, MENU_OPTIONS, Menu.NONE, "Options");
        menu.add(Menu.NONE, MENU_SETTINGS, Menu.NONE, "Settings");
        menu.add(Menu.NONE, MENU_STUFF, Menu.NONE, "Stuff");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case MENU_OPTIONS:
                Toast.makeText(this, "Options", Toast.LENGTH_SHORT).show();
                break;

            case MENU_SETTINGS:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;

            case MENU_STUFF:
                Toast.makeText(this, "Stuff", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "Doh!", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}