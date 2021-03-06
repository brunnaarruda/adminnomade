package br.ufrpe.brunna.adminnomades.pessoa.gui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.ufrpe.brunna.adminnomades.R;
import br.ufrpe.brunna.adminnomades.infra.Sessao;
import br.ufrpe.brunna.adminnomades.pessoa.negocio.PessoaNegocio;

public class EditarPerfilActivity extends AppCompatActivity {
    private EditText nomeEditar;
    private EditText telefoneEditar;
    private EditText emailEditar;
    private Button botaoAlterar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);
        setTela();
        botaoAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alterarPessoa();
            }
        });
    }
    private void setTela(){
        nomeEditar = findViewById(R.id.nomeEditarId);
        telefoneEditar = findViewById(R.id.telefoneEditarId);
        emailEditar = findViewById(R.id.emailEditarId);
        botaoAlterar = findViewById(R.id.botaoAlterarPerfilId);
        nomeEditar.setText(Sessao.instance.getPessoa().getNome());
        telefoneEditar.setText(Sessao.instance.getPessoa().getTelefone());
        emailEditar.setText(Sessao.instance.getPessoa().getEmail());
    }
    private void alterarPessoa(){
        PessoaNegocio pessoaNegocio = new PessoaNegocio();
        Sessao.instance.getPessoa().setNome(nomeEditar.getText().toString().trim());
        Sessao.instance.getPessoa().setTelefone(telefoneEditar.getText().toString().trim());
        Sessao.instance.getPessoa().setEmail(emailEditar.getText().toString().trim());
        pessoaNegocio.editarPessoa(Sessao.instance.getPessoa());
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(EditarPerfilActivity.this,PerfilActivity.class));
        finish();
    }
}