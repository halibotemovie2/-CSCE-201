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
