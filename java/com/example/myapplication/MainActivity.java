package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Exampleitem> examplelist;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private Button buttoni,buttond;
    private EditText editTexti,editTextd;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttond=findViewById(R.id.b2);
        buttoni=findViewById(R.id.b1);
        editTexti=findViewById(R.id.e1);
        editTextd=findViewById(R.id.e2);



 generateFake();
        //config for recyclerview
recyclerView=findViewById(R.id.recyclerview);
recyclerView.setHasFixedSize(true);

layoutManager=new LinearLayoutManager(this);
adapter=new ExampleAdapter(examplelist);

recyclerView.setLayoutManager(layoutManager);
recyclerView.setAdapter(adapter);
buttoni.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int position=Integer.parseInt(editTexti.getText().toString());
        addCard(position);
    }
});
buttond.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        int position=Integer.parseInt(editTextd.getText().toString());
        deletecard(position);
    }
});

    }
    public void generateFake(){
         examplelist=new ArrayList<>();
        examplelist.add(new Exampleitem(R.drawable.node,"clicked 1"));
        examplelist.add(new Exampleitem(R.drawable.oner,"clicked 2"));
        examplelist.add(new Exampleitem(R.drawable.twor,"clicked 3"));
        examplelist.add(new Exampleitem(R.drawable.threer,"clicked 4"));
        examplelist.add(new Exampleitem(R.drawable.fourr,"clicked 5"));
        examplelist.add(new Exampleitem(R.drawable.fiver,"clicked 6"));
    }
    public void addCard(int position){
        examplelist.add(position,new Exampleitem(R.drawable.node,"new card"));
        adapter.notifyItemInserted(position);
    }
    public void deletecard(int position){
        examplelist.remove(position);
        adapter.notifyItemRemoved(position);
    }
}
