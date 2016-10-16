package pe.joedayz.micalculadora.fragment;

import pe.joedayz.micalculadora.model.TipRecord;

/**
 * Created by josediaz on 10/15/16.
 */

public interface TipHistoryListFragmentListener {

    void addToList(TipRecord record);
    void clearList();
}
