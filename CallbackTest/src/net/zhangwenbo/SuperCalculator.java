/**
 * 
 */
package net.zhangwenbo;

/**
 * @author Iver3oN Zhang
 * @date 2016年4月27日
 * @email grepzwb@qq.com SuperCalculator.java Impossible is nothing
 */
public class SuperCalculator {
	public void add(int a, int b, Student xiaoming) {
		int result = a + b;
		//调用回调函数  
		xiaoming.fillBlank(a, b, result);
	}
}
