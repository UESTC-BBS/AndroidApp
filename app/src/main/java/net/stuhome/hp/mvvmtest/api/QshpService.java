package net.stuhome.hp.mvvmtest.api;

import net.stuhome.hp.mvvmtest.model.TopicList;
import net.stuhome.hp.mvvmtest.model.UserLogin;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface QshpService {
    @FormUrlEncoded
    @POST("index.php?r=user/login")
    Observable<UserLogin> getUserLoginInfo(@Field("username") String username, @Field("password") String password);

    @FormUrlEncoded
    @POST("index.php?r=forum/topiclist")
    Observable<TopicList> getTopicList(@Field("boardId") String boardId, @Field("page") String page, @Field("accessToken") String accessToken, @Field("accessSecret") String accessSecret, @Field("apphash") String apphash);

    class Factory {
        public static QshpService create() {
            Retrofit retrofit = new Retrofit.Builder()
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://bbs.uestc.edu.cn/mobcent/app/web/")
                    .build();
            return retrofit.create(QshpService.class);
        }
    }
}
