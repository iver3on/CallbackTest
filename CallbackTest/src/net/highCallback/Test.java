/**
 * 
 */
package net.highCallback;

/**
 * @author Iver3oN Zhang
 * @date 2016年4月27日
 * @email grepzwb@qq.com
 * Test.java
 * Impossible is nothing
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 56;
        int b = 31;
        int c = 26497;
        int d = 11256;
        Student s1 = new Student("小明");
        Seller s2 = new Seller("老婆婆");
 
        s1.callHelp(a, b);
        s2.callHelp(c, d);
	}

}
