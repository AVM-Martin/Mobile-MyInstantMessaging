package id.my.avmmartin.myinstantmessaging.data.db;

import android.content.Context;

import id.my.avmmartin.myinstantmessaging.data.db.factory.ChatOverviewFactory;
import id.my.avmmartin.myinstantmessaging.data.db.model.ChatOverview;

public class ChatOverviewController {
    private Context context;

    public ChatOverviewController(Context _context) {
        context = _context;
    }

    public ChatOverview get_chat_overview_by_position(int position) {
        return ChatOverviewFactory.get_instance().get(position);
    }

    public int size() {
        return ChatOverviewFactory.get_instance().size();
    }
}
