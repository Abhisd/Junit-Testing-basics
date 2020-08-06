package com.abhishek.mockito.data.api;

import java.util.List;

//create TodoServiceStubb

public interface TodoService {
	public  List<String> retreiveTodo(String user);
	
	public void deleteTodo(String todo);

}
