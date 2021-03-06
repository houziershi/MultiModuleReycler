package bubei.tingshu.multimodule.group;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by xiaojian.fu on 2017/8/11.
 */

public abstract class OneFooterGroupChildManager extends SimpleGroupChildManager {
    public OneFooterGroupChildManager(GridLayoutManager gridLayoutManager) {
        super(gridLayoutManager);
    }

    @Override
    public final int getHeaderViewType(int positionInHeaders) {
        return 0;
    }

    @Override
    public final int getHeaderSpanSize(int positionInHeaders) {
        return 0;
    }

    @Override
    public final RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public final void onBindHeaderViewHolder(RecyclerView.ViewHolder viewHolder, int viewType, int positionInHeaders) {

    }
}
