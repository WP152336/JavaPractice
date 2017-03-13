/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 	| _ Operator
 *
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author jiheu
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i1=1700000;
		int i2=3;
		int i3=1500;
		long l1=(long)i1*(long)i2*(long)i3*12;
		System.out.println("<< 디미베네 연간 인건비 >>");
	 	System.out.println("월 평균 급여 : "+String.format("%,d",i1)+"원");
	 	System.out.println("점포 내 직원수 : "+String.format("%,d",i2)+"명");
	 	System.out.println("점포 수 : "+String.format("%,d",i3)+"개");
	 	System.out.println("\n");
	 	System.out.println("연간 인건비 : "+String.format("%,d",l1)+"원");

	 	
	}

}
