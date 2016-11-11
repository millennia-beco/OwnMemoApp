package jp.ac.kumamoto_u.abco.ownmemoapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by AbeKodai on 2016/11/10.
 */
public class EditActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.edit, menu);
        return true;
    }

}
