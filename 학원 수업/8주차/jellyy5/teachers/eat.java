package teachers;

public interface eat {
    public void eat(String action);  //추상 메서드
    
    default public void eatfix() {
        System.out.println("을 먹습니다.");
    }
}
