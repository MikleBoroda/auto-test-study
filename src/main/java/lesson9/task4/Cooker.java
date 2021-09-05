package lesson9.task4;

import lesson9.task4.food.Food;

import java.util.ArrayList;
import java.util.List;

public class Cooker {

    private List<Food> foodsForCook = new ArrayList<>();

    public int getTotalTime() {
        int totalTime = 0;
        for (Food food : foodsForCook
        ) {
            totalTime += food.getCookingTime();
        }
        return totalTime;
    }

    public int getTotalSize() {
        return foodsForCook.size();
    }

    public void addFood(Food food) {
        foodsForCook.add(food);
    }

    public void clear() {
        foodsForCook.clear();
    }

}
