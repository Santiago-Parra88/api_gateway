package ups.edu.ec.integracionAplicaciones.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ups.edu.ec.integracionAplicaciones.model.Auto;
import ups.edu.ec.integracionAplicaciones.repository.AutoRepository;

@Service
public class AutoService {

    @Autowired
    private AutoRepository autoRepository;
    public Auto saveAuto(Auto auto) {
        return autoRepository.save(auto);
    }

}
