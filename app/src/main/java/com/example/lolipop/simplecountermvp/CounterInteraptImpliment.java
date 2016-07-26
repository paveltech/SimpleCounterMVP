package com.example.lolipop.simplecountermvp;

/**
 * Created by lolipop on 7/26/16.
 */
public class CounterInteraptImpliment implements CounterInterapt{

    @Override
    public void OnFinished(OnfinishedLisener lisener) {
        lisener.showMessage();
    }
}
