package rongviet_company.entities;

import rongviet_company.entities.Employee;

public class MarketingStaff extends Employee {
    private double kpi;
    private double bonusPercent;

    public MarketingStaff(String name, double salary, double kpi, double bonusPercent) {
        super(name, salary);
        this.kpi = kpi;
        this.bonusPercent = bonusPercent;
    }

    public void setKpi(double kpi) {
        this.kpi = kpi;
    }

    public void setBonusPercent(double bonusPercent) {
        this.bonusPercent = bonusPercent;
    }

    @Override
    public String toString() {
        return "MarketingStaff: " +id+". "+name+
                ", kpi: " + kpi +
                ", bonusPercent: " + bonusPercent+
                ", salary: " + salary;
    }
}
