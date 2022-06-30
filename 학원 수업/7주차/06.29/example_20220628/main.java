import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import package0004_gameSlimeLand.*;
import package0004_gameSlimeLand.inven.potion.RedPotion;
import package0004_gameSlimeLand.slime.NormalSlime;
import package0004_gameSlimeLand.slime.RedSlime;
import package0004_gameSlimeLand.slime.actionSlime;
import package0004_gameSlimeLand.slime.actionSlimeBludslime;
import package0004_gameSlimeLand.slime.actionSlimeRedslime;
import package0004_gameSlimeLand.slime.slime_notUse;
import package0008_promotionExample.parent;
import package0010_exam.*;



public class main {

    public static void main(String[] arg) {

        // startSandwich();

        // startPromotion();

        // CreateSlime();

        TodoList();

        // startForIf();

        //답안쓰기

        

    }

    private static void TodoList() {
        Child Child_A = new Child("책가방",3000);
        Child Child_B = new Child("손가방",50000);
        Parent Child_C = new Child("서류가방", 100000);
        //자동 형변환
        System.out.println("-------CHAPTER.1 형변환 전-------");

        Child_A.goToWork();
        Child_A.goToPCRoom();
        Child_A.buyBranch(50000);
        System.out.println("-------parent------");
        
        Child_B.goToWork();
        Child_B.goToPCRoom();
        Child_B.buyBranch(50000);
        System.out.println("-------child-------");
        
        Child_C.goToWork();
        Child_C.buyBranch(50000);
        System.out.println("-------Sister-------");

        // Parent Not_child_Array = new Parent[3];
        Parent Not_child_A = (Parent)Child_A;
        Parent Not_child_B = (Parent)Child_B;
        Parent Not_child_C = (Parent)Child_C;
        //형변환
        // Not_child_A = Child_A;
        
        System.out.println("-------CHAPTER.2 형변환 후-------");

        Not_child_A.goToWork();
        //child 인 채로 남아있음 (속이고 있기 떄문)
        // Not_child_A.goToPCRoom();
        Not_child_A.buyBranch(50000);
        System.out.println("-------parent-------");
        
        Not_child_B.goToWork();
        Not_child_B.buyBranch(50000);
        // Not_child_B.goToPCRoom();
        System.out.println("-------child-------");
        
        Not_child_C.goToWork();
        Not_child_C.buyBranch(50000);
        // Not_child_C.goToPCRoom();
        System.out.println("-------Sister-------");


        Not_child_A.goToWork();
        //출근합니다 
        System.out.println();
        // Child Child_AA = (Child)Not_child_A;
        Sister Child_AA = (Sister)Not_child_A;
        //시스터가 불가능한 이유: 시스터에는 이미 인스턴스가 있고
        // 자바는 위 아래로만 가능한데 경로가 아이 어른 딸 이 순이라
        //  선언 타입을 보고 할당된 인스턴스를 보고 인식
        
        //형변환
        Child_AA.goToWork();
        Child_AA.goToPCRoom();
        Not_child_C.buyBranch(50000);
        System.out.println();
        System.out.println("-------child-------");
    }

    public static void CreateSlime() {

        //슬라임을 매개변수로 넣어서 출력하기

        NormalSlime normalSlime = new NormalSlime();
        actionSlime basicActionSlime = new actionSlime();

        actionSlimeBludslime blueActionSlime = new actionSlimeBludslime();
        //
        actionSlimeRedslime redActionSlime = new actionSlimeRedslime();

        normalSlime.getAction(blueActionSlime);
        normalSlime.getAction(redActionSlime);

////


        actionSlime basicActionSlime_A = new actionSlimeBludslime();
        // 타입은 부모클래스 타입, 실제로 구현된 것은 자식 클래스.
		method1(basicActionSlime_A);
		method2(basicActionSlime_A);
		
		actionSlime basicActionSlime_B = new actionSlime();
		method1(basicActionSlime_B);
		// method2(basicActionSlime_B); //예외 발생

    

        

        // String[] arrSlimeName = new String[4];
        // arrSlimeName[0] = "검은색";
        // arrSlimeName[1] = "붉은색";
        // arrSlimeName[2] = "푸른색";
        // arrSlimeName[3] = "초록색";

        // int num = (int)(Math.random()*arrSlimeName.length);

        // int input_hp = (int)(Math.random()*100);
        // int input_mp = (int)(Math.random()*30);
        // RedSlime red_1_slime = new RedSlime(input_hp, input_mp, arrSlimeName[num], arrSlimeName[num]);
        // input_hp = (int)(Math.random()*100);
        // input_mp = (int)(Math.random()*30);
        // RedSlime red_2_slime = new RedSlime(input_hp, input_mp, arrSlimeName[num], arrSlimeName[num]);

        // red_1_slime.getColor();
        // System.out.println(red_1_slime.getName()+"의 공격력은 "+red_1_slime.att());


        // red_2_slime.getColor();
        // System.out.println(red_2_slime.getName()+"의 공격력은 "+red_2_slime.att());

    }
//
    public static void method1(actionSlime parent) {
        //부모 클래스를 객체로 만들 수 있다.
		if(parent instanceof actionSlimeBludslime) {
            //아버지 이름으로 들어와놓고 정체를 밝힌다.
			actionSlimeBludslime child = (actionSlimeBludslime) parent;
            //강제 형변환 actionSlimeBludslime 을 parent로 형변환한다
            //부모 클래스로 자식 클래스로 형변환
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(actionSlime parent) {
		actionSlimeBludslime child = (actionSlimeBludslime) parent;
		System.out.println("method2 - Child로 변환 성공");
	}

    // private static void usePotion() {
    //     //용사의 인벤토리에 아이템 번호를 가지고 포션을 사용합니다
    //     RedPotion redpotion = new RedPotion(30, 1, "하얀색");
    //     RedPotion redpotion_x3 = new RedPotion(30, 3, "빨간색");
    //     RedPotion redpotion_xRandom = new RedPotion(30, 2);

    //     // redpotion.usePotionText();
    //     int effectHP = redpotion.useItem(20);
    //     int effectHP_x3 = redpotion_x3.useItem(41);
    //     int effectHP_xRandom = redpotion_xRandom.useItem(52);

    //     System.out.println("용사는 포션을 사용하여 HP "+effectHP+"를 회복하였습니다");
    //     System.out.println("용사는 포션을 사용하여 HP "+effectHP_x3+"를 회복하였습니다");
    //     System.out.println("용사는 포션을 사용하여 HP "+effectHP_xRandom+"를 회복하였습니다");
    // }


    // private static void SlimeGo() {
    //     RedSlime redslime = new RedSlime(20, 30, "red", "예쁜이");

    //     redslime.initSlime();
    //     redslime.getColor();
        
    // }

    private static void GameStart() {
        //슬라임과 대치하는 용사 상황을 코드로 구현
        //용사를 만들자 , 용사 객체 생성(1명)

        //string 메모리를 적게 쓰는 법
        String input = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("용사를 정해주세요");
        //키보드 입력값을 input 변수에 할당
        input = scan.nextLine();

        Warrior warrior = new Warrior(input, 1000, 5000);

        //while문 (슬라임과 용사가 열심히 반복적으로 싸우는 구역)
        while(true) {

            warrior.info();

            //텍스트 랜덤으로 입력값 받기 (랜덤함수와 아스키코드로 랜덤 출력)
            //슬라임 몬스터 생성(다수)
            String input_name_1 = "노란 슬라임";
            String input_name_2 = "빨간 슬라임";
            String input_name_3 = "초록 슬라임";
            String input_name_4 = "파란 슬라임";
            int input_hp = 30;
            int input_mp = 3;
    
            slime_notUse slime_A = new slime_notUse(input_name_1, input_hp, input_mp);
            slime_notUse slime_B = new slime_notUse(input_name_2, input_hp, input_mp);
            slime_notUse slime_C = new slime_notUse(input_name_3, input_hp, input_mp);
            slime_notUse slime_D = new slime_notUse(input_name_4, input_hp, input_mp);

            slime_A.info();
            slime_B.info();
            slime_C.info();
            slime_D.info();

            slime_A.dmg(warrior.attRang);

          

            //슬라임 증식을 한다

            //용사의 공격(1턴)
           
        
            //슬라임의 공격(1턴)
         
           
            //if(모든 슬라임이 죽을 경우) break;
        }
    
    }
}