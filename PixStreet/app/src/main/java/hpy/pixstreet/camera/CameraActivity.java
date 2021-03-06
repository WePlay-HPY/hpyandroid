package hpy.pixstreet.camera;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import hpy.pixstreet.R;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        Log.d("PixStreet","CameraActivity");

        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }
    }

}
