package br.ufrpe.brunna.adminnomades.pessoa.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import br.ufrpe.brunna.adminnomades.R;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;
import br.ufrpe.brunna.adminnomades.pessoa.negocio.PessoaNegocio;

public class PerfisListActivity extends AppCompatActivity {
    private TextView titulo;
    private Button botaoNovoPerfil;
    private ListView listaPerfis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfis_list);
        setTela();
        botaoNovoPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PerfisListActivity.this, CadastrarPerfilActivity.class));
                finish();
            }
        });
    }
    private void setTela(){
        titulo = findViewById(R.id.tituloId);
        botaoNovoPerfil = findViewById(R.id.botaoNovoPerfilId);
        listaPerfis = findViewById(R.id.listPerfisId);
    }
}
