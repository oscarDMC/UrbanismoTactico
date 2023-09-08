package co.edu.urbanismotactico;

import java.util.ArrayList;
import java.util.List;
public class ExpertSignals {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("Reglamentarias")) {
            brands.add("No Pase");
            brands.add("Pare");
            brands.add("Prohibido parquear");}
        if (color.equals("Preventivas")) {
            brands.add("Intersección");
            brands.add("Puente angosto");
            brands.add("Curva Peligrosa");}
        if (color.equals("Informativas")) {
            brands.add("Hospital");
            brands.add("Escuela");
            brands.add("Museo");
        }
        if (color.equals("Sancionatorias")) {
            brands.add("Pico y placa");
            brands.add("Escuela");
            brands.add("Museo");
        }
        else {

        }
        return brands;
    }
}