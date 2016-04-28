/**
 * 
 */
package net.zhangwenbo;

/**
 * @author Iver3oN Zhang
 * @date 2016年4月27日
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

	//fillBlank就是回调函数  回调的优势已经体现。
	/*可以很明显的看出，对于完成老师的填空题这个任务上，小明已经不需要等待到加法做完且结果填写在黑板上
	 * 才能去跟小伙伴们撒欢了，填空这个工作由超级计算器小红来做了。回调的优势已经开始体现了。 
	 */
	public void fillBlank(int a, int b, int result) {
		System.out.println(name + "求助小红计算:" + a + " + " + b + " = " + result);
	}
}
