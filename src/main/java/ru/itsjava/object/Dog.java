package ru.itsjava.object;

import lombok.*;

@AllArgsConstructor
@Data
@RequiredArgsConstructor

public class Dog {
    private final String nickname;
    private int pawsCount;

//    public Dog(String nickname, int pawsCount) {
//        this.nickname = nickname;
//        this.pawsCount = pawsCount;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Dog dog = (Dog) o;
//
//        if (pawsCount != dog.pawsCount) return false;
//        return nickname.equals(dog.nickname);
//    }
//
//    @Override
//    public int hashCode() {
//        return nickname.hashCode();
//    }
//
//    @Override
//    public String toString() {
//        return "Dog{" +
//                "nickname='" + nickname + '\'' +
//                ", pawsCount=" + pawsCount +
//                '}';
//    }
}
