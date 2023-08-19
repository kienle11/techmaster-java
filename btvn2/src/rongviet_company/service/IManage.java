package rongviet_company.service;

import java.util.List;
import java.util.Scanner;

public interface IManage<T>{
    void add(Scanner scanner, List<T>list);
    void display(List<T>list,Scanner scanner);
    void delete(Scanner scanner,List<T>T);
    void edit(Scanner scanner, List<T>T);
}
