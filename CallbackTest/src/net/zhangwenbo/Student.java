/**
 * 
 */
package net.zhangwenbo;

/**
 * @author Iver3oN Zhang
 * @date 2016��4��27��
 * @email grepzwb@qq.com Student.java Impossible is nothing
 */
public class Student {
	private String name = null;

	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void callHelp(int a, int b) {
		new SuperCalculator().add(a, b, this);
	}

	//fillBlank���ǻص�����  �ص��������Ѿ����֡�
	/*���Ժ����ԵĿ��������������ʦ���������������ϣ�С���Ѿ�����Ҫ�ȴ����ӷ������ҽ����д�ںڰ���
	 * ����ȥ��С����������ˣ������������ɳ���������С�������ˡ��ص��������Ѿ���ʼ�����ˡ� 
	 */
	public void fillBlank(int a, int b, int result) {
		System.out.println(name + "����С�����:" + a + " + " + b + " = " + result);
	}
}
