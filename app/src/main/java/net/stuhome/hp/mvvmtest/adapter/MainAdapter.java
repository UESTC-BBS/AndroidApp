package net.stuhome.hp.mvvmtest.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import net.stuhome.hp.mvvmtest.R;
import net.stuhome.hp.mvvmtest.databinding.ItemBinding;
import net.stuhome.hp.mvvmtest.model.TopicListList;
import net.stuhome.hp.mvvmtest.viewmodel.ItemViewModel;

import java.util.Collections;
import java.util.List;

/**
 * Created by msn76 on 2016/2/29.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ItemViewHolder> {

    private List<TopicListList> topicListLists = Collections.emptyList();

    public MainAdapter(List<TopicListList> topicListLists) {
        this.topicListLists = topicListLists;
    }

    public MainAdapter() {}

    public void setTopicListLists(List<TopicListList> topicListLists) {
        this.topicListLists = topicListLists;
        notifyDataSetChanged();
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item, parent, false);
        return new ItemViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.bindTopicListList(topicListLists.get(position));
    }

    @Override
    public int getItemCount() {
        return topicListLists.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {
        final ItemBinding binding;

        public ItemViewHolder(ItemBinding binding) {
            super(binding.cvPost);
            this.binding = binding;
        }

        public void bindTopicListList(TopicListList topicListList) {
            binding.setViewModel(new ItemViewModel(topicListList));
        }
    }
}
