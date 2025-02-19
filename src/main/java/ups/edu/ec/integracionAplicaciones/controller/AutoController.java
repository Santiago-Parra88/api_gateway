package ups.edu.ec.integracionAplicaciones.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ups.edu.ec.integracionAplicaciones.model.Auto;
import ups.edu.ec.integracionAplicaciones.service.AutoService;

@RestController
@RequestMapping("/Auto")
public class AutoController {

    @Autowired
    private AutoService autoService;

    @PostMapping
    public ResponseEntity<?> createAuto(@RequestBody Auto auto) {
        try {
            Auto savedAuto = autoService.saveAuto(auto);
            return new ResponseEntity<>(savedAuto, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
