package com.example.praneshraagav.calc;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends Activity implements View.OnClickListener {
String s="";  int result,mValueOne,mValueTwo;
    boolean multiplication,addition,subtract,division;
char c=' ';
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(this);
        Button b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(this);
        Button b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(this);
        Button b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(this);
        Button b5=(Button)findViewById(R.id.b5);
        b5.setOnClickListener(this);
        Button b6=(Button)findViewById(R.id.b6);
        b6.setOnClickListener(this);
        Button b7=(Button)findViewById(R.id.b7);
        b7.setOnClickListener(this);
        Button b8=(Button)findViewById(R.id.b8);
        b8.setOnClickListener(this);
        Button b9=(Button)findViewById(R.id.b9);
        b9.setOnClickListener(this);
        Button b0=(Button)findViewById(R.id.b0);
        b0.setOnClickListener(this);
        Button beq=(Button)findViewById(R.id.beq);
        beq.setOnClickListener(this);
        Button bp=(Button)findViewById(R.id.bp);
        bp.setOnClickListener(this);
        Button bm=(Button)findViewById(R.id.bm);
        bm.setOnClickListener(this);
        Button bs=(Button)findViewById(R.id.bs);
        bs.setOnClickListener(this);
        Button bd=(Button)findViewById(R.id.bd);
        bd.setOnClickListener(this);
        Button bdel=(Button)findViewById(R.id.bdel);
        bdel.setOnClickListener(this);
        Button bdot=(Button)findViewById(R.id.bdot);
        bdot.setOnClickListener(this);
        Button bclr=(Button)findViewById(R.id.bclr);
        bclr.setOnClickListener(this);
         tv1=(TextView)findViewById(R.id.tv1);



    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.b0:
            case R.id.b1:
            case R.id.b2:
            case R.id.b3:
            case R.id.b4:
            case R.id.b5:
            case R.id.b6:
            case R.id.b7:
            case R.id.b8:
            case R.id.b9:


                String in = ((Button) v).getText().toString();
                if (s.equals("0"))
                {
                    s= in;
                }
                else
                {
                    s+=in;
                }
                tv1.setText(s);
                if(c == '=')
                {
                    result=0;
                    c =' ';
                }
                break;
            case R.id.bdel:
                s = tv1.getText().toString();
                s = s.substring(0, s.length() - 1);
                tv1.setText(s);
                break;

            case R.id.bp:
                tv1.setText(s+'+');
                compute();
                c = '+';
                break;
            case R.id.bs:
                compute();
                c = '-';
                break;
            case R.id.bd:
                compute();
                c = '/';
                break;
            case R.id.bm:
                compute();
                c = '*';
                break;
            case R.id.beq:
                compute();
                c = '=';
                break;
            case R.id.bclr:
                result = 0;
                s = "0";
                c = ' ';
                tv1.setText("0");
                break;
        }
    }

    private void compute()
    {
        int inNum = Integer.parseInt(s);
        s = "0";
        if (c == ' ')
        {
            result = inNum;
        }
        else if (c == '+')
        {
            result += inNum;
        }
        else if (c == '-')
        {
            result -= inNum;
        }
        else if (c == '*')
        {
            result *= inNum;
        }
        else if (c == '/')
        {
            result /= inNum;
        }
        else if (c == '=')
        {
            // Keep the result for the next operation
        }
        tv1.setText(String.valueOf(result));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
