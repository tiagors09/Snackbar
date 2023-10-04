package br.com.tiagors09.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button buttonAbrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbrir = findViewById(R.id.buttonAbrir);

        buttonAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(
                        v,
                        "botão pressionado",
                        Snackbar.LENGTH_SHORT
                ).setAction("Confirmar", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        Toast
//                                .makeText(
//                                        getApplicationContext(),
//                                        "deu certo",
//                                        Toast.LENGTH_SHORT
//                        ).show();
                    }
                });

                snackbar.show();
            }
        });
    }
}