package edu.eci.arsw.app.parcial.services.imp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import edu.eci.arsw.app.parcial.exception.ParcialException;
import edu.eci.arsw.app.parcial.httpService.HttpServiceConnect;
import edu.eci.arsw.app.parcial.model.CityData;
import edu.eci.arsw.app.parcial.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service("weatherService")
public class WeatherServiceImp implements WeatherService{
	@Autowired
	private HttpServiceConnect connect;
	@Override
	public CityData getWeatherByCityName(String nameCity)  throws ParcialException, IOException{
		Gson obj =new Gson();
		
		//JSONObject obj = connect.getWeatherByCityName(nameCity);
		ObjectMapper mapper = new ObjectMapper();
		CityData city = obj.fromJson( connect.getWeatherByCity(nameCity).toString(), CityData.class) ;
		
		return city;		
	}
	
	
}
