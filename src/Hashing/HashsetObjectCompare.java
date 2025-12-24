package Hashing;

import java.util.HashSet;
import java.util.Objects;

class student
{
    int rollno;
    String name;

    public student(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        student other = (student) obj;
        return rollno == other.rollno && name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Id: " + rollno + " Name:" + name;
    }
}

public class HashsetObjectCompare
{
    public static void main(String[] args)
    {
        HashSet<student> hs = new HashSet<>();
        hs.add(new student(1,"abc"));
        hs.add(new student(2,"def"));
        hs.add(new student(1,"abc"));
        System.out.println(hs.size());
        System.out.println(hs.toString());
    }
}
