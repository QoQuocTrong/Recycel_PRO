package l.com.recycel_pro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import l.com.recycel_pro.adapter.PlaceAdapter;
import l.com.recycel_pro.model.Place;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPlace;
    private List<Place> places;
    private PlaceAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        recyclerPlace = findViewById(R.id.recylerView);
        places = new ArrayList<>();
        adapter = new PlaceAdapter(places);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(this);
        recyclerPlace.setLayoutManager(layoutManager1);
        recyclerPlace.setAdapter(adapter);
        fakeData();
    }
    private void fakeData() {

        for (int i = 0; i < 40; i++) {
            Place place = new Place("", "Dark River " + i, "");
            places.add(place);
        }
        adapter.notifyDataSetChanged();
    }

}
