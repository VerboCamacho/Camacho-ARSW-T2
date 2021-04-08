package edu.eci.arsw.app.parcial.httpService.imp;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.app.parcial.httpService.HttpServiceConnect;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class HttpServiceConnectImp implements HttpServiceConnect   {
	/**
	 * Metodo que conecta con la api y retorna el JSONObject con la info de la ciudad solicitada
	 * @param nameCity nombre de la ciudad
	 * @return retorna json con datos sobre el clima para la ciudad
	 */
	@Override
	public JSONObject getWeatherByCity(String nameCity)  {
		String KEY="e3df546e99009f7020bcdb8239929f42";
		JSONObject result = null;
		try {
			HttpResponse<String> httpResponse = Unirest.get("https://api.openweathermap.org/data/2.5/weather?q="+nameCity+"&appid="+KEY).asString();
			result =new JSONObject(httpResponse.getBody());
			System.out.println(result);
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	
}
