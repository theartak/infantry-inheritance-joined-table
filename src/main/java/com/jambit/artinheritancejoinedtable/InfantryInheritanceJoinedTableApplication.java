package com.jambit.artinheritancejoinedtable;

import com.jambit.artinheritancejoinedtable.model.Archer;
import com.jambit.artinheritancejoinedtable.model.Infantry;
import com.jambit.artinheritancejoinedtable.model.InfantryType;
import com.jambit.artinheritancejoinedtable.model.Knight;
import com.jambit.artinheritancejoinedtable.repository.ArcherRepository;
import com.jambit.artinheritancejoinedtable.repository.InfantryRepository;
import com.jambit.artinheritancejoinedtable.repository.KnightRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InfantryInheritanceJoinedTableApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(InfantryInheritanceJoinedTableApplication.class, args);
        InfantryRepository archerRepository =
                configurableApplicationContext.getBean(ArcherRepository.class);
        InfantryRepository knightRepository =
                configurableApplicationContext.getBean(KnightRepository.class);

        Infantry archer = new Archer(InfantryType.LIGHT, 300, 500, 100, 1000);
        Infantry knight = new Knight(InfantryType.HEAVY, 280, 1000, 300, true);

        archerRepository.save(archer);
        knightRepository.save(knight);

//        archerRepository.delete(archer);
//        knightRepository.delete(knight);
    }

}
