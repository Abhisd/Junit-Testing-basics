package com.abhishek.mockito.bussiness;

import java.util.ArrayList;
import java.util.List;

import com.abhishek.mockito.data.api.TodoService;

//TodoBussinessImpl SUT(System under test)
//TodoService is Dependency
public class TodoBussinessImpl {
	private TodoService todoService;

	public TodoBussinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	public List<String> retreiveTodoRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> falseTodos = new ArrayList<String>();
		List<String> todos = todoService.retreiveTodo(user);
		for (String todo : todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			} else
				falseTodos.add(todo);
		}
		// System.out.println(falseTodos);
		return filteredTodos;

	}

	public void deleteTodoNotRelatedToSpring(String user) {

		List<String> todos = todoService.retreiveTodo(user);
		for (String todo : todos) {
			if (!todo.contains("Spring")) {
				todoService.deleteTodo(todo);
			}

		}

	}
}
