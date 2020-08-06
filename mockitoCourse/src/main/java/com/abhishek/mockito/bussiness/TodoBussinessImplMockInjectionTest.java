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

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.junit.MockitoJUnit;

import com.abhishek.mockito.data.api.TodoService;


public class TodoBussinessImplMockInjectionTest {

	@Rule
	public MockitoRule mockitoRule=new MockitoJUnit().rule();
	
	
	@Mock
	TodoService todoServiceMock; // mockito creates mock for class TodoService automatically

	@InjectMocks
	TodoBussinessImpl todoBussinessImpl;
	
	@Captor
	ArgumentCaptor<String> stringArgCaptor;

	@Test
	public void testRetreiveTodoRelatedToSpring_usingMock() {

		List<String> todos = Arrays.asList("Learn Spring MVC ", "Learn Spring FrameWork", "Learn to Play Guitar");
		when(todoServiceMock.retreiveTodo("dummy")).thenReturn(todos);

		List<String> filterdTodos = todoBussinessImpl.retreiveTodoRelatedToSpring("dummy");

		assertEquals(filterdTodos.size(), 2);

	}

	@Test
	public void testdeleteTodoNotRelatedToSpring_usingBDD() {

		List<String> todos = Arrays.asList("Learn Spring MVC ", "Learn Spring FrameWork", "Learn to Play Guitar");
		given(todoServiceMock.retreiveTodo("dummy")).willReturn(todos);

		todoBussinessImpl.deleteTodoNotRelatedToSpring("dummy");

		then(todoServiceMock).should().deleteTodo("Learn to Play Guitar");

		then(todoServiceMock).should(never()).deleteTodo("Learn Spring MVC");

		then(todoServiceMock).should(never()).deleteTodo("Learn Spring FrameWork");

	}

	@Test
	public void testRetreiveTodoRelatedToSpring_usingMock1() {

		List<String> todos = Arrays.asList("Learn Spring MVC ", "Learn Spring FrameWork", "Learn to Play Guitar");
		List<String> finalTodos = Arrays.asList("Learn Spring MVC ", "Learn Spring FrameWork");

		when(todoServiceMock.retreiveTodo("dummy")).thenReturn(todos);

		List<String> filterdTodos = todoBussinessImpl.retreiveTodoRelatedToSpring("dummy");

		assertEquals(filterdTodos, finalTodos);

		System.out.println(filterdTodos);

	}

	@Test
	public void testdeleteTodoNotRelatedToSpring_usingBDD_ArgumentCaptor() {

		

		List<String> todos = Arrays.asList("Learn Spring MVC ", "Learn Spring FrameWork", "Learn to Play Guitar");
		given(todoServiceMock.retreiveTodo("dummy")).willReturn(todos);

		todoBussinessImpl.deleteTodoNotRelatedToSpring("dummy");

		then(todoServiceMock).should().deleteTodo(stringArgCaptor.capture());
		assertThat(stringArgCaptor.getValue(), is("Learn to Play Guitar"));

	}

}


//**@InjectMocks**
//mockito will check all the things present in TodoBussinessImpl class
//it will work with all the dependencies of TodoBussinessImpl and checks 
//whether any of the mock matches with type of TodoService Interface 
//	TodoBussinessImpl todoBussinessImpl = new TodoBussinessImpl(todoServiceMock); 
//this line is eliminated when we use @InjectMocks.

//**@Captor**
// it will create argument captor automatically for the type 

//**@Rule**
//sometimes we have to use Runner for spring framework and we cannot use multiple runners at a same time
// so we can add mockito junit runner by using rule and spring framework with @RunWith if needed.
//@Rule is used instead of @RunWith






