package edu.eci.arsw.app.parcial.services;

import edu.eci.arsw.app.parcial.exception.ParcialException;
import edu.eci.arsw.app.parcial.model.CityData;

import java.io.IOException;


public interface WeatherService {
	/**
	 * Realiza el mapeo de los elementos del JSON y los convierte en objetos java
	 * @param nameCity ciudad seleccionada 
	 * @return retorna las caracteristicas climaticas de la ciudad como Objeto Java 
	 * @throws ParcialException
	 * @throws IOException
	 */
	CityData getWeatherByCityName(String nameCity) throws ParcialException, IOException;
}
