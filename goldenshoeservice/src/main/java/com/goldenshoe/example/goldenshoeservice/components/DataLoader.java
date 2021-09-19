package com.goldenshoe.example.goldenshoeservice.components;

import com.goldenshoe.example.goldenshoeservice.models.ShoeModel;
import com.goldenshoe.example.goldenshoeservice.models.ShoeType;
import com.goldenshoe.example.goldenshoeservice.repositories.shoeModelRepository.ShoeModelRepository;
import com.goldenshoe.example.goldenshoeservice.repositories.shoeTypeRepository.ShoeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ShoeModelRepository shoeModelRepository;

    @Autowired
    ShoeTypeRepository shoeTypeRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        ShoeType boots = new ShoeType("Boots");
        shoeTypeRepository.save(boots);

        ShoeType lifeStyle = new ShoeType("Lifestyle");
        shoeTypeRepository.save(lifeStyle);

        ShoeType running = new ShoeType("Running");
        shoeTypeRepository.save(running);

        ShoeType hiking = new ShoeType("Hiking");
        shoeTypeRepository.save(hiking);

        ShoeType football = new ShoeType("Football");
        shoeTypeRepository.save(football);

        ShoeModel footballBoots1 = new ShoeModel("super 80", "purple", "80", 1, "Hello World", football, "Men");
        shoeModelRepository.save(footballBoots1);

        ShoeModel footballBoots2 = new ShoeModel("mercury", "green", "80",4, "hello world", football, "Women");
        shoeModelRepository.save(footballBoots2);

        ShoeModel skater = new ShoeModel("Skater pro", "black", "50",3, "hello world", lifeStyle, "Men");
        shoeModelRepository.save(skater);

        ShoeModel skater2 = new ShoeModel("Skater pro", "black", "50",5, "hello world", lifeStyle, "Women");
        shoeModelRepository.save(skater2);

        ShoeModel skater3 = new ShoeModel("Skater pro", "black and white", "60",7, "hello world", lifeStyle, "Women");
        shoeModelRepository.save(skater3);

        ShoeModel skater4 = new ShoeModel("Skater pro", "black and white", "60",2, "hello world", lifeStyle, "Men");
        shoeModelRepository.save(skater4);

        ShoeModel footballBoots3 = new ShoeModel("super 100", "purple", "80", 6, "Hello World", football, "Women");
        shoeModelRepository.save(footballBoots3);

        ShoeModel footballBoots4 = new ShoeModel("mercury 2.0", "green", "80",3, "hello world", football, "Men");
        shoeModelRepository.save(footballBoots4);

        ShoeModel capToeBoot = new ShoeModel("cap toe boot", "black", "200", 2, "hello world", boots, "Men");
        shoeModelRepository.save(capToeBoot);

        ShoeModel running1 = new ShoeModel("Super Runner 2000", "grey", "50", 1,"Hello world", running, "Women");
        shoeModelRepository.save(running1);

        ShoeModel running2 = new ShoeModel("Super Runner 2000", "blue", "50", 0,"Hello world", running, "Men");
        shoeModelRepository.save(running2);

        ShoeModel running5 = new ShoeModel("Super Runner 2077", "blue", "50", 2,"Hello world", running, "Men");
        shoeModelRepository.save(running5);

        ShoeModel running3 = new ShoeModel("Super Runner 1999", "purple", "50", 3,"Hello world", running, "Men");
        shoeModelRepository.save(running3);

        ShoeModel running4 = new ShoeModel("Super Runner 2049", "yello", "50", 4,"Hello world", running, "Momen");
        shoeModelRepository.save(running4);

        ShoeModel chelsea = new ShoeModel("chelsea", "brown", "199.99", 5, "hello world", boots, "Men");
        shoeModelRepository.save(chelsea);

        ShoeModel desertBoot = new ShoeModel("desert boot", "tan", "179.99", 0, "hello world", boots, "Women");
        shoeModelRepository.save(desertBoot);

        ShoeModel desertBoot2 = new ShoeModel("desert boot", "tan", "179.99", 10, "hello world", boots, "Men");
        shoeModelRepository.save(desertBoot2);

        ShoeModel hiking1 = new ShoeModel("super hiking shoes", "grey", "100", 3, "Hello world", hiking, "Wen");
        shoeModelRepository.save(hiking1);

        ShoeModel hiking2 = new ShoeModel("super hiking shoes extra comfort", "grey", "100", 1, "Hello world", hiking, "Women");
        shoeModelRepository.save(hiking2);

        ShoeModel hiking3 = new ShoeModel("super hiking shoes limited edition", "orange", "800", 5, "Hello world", hiking, "Men");
        shoeModelRepository.save(hiking3);

        ShoeModel hiking4 = new ShoeModel("super hiking shoes ", "black", "100", 6, "Hello world", hiking, "Women");
        shoeModelRepository.save(hiking4);

        ShoeModel running6 = new ShoeModel("Super Runner 1999", "purple", "50", 3,"Hello world", running, "Kids");
        shoeModelRepository.save(running6);

        ShoeModel running7 = new ShoeModel("Super Runner 2049", "yello", "50", 4,"Hello world", running, "Kids");
        shoeModelRepository.save(running7);

        ShoeModel chelsea2 = new ShoeModel("chelsea", "brown", "199.99", 5, "hello world", boots, "Kids");
        shoeModelRepository.save(chelsea2);

        ShoeModel desertBoot3 = new ShoeModel("desert boot", "tan", "179.99", 0, "hello world", boots, "Kids");
        shoeModelRepository.save(desertBoot3);

        ShoeModel desertBoot4 = new ShoeModel("desert boot", "tan", "179.99", 10, "hello world", boots, "Kids");
        shoeModelRepository.save(desertBoot4);

        ShoeModel hiking5 = new ShoeModel("super hiking shoes", "grey", "100", 3, "Hello world", hiking, "Kids");
        shoeModelRepository.save(hiking5);

        ShoeModel hiking6 = new ShoeModel("super hiking shoes extra comfort", "grey", "100", 1, "Hello world", hiking, "Kids");
        shoeModelRepository.save(hiking6);

        ShoeModel hiking7 = new ShoeModel("super hiking shoes limited edition", "orange", "800", 5, "Hello world", hiking, "Kids");
        shoeModelRepository.save(hiking7);

        ShoeModel hiking8 = new ShoeModel("super hiking shoes ", "black", "100", 6, "Hello world", hiking, "Kids");
        shoeModelRepository.save(hiking8);

    }

}
