package inbm.com.myapplication;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class MyViewModel extends ViewModel {
    private MutableLiveData<List<User>> users;
    public LiveData<List<User>> getUsers(){
        if(users == null){
            users = new MutableLiveData<List<User>>();

            loadUsers();
        }

        return users;
    }

    private void loadUsers() {

    }
}
