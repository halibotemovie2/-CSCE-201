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
