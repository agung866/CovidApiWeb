package com.adl.main.services;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adl.main.model.AllCovidInfoModel;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class CovidApiService {
	private AllCovidRepository service;
	
	public CovidApiService(){
		
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://covid-19.dataflowkit.com/")
					.addConverterFactory(GsonConverterFactory.create())
					.build();
		service =retrofit.create(AllCovidRepository.class);
		}
	public List<AllCovidInfoModel> getAllCovidInfo(){
		Call<List<AllCovidInfoModel>> callInfo =service.getAll();
		Response<List<AllCovidInfoModel>> response=null;
		try {
			response = callInfo.execute();
		}catch(IOException e){
			e.printStackTrace();
		}
		return response.body();
	}
	
}
