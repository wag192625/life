package weapon;
// import exam_overriding.*;
// import exam_super.*;
// import slimeland.slime;
import weapon.weaponChange.*;

public class main {
    public static void main(String[] arg) {
    }
    
    // public static void ChangeWeapon(){
    //     weaponLance lance = new weaponLance();
    //     weaponLong long_1 = new weaponLong();
    //     lance.attAction();
    //     lance.destrution();
    // }
    //1

    public static void CreateSlime() {

        String[] arrSlimeName = new String[4];
        arrSlimeName[1] = "검은색";
        arrSlimeName[2] = "붉은색";
        arrSlimeName[3] = "푸른색";
        arrSlimeName[4] = "초록색";

        int num = (int)(Math.random()*arrSlimeName.length);

        int input_hp = (int)(Math.random()*100);
        int input_mp = (int)(Math.random()*30);
        RedSlime red_1_slime = new RedSlime(input_hp, input_mp, arrSlimeName[num], arrSlimeName[num]);
        input_hp = (int)(Math.random()*100);
        input_mp = (int)(Math.random()*30);
        RedSlime red_2_slime = new RedSLime(input_hp, input_mp, arrSlimeName[num], arrSlimeName[num]);

        red_1_slime.getColor();
        System.out.println(red_1_slime.getName()+"의 공격력은 "+red_1_slime.att());
        red_1_slime.att();
        
        red_2_slime.getColor();
        System.out.println(red_2_slime.getName()+"의 공격력은 "+red_2_slime.att());

    }

//슬라임 3마리가 없어질 때 까지
        // while(true) {
        //     String input_name_1 = "노란슬라임";
        //     String input_name_2 = "빨간슬라임";
        //     String input_name_3 = "파란슬라임";
        //     int input_hp = 130;
        //     int input_mp = 10;

        //     slime slime_A = new slime(input_name_1, input_hp, input_mp);
        //     slime slime_B = new slime(input_name_2, input_hp, input_mp);
        //     slime slime_C = new slime(input_name_3, input_hp, input_mp);



        //     if(slime_A.input_hp <= 0) { //만약 체력이 0보다 낮아지면 객체 삭제
        //         slime_A = null;
        //         break;
        //     }
        //     if(slime_B.input_hp <= 0) { //만약 체력이 0보다 낮아지면 객체 삭제
        //         slime_B = null;
        //         break;
        //     }
        //     if(slime_C.input_hp <= 0) { //만약 체력이 0보다 낮아지면 객체 삭제
        //         slime_B = null;
        //         break;
        //     }
        // }
    }

// 용사는 슬라임을 잡기 위해 무기 교체 시스템을 개발하려고 합니다.
// 상속과 오버라이딩을 사용하여
// 주먹, 숏소드, 롱소드, 랜스 4가지의 무기 타입을 교체합니다.
// 필드명 ATTRange, ChangeTime 으로 무기 교체 시간과 공격 범위를 상속받고
// 메서드 attAction으로 이벤트를 발생 시키시오.

//어려운 문제
// 용사와 슬라임 3마리가 자동으로 싸우며 알아서 무기를 교체하고 효율적으로
//
// 자동전투를 할 수 있는 시스템을 개발하시오
//
// attAction = 공격  attrange 범위 changetime 횟수
//
// 알아서 무기를 교체 = 턴당/ 몬스터 체력당/ 마릿수당
// 턴 카운트는 static

// 카카오급
// 다 만드신 분들은 포션의 개수와 공격력 랜덤 출력하는 게임 시스템을 추가하여
// 용사 1턴 마다 효율적인 공격방식을 재구성하는 알고리즘을 만드시오.

// 용사 입장에서 슬라임의 수를 확인한다.
// 용사 입장에서 가지고 있는 무기 타입의 공격 범위와 공격력을 확인한다.
// 용사 입장에서 가지고 있는 무기 타입을 교체하는 시간까지 고려하여 연산한다.
// 효율적인 방식을 선택하여 진행한다.


// 용사 한명 만들고 스테틱으로 만들기

// 슬라임 수는 상관 없음

// 인벤토리에 가지고 있는 무기 타입을 선택
