package com.company;

public class Coach extends People {

    AccrediationType accrediationType;
    private int yearsExperience;

    public Coach(String name, String address, AccrediationType accrediationType, int yearsExperience) {
        super(name, address);
        this.accrediationType = accrediationType;
        this.yearsExperience = yearsExperience;
    }

    public AccrediationType getAccrediationType() {
        return accrediationType;
    }

    public void setAccrediationType(AccrediationType accrediationType) {
        this.accrediationType = accrediationType;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public enum AccrediationType{
        BEGINNER,
        SENIOR,
        EXPERT;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Coach{");
        sb.append("accrediationType=").append(accrediationType);
        sb.append(", yearsExperience=").append(yearsExperience);
        sb.append('}');
        return sb.toString();
    }
}
