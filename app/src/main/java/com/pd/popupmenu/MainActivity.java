package com.pd.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn_popup;
LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (LinearLayout)findViewById( R.id.line );


            btn_popup = (Button)findViewById(R.id.button);
            btn_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu pop = new PopupMenu(MainActivity.this,btn_popup);
                pop.getMenuInflater().inflate(R.menu.popupmenu,pop.getMenu());

                pop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(MainActivity.this, "Option ckicked is:"+menuItem.getTitle(), Toast.LENGTH_SHORT).show();

                        return true;
                    }
                });
                pop.show();
            }
        });
    }

    public void clickMe1(MenuItem item){
        l.setBackgroundColor( Color.GREEN );
    }
    public void clickMe2(MenuItem item){
        l.setBackgroundColor( Color.YELLOW );
    }
    public void clickMe3(MenuItem item){
        l.setBackgroundColor( Color.BLUE );
    }
    public void clickMe4(MenuItem item){
        l.setBackgroundColor( Color.MAGENTA );
    }

}