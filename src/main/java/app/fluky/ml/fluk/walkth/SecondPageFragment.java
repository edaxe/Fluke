package app.fluky.ml.fluk.walkth;

import android.graphics.PointF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.goka.walker.WalkerFragment;
import com.goka.walker.WalkerLayout;

import java.util.Arrays;

import app.fluky.ml.fluk.R;

public class SecondPageFragment extends WalkerFragment {

    public static final String TAG = SecondPageFragment.class.getSimpleName();

    public static final int PAGE_POSITION = 1;
    private WalkerLayout walkerLayout;

    public static SecondPageFragment newInstance() {
        Bundle args = new Bundle();
        SecondPageFragment fragment = new SecondPageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.secondwalker, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        walkerLayout = (WalkerLayout) view.findViewById(R.id.walker);
        walkerLayout.setSpeedVariance(new PointF(1.2f, 0.0f));
        walkerLayout.setEnableAlphaAnimation(true);
        walkerLayout.setSpeed(new PointF(1.0f, 0.0f));
        walkerLayout.setIgnoredViewTags(Arrays.asList("1"));
        walkerLayout.setup();
    }

    @Override
    protected int getPagePosition() {
        return PAGE_POSITION;
    }

    @Override
    protected WalkerLayout getWalkerLayout() {
        return walkerLayout;
    }
}
