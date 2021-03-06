package br.ufrpe.brunna.adminnomades.pessoa.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import br.ufrpe.brunna.adminnomades.R;
import br.ufrpe.brunna.adminnomades.endereco.gui.EnderecoListActivity;
import br.ufrpe.brunna.adminnomades.infra.Sessao;
import br.ufrpe.brunna.adminnomades.pessoa.negocio.PessoaNegocio;
import android.view.View;
import android.widget.SimpleCursorTreeAdapter;
import android.widget.TextView;
import android.widget.Button;


public class PerfilActivity extends AppCompatActivity {
    private TextView nomePerfil;
    private TextView telefonePerfil;
    private TextView emailPerfil;
    private Button botaoEditar;
    private Button botaoDeletar;
    private Button botaoVerEndereco;

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
        botaoDeletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deletar();
            }
        });
        botaoVerEndereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(PerfilActivity.this, EnderecoListActivity.class));
            finish();
            }
        });

    }

    private void setTela(){
        nomePerfil = findViewById(R.id.nomePerfilId);
        telefonePerfil = findViewById(R.id.telefonePerfilId);
        emailPerfil = findViewById(R.id.emailPerfilId);
        botaoEditar = findViewById(R.id.botaoAlterarPerfilId);
        botaoDeletar = findViewById(R.id.botaoDeletarPerfilId);
        botaoVerEndereco = findViewById(R.id.botaoVerEnderecoId);
        nomePerfil.setText(Sessao.instance.getPessoa().getNome());
        telefonePerfil.setText(Sessao.instance.getPessoa().getTelefone());
        emailPerfil.setText(Sessao.instance.getPessoa().getEmail());
    }
    public void editar(){
        startActivity(new Intent(PerfilActivity.this, EditarPerfilActivity.class));
        finish();
    }
    public void deletar(){
        PessoaNegocio pessoaNegocio = new PessoaNegocio();
        pessoaNegocio.deletarPessoa(Sessao.instance.getPessoa());
        onBackPressed();
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(PerfilActivity.this,PerfisListActivity.class));
        Sessao.instance.resetPessoa();
        finish();
    }
}
