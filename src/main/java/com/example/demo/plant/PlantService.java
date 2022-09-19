package com.example.demo.plant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantService {

    private final PlantRepository plantRepository;

    @Autowired
    public PlantService(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    public List<Plant> getPlant() {
        System.out.println("getPlant func");
        System.out.println(plantRepository.findAll());
        //return List.of(new Plant((long)2, "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"));
        return plantRepository.findAll();
    }
}
