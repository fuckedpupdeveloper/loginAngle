package ir.mhkz.loginandsignup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class joshi_info extends AppCompatActivity {
    LinearLayout apply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joshi_info);


        apply = findViewById(R.id.joshi_apply);
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Request send!" , Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
