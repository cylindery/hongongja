package sec02.exam01;   //현재 날짜를 출력하기. Date 클래스 또는 원하는 문자열 형식으로 얻기 위해 SimpleDateFormat 클래스 이용

import java.util.*;
import java.text.*;

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);

        //SimpleDateFormat은 형식 개체이므로 Date 객체 만든 것을 끼워 넣어야 한다
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);
    }
}
