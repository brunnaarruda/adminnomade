package br.ufrpe.brunna.adminnomades.endereco.gui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import br.ufrpe.brunna.adminnomades.R;
import br.ufrpe.brunna.adminnomades.endereco.dominio.Endereco;
import br.ufrpe.brunna.adminnomades.infra.NomadesApp;

public class EnderecoAdapter extends ArrayAdapter<Endereco> {
    private List<Endereco> enderecoList;

    public EnderecoAdapter(@NonNull List<Endereco> enderecoList){
        super(NomadesApp.getContext(), R.layout.linha_endereco, enderecoList);
        this.enderecoList = enderecoList;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) NomadesApp.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.linha_endereco, parent, false);
        TextView enderecoRua = view.findViewById(R.id.enderecoRuaId);
        enderecoRua.setText(enderecoList.get(position).getRua());
        TextView enderecoNumero = view.findViewById(R.id.enderecoNumeroId);
        enderecoRua.setText(enderecoList.get(position).getNumero());
        TextView enderecoCidade = view.findViewById(R.id.enderecoCidadeId);
        enderecoCidade.setText(enderecoList.get(position).getCidade());
        return view;
    }
}