package sec02.verify.exam04;    //534자루의 연필을 30명의 학생들에게 똑같이 나눌 때, 1인당 몇 개를 가지며 몇 개가 남는지 구하기

public class Exam04 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = pencils / students;
        int pencilsLeft = pencils % students;

        System.out.println(pencilsPerStudent);
        System.out.println(pencilsLeft);
    }
}
