import java.util.*;

public class star {

    public static void main(String[] arg) {
        int x= 6;
        int y= 7;
        int z= 3;
        // 역삼각형
        for(int i=0; i<y; i++) {
            for(int j=y; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }        


        //직각삼각형 람다식
        // for(int i=0; i<y; i++) {
        //     Arrays.asList(new String[i]).stream().forEach(_row -> System.out.print("*"));
        //     System.out.println("");
        // }

        // 사각형
        // for(int i=0; i<=y; i++) {
        //     for(int j=0; j<x; j++) {
        //         System.out.print( "*");
        //     }
        // System.out.println();
        // }
        //
        // // 직각삼각형
        // for(int i=0; i<=y; i++) {
        //     for(int j=0; j<i; j++) {
        //         System.out.print( "*");
        //     }
        // System.out.println();
        // }

        // //뭔가
    //     for(int i=0; i<=y; i++) {
    //         for(int j=0; j<i+1; j++) {
    //             if(j != y){
    //                 for(int k = 0; k<=i; k++){
    //                     System.out.print(" ");
    //                 }
    //             }
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
        
            // for(int j=0; j<i+1; j++) {
            //     System.out.print("1");
            //     }




    }
}