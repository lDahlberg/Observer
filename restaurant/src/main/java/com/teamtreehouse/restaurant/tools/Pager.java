package com.teamtreehouse.restaurant.tools;

import com.teamtreehouse.restaurant.tables.Status;
import com.teamtreehouse.restaurant.tables.Table;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lDahlberg on 9/2/2016.
 */
public class Pager implements Observer{

    public Pager(Table table) {
        table.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        Status status = (Status) arg;
        Table table = (Table) o;
        if (status == Status.AVAILABLE) {
            System.out.printf("BZZZZZZ...table #%d is ready %n", table.getPositionNumber());
        }
    }
}
