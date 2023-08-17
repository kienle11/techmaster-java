package techmaster.service;

import java.util.List;
import java.util.Scanner;

public interface ITools<T> {
    void add(List<T> list, Scanner scanner);
    void delete(List<T> list, Scanner scanner);
    void edit(Scanner scanner, List<T> list);
    void display(List<T> list, Scanner scanner);
}
