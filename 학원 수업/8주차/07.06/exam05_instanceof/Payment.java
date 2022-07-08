public interface Payment {
    // 요금결제임
    int money = 1400;
    // 필드
    // 인터페이스에서 값 지정 안된다 했는데 값 지정해줬더니 되서 궁금

    //추상 메서드 (오버라이드 해야함)
    void lostMoney(); 

    //default 메서드 는 안써도 될듯

}
