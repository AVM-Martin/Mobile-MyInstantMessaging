package id.my.avmmartin.myinstantmessaging.data.db.factory;

import java.util.Vector;

import id.my.avmmartin.myinstantmessaging.data.db.model.ChatOverview;

public class ChatOverviewFactory extends Vector<ChatOverview> {
    private static ChatOverviewFactory instance = new ChatOverviewFactory();

    private ChatOverviewFactory() {
        super.add(new ChatOverview(
            "https://www.shareicon.net/data/128x128/2016/05/26/771203_man_512x512.png",
            "James",
            "Thank you! That was very helpful"
        ));
        super.add(new ChatOverview(
            "https://vectorified.com/images/no-profile-picture-icon-13.png",
            "Will Kenny",
            "I know... I'm trying to get the funds."
        ));
        super.add(new ChatOverview(
            "https://miro.medium.com/max/128/1*hh9ZE_Z3i-BOG0LZiH0K0w.png",
            "Beth Williams",
            "I'm looking for tips around capturing the milky way. I have a 6D with a 24-100mm..."
        ));
        super.add(new ChatOverview(
            "https://cutewallpaper.org/21/sad-aesthetic-profile-pictures/ddZdZdLdSdSd-ddSddaddZdddSddZdTdrzt-loco.pfp-.jpg",
            "Rev Shawn",
            "Wanted to ask if you're available for a portrait shoot next week."
        ));
    }
    public static ChatOverviewFactory get_instance() {
        return instance;
    }

    public ChatOverview set(int index, ChatOverview element) {
        // do nothing
        return element;
    }
    public boolean add(ChatOverview chatOverview) {
        // do nothing
        return false;
    }
}
