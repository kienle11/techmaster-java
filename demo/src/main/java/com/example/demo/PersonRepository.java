package com.example.demo;

import com.example.demo.model.Person;

import java.util.List;

public interface PersonRepository {
    List<Person> inSalaryRange(int start, int end); // Liệt kê danh sách những người có mức lương trong khoảng được chỉ định start -> end

    List<Person> startsWith(String prefix); // Liệt kê danh sách những người có tên bắt đầu bằng 1 prefix nào đó

    List<Person> sortByBirthYearDescending(); // Sắp xếp danh sách theo năm sinh giảm dần

    List<Person> top5HighestPaid(); // Lấy danh sách 5 người có mức lương cao nhất

    List<Person> inAgeRange(int start, int end) ;// Liệt kê danh sách những người có tuổi trong khoảng được chỉ định start -> end
}
