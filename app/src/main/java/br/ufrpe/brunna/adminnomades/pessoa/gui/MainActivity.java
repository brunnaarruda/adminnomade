package br.ufrpe.brunna.adminnomades.pessoa.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import br.ufrpe.brunna.adminnomades.R;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView titulo;
    private Button botaoVerNomades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTela();
        botaoVerNomades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iniciarApp();
            }
        });
    }
    private void setTela(){
        titulo = findViewById(R.id.tituloInicioId);
        botaoVerNomades = findViewById(R.id.botaoVerNomadesId);
    }
    private void iniciarApp(){
        startActivity(new Intent(MainActivity.this, PerfisListActivity.class));
        finish();
    }

}
