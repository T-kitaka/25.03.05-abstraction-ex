package com.jstudy.장윤영;

public class Cleaner {

    private final VacuumCleaner vacuum = new VacuumCleaner();

    public void turnOn() {
        vacuum.turnOn();
    }

    public void clean() {
        vacuum.clean();
    }

    public void turnOff() {
        vacuum.turnOff();
    }

    public void emptyDustbin() {
        vacuum.emptyDustbin();
    }
}

