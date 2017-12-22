package com.animeshjain.todo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView mainList;
    String[] titleStr= new String[]{"ABC", "BCD", "CDE","ABC", "BCD", "CDE"};
    String[] descriptionStr = new String[]{"abcdef","bcdefg","cdefgh","abcdef","bcdefg","cdefgh"};
    String[] dateStr= new String[]{"12/1/1234","23/2/3421","21/1/2313","12/1/1234","23/2/3421","21/1/2313"};
    int[] status = new int[]{0,0,0,1,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainList =(ListView)findViewById(R.id.mainListView);

        CustomAdapter customAdapter =new CustomAdapter();
        mainList.setAdapter(customAdapter);
    }


    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return dateStr.length;
        }
        @Override
        public Object getItem(int i) {
            return null;
        }
        @Override
        public long getItemId(int i) {
            return 0;
        }
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
             view= getLayoutInflater().inflate(R.layout.listcontent, null);

            TextView title= (TextView)view.findViewById(R.id.title);
            TextView description =(TextView)view.findViewById(R.id.description);
            TextView dueDate= (TextView)view.findViewById(R.id.dueDate);
            ImageView statusImg=(ImageView)view.findViewById(R.id.completeBtn);
            if (status[i]== 0){
                statusImg.setImageResource(R.drawable.incomplete);
            }else if (status[i]== 1){
                statusImg.setImageResource(R.drawable.complete);
            }
            title.setText(titleStr[i]);
            description.setText(descriptionStr[i]);
            dueDate.setText(dateStr[i]);
            return view;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.addBtn:{
                Toast.makeText(this, "Add Btn Clicked", Toast.LENGTH_SHORT).show();
            }break;
            case R.id.completedBtn:{
                Toast.makeText(this, "View Complete Btn Clicked", Toast.LENGTH_SHORT).show();
            }break;
        }
        return super.onOptionsItemSelected(item);
    }
}
