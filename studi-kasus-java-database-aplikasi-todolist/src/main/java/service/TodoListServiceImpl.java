package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        TodoList[] model = todoListRepository.getAll();
        System.out.println("TODO LIST");
        for(var todolist : model){
            System.out.println(todolist.getId() + " : " + todolist.getTodo());
        }
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todoList = new TodoList(todo);
        todoListRepository.add(todoList);
        System.out.println("Sukses Menambahkan TODO: "+todo);

    }

    @Override
    public void removeTodoList(Integer number) {
        boolean success = todoListRepository.remove(number);
        if(success){
            System.out.println("Sukses Menghapus TODO : "+ number);
        }else{
            System.out.println("Gagal Menghapus TODO : "+ number);
        }
    }
}
