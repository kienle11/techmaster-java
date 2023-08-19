package rongviet_company;

import rongviet_company.entities.Employee;
import rongviet_company.entities.Manager;
import rongviet_company.entities.MarketingStaff;

import java.util.List;

public class RongVietEmployees {
    private List<Employee> employees;
    private List<MarketingStaff>marketingStaffs;
    private List<Manager>managers;

    public RongVietEmployees(List<Employee> employees, List<MarketingStaff> marketingStaffs, List<Manager> managers) {
        this.employees = employees;
        this.marketingStaffs = marketingStaffs;
        this.managers = managers; 
    }
}
