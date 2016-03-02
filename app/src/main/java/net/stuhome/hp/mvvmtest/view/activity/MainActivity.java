package net.stuhome.hp.mvvmtest.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import net.stuhome.hp.mvvmtest.R;
import net.stuhome.hp.mvvmtest.adapter.MainAdapter;
import net.stuhome.hp.mvvmtest.databinding.ActivityMainBinding;
import net.stuhome.hp.mvvmtest.model.TopicListList;
import net.stuhome.hp.mvvmtest.viewmodel.MainViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainViewModel.DataListener {

    private ActivityMainBinding mMainBinding;
    private MainViewModel mMainViewModel;
    private List<TopicListList> topicListLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mMainViewModel = new MainViewModel(this);
        mMainBinding.setViewModel(mMainViewModel);
        setupActionBar(mMainBinding.toolbar);
        setupRecyclerView(mMainBinding.rvMain);
        setupDrawerLayout(mMainBinding.dlMain);
        mMainViewModel.addData();
    }

    private void setupRecyclerView(final RecyclerView recyclerView) {
        recyclerView.setAdapter(new MainAdapter(topicListLists));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (layoutManager instanceof LinearLayoutManager) {
                    int lastVisiblePos = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                    if (lastVisiblePos > recyclerView.getAdapter().getItemCount() - 2 && dy > 0) {
                        mMainViewModel.addData();
                    }
                }
            }
        });
    }

    private void setupDrawerLayout(DrawerLayout dlMain) {
        ActionBarDrawerToggle drawerToggle;
        drawerToggle = new ActionBarDrawerToggle(this, dlMain, mMainBinding.toolbar, R.string.category, R.string.app_name);
        drawerToggle.syncState();
        mMainBinding.dlMain.addDrawerListener(drawerToggle);
    }

    private void setupActionBar(Toolbar toolbar) {
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public void onDataChange(List<TopicListList> topicListLists) {
        this.topicListLists.addAll(topicListLists);
        mMainBinding.rvMain.getAdapter().notifyDataSetChanged();
        mMainBinding.srlMain.setRefreshing(false);
    }
}
