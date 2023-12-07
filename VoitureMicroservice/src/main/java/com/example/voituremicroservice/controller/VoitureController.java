import com.example.voituremicroservice.entities.Voiture;
import com.example.voituremicroservice.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoitureController {
    @Autowired
    VoitureRepository clientRepository ;
    @GetMapping("/voitures")
    public List<Voiture> chercherClients(){
        return clientRepository.findAll();
    }
    @GetMapping("/voiture/{id}")
    public Voiture chercherUnClients (@PathVariable Long id) throws Exception{

        return this.clientRepository.findById(id).orElseThrow(()-> new Exception("Client inexistant"));}


}