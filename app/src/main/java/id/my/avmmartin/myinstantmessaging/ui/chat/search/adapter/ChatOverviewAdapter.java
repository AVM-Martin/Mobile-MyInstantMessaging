package id.my.avmmartin.myinstantmessaging.ui.chat.search.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import id.my.avmmartin.myinstantmessaging.R;
import id.my.avmmartin.myinstantmessaging.data.db.ChatOverviewController;
import id.my.avmmartin.myinstantmessaging.data.db.model.ChatOverview;

public class ChatOverviewAdapter extends RecyclerView.Adapter<ChatOverviewViewHolder> {
    @NonNull
    @Override
    public ChatOverviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.adapter_chat_overview, parent, false);

        return new ChatOverviewViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatOverviewViewHolder holder, int position) {
        ChatOverview chatOverview = chatoverview_db.get_chat_overview_by_position(position);

        Picasso.get().load(chatOverview.get_picture_url()).into(holder.iv_profilepicture);
        holder.tv_chattitle.setText(chatOverview.get_chat_title());
        holder.tv_chatoverview.setText(chatOverview.get_chat_overview());
    }

    @Override
    public int getItemCount() {
        return chatoverview_db.size();
    }

    private Context context;
    private ChatOverviewController chatoverview_db;

    public ChatOverviewAdapter(Context _context) {
        context = _context;
        chatoverview_db = new ChatOverviewController(_context);
    }
}
