package com.example.health_declaration.entity;

public class Disease {
    private String name;
    private boolean hadDisease;

    public Disease() {
    }

    public Disease(String name, boolean hadDisease) {
        this.name = name;
        this.hadDisease = hadDisease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHadDisease() {
        return hadDisease;
    }

    public void setHadDisease(boolean hadDisease) {
        this.hadDisease = hadDisease;
    }
}
