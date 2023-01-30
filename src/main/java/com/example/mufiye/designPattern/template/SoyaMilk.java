package com.example.mufiye.designPattern.template;

public abstract class SoyaMilk {
    public final void make() {
        select();
        add();
        soak();
        beat();
    }

    protected abstract void select();

    protected abstract void add();
    protected abstract void soak();
    protected abstract void beat();
}
