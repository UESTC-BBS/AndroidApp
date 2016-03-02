package net.stuhome.hp.mvvmtest.viewmodel;

import android.support.v4.widget.SwipeRefreshLayout;

import net.stuhome.hp.mvvmtest.api.QshpService;
import net.stuhome.hp.mvvmtest.model.TopicList;
import net.stuhome.hp.mvvmtest.model.TopicListList;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by msn76 on 2016/2/29.
 */
public class MainViewModel {
    private DataListener mListener;
    private List<TopicListList> mTopicListLists = new ArrayList<>();
    private int page = 0;

    public MainViewModel(DataListener listener) {
        this.mListener = listener;
    }

    public SwipeRefreshLayout.OnRefreshListener getMainRefeshListener() {
        return new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                addData();
            }
        };
    }

    public void addData() {
        QshpService qshpService = QshpService.Factory.create();
        qshpService.getTopicList("61", String.valueOf(++page), "5260ba91569e6649f063e32598ec1", "da9af70218eaede9ccd46a97ace28", "678a760c")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<TopicList>() {
                    @Override
                    public void onCompleted() {
                        mListener.onDataChange(mTopicListLists);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(TopicList topicList) {
                        MainViewModel.this.mTopicListLists = topicList.getTopicListList();
                    }
                });
    }

    public interface DataListener {
        void onDataChange(List<TopicListList> topicListLists);
    }
}
