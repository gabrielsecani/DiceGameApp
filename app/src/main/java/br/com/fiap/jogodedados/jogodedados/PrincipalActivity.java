package br.com.fiap.jogodedados.jogodedados;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PrincipalActivity extends AppCompatActivity {

    private Random r = new Random();
    private ImageButton imgBtnJogador;
    private ImageView imgBtnComputador;
    private TextView txtResultado;
    private int[] imageViews = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        imageViews = new int[]{R.drawable.dado1,
                R.drawable.dado2,
                R.drawable.dado3,
                R.drawable.dado4,
                R.drawable.dado5};
    }

    public void jogar(View v) {
        imgBtnJogador = (ImageButton) findViewById(R.id.imgBtnJogador);
        imgBtnComputador = (ImageView) findViewById(R.id.imgBtnComputador);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        r.nextInt();
        int nJogador = r.nextInt(5);
        imgBtnJogador.setImageResource(imageViews[nJogador]);

        int nComputador = r.nextInt(5);
        imgBtnComputador.setImageResource(imageViews[nComputador]);

        if (nJogador == nComputador) {
            txtResultado.setText(R.string.dados_winnerdeuce);
        } else if (nJogador > nComputador) {
            txtResultado.setText(R.string.dados_winnerplayer);
        } else {
            txtResultado.setText(R.string.dados_winnercomputer);
        }

    }

}
