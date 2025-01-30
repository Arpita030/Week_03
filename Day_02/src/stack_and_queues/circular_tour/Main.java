package stack_and_queues.circular_tour;

public class Main {
    public static void main(String[] args) {
        int[] petrol = {3,8,4,6,7};
        int[] distance = {4,6,7,3,5};
        CircularTour circularTour=new CircularTour();
        int startPump = circularTour.findStartingPump(petrol, distance);
        System.out.println("Starting Petrol Pump Index: " + startPump);
    }
}