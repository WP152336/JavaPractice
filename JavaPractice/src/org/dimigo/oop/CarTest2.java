/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	| _ CarTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author jiheu
 * @version : 1.0
 */
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car =new Car2();
		System.out.println("<< 자동차 목록 >>");
		System.out.printf("제조사명 : %s\n",car.getCompany());
		System.out.printf("모델명 : %s\n",car.getModel());
		System.out.printf("색상 : %s\n",car.getColor());
		System.out.printf("최대속도 : %dkm\n",car.getMaxSpeed());
		System.out.println(String.format("가격 : %,d원\n",car.getPrice()));
		
		Car2 car2 = new Car2("기아자동차","K7","흰색",246,40000000);
		System.out.printf("제조사명 : %s\n",car2.getCompany());
		System.out.printf("모델명 : %s\n",car2.getModel());
		System.out.printf("색상 : %s\n",car2.getColor());
		System.out.printf("최대속도 : %dkm\n",car2.getMaxSpeed());
		System.out.println(String.format("가격 : %,d원\n",car2.getPrice()));
		
		Car2 car3 = new Car2("삼성자동차","SM7","회색",200,38000000);
		System.out.printf("제조사명 : %s\n",car3.getCompany());
		System.out.printf("모델명 : %s\n",car3.getModel());
		System.out.printf("색상 : %s\n",car3.getColor());
		System.out.printf("최대속도 : %dkm\n",car3.getMaxSpeed());
		System.out.println(String.format("가격 : %,d원\n",car3.getPrice()));
	}

}
