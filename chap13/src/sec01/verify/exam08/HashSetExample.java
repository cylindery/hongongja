/*
HashSet에 Student 객체를 저장하려고 한다. 학번이 같으면 동일한 Student라고 가정하고 중복 저장이 되지 않도록
 */
package sec01.verify.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "조민우"));

        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.studentNum + ":" + student.name);
        }
    }
}
