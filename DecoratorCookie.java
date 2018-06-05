// package com.company.oop;
/* 자바 데코레이터 패턴 JDM's Blog = http://jdm.kr/blog/78
 */

public class DecoratorCookie {

/* Cookie Interface */
public interface Cookie {
public String getName();
// 쿠키의 이름을 얻습니다.
}

/* Create Cookie */
public class BraveCookie implements Cookie  {
@Override
public String getName() {
        return "용감한쿠키";
}
}


public static void main(String[] args ) {

        // 그냥 용감한 쿠키 만들기
        Cookie braveCookie = new BraveCookie();

        // 우유를 얹은 용감한 쿠키 만들기
        Cookie milkBraveCookie = new MilkTopping(braveCookie);

        // 그위에 초콜릿을 얹은 용감한 쿠키 만들기
        Cookie chocolateMilkBraveCookie = new ChocolateTopping(milkBraveCookie);

        // 그위에 우유를 한번 더 넣은 용감한 쿠키 만들기
        Cookie chocolateDoubleMilkBraveCookie = new MilkTopping(chocolateMilkBraveCookie);

        System.out.println(chocolateDoubleMilkBraveCookie.getName());

        // 소다 쿠키 만들기 = 쿠키클라스에서 반홥값을 '소다쿠키'로 @오버라이드 시킴
        Cookie SodaCookie = new Cookie() {
                @Override
                public String getName() {
                        return "소다쿠키";
                }
        };

        // 초콜릿을 두번 넣은 소다 쿠키 만들기
        SodaCookie = new ChocolateTopping(new ChocolateTopping(SodaCookie));

        System.out.println(SodaCookie.getName());
}

}
