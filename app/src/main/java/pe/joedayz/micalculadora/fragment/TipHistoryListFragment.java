package pe.joedayz.micalculadora.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import pe.joedayz.micalculadora.R;
import pe.joedayz.micalculadora.adapter.TipAdapter;
import pe.joedayz.micalculadora.model.TipRecord;


public class TipHistoryListFragment extends Fragment implements TipHistoryListFragmentListener{

    TipAdapter adapter;
    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tip_history_list, container, false);
        ButterKnife.bind(this, view);
        initAdapter();
        initRecyclerView();

        return view;
    }

    private void initRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
    }

    private void initAdapter() {
        if(adapter==null){
            adapter = new TipAdapter(getContext().getApplicationContext(), new ArrayList<TipRecord>());
        }
    }


    @Override
    public void addToList(TipRecord record) {
        adapter.addElement(record);
    }

    @Override
    public void clearList() {
        adapter.clear();
    }
}
