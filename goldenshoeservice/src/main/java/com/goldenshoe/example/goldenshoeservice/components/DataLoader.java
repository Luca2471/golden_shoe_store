package com.goldenshoe.example.goldenshoeservice.components;

import com.goldenshoe.example.goldenshoeservice.models.ShoeModel;
import com.goldenshoe.example.goldenshoeservice.models.ShoeSize;
import com.goldenshoe.example.goldenshoeservice.models.ShoeType;
import com.goldenshoe.example.goldenshoeservice.repositories.ShoeModelRepository;
import com.goldenshoe.example.goldenshoeservice.repositories.ShoeSizeRepository;
import com.goldenshoe.example.goldenshoeservice.repositories.ShoeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ShoeSizeRepository shoeSizeRepository;

    @Autowired
    ShoeModelRepository shoeModelRepository;

    @Autowired
    ShoeTypeRepository shoeTypeRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        ShoeType chelsea = new ShoeType("chelsea");
        shoeTypeRepository.save(chelsea);

        ShoeModel vintage = new ShoeModel("vintage", "brown", "190", "male", "hello world");
        shoeModelRepository.save(vintage);

        ShoeSize small = new ShoeSize("8.5", 4);
        shoeSizeRepository.save(small);
    }

}
