/*
Date와 SimpleDateFormat 클래스를 이용해서 오늘의 날짜를 다음과 같이 출력하는 프로그램을 작성해보세요.
2024년 05월 08일 화요일 10시 30분
 */
package sec02.verify.exam01;

import java.text.*;
import java.util.Date;

public class DatePrintExample {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");

        String sdfNow = sdf.format(now);
        System.out.println(sdfNow);
    }
}
