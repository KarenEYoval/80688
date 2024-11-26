package mx.uv.practica12;

import java.util.Optional;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class App {
    // instancia de la interfaz que extiende de crudRepository
    // esta anotación facilita la inyección de dependencias en tiempo de ejecución
    @Autowired
    private Icolor colores;

    // este método recibe objetos del tipo Content-Type 'application/json'
    @RequestMapping(method = RequestMethod.POST, value = "/colores")
    Object crearColores(@RequestBody Color color) {
        // String id=UUID.randomUUID().toString();
        // color.setId(id);
        // color.setNombreColor("blanco");
        // color.setValorColor("255");

        // colores es una instancia de una lista
        // colores.add(color);
        Color c = new Color();
        c = colores.save(color);

        System.out.println(color.getNombreColor());
        Properties resultado = new Properties();
        resultado.setProperty("id", c.getId().toString());
        // return "color creado";
        return resultado;
    }

    // curl -X GET http://localhost:8080/color?color=blanco&valor=255
    // Este método recibe objetos del tipo Content-Type
    // 'application/x-www-form-urlencoded'
    @RequestMapping(method = RequestMethod.GET, value = "/colores")
    // List<Color> listarColor(@RequestParam(required = false, defaultValue = "",
    // name = "id") String id) {
    Iterable<Color> listarColor(@RequestParam Optional<String> id) {
        return colores.findAll();
    }

}