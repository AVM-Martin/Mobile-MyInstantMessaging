package id.my.avmmartin.myinstantmessaging.data.db.model;

public class ChatOverview {
    private String picture_url;
    private String chat_title;
    private String chat_overview;

    public ChatOverview(String _picture_url, String _chat_title, String _chat_overview) {
        picture_url = _picture_url;
        chat_title = _chat_title;
        chat_overview = _chat_overview;
    }

    public String get_picture_url() {
        return picture_url;
    }

    public String get_chat_title() {
        return chat_title;
    }

    public String get_chat_overview() {
        return chat_overview;
    }
}
