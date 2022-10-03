package controller;

import datasource.model.Nutricionista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import repository.NutricionistaRepository;

import java.util.Optional;

@RestController
public class NutricionistaController {
    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    @GetMapping(path="api/nutricionista-id/{}")
    public ResponseEntity<Optional<Nutricionista>> buscarNutricionistaPorId(@PathVariable(name = "id", required = true)Long idNutricionista){
        return ResponseEntity.ok(nutricionistaRepository.findById(idNutricionista));
    }
}
