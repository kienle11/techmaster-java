import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập độ dài mảng");
            int n = Integer.parseInt(scanner.nextLine());
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập phần tử thứ " + (i + 1));
                int x = Integer.parseInt(scanner.nextLine());
                array[i] = x;
            }
            System.out.println(Arrays.toString(array));
            System.out.println("Thêm phần tử vào mảng");
            int array1[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                array1[i] = array[i];
            }
            System.out.println("Nhập thêm phần tử:");
            int value = Integer.parseInt(scanner.nextLine());
            array1[n] = value;
            System.out.println("Mảng số mới sau khi thêm phần tử" + Arrays.toString(array1));

            //Cho người dùng thay đổi giá trị nhập:
            String answer ="";
            System.out.println("Bạn có muốn sửa phần tử mới thêm vào? (Y/N)");
            answer = scanner.nextLine();
          while (answer.equals("y"))   {
              System.out.println("Nhập phần tử mới");
          value = Integer.parseInt(scanner.nextLine());
          array1[n]=value;
              System.out.println("Bạn có muốn sửa phần tử mới thêm vào? (Y/N)");
              answer = scanner.nextLine();
          }
            System.out.println(Arrays.toString(array1));

          //Đổi chỗ phần tử 2-3 ( array1[2] - array1[3])
            int temp1 = array1[2]; //temp1, temp2 là giá trị trung gian
            array1[2] = array1[3];
            array1[3] = temp1;
            System.out.println("Mảng số mới sau khi đổi chỗ:" + Arrays.toString(array1));

            // Sắp xếp thứ tự mảng tăng dần
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < n-i ; j++) {
                    if (array1[j + 1] < array1[j]) {
                        int temp2 = array1[j ];
                        array1[j] = array1[j + 1];
                        array1[j+1] = temp2;
                    }
                }
            }
            System.out.println("Mảng số sau khi sắp xếp tăng dần"+Arrays.toString(array1));
        }
    }
