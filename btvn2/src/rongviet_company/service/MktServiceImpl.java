package rongviet_company.service;

import rongviet_company.entities.MarketingStaff;

import java.util.List;
import java.util.Scanner;

public class MktServiceImpl implements IManage<MarketingStaff> {
    @Override
    public void add(Scanner scanner, List<MarketingStaff> marketingStaffs) {
        System.out.println("Nhap thong tin nhan vien tiep thi");
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhap luong co ban");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Doanh thu ban hang");
        double kpi = Double.parseDouble(scanner.nextLine());
        System.out.println("Phan tram hoa hong");
        double bonus = Double.parseDouble(scanner.nextLine());
        double totalSalary = salary+kpi+(bonus/100*kpi);
        MarketingStaff staff = new MarketingStaff(name,totalSalary,kpi,bonus);
        marketingStaffs.add(staff);
        System.out.println("Them thanh cong nhan vien tiep thi");
    }

    @Override
    public void display(List<MarketingStaff> marketingStaffs, Scanner scanner) {
        System.out.println("Nhap id nhan vien");
        int id = Integer.parseInt(scanner.nextLine());
        for (MarketingStaff mkt: marketingStaffs){
            if (id==mkt.getId()) System.out.println(mkt);
            else System.out.println("Khong tim thay nhan vien");
        }
    }

    @Override
    public void delete(Scanner scanner, List<MarketingStaff> marketingStaffs) {
        System.out.println("Nhap id nhan vien muon xoa");
        int id = Integer.parseInt(scanner.nextLine());
        for (MarketingStaff mkt: marketingStaffs){
            if (id==mkt.getId()) {marketingStaffs.remove(mkt);
                System.out.println("Da xoa thanh cong");}
            else System.out.println("Khong tim thay nhan vien");
        }
    }

    @Override
    public void edit(Scanner scanner, List<MarketingStaff> marketingStaffs) {
        System.out.println("Nhap id nhan vien muon sua");
        int id = Integer.parseInt(scanner.nextLine());
        for (MarketingStaff mkt: marketingStaffs){
            if (id==mkt.getId()) {
                System.out.println("Nhap thong tin ban muon sua");
                System.out.println("Cap nhat doanh thu ban hang");
                double newKpi= Double.parseDouble(scanner.nextLine());
                System.out.println("Cap nhat phan tram hoa hong");
                double newBonus = Double.parseDouble(scanner.nextLine());
                mkt.setKpi(newKpi);
                mkt.setBonusPercent(newBonus);
                System.out.println("Cap nhat thanh cong");
            }
            else System.out.println("Khong tim thay nhan vien");
        }
    }


    public void findBySalary(Scanner scanner,List<MarketingStaff>marketingStaffs) {
        System.out.println("Bạn muốn tìm trong mức lương nào");
        System.out.println("1. Dưới 5 triệu");
        System.out.println("2. Trên 5 triệu-dưới 10 triệu");
        System.out.println("3. Trên 10 triệu");
        int answer = Integer.parseInt(scanner.nextLine());
        for (MarketingStaff mkt:marketingStaffs) {
            switch (answer) {
                case 1 -> {
                    if (mkt.getSalary() < 500000) ;
                    System.out.println(mkt);
                }
                case 2 -> {
                    if (mkt.getSalary() > 5000000 && mkt.getSalary() < 10000000)
                        System.out.println(mkt);
                }
                case 3 -> {
                    if (mkt.getSalary() > 10000000)
                        System.out.println(mkt);
                }
                default -> System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }
    public double calculateSalary(double salary, double kpi, double bonusPercent){
         return salary+kpi+(bonusPercent/100*kpi);
    }
public double calculateTaxes(double salary, double kpi, double bonusPercent){
        if (calculateSalary(salary,kpi,bonusPercent)<11000000) return 0;
        else return (calculateSalary(salary,kpi,bonusPercent)-11000000)*0.1;
}
}
