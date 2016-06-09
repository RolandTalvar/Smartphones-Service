package com.rolandtalvar.controller;

import com.rolandtalvar.model.Smartphone;
import com.rolandtalvar.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/service")
public class ServicesController {

    @Autowired
    SmartphoneRepository smartphoneRepository;

    @RequestMapping(value = "/smartphones")
    public List<Smartphone> getAllSmartphones() {
        return smartphoneRepository.findAll();
    }

}
