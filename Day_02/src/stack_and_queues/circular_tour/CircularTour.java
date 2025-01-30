package stack_and_queues.circular_tour;

import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
    public int findStartingPump(int[] petrol, int[] distance) {
        Queue<Integer> queue = new LinkedList<>();
        int totalPetrol = 0;
        int currentPetrol = 0;
        int start = 0;

        for (int i = 0; i < petrol.length; i++) {
            queue.add(i);
            totalPetrol += petrol[i] - distance[i];
            currentPetrol += petrol[i] - distance[i];

            while (currentPetrol < 0 && !queue.isEmpty()) {
                int pump = queue.poll();
                currentPetrol -= (petrol[pump] - distance[pump]);
                start = pump + 1;
            }
        }

        if (totalPetrol >= 0) {
            return start;
        } else {
            return -1;
        }
    }
}