package com.test;
import java.awt.Color;

import com.abc.*; // 호출하고자 하는 패키지의 클래스까지만 선언
import com.abc.MTest02;
// rt.jar    - > java.long.*   import 없이 사용한다
public class MTest01 { // 실행단위

	public static void main(String[] args) { // 명령 호출단위
		// com.abc.MTest.main02();
		MTest02.main02();
		System.out.println(Math.PI);
		System.out.println(Color.BLUE);
	}
}
