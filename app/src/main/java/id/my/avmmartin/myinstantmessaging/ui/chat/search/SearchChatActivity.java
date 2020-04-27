package id.my.avmmartin.myinstantmessaging.ui.chat.search;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import id.my.avmmartin.myinstantmessaging.R;
import id.my.avmmartin.myinstantmessaging.ui.chat.search.adapter.ChatOverviewAdapter;

public class SearchChatActivity extends AppCompatActivity {
    private RecyclerView rv_chatlist;
    private ChatOverviewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_search_chat);
        super.onCreate(savedInstanceState);

        init_components();
        load_data();
    }

    private void init_components() {
        rv_chatlist = findViewById(R.id.searchchat_rv_chatlist);
        adapter = new ChatOverviewAdapter(this);
    }

    private void load_data() {
        rv_chatlist.setLayoutManager(new LinearLayoutManager(this));
        rv_chatlist.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        adapter.notifyDataSetChanged();
        super.onResume();
    }
}
