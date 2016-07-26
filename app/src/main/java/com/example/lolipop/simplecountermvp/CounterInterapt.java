package com.example.lolipop.simplecountermvp;

/**
 * Created by lolipop on 7/26/16.
 */
public interface CounterInterapt {

    interface OnfinishedLisener{

        void showMessage();
    }

    void OnFinished(OnfinishedLisener lisener);
}
