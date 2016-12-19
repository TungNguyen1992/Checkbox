package tung.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox cbxancom,cbxancam,cbxancuc;
    TextView txthienthi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbxancam= (CheckBox) findViewById(R.id.cbxancam);
        cbxancom= (CheckBox) findViewById(R.id.cbxancom);
        cbxancuc= (CheckBox) findViewById(R.id.cbxancuc);
        txthienthi= (TextView) findViewById(R.id.txthienthi);

        cbxancam.setOnClickListener(this);
        cbxancom.setOnClickListener(this);
        cbxancuc.setOnClickListener(this);

       /* cbxancuc.setOnCheckedChangeListener(this);
        cbxancom.setOnCheckedChangeListener(this);
        cbxancam.setOnCheckedChangeListener(this);*/
    }

    @Override
    public void onClick(View view) {
        int id= view.getId();
        boolean ischecked=((CheckBox)view).isChecked();
        if (id==R.id.cbxancam&&ischecked==true)
        {
            Toast.makeText(this, "Ăn cám", Toast.LENGTH_SHORT).show();
        }
        if (id==R.id.cbxancuc&&ischecked==true)
        {
            Toast.makeText(this, "Ăn cức", Toast.LENGTH_SHORT).show();
        } if (id==R.id.cbxancom&&ischecked==true)
        {
            Toast.makeText(this, "Ăn cơm", Toast.LENGTH_SHORT).show();
        }

    }

    /*@Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton==cbxancam&&b==true)
        {
            txthienthi.setText("Ăn cám");
            Toast.makeText(this, "Ăn cám", Toast.LENGTH_SHORT).show();
        }
        if (compoundButton==cbxancom&&b==true)
        {
            txthienthi.setText("Ăn cơm");
            Toast.makeText(this, "Ăn cơm", Toast.LENGTH_SHORT).show();
        }if (compoundButton==cbxancuc&&b==true)
        {
            txthienthi.setText("Ăn cức");
            Toast.makeText(this, "Ăn cức", Toast.LENGTH_SHORT).show();
        }
    }*/
}
