package Going;

public class Road {
    public void road(Way way) {
//        if(speed == 30) {
            //형변환
            if(way instanceof Beginner) {	//인스턴스 오브가 작동되는 이유 = 버스는 바이클에 상속이 되어있어서
                // instanceof 는 타입(지금은 클래스)을 비교하는거임
                Beginner beginner = (Beginner) way;
                //형변환
                beginner.driveway();
                //
            }
            if(way instanceof Pro) {	//인스턴스 오브가 작동되는 이유 = 버스는 바이클에 상속이 되어있어서
                // instanceof 는 타입(지금은 클래스)을 비교하는거임
                Pro pro = (Pro) way;
                //형변환
                pro.driveway();
                //
            }
            if(way instanceof Master) {	//인스턴스 오브가 작동되는 이유 = 버스는 바이클에 상속이 되어있어서
                // instanceof 는 타입(지금은 클래스)을 비교하는거임
                Master master = (Master) way;
                //형변환
                master.highway();
                //
            }
    }
}
//  클래스를 비교해서 고속도로 들어가면 전문가로 형변환
//  일반도로로 나오면 초보자로 형변환 인데
//  뭘 부모로 삼고 자식으로 삼고 형변환하느냐

// 속도에 따라 고속도로인지 하고싶은데 어료움