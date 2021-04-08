package edu.eci.arsw.app.parcial.httpService;

import edu.eci.arsw.app.parcial.exception.ParcialException;
import org.json.JSONObject;

public interface HttpServiceConnect {
	/**
	 * Conexion a la API en donde se realiza un get para traer los datos climaticos de la ciudad seleccionada
	 * @param nameCity nombre de la ciudad seleccionada
	 * @return Json con informacion climatica de la ciudad
	 * @throws ParcialException
	 */
	JSONObject getWeatherByCity(String nameCity) throws ParcialException;
}
