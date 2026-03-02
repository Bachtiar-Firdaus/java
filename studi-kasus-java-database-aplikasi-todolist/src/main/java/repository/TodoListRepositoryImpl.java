package repository;

import entity.TodoList;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TodoListRepositoryImpl implements TodoListRepository{

    public TodoList[] data = new TodoList[10];

    private DataSource dataSource;

    public TodoListRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public TodoList[] getAll() {
        return data;
    }

    public boolean isFull(){
        var isFull = true;
        for (var i = 0; i < data.length; i++){
            if (data[i] == null){
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void resizeIsfull(){
        // jika penuh, kita lakukan resize ukuran array 2x lipat
        if(isFull()){
            var temp = data;
            data = new TodoList[data.length * 2];

            for (var i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(TodoList todoList) {
        String sql = "INSERT INTO todolist(todo) VALUES (?)";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){

            statement.setString(1,todoList.getTodo());
            statement.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


//        resizeIsfull();
//
//        // tambahkan ke posisi yang data arraynya null
//        for (var i = 0; i < data.length; i++){
//            if (data[i] == null){
//                data[i] = todoList;
//                break;
//            }
//        }
    }



    private boolean isExist(Integer number) {
        String sql = "SELECT id FROM todolist WHERE id = ?";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1,number);
            try(ResultSet resultSet = statement.executeQuery()){
                if(resultSet.next()){
                    return true;
                }else {
                    return false;
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean remove(Integer number) {
        if(isExist(number)) {
            String sql = "DELETE FROM todolist WHERE id = ?";

            try (Connection connection = dataSource.getConnection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, number);
                statement.executeUpdate();

                return true;
            } catch (SQLException exception) {
                throw new RuntimeException(exception);
            }
        }else {
            return false;
        }


//        if((number - 1) >= data.length){
//            return false;
//        }else if(data[number - 1] == null){
//            return false;
//        }else{
//            for(int i = (number - 1); i < data.length; i++){
//                if(i == (data.length - 1)){
//                    data[i]=null;
//                }else {
//                    data[i] = data[i + 1];
//                }
//            }
//            return true;
//        }
    }
}
