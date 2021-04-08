package edu.eci.arsw.app.parcial.model;

/**
 * Esta clase guarda el tipo y a que pais pertenece la ciudad seleccionada 
 * @author Verbo Camacho
 *
 */
public class Sys {
	public int type;
	public int id;
	public String country;
	public long sunrise;
	public long sunset;
	public Sys(int type, int id, String country, long sunrise, long sunset) {
		this.type = type;
		this.id = id;
		this.country = country;
		this.sunrise = sunrise;
		this.sunset = sunset;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getSunrise() {
		return sunrise;
	}
	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}
	public long getSunset() {
		return sunset;
	}
	public void setSunset(long sunset) {
		this.sunset = sunset;
	}
	
}
