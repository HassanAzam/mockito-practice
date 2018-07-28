package com.mockito.practice.mockitopractice;

// Dataservice is the depedency of BusinessLogicImpl
// To test this class, we need its dependencies
public class BusinessLogicImpl {
	private DataService dataService;
	
	public BusinessLogicImpl(DataService stub) {
		this.dataService = stub;
	}
	
	int findGreatestFromAllData(){
		int [] data = dataService.retrieveAllData();
//		if(data.length == 0)
//			throw new Exception("Empty array, Couldn't find largest element in empty array");
		int greatest = Integer.MIN_VALUE;
		for(int n : data) {
			if(n > greatest)
				greatest = n;
		}
		return greatest;
	}
}

