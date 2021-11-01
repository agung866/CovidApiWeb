package com.adl.main.services;

import java.util.List;

import com.adl.main.model.AllCovidInfoModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AllCovidRepository {
	@GET("v1")
	Call<List<AllCovidInfoModel>> getAll();
	
	Call<AllCovidInfoModel> getByCountry(@Path("country") String country);

}
