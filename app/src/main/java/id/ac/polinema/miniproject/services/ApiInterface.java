package id.ac.polinema.miniproject.services;

import id.ac.polinema.miniproject.model.AdminRequest;
import id.ac.polinema.miniproject.model.LoginRequest;
import id.ac.polinema.miniproject.model.LoginResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface{
        @POST("/api/auth/login")
    Call<LoginResponse> postLogin(@Body LoginRequest request);

}
