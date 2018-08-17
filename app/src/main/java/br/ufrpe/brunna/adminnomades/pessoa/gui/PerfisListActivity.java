package br.ufrpe.brunna.adminnomades.pessoa.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import br.ufrpe.brunna.adminnomades.R;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import br.ufrpe.brunna.adminnomades.infra.Sessao;
import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;
import br.ufrpe.brunna.adminnomades.pessoa.negocio.PessoaNegocio;

public class PerfisListActivity extends AppCompatActivity {
    private TextView titulo;
    private Button botaoNovoPerfil;
    private ListView lista;
    private List<Pessoa> listaPessoas;

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
        lista = findViewById(R.id.listPerfisId);
        PessoaNegocio pessoaNegocio = new PessoaNegocio();
        listaPessoas = pessoaNegocio.listarPessoas();
        PessoaAdapter adapter = new PessoaAdapter(listaPessoas);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                abrirPerfil(position);
            }
        });
    }
    private void abrirPerfil(int position){
        Sessao.instance.setPessoa(listaPessoas.get(position));
        startActivity(new Intent(PerfisListActivity.this,PerfilActivity.class));
        finish();
    }
}
