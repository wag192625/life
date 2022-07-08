package drivers;

public interface Limit {
    int speed();

    default void driveway() {
        System.out.println("일반 도로입니다. 초보자가 됩니다.");
    }
    default void highway() {
        System.out.println("고속 도로입니다. 초보자 해제");

    }
}
