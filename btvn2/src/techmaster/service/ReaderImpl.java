package techmaster.service;

import techmaster.entities.Reader;

import java.util.List;
import java.util.Scanner;

public class ReaderImpl implements ITools<Reader>{

    public void manageReaderSelect(Scanner scanner, List<Reader>readers) {
        do {
            System.out.println("Bạn có thể thực hiện những việc sau");
            System.out.println("Thêm thông tin độc giả mới");
            System.out.println("Xóa 1 độc giả");
            System.out.println("Sửa thông tin độc giả");
            System.out.println("Hiển thị thông tin độc giả");
            System.out.println("Thoát");
            System.out.println("Mời bạn chọn");
            int choose =0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1 -> add(readers, scanner);
                    case 2 -> delete(readers, scanner);
                    case 3 -> edit(scanner, readers);
                    case 4 -> display(readers,scanner);
                    default -> System.out.println("Lựa chọn không hợp lệ ");
                }
            }catch (Exception ignored){}
            if (choose==5) break;
        }while (true);}

    @Override
    public void add(List<Reader> readers, Scanner scanner) {
        System.out.println("Nhập thông tin độc giả");
        System.out.println("Tên độc giả");
        String name = scanner.nextLine();
        System.out.println("Số điện thoại");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Địa chỉ");
        String address = scanner.nextLine();
        Reader reader = new Reader(name,phoneNumber,address);
        readers.add(reader);
        System.out.println("Đã thêm thành công");
    }

    @Override
    public void delete(List<Reader>readers, Scanner scanner) {
        System.out.println("Nhập id độc giả");
        int getID = Integer.parseInt(scanner.nextLine());
        for (Reader reader: readers) {
            if (getID == reader.getId()) {
            readers.remove(reader);
            System.out.println("Đã xóa thành công");
            } else{
            System.out.println("Không tìm thông tin người đọc");
            System.out.println("Thử tìm theo tên:");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase(reader.getName())){
            readers.remove(reader);
            System.out.println("Đã xóa thành công");}
            else System.out.println("Không tìm thấy thông tin người đọc");}
        }
    }

    @Override
    public void edit(Scanner scanner, List<Reader>readers) {
        System.out.println("Nhập id độc giả");
        int readerID = Integer.parseInt(scanner.nextLine());
        for (Reader reader: readers) {
            if (readerID == reader.getId()) {
                System.out.println("Nhập tên mới của độc giả");
                String nameUpdate = scanner.nextLine();
                System.out.println("Số điện thoại");
                int phoneNumberUpdate = Integer.parseInt(scanner.nextLine());
                System.out.println("Địa chỉ mới");
                String addressUpdate = scanner.nextLine();
                reader.setName(nameUpdate);
                reader.setPhoneNumber(phoneNumberUpdate);
                reader.setAddress(addressUpdate);
                System.out.println("Cập nhật thành công");
            } else{
                System.out.println("Không tìm thấy id độc giả");
                System.out.println("Thử tìm theo tên:");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase(reader.getName())){
                    System.out.println("Nhập tên mới của độc giả");
                    String nameUpdate = scanner.nextLine();
                    System.out.println("Số điện thoại");
                    int phoneNumberUpdate = Integer.parseInt(scanner.nextLine());
                    System.out.println("Địa chỉ mới");
                    String addressUpdate = scanner.nextLine();
                    reader.setName(nameUpdate);
                    reader.setPhoneNumber(phoneNumberUpdate);
                    reader.setAddress(addressUpdate);
                    System.out.println("Cập nhật thành công");
                } else System.out.println("Không tìm thấy độc giả");}
        }
    }

    @Override
    public void display(List<Reader> readers, Scanner scanner) {
        System.out.println("Tìm kiếm thông tin độc giả:");
        System.out.println("1. Theo ID");
        System.out.println("2. Theo tên");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 -> {
                System.out.println("Mời nhập id độc giả");
                int idReader = Integer.parseInt(scanner.nextLine());
                for (Reader readerID : readers) {
                if (idReader == readerID.getId()){
                System.out.println(readerID);}
                else System.out.println("Không tìm thấy độc giả");}
            }
            case 2 -> {
                System.out.println("Nhập tên");
                String readerName = scanner.nextLine();
                for (Reader reader: readers) {
                if (readerName.equalsIgnoreCase(reader.getName())) {
                System.out.println(reader);}
                else System.out.println("Không tìm thấy độc giả");}
            }
        }
    }
    public Reader findReaderByName(String name, List<Reader> readers) {
        for (Reader reader: readers) {
        if (name.equals(reader.getName())) {
        return reader;}}
        return null;}
}
