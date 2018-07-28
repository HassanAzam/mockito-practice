package com.mockito.practice.mockitopractice;

// Dataservice is the depedency of BusinessLogicImpl
// To test this class, we need its dependencies
public class BusinessLogicImpl {
	private DataService dataService;
	
	int findGreatestFromAllData() {
		int [] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		for(int n : data) {
			if(n > greatest)
				greatest = n;
		}
		return greatest;
	}
}

