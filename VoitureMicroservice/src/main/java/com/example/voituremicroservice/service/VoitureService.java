package com.example.voituremicroservice.service;

import com.example.voituremicroservice.entities.Voiture;
import com.example.voituremicroservice.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    public Voiture enregistrerVoiture(Voiture voiture){
        return voitureRepository.save(voiture);
    }
}
