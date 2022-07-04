package interface_example;

import java.util.Scanner;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		// Searchable cha = new Searchable();
		RemoteControl.changeBattery();
		Audio audio_A = new Audio();
		Scanner sc = new Scanner(System.in);
		
		audio_A.turnOn();

		// ***************************
		String input= "";		// ⬇
		input=sc.nextLine();	// ⬇
		tv.search(input);
		// ***************************
		
		audio_A.setVolume(30);
		audio_A.setMute(true);
		audio_A.turnOff();
        
		// int ch_num;
		// int min = Integer.MAX_VALUE;
		// int[] arr = {10,20,25,120};
		// int answer  = 0;
		// for(int i=0; i<arr.length; i++){
		// 	int abs= Math.abs(arr[i] - ch_num);
		// 	if(abs < min) {
		// 		min = abs;
		// 		answer = arr[i];
		// 	}
		// }
		// System.out.println(answer);

		System.out.println("start");	
		tv.setMute(true);

		// RemoteControl rc = tv;
		// Searchable searchable = tv;
	}}
