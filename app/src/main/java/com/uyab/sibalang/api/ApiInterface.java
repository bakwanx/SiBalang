package com.uyab.sibalang.api;

import com.uyab.sibalang.model.GeneralResponse;
import com.uyab.sibalang.model.LoginResponse;
import com.uyab.sibalang.model.StuffDetailResponse;
import com.uyab.sibalang.model.StuffResponse;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("auth/register")
    Call<GeneralResponse> register(
            @Field("nim") String nim,
            @Field("password") String password,
            @Field("full_name") String fullname,
            @Field("departmen") String departmen,
            @Field("program") String program,
            @Field("phone") String phone,
            @Field("position") String position
    );

    @FormUrlEncoded
    @POST("auth/login")
    Call<LoginResponse> login(
            @Field("nim") String nim,
            @Field("password") String password
    );

    @Multipart
    @POST("stuff")
    Call<GeneralResponse> addStuff(
            @Part("id_user") RequestBody id_user,
            @Part("type") RequestBody type,
            @Part("name") RequestBody name,
            @Part("description") RequestBody description,
            @Part MultipartBody.Part photo
    );

    @GET("stuff")
    Call<StuffResponse> stuffList();

    @GET("stuff/{stuff_id}")
    Call<StuffDetailResponse> stuffDetail(@Path("stuff_id") String stuff_id);

    @FormUrlEncoded
    @POST("stuff/turn")
    Call<GeneralResponse> turnStuff(
            @Field("stuff_id") String stuffId,
            @Field("claimer_user_id") String claimer_user_id
    );
}
