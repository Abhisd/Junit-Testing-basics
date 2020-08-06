package com.abhishek.mockito.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	//this is the dummy implementation of TodoService interface
	public List<String> retreiveTodo(String user) {
		return Arrays.asList("Learn Spring MVC ", "Learn Spring FrameWork", "Learn to Play Guitar");
	}

	public void deleteTodo(String todo) {
		
	}

}
 
//**Disadvantage of stub
//Stub is gets more complex as methods are implemented 
//in stub class which is quite difficult for large scale
//application.
// **mock is the best way to overcome this problem