/**
 * 
 */
package net.zhangwenbo;

/**
 * @author Iver3oN Zhang
 * @date 2016��4��27��
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
		//С��ͨ�������callHelp����������С�죨new SuperCalculator()����add������
		//�ڵ��õ�ʱ����������ã�this����������һ�����룬С����ʹ�ü������ó����֮��
		//�ص���С����fillBlank����������������˺ڰ��ϵĿո��
		Student s = new Student("С��");
		s.callHelp(a, b);
	}

}
