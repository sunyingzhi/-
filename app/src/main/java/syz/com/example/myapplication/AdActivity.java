package syz.com.example.myapplication;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AdActivity extends AppCompatActivity {
    TextView  tv_daojishi;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad);

        final TextView tv_daojishi=findViewById(R.id.tv_daojishi);

        new Thread(new Runnable() {
            @Override
            public void run() { for (int i=5;i>=0;i--){
                SystemClock.sleep(1000);
                tv_daojishi.setText("点击跳转"+i);

            }


            }
        }).start();




    }

}
