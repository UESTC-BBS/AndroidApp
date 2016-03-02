package net.stuhome.hp.mvvmtest.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import net.stuhome.hp.mvvmtest.R;
import net.stuhome.hp.mvvmtest.model.TopicListList;

/**
 * Created by msn76 on 2016/2/29.
 */
public class ItemViewModel extends BaseObservable{
    private TopicListList topicListList;

    public ItemViewModel(TopicListList topicListList) {
        this.topicListList = topicListList;
    }

    public void onItemClick(View view) {

    }

    public String getUserAvatarUrl() {
        return topicListList.getUserAvatar();
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.with(view.getContext())
                .load(imageUrl)
                .placeholder(R.drawable.placeholder)
                .into(view);
    }

    public String getTitle() {
        return topicListList.getTitle();
    }

    public String getSubject() {
        return topicListList.getSubject()+"...";
    }

    public String getAuthor() {
        return topicListList.getUserNickName();
    }

    public String getHits() {
        return "查看 " + topicListList.getHits();
    }

    public String getReplies() {
        return "回复 " + topicListList.getReplies();
    }
}
