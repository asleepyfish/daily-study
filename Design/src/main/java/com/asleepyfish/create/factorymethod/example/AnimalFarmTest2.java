package com.asleepyfish.create.factorymethod.example;

/**
 * @author: zhoujh
 * @date: 2021/12/3 16:19
 * @description:
 */
public class AnimalFarmTest2 {
    public static void main(String[] args) {
        Animal a;
        AnimalFarm af;
        af = (AnimalFarm) ReadXML2.getObject();
        a = af.newAnimal();
        a.show();
    }

    interface Animal {
        public void show();
    }

    class Horse implements Animal {

        @Override
        public void show() {

        }
    }

    class Cattle implements Animal {

        @Override
        public void show() {

        }
    }

    interface AnimalFarm {
        public Animal newAnimal();
    }

    class HorseFarm implements AnimalFarm {
        @Override
        public Animal newAnimal() {
            return new Horse();
        }
    }

    class CattleFarm implements AnimalFarm {

        @Override
        public Animal newAnimal() {
            return new Cattle();
        }
    }
}
