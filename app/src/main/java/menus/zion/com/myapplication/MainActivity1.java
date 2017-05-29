package menus.zion.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
//Test for pull
public class MainActivity1 extends AppCompatActivity {

    int r = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        ((Button)findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showView();
            }
        });
    }

    private void showView()
    {

        if(r ==0) {
            r = 1;
            ((ImageView) findViewById(R.id.img)).setVisibility(View.VISIBLE);
        }else{
            r = 0;
            ((ImageView) findViewById(R.id.img)).setVisibility(View.GONE);
        }
    }
}
