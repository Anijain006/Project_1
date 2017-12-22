package com.animeshjain.todo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class completedTasks extends AppCompatActivity {

    ListView completedTaskList;
    String[] titleStr= new String[]{"ABC", "BCD", "CDE","ABC", "BCD", "CDE"};
    String[] descriptionStr = new String[]{"abcdef","bcdefg","cdefgh","abcdef","bcdefg","cdefgh"};
    String[] dateStr= new String[]{"12/1/1234","23/2/3421","21/1/2313","12/1/1234","23/2/3421","21/1/2313"};
    int[] status = new int[]{0,0,0,1,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_tasks);
    }
    
}
