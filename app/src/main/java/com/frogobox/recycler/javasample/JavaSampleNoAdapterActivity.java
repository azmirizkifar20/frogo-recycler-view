package com.frogobox.recycler.javasample;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.frogobox.recycler.FrogoRecyclerView;
import com.frogobox.recycler.R;
import com.frogobox.recycler.callback.FrogoAdapterCallback;
import com.frogobox.recycler.model.ExampleModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class JavaSampleNoAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frogo_rv_sample);
        setupFrogoRecyclerView();
    }

    private ArrayList<ExampleModel> listData() {
        ArrayList<ExampleModel> exampleModels = new ArrayList<>();
//        exampleModels.add(new ExampleModel(Constant.NICK_NAME));
//        exampleModels.add(new ExampleModel(Constant.NICK_NAME));
//        exampleModels.add(new ExampleModel(Constant.NICK_NAME));
//        exampleModels.add(new ExampleModel(Constant.NICK_NAME));
        return exampleModels;
    }

    private void setupFrogoRecyclerView() {
        FrogoRecyclerView recyclerView = findViewById(R.id.frogo_recycler_view);
        recyclerView.injectAdapter(
                R.layout.example_list_item,
                listData(),
                R.layout.example_empty_view,
                new FrogoAdapterCallback<ExampleModel>() {
                    @Override
                    public void setupInitComponent(@NotNull View view, ExampleModel data) {
                        // Init component content item recyclerview
                        TextView tvExample = view.findViewById(R.id.tv_example_item);
                        tvExample.setText(data.getName());
                    }

                    @Override
                    public void onItemClicked(ExampleModel data) {
                        // setup item clicked on frogo recycler view
                        Toast.makeText(JavaSampleNoAdapterActivity.this, data.getName(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onItemLongClicked(ExampleModel data) {
                        // setup item long clicked on frogo recycler view
                        Toast.makeText(JavaSampleNoAdapterActivity.this, data.getName(), Toast.LENGTH_SHORT).show();
                    }
                });
        recyclerView.isViewLinearVertical(false);
    }

}
