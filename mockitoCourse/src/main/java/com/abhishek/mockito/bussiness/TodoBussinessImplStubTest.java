package com.abhishek.mockito.bussiness;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.abhishek.mockito.data.api.TodoService;
import com.abhishek.mockito.data.api.TodoServiceStub;

public class TodoBussinessImplStubTest {
	TodoService todoServiceStub = new TodoServiceStub();
	TodoBussinessImpl todoBussinessImpl = new TodoBussinessImpl(todoServiceStub);
	List<String> filterdTodos = todoBussinessImpl.retreiveTodoRelatedToSpring("dummy");

	@Test
	public void testRetreiveTodoRelatedToSpring_usingStub() {

		assertEquals(filterdTodos.size(), 2);

		System.out.println(filterdTodos);

	}

	

}
