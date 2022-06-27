package weapon;
import exam_overriding.*;
import exam_super.*;
import weapon.weaponChange.*;

public class main {
    public static void main(String[] arg) {

    }
    public static void ChangeWeapon(){
        weaponLance lance = new weaponLance();
        weaponLong long_1 = new weaponLong();
        lance.attAction();
        lance.destrution();
    }

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
