package com.alibaseit.hackersolution.java.datastructures.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KinderGartenAdventure {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			final int nemberOfStudent = scanner.nextInt();
			List<Integer> timeNeededToFinishWork = new ArrayList<>();
			for (int i = 0; i < nemberOfStudent; i++) {
				timeNeededToFinishWork.add(scanner.nextInt());
			}
			int maxTotalTimeNeeded = 0;
			int bestStudentToStartFrom = 0;
			int count = nemberOfStudent;
			while (count >= 0) {
				int max = 0;
				int from = nemberOfStudent - count;
				for (int i = 0; i < nemberOfStudent; i++) {
					if (timeNeededToFinishWork.get(i).intValue() <= ((i + count) % nemberOfStudent))
						++max;
				}
				if (max > maxTotalTimeNeeded) {
					maxTotalTimeNeeded = max;
					bestStudentToStartFrom = from;
				}
				count -= 1;
			}
			System.out.println(bestStudentToStartFrom + 1);
		}
	}
}
