package menus.zion.com.myapplication;
//test
<<<<<<< HEAD
//test123456 sdfsdf
=======
>>>>>>> e24ac864db6b018fbc8b06510ff1069570e8a19d
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int r = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button)findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(MainActivity.this,MainActivity1.class));
            }
        });
    }

}
