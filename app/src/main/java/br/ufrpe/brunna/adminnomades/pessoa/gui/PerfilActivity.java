package br.ufrpe.brunna.adminnomades.pessoa.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R;
import android.view.View;
import android.widget.TextView;


public class PerfilActivity extends AppCompatActivity {
    private TextView nomePerfil;
    private TextView cpfPerfil;
    private TextView telefonePerfil;
    private TextView emailPerfil;
    private Button botaoEditar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        setTela();
        botaoEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editar();
            }
        });
    }

    private void setTela(){
        nomePerfil = findViewById(R.id.nomePerfilId);
        cpfPerfil = findViewById(R.id.cpfPerfilId);
        telefonePerfil = findViewById(R.id.telefonePerfilId);
        emailPerfil = findViewById(R.id.emailPerfilId);
        botaoEditar = findViewById(R.id.botaoEditarId);
    }

    public void editar(){
        startActivity(new Intent(PerfilActivity.this, EditarPerfilActivity.class));
        PerfilActivity.this.finish();
    }
}
