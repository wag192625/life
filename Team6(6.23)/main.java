package June21.Team6;

import java.util.Scanner;
import java.util.Random;
import June21.Team6.slimeLand.*;

public class main {
    public static void main(String[] args) {
        String input_name = "";
        String enter = "\n" ;
        Scanner scan = new Scanner(System.in);

        
        System.out.println("게임 스타트!!");

        System.out.println("----------------------");
        System.out.println("용사의 이름을 정해주세요!!");
        input_name = scan.nextLine();
        System.out.println("----------------------");

        System.out.println("----------------------");
        System.out.println("무기를 선택해주세요!!");
        System.out.println("1.막대기\t2.야구방망이\t3.백과사전");
        System.out.println("----------------------");
        
        int number = scan.nextInt();

        String input_weapon_1 = "막대기";
        String input_weapon_2 = "야구방망이";
        String input_weapon_3 = "백과사전";
        int input_offpower = 5;

        Weapon weapon_1 = new Weapon(input_weapon_1, input_offpower);
        Weapon weapon_2 = new Weapon(input_weapon_2, input_offpower);
        Weapon weapon_3 = new Weapon(input_weapon_3, input_offpower);

        
        if(number == 1) {
            System.out.println(input_name +"은(는) "+input_weapon_1 +"를 획득하였다!");
            weapon_1.info();
        }    
        else if(number == 2) {
            System.out.println(input_name +"은(는) "+input_weapon_2+"를 획득하였다!");
            weapon_2.info();
        }
        else if(number == 3) {
            System.out.println(input_name +"은(는) "+input_weapon_3+"를 획득하였다!");
            weapon_3.info();
        }

        scan.nextLine();
        scan.nextLine();
        
        Warrior warrior = new Warrior(input_name, 100, 100, input_offpower);

        warrior.info();

        System.out.println("----------------------");
        System.out.println("전투를 시작하시겠습니까?");
        System.out.println("1.전투 시작\t2.게임 종료");
        System.out.println("----------------------");

        int number_battle = scan.nextInt();
        if(number_battle == 1) {
            System.out.println("----------------------");
            System.out.println("몬스터가 나타났다!");
            System.out.println("----------------------");

            Random ran = new Random();
            snail snail = new snail();
            slime slime = new slime();
            Dragon dragon = new Dragon();
            int n = 0;
            for(int i=0; i<10; i++) {
                n = ran.nextInt(3);
                if(n == 0) {
                    snail.info();
                    System.out.println("몬스터를 해치웠다!");
                }
                else if(n == 1) {
                    slime.info();
                    System.out.println("몬스터를 해치웠다!");
                }
                else if(n == 2) {
                    dragon.info();
                    System.out.println("몬스터를 해치웠다!");
                }
                


            }
            
            System.out.println("게임이 종료되었습니다.");
            
        }
        if(number_battle == 2) {
            System.out.println("게임이 종료되었습니다.");
        }
    }
}
