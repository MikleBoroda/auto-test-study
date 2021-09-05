package lesson9.task4;

import lesson9.task4.food.Coffee;

import java.util.List;

public class BusyTimeDistributor extends Distributor {
    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int maxTime = Integer.MAX_VALUE;
        Cooker candidate = null;
        for (Cooker coooker : cookers
        ) {
            if (coooker.getTotalTime() < maxTime) {
                maxTime = coooker.getTotalTime();
                candidate = coooker;
            }
        }
        return candidate;

    }
}
