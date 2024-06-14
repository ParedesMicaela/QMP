package org.example.Prendas;

import java.util.List;
import java.util.Map;

public class AdapterClima {
    private AccuWeatherAPI apiClima;
    private List<Alerta> alertas;

    public AdapterClima (AccuWeatherAPI apiClima) {
        this.apiClima = apiClima;
    }

    public List<Map<String, Object>> getClima (String city) {
        return apiClima.getWeather(city);
    }

    public Map<String, List<String>> getAlertas(String city) {
        return apiClima.getAlerts(city);
    }

    public List<Alerta> getCurrentAlert() {
        alertas.get("CurrentAlerts"); //Devuelve un objeto como [“STORM”, “HAIL”, ...]
    }
}
