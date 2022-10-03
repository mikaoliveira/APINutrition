package service;

import datasource.model.Nutricionista;
import org.springframework.beans.factory.annotation.Autowired;
import repository.NutricionistaRepository;

public class CadastroNutricionista {
    @Autowired
    private NutricionistaRepository nutricionistaRepository;

    public void cadastro(Nutricionista nutricionista){
        nutricionistaRepository.saveAndFlush(nutricionista);
    }

}
