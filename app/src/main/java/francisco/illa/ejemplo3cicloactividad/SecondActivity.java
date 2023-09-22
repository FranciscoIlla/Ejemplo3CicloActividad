package francisco.illa.ejemplo3cicloactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button btnAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        btnAbrir = findViewById(R.id.btnAbrirSecond);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
        Log.e("ESTADOS","1- Estoy en el método create SECOND");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("ESTADOS","7- Estoy en el método restart SECOND");
        this.onDestroy();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("ESTADOS","6- Estoy en el metodo destroy SECOND");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("ESTADOS","5- Estoy en el metodo Stop SECOND");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("ESTADOS","4- Estoy en el metodo Pause SECOND");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("ESTADOS","3- Estoy en el metodo Resume SECOND");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("ESTADOS","2- Estoy en el metodo Start SECOND");

    }

}