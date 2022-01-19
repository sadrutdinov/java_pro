package com.sai.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> vanyaAction = new ArrayList<>();
        vanyaAction.add(Action.NOJNICI);
        vanyaAction.add(Action.BUMAGA);
        vanyaAction.add(Action.NOJNICI);

        List<Action> petyaAction = new ArrayList<>();
        petyaAction.add(Action.BUMAGA);
        petyaAction.add(Action.KAMEN);
        petyaAction.add(Action.KAMEN);

        new BestFriend("Vanya", vanyaAction, exchanger);
        new BestFriend("Petya", petyaAction, exchanger);
    }
}

enum Action {
    KAMEN, NOJNICI, BUMAGA;
}

class BestFriend extends Thread {
    private String name;
    private Exchanger<Action> exchanger;
    private List<Action> myActions;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.exchanger = exchanger;
        this.myActions = myActions;
        this.start();
    }

    @Override
    public void run() {
        Action reply;
        for(Action action: myActions) {
            try {

                reply = exchanger.exchange(action);
//                System.out.print(action.name() + " vs " + reply.name() + " => ");
                whoWins(action, reply);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void whoWins(Action myActions, Action friendsAction) {
        if ((myActions == Action.KAMEN && friendsAction == Action.NOJNICI)
                || (myActions == Action.BUMAGA && friendsAction == Action.KAMEN)
                || (myActions == Action.NOJNICI && friendsAction == Action.BUMAGA)) {
            System.out.println(name + " wins!");
        }
    }
}
