/**
 * 
 */
package net.zhangwenbo;

/**
 * @author Iver3oN Zhang
 * @date 2016年4月27日
 * @email grepzwb@qq.com Test.java Impossible is nothing
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 26549;
		int b = 16487;
		//小明通过自身的callHelp方法调用了小红（new SuperCalculator()）的add方法，
		//在调用的时候将自身的引用（this）当做参数一并传入，小红在使用计算器得出结果之后，
		//回调了小明的fillBlank方法，将结果填在了黑板上的空格里。
		Student s = new Student("小明");
		s.callHelp(a, b);
	}

}
