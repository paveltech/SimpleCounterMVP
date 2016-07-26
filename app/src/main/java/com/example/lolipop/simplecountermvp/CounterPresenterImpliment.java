package com.example.lolipop.simplecountermvp;

/**
 * Created by lolipop on 7/26/16.
 */
public class CounterPresenterImpliment implements CounterPresenter , CounterInterapt.OnfinishedLisener{

    private MainView mainView;
    private CounterInterapt counterInterapt;

    public static int number;


    public CounterPresenterImpliment(MainView mainView){
        this.mainView = mainView;
        counterInterapt = new CounterInteraptImpliment();
    }

    @Override
    public void plsuANmber() {
        if (mainView!=null){
            number = number+1;
            mainView.showMessage(""+number);
        }
    }

    @Override
    public void minusANumber() {
        if (mainView!=null){
            if (number>0){
                number = number-1;
                mainView.showMessage(""+number);
            }
        }
    }

    @Override
    public void OnResume() {
        if (mainView!=null){
            counterInterapt.OnFinished(this);
            mainView.setNegetiveButton();
            mainView.setPositiveButton();
            mainView.setRefreshButton();
        }
    }

    @Override
    public void refreshButton() {
        if (mainView!=null){
            number=0;
            mainView.showMessage(""+number);
        }
    }

    @Override
    public void showLimitCross() {
        if (mainView!=null){
            if (number==10){
                mainView.showMessage("Limit Cross");
                number=0;
            }
        }
    }

    @Override
    public void showMessage() {
        if (mainView!=null){
            mainView.showMessage(""+number);
        }
    }
}
