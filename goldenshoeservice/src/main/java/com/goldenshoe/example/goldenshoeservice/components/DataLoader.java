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

        ShoeModel footballBoots1 = new ShoeModel("super 80", "purple", "79.99", 1, "https://i.imgur.com/cW2BrLz.jpg", "https://i.imgur.com/aEaJcTZ.jpg", football, "Men");
        shoeModelRepository.save(footballBoots1);

        ShoeModel footballBoots2 = new ShoeModel("mercury", "green", "80.00",4, "https://i.imgur.com/cW2BrLz.jpg", "https://i.imgur.com/aEaJcTZ.jpg", football, "Women");
        shoeModelRepository.save(footballBoots2);

        ShoeModel skater = new ShoeModel("Skater pro", "black", "50.00",3, "https://i.imgur.com/RBVIOo6.jpg", "https://i.imgur.com/TRRGcYk.jpg", lifeStyle, "Men");
        shoeModelRepository.save(skater);

        ShoeModel skater2 = new ShoeModel("Skater pro", "black", "50.00",5, "https://i.imgur.com/RBVIOo6.jpg", "https://i.imgur.com/TRRGcYk.jpg", lifeStyle, "Women");
        shoeModelRepository.save(skater2);

        ShoeModel skater3 = new ShoeModel("Skater pro", "black and white", "60.00",7, "https://i.imgur.com/YLaP6vw.jpg", "https://i.imgur.com/ssC6mBO.jpg", lifeStyle, "Women");
        shoeModelRepository.save(skater3);

        ShoeModel skater4 = new ShoeModel("Skater pro", "black and white", "60.00",2, "https://i.imgur.com/YLaP6vw.jpg", "https://i.imgur.com/ssC6mBO.jpg",lifeStyle, "Men");
        shoeModelRepository.save(skater4);

        ShoeModel footballBoots3 = new ShoeModel("super 100", "purple", "80.00", 6, "https://i.imgur.com/rBSbmi6.jpg", "https://i.imgur.com/11IY70G.jpg", football, "Women");
        shoeModelRepository.save(footballBoots3);

        ShoeModel footballBoots4 = new ShoeModel("mercury 2.0", "green", "80.00",3, "https://i.imgur.com/rBSbmi6.jpg", "https://i.imgur.com/11IY70G.jpg",football, "Men");
        shoeModelRepository.save(footballBoots4);

        ShoeModel capToeBoot = new ShoeModel("cap toe boot", "black", "200.00", 2, "https://i.imgur.com/xuiMVXD.jpg","https://i.imgur.com/hT3Zzp9.jpg", boots, "Men");
        shoeModelRepository.save(capToeBoot);

        ShoeModel running1 = new ShoeModel("Super Runner 2000", "grey", "50.00", 1,"https://i.imgur.com/xuiMVXD.jpg", "https://i.imgur.com/hT3Zzp9.jpg", running, "Women");
        shoeModelRepository.save(running1);

        ShoeModel running2 = new ShoeModel("Super Runner 2000", "blue", "50.00", 0,"https://i.imgur.com/hCjuUEY.jpg", "https://i.imgur.com/bxlui3r.jpg", running, "Men");
        shoeModelRepository.save(running2);

        ShoeModel running5 = new ShoeModel("Super Runner 2077", "blue", "50.00", 2,"https://i.imgur.com/9SWsgfc.jpg", "https://i.imgur.com/b5bWu3o.jpg", running, "Men");
        shoeModelRepository.save(running5);

        ShoeModel running3 = new ShoeModel("Super Runner 1999", "purple", "50.00", 3,"https://i.imgur.com/bTHenDK.jpg", "https://i.imgur.com/VxK51ZJ.jpg", running, "Men");
        shoeModelRepository.save(running3);

        ShoeModel running4 = new ShoeModel("Super Runner 2049", "yello", "50.00", 4,"https://i.imgur.com/hCjuUEY.jpg", "https://i.imgur.com/bxlui3r.jpg", running, "Women");
        shoeModelRepository.save(running4);

        ShoeModel chelsea = new ShoeModel("chelsea", "brown", "199.99", 5, "https://i.imgur.com/mZVWMVB.jpg","https://i.imgur.com/iO2kBQh.jpg", boots,"Men");
        shoeModelRepository.save(chelsea);

        ShoeModel desertBoot = new ShoeModel("desert boot", "tan", "179.99", 0, "https://i.imgur.com/CRGQfiz.jpg", "https://i.imgur.com/NBnmdnd.jpg", boots, "Women");
        shoeModelRepository.save(desertBoot);

        ShoeModel desertBoot2 = new ShoeModel("desert boot", "tan", "179.99", 10, "https://i.imgur.com/CRGQfiz.jpg", "https://i.imgur.com/NBnmdnd.jpg", boots,"Men");
        shoeModelRepository.save(desertBoot2);

        ShoeModel hiking1 = new ShoeModel("super hiking shoes", "grey", "100.00", 3, "https://i.imgur.com/vd5pdNU.jpg","https://i.imgur.com/apSWk4S.jpg", hiking, "Women");
        shoeModelRepository.save(hiking1);

        ShoeModel hiking2 = new ShoeModel("super hiking shoes extra comfort", "grey", "100.00", 1, "https://i.imgur.com/EAE8nkV.jpg","https://i.imgur.com/dUAnBp6.jpg", hiking, "Women");
        shoeModelRepository.save(hiking2);

        ShoeModel hiking3 = new ShoeModel("super hiking shoes limited edition", "orange", "800.00", 5, "https://i.imgur.com/EAE8nkV.jpg", "https://i.imgur.com/dUAnBp6.jpg", hiking, "Men");
        shoeModelRepository.save(hiking3);

        ShoeModel hiking4 = new ShoeModel("super hiking shoes ", "black", "100.00", 6, "https://i.imgur.com/LyZNhdE.jpg", "https://i.imgur.com/kxTd66s.jpg",hiking, "Women");
        shoeModelRepository.save(hiking4);

        ShoeModel running6 = new ShoeModel("Super Runner 1999", "purple", "50.00", 3,"https://i.imgur.com/9SWsgfc.jpg","https://i.imgur.com/b5bWu3o.jpg", running, "Kids");
        shoeModelRepository.save(running6);

        ShoeModel running7 = new ShoeModel("Super Runner 2049", "yello", "50.00", 4,"https://i.imgur.com/bTHenDK.jpg","https://i.imgur.com/VxK51ZJ.jpg", running, "Kids");
        shoeModelRepository.save(running7);

        ShoeModel chelsea2 = new ShoeModel("chelsea", "brown", "199.99", 5, "https://i.imgur.com/mZVWMVB.jpg","https://i.imgur.com/iO2kBQh.jpg", boots, "Kids");
        shoeModelRepository.save(chelsea2);

        ShoeModel hiking5 = new ShoeModel("super hiking shoes", "grey", "100.00", 3, "https://i.imgur.com/EAE8nkV.jpg", "https://i.imgur.com/dUAnBp6.jpg", hiking, "Kids");
        shoeModelRepository.save(hiking5);

        ShoeModel hiking6 = new ShoeModel("super hiking shoes extra comfort", "grey", "100.00", 1, "https://i.imgur.com/LyZNhdE.jpg","https://i.imgur.com/kxTd66s.jpg", hiking, "Kids");
        shoeModelRepository.save(hiking6);

        ShoeModel hiking7 = new ShoeModel("super skater limited edition", "orange", "800.00", 5, "https://i.imgur.com/RBVIOo6.jpg", "https://i.imgur.com/TRRGcYk.jpg", lifeStyle, "Kids");
        shoeModelRepository.save(hiking7);

        ShoeModel hiking8 = new ShoeModel("super 90 football ", "black", "100.00", 6, "https://i.imgur.com/cW2BrLz.jpg", "https://i.imgur.com/aEaJcTZ.jpg", football ,"Kids");
        shoeModelRepository.save(hiking8);

    }

}
