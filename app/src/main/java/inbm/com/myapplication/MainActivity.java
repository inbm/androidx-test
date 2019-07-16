package inbm.com.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        MyViewModel vm = ViewModelProviders.of(this).get(MyViewModel.class);
        vm.getUsers().observe(this, users ->{

        });
    }
}
