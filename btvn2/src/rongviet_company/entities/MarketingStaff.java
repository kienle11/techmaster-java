package rongviet_company.entities;

import rongviet_company.entities.Employee;

public class MarketingStaff extends Employee {
    private static int autoID;
    private int id;
    private double kpi;
    private double bonusPercent;

    public MarketingStaff(String name, double salary, double kpi, double bonusPercent) {
        super(name, salary);
        this.kpi = kpi;
        this.bonusPercent = bonusPercent;
        this.id = ++autoID;
    }

    public void setKpi(double kpi) {
        this.kpi = kpi;
    }

    public void setBonusPercent(double bonusPercent) {
        this.bonusPercent = bonusPercent;
    }
}
