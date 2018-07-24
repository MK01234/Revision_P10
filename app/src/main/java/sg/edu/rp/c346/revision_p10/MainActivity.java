package sg.edu.rp.c346.revision_p10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvemployee ;
    ArrayList<contactList> alemplyee;
    CustomAdapter caemployee;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        lvemployee = findViewById(R.id.listViewem);

        alemplyee = new ArrayList<>();

        contactList contactList1 = new contactList("Mary", "+65", 65442334);
        contactList contactList2 = new contactList("Ken", "+65",  97442437);
        alemplyee.add(contactList1);
        alemplyee.add(contactList2);

        caemployee = new CustomAdapter(this, R.layout.contact, alemplyee);

        lvemployee.setAdapter((ListAdapter) caemployee);


    }
}
