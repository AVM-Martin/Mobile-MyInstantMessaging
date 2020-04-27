package id.my.avmmartin.myinstantmessaging.ui.chat.search.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import id.my.avmmartin.myinstantmessaging.R;

class ChatOverviewViewHolder extends RecyclerView.ViewHolder {
    ImageView iv_profilepicture;
    TextView tv_chattitle;
    TextView tv_chatoverview;

    ChatOverviewViewHolder(@NonNull View itemView) {
        super(itemView);

        init_components();
    }

    private void init_components() {
        iv_profilepicture = itemView.findViewById(R.id.adapter_searchchat_iv_profilepicture);
        tv_chattitle = itemView.findViewById(R.id.adapter_searchchat_tv_chattitle);
        tv_chatoverview = itemView.findViewById(R.id.adapter_searchchat_tv_chatoverview);
    }
}
