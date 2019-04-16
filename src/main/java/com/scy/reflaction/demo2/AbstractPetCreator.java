package com.scy.reflaction.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 类名： PetCreator <br>
 * 描述：TODO <br>
 * 创建日期： 2019/4/16 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public abstract class AbstractPetCreator {
    private Random random = new Random(50);

    public abstract List<Class<? extends Pet>> getTypes();

    public Pet randomPet() {
        int n = random.nextInt(getTypes().size());
        try {
            return getTypes().get(n).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException();
        }
    }

    public Pet[] createArray(int size) {
        Pet[] pets = new Pet[size];
        for (int i = 0; i < size; i++) {
            pets[i] = randomPet();
        }
        return pets;
    }

    public List<Pet> arrayList(int size) {
        List<Pet> pets = new ArrayList<>();
        Collections.addAll(pets, createArray(size));
        return pets;
    }
}
