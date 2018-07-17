package com.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {
    int i;
    @Override
    public void run() {
        System.out.println("Timer task started at:" + new Date());
        String res = completeTask(++i);
        System.out.println(res);
        if("error".equals(res)){
            System.exit(0);
        }
        System.out.println("Timer task finished at:" + new Date());
    }

    private String completeTask(int i) {
        try {
            // assuming it takes 20 secs to complete the task
            String flag = "error";
            Thread.sleep(10000);
            switch (i) {
                case 1:
                    flag = "Inprogress";
                    break;
                case 2:
                    flag = "success";
                default:
                    flag = "error";
                    break;
            }
            return flag;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String args[]) {
        TimerTask timerTask = new MyTimerTask();
        // running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10 * 1000);
        System.out.println("TimerTask started");

        // timer.cancel();
        // System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /*
         * TimerTask timerTask = new MyTimerTask();
         * Timer timer = new Timer(true);
         * long period = 1000 * 60;
         * long delay = 10*1000;
         * // timer.schedule(timerTask, delay, period);
         * timer.scheduleAtFixedRate(timerTask, delay, period);
         */
    }

}
