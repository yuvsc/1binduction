package com.phoenixinduction.inductionburner;
public class Data {
    private String foobar = null;
    private String baz;

    public boolean isReady() {
        return (foobar != null);
    }

    public Integer getFoobar() { return foobar; }

    public void setFoobar(Integer foobar) { this.foobar = foobar; }

    @Override
    public String toString() {
        return "Data [Foobar=" + foobar + "]";
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public String getBaz() {
        return baz;
    }
}