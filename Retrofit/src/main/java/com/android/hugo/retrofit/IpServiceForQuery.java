package com.android.hugo.retrofit;

import com.android.hugo.retrofit.model.IpModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2016/9/9 0009.
 */
public interface IpServiceForQuery{
    @GET("getIpInfo.php")
    Call<IpModel> getIpMsg(@Query("ip") String ip);
}
