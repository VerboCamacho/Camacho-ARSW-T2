package edu.eci.arsw.app.parcial.controllers;

import edu.eci.arsw.app.parcial.exception.ParcialException;
import edu.eci.arsw.app.parcial.services.imp.WeatherServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value ="/weather")
public class WeatherParcialController {
	@Autowired
	@Qualifier("weatherService")
	private WeatherServiceImp weather; 
	
	/**
	 * Metodo request get que retorna el clima y las estadisticas de la ciudad seleccionada
	 * @param nameCity nombre de la ciudad 
	 * @return retorna json con datos sobre el clima para la ciudad 
	 * @throws IOException
	 */
	@RequestMapping(value = "/{nameCity}",method = RequestMethod.GET)
	public ResponseEntity<?> getAirportByName(@PathVariable(name="nameCity") String nameCity) throws IOException  {
		try {
			return new ResponseEntity<>(weather.getWeatherByCityName(nameCity), HttpStatus.ACCEPTED);
		} catch (ParcialException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
				
	}

}
