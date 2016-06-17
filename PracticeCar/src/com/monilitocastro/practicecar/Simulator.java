package com.monilitocastro.practicecar;

import java.util.Scanner;

import com.monilitocastro.practicecar.components.GasPoweredVehicle;

public class Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GasPoweredVehicle mpv = GasPoweredVehicle.getInstance();
		String cmd = "info";
		while(!cmd.equals("exit") ){
			mpv.command(cmd);
			
			System.out.println();
			cmd = sc.nextLine();
		}
	}

}
