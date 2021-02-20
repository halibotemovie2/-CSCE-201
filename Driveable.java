public interface Driveable {
    public void start();
    public void stop();
    public void turn();
}

public class Bicycle implements Driveable{

    @Override
    public void start() {
        System.out.println("🚲自行车启动");
    }

    @Override
    public void stop() {
        System.out.println("🚲自行车刹车");
    }

    @Override
    public void turn() {
        System.out.println("🚲自行车转弯");
    }
}

public class Car implements Driveable {

    @Override
    public void start() {
        System.out.println("🚗汽车启动");
    }

    @Override
    public void stop() {
        System.out.println("🚗汽车刹车");
    }

    @Override
    public void turn() {
        System.out.println("🚗汽车转弯");
    }
}

