/**
 * 
 */
package net.highCallback;

/**
 * @author Iver3oN Zhang
 * @date 2016��4��27��
 * @email grepzwb@qq.com
 * Student.java
 * Impossible is nothing
 */
public class Student {
	 private String name = null;
	 
	    public Student(String name)
	    {
	        // TODO Auto-generated constructor stub
	        this.name = name;
	    }
	 
	    public void setName(String name)
	    {
	        this.name = name;
	    }
	 
	    public class doHomeWork implements doJob
	    {
	        @Override
	        public void fillBlank(int a, int b, int result)
	        {
	            // TODO Auto-generated method stub
	            System.out.println(name + "����С�����:" + a + " + " + b + " = " + result);
	        }
	    }
	 
	    //�ص�����
	    public void callHelp (int a, int b)
	    {
	        new SuperCalculator().add(a, b, new doHomeWork());
	    }
}
