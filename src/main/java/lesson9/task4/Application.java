package lesson9.task4;

import com.sun.tools.javah.Gen;
import lesson9.task4.food.Food;

import java.util.List;
import java.util.Random;

public class Application {

    public static final int COOKERS_AMOUNT = new Random().nextInt(6) + 5;
    public static final int FOOD_AMOUNT = 100;

    public static void main(String[] args) {
        List<Cooker> cookers = Generator.generatorCookers(COOKERS_AMOUNT);
        List<Food> foods = Generator.generatorFood(FOOD_AMOUNT);

        Distributor roundRobinDistributor = new RoundRobinDistributor();
        Distributor busyTimeDistributor = new BusyTimeDistributor();

        for (Food food : foods) {
            roundRobinDistributor.addFood(food, cookers);
        }

        int maxTime = 0;

        for (Cooker cooker : cookers
        ) {
            if (maxTime < cooker.getTotalTime()) {
                maxTime = cooker.getTotalTime();
            }
        }

        System.out.println("Суммарное время приготовления блюд поварами (Round Robin): " + maxTime);


        for (Cooker cooker : cookers
        ) {
            cooker.clear();
        }

        for (Food food : foods
        ) {
            busyTimeDistributor.addFood(food, cookers);

        }

        maxTime = 0;
        for (Cooker cooker : cookers) {
            if (maxTime < cooker.getTotalTime())
                maxTime = cooker.getTotalTime();
        }
        System.out.println("Суммарное время приготовления блюд поварами (Busy Time): " + maxTime);


    }
}
