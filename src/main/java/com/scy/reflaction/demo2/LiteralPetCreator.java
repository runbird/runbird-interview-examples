package com.scy.reflaction.demo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 类名： LiteralPetCreator <br>
 * 描述：TODO <br>
 * 创建日期： 2019/4/16 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class LiteralPetCreator extends AbstractPetCreator {

    private static final List<Class<? extends Pet>> ALL_TYPES = Collections.unmodifiableList(
            Arrays.asList(Pet.class, Dog.class, Cat.class, EgyptianMau.class, Mutt.class)
    );

    private static final List<Class<? extends Pet>> TYPES = ALL_TYPES.subList(
            ALL_TYPES.indexOf(EgyptianMau.class), ALL_TYPES.size()
    );

    @Override
    public List<Class<? extends Pet>> getTypes() {
        return TYPES;
    }
}
