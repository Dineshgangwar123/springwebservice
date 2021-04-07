package com.myfirstdemo.reactfullwebservice.todo;

import java.net.URI;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.myfirstdemo.reactfullwebservice.todo.Todo;
import com.myfirstdemo.reactfullwebservice.todo.HardcodedService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TodoResourse {
	
	@Autowired
	private HardcodedService hardcodedService;

	@GetMapping(path="/getall-todo/{name}/todos")
	public List<Todo> getAlltodo(@PathVariable String name)
	{
		return hardcodedService.getAll(name );
	}
	
	@GetMapping(path="/get-todo/{name}/todos/{id}")
	public Todo getodo(@PathVariable String name,@PathVariable long id)
	{
		return hardcodedService.findTodo(id);
	}
	
	@DeleteMapping(path="/delete-todo/{username}/todo/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username,@PathVariable long id)
	{
		Todo todo=hardcodedService.deleteTodo(id);
		if(todo!=null)
		{
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping(path="/add-todo/{username}/{discription}/{isDone}")
	public ResponseEntity<Void> addTodo(@PathVariable String username,@PathVariable String discription,
			                 @PathVariable boolean isDone)
	{
		Todo todosss= new Todo(0,username,discription,new Date(), isDone) ;
		Todo createdTodo=hardcodedService.saveTodo(todosss);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}

}
