package com.myfirstdemo.reactfullwebservice.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HardcodedService 
{

	private static List<Todo> todos = new ArrayList();
	private static long id = 0;
	public int a;

	static {
		todos.add(new Todo(++id,"dinesh","working",new Date(), false) );
		todos.add(new Todo(++id,"dinesh","not working",new Date(), false) );
		todos.add(new Todo(++id,"dinesh","working tomorrow",new Date(), false) );
		todos.add(new Todo(++id,"dinesh","going to play",new Date(), false) );
		todos.add(new Todo(++id,"dinesh","Not Specified",new Date(), false) );
		todos.add(new Todo(++id,"dinesh","Learning react ",new Date(), false) );
	}
	
	public List<Todo> getAll(String username)
	{
		List<Todo> todobyUser= new ArrayList();
		
		for(int i=0; i< todos.size(); i++)
		{
			if((todos.get(i).getUsername()).equals(username) )
			{
				todobyUser.add(todos.get(i));
			}
		}
		
		return todobyUser;
	}
	public Todo deleteTodo(long id)
	{
		Todo todo=findTodo(id);
		if(todo==null)
		{
			return null;
			
		}
		if(todos.remove(todo))
		{
			return todo;	
		}
		return null;
	}
	
	public Todo findTodo(long id2) {
		for(Todo todo:todos)
		{
			if(todo.getId()== id2)
			{
				return todo;
			}
		}
		return null;
	}
	
	public Todo saveTodo(Todo todo)
	{
		if(todo.getId()== 0 || todo.getId()== -1)
		{
			todo.setId(++id);
			todos.add(todo);
		}
		else
		{
			deleteTodo(todo.getId());
			todos.add(todo);
			
		}
		return todo;
	}
	
	

}
