package star;

import java.util.*;

public class star {

    public static void main(String[] arg) {
        
        
        int x= 6;
        int y= 7;
        int z= 3;

        // 원
        // for2 if1

        //정삼각형 2
        for(int i=0; i<y; i++){
            for(int j=y; j>i; j++){
     
            }
            System.out.println();
           }
        }
    }
        // 직각삼각형 람다식
        // for(int i=0; i<y; i++) {
        //     Arrays.asList(new String[i]).stream().forEach(_row -> System.out.print("*"));
        //     System.out.println("");
        //         }
        //     }
        // }


        // 사각형
        // for(int i=0; i<=y; i++) {
        //     for(int j=0; j<x; j++) {
        //         System.out.print( "*");
        //     }
        // System.out.println();
        // }
        

        // // 직각삼각형
        // for(int i=0; i<=y; i++) {
        //     for(int j=0; j<i; j++) {
            //         System.out.print( "*");
            //     }
            // System.out.println();
            // }


        // // 역삼각형
        // for(int i=0; i<y; i++){
        //      for(int k=y; k>i; k--) {
        //          System.out.print("0");
        //      }}
        
        //역삼각형2

        // for(int i=0; i<y; i++){
        //     for(int j=0; j<y-i;j++){
        //         System.out.print("*");
        //         }
        //     System.out.println();
        //    }
        
        // 정삼각형
        // for(int i=0; i<y; i++){
        //     for(int j=y; j>i; j--) {
        //         System.out.print(" ");
        //        }
        //    for(int k=0; k<i+1; k++) {
        //        System.out.print("1");
        //        }
        //    for(int l=0; l<i; l++) {
        //        System.out.print("2");
        //        }
        //    System.out.println();
        //    }

        //정삼각형 2
        // for(int i=0; i<y; i++){
        //     for(int j=y; j>i; j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=0; k<i+1; k++){
        //         if(k<i){
        //             System.out.print("+");
        //         }
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //    }
        // }

        //마름모
        // for(int i=0; i<y; i++){
        //     for(int j=y; j>i; j--) {
        //         System.out.print(" ");
        //         }
        //     for(int k=0; k<i; k++) {
        //         System.out.print("1");
        //         }
        //     for(int l=0; l<i-1; l++) {
        //         System.out.print("2");
        //         }
        //     System.out.println();
        //    }
        // for(int i=0; i<y; i++){
        //     for(int j=0; j<i; j++) {
        //         System.out.print(" ");
        //     }
        //     for(int k=y; k>i; k--){
        //         System.out.print("3");
        //     }
        //     for(int l=y; l>i+1; l--){
        //         System.out.print("4");
        //     }
        //     System.out.println();
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

    // }

// int[][] arr1 = {{1,2},{3,4},{5,6}}; //int[3][2] 
// int[][] arr2 = {{3,4},{5,6},{7,8}};
// int[][] answer = new int[3][2];
// for(int i = 0; i<arr1.length; i++) {
//     for(int j = 0; j<arr1[i].length; j++) {
//         answer[i][j] = arr1[i][j] + arr2[i][j];
//         System.out.print("["+answer[i][j]+"]");
//         }
//     }