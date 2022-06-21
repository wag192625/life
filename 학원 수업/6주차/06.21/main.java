import java.util.*;

import slimeland.*;

public class main{
    public static void main(String[] arg) {
        //슬라임과 대치하는 용사 상황을 코드로 구현할 것
        //용사를 만들자

        //스캐너에 스트링 버퍼를 만들어서
        //string 메모리를 적게 쓰는법
        String input = "";
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("이름을 정해주세요.");
        //키보드 입력값을 input 변수에 할당
        input =  scan.nextLine();

        Warrior warrior = new Warrior(input, 200, 100);

        //while문 (슬라임과 용사가 열심히 반복적으로 싸우는 구역)
        while(true) {

            warrior.info();

            //텍스트 랜덤으로 입력값 받기 (랜덤 함수와 아스키코드로 랜덤 출력)
            //슬라임은 증식한다.
            //슬라임 몬스터 생성(다수)
            String input_name_1 = "노란 슬라임";
            String input_name_2 = "빨간 슬라임";
            String input_name_3 = "초록 슬라임";
            String input_name_4 = "파란 슬라임";
            int input_hp = 30;
            int input_mp = 3;

            slime slime_A = new slime(input_name_1, input_hp, input_mp);// 생성자 우선 생성
            slime slime_B = new slime(input_name_2, input_hp, input_mp);
            slime slime_C = new slime(input_name_3, input_hp, input_mp);
            slime slime_D = new slime(input_name_4, input_hp, input_mp);
            
            slime_A.info();
            slime_B.info();
            slime_C.info();
            slime_D.info();
    
            // System.out.println("_________slime_A_________");
            // System.out.println(slime_A.hp);
            // System.out.println(slime_A.hp);
            // System.out.println(slime_A.mp);
    
            //용사의 공격(1턴)
            //공격,스킬 선택
            System.out.println("1.공격 2. 방어 3.스킬");
            // switch(choice){
            //     case 1: 
            //         System.out.println("누구를 공격하겠습니까?");
            //         switch(){
            //             case 1: ;
            //                 break;
            //             case 2: ;
            //                 break;
            //             case 3: ;
            //                 break;
            //             case 4: ;
            //                 break;}
            //             break;
            //     case 2:
            //         System.out.println("");
            //         break;
            //     case 3:
            //         break;
            //     case 4:
            //         break;
            // }

            



            //상태 확인
            slime_A.info();
            slime_B.info();
            slime_C.info();
            slime_D.info();
            warrior.info();
            //슬라임의 공격(1턴 씩);
            slime_A.dmg (warrior.att());
            slime_B.dmg (warrior.att());
            slime_C.dmg (warrior.att());
            slime_D.dmg (warrior.att());

            //상태 확인
            slime_A.info();
            slime_B.info();
            slime_C.info();
            slime_D.info();
            warrior.info();

            //슬라임은 공격을 하고 전사는 공격을 받는다. 
            //

            // slime_A.dmg (slime_B.att());

            //용사는 슬라임을 공격하여 슬라임은 죽는다.
            //if(모든 슬라임이 죽을 경우) break;
        }
    }
}
    //hp < 0 되는 경우의 메소드
    // 필드 내
    // 레벨업 / 필드레벨, 강한 적, 다른 적, 보스 슬라임
    
    // 스코어 (점수제/3성제)
    // 모든 적 처치 / 용사 체력 비례 (이경우는 몬스터가 끝없이 나와야 할 듯) 
    // 턴수 비례 적 처치 횟수 (턴 제한도 좋을듯,) / 턴 수에 따라 별 갯수 달라짐

    // 등장 요소
    
    // 용사
    // 용사는 한명이면 충분한가 / 무기의 종류 다양화? (적의 약점속성 무기등)
    // 필드 이동시 체력이 회복할것인가. 

    //적
    // 적의 등급과 수 / 보스몹의 여부 / 증식
    // 턴 횟수에 따라 특수공격(터져서 게임오버, 더 강해짐, 디버프 / 누구부터 처리 할 것인가/)