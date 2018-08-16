package br.ufrpe.brunna.adminnomades.pessoa.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import br.ufrpe.brunna.adminnomades.pessoa.dominio.Pessoa;
import br.ufrpe.brunna.adminnomades.pessoa.negocio.PessoaNegocio;

public class CadastrarPerfilActivity extends AppCompatActivity {
    private EditText nomeRegistro;
    private EditText telefoneRegistro;
    private EditText emailRegistro;
    private Button botaoCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_perfil);
        setTela();
        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrar();
            }
        });
    }
    private void setTela(){
        nomeRegistro = findViewById(R.id.nomeRegistroId);
        telefoneRegistro = findViewById(R.id.telefoneRegistroId);
        emailRegistro = findViewById(R.id.emailRegistroId);
        botaoCadastrar = findViewById(R.id.botaoRegistroId);
    }
    private void cadastrar(){
        PessoaNegocio pessoaNegocio = new PessoaNegocio();
        Pessoa pessoa = new Pessoa();
        String nome = nomeRegistro.getText().toString().trim();
        String telefone = telefoneRegistro.getText().toString().trim();
        String email = emailRegistro.getText().toString().trim();
        pessoa.setNome(nome);
        pessoa.setTelefone(telefone);
        pessoa.setEmail(email);
        finish();
    }
}
