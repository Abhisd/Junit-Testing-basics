package com.abhishek.mockito.bussiness;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

import com.abhishek.mockito.data.api.TodoService;

public class TodoBussinessImplMockTest {

	// mocking is creating object that simulate the behavior of the real objects.
	// unlike stub mock can be created dynamically from code at runtime
	// Mocks offer more function than stubbing
	// We can verify method calls and lot of more things
	// when we use stub we have to create real class for different methods.
	// working flow of the mock is shown in OnGoingStubbing.class (ctrl+shift+t)

	@Test
	public void testRetreiveTodoRelatedToSpring_usingMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC ", "Learn Spring FrameWork", "Learn to Play Guitar");
		when(todoServiceMock.retreiveTodo("dummy")).thenReturn(todos);

		TodoBussinessImpl todoBussinessImpl = new TodoBussinessImpl(todoServiceMock);
		List<String> filterdTodos = todoBussinessImpl.retreiveTodoRelatedToSpring("dummy");

		assertEquals(filterdTodos.size(), 2);

	}

	@Test
	public void testdeleteTodoNotRelatedToSpring_usingBDD() {
		
		//given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC ", "Learn Spring FrameWork", "Learn to Play Guitar");
		given(todoServiceMock.retreiveTodo("dummy")).willReturn(todos);
		TodoBussinessImpl todoBussinessImpl = new TodoBussinessImpl(todoServiceMock);
		
		
		//when
		todoBussinessImpl.deleteTodoNotRelatedToSpring("dummy");

		
		//then
		
		// verify(todoServiceMock,times(1)).deleteTodo("Learn to Play Guitar");	
		 then(todoServiceMock).should().deleteTodo("Learn to Play Guitar");		
		 
		// verify(todoServiceMock,never()).deleteTodo("Learn Spring MVC");		
		 then(todoServiceMock).should(never()).deleteTodo("Learn Spring MVC");  
		
		// verify(todoServiceMock,never()).deleteTodo("Learn Spring FrameWork");	
		 then(todoServiceMock).should(never()).deleteTodo("Learn Spring FrameWork");

	}

	@Test
	public void testRetreiveTodoRelatedToSpring_usingMock1() {

		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC ", "Learn Spring FrameWork", "Learn to Play Guitar");
		List<String> finalTodos = Arrays.asList("Learn Spring MVC ", "Learn Spring FrameWork");

		when(todoServiceMock.retreiveTodo("dummy")).thenReturn(todos);

		TodoBussinessImpl todoBussinessImpl = new TodoBussinessImpl(todoServiceMock);
		List<String> filterdTodos = todoBussinessImpl.retreiveTodoRelatedToSpring("dummy");

		assertEquals(filterdTodos, finalTodos);

		System.out.println(filterdTodos);

	}
	
	@Test
	public void testdeleteTodoNotRelatedToSpring_usingBDD_CaptureArguments() {
		
		// declare argument captor
		
		ArgumentCaptor<String> stringArgCaptor= ArgumentCaptor.forClass(String.class);
		// define argument captor on specific method call
		// capture the  argument
		
		//given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC ", "Learn Spring FrameWork", "Learn to Play Guitar");
		given(todoServiceMock.retreiveTodo("dummy")).willReturn(todos);
		TodoBussinessImpl todoBussinessImpl = new TodoBussinessImpl(todoServiceMock);
		
		
		//when
		todoBussinessImpl.deleteTodoNotRelatedToSpring("dummy");

		
		//then
		
		// verify(todoServiceMock,times(1)).deleteTodo("Learn to Play Guitar");	
		 then(todoServiceMock).should().deleteTodo(stringArgCaptor.capture());		
		 assertThat(stringArgCaptor.getValue(),is("Learn to Play Guitar"));
		
	}

}
//times() will runs the delete method once as it deleting the only one string 
//without spring

// verify(todoServiceMock,never()).deleteTodo("Learn Spring MVC");	
//this will make sure that "Learn Spring MVC" is never deleted
//otherwise it will show error in testing








