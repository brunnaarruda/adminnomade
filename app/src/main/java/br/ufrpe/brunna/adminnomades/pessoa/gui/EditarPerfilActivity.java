package br.ufrpe.brunna.adminnomades.pessoa.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R;
import android.widget.Button;
import android.widget.EditText;

import br.ufrpe.brunna.adminnomades.infra.Sessao;

public class EditarPerfilActivity extends AppCompatActivity {
    private EditText nomeEditar;
    private EditText telefoneEditar;
    private EditText emailEditar;
    private EditText cpfEditar;
    private Button alterar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);
        setTela();
    private void setTela(){
            nomeEditar = findViewById(R.id.nomeId);
            telefoneEditar = findViewById(R.id.telefonePessoaId);
            emailEditar = findViewById(R.id.emailPessoaId);
            cpfEditar = findViewById(R.id.cpfPessoaId);
            alterar = findViewById(R.id.btAlterarId);
            setPessoa();
    }
    private void setPessoa(){
        Pessoa pessoa = Sessao.instance.getPessoa();
        alterarNome = setTex
        }

}
