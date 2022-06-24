package ru.itsjava.stu;

import java.util.Objects;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) { //в параметре объявляем объект о класса Object (так как все объекты наследуются от класса Object)
        if (this == o) return true; //проверяем равенство объектов обычным ==
        if (o == null || getClass() != o.getClass()) return false; //проверяем объект о на пустоту и на принадлежность к одному классу со сравниваемым объектом
        Student student = (Student) o; //предыдущие условия не выполнились, значит создаем новый объект класса сравниваемого объекта и присваеваем ему объект о
        return id == student.id && Objects.equals(name, student.name);
        //в последней строке проверяем на равенство уникальное поле и сравниваем один из параметров сравниваемого объекта с параметром искомого объекта о
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
