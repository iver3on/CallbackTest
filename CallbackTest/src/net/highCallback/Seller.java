/**
 * 
 */
package net.highCallback;

/**
 * @author Iver3oN Zhang
 * @date 2016年4月27日
 * @email grepzwb@qq.com
 * Seller.java
 * Impossible is nothing
 */
public class Seller {
	 private String name = null;
	 
	    public Seller(String name)
	    {
	        // TODO Auto-generated constructor stub
	        this.name = name;
	    }
	 
	    public void setName(String name)
	    {
	        this.name = name;
	    }
	 
	    //内部类实现doJob接口，使得这个类具有接口的方法
	    public class doHomeWork implements doJob
	    {
	 
	        @Override
	        public void fillBlank(int a, int b, int result)
	        {
	            // TODO Auto-generated method stub
	            System.out.println(name + "求助小红算账:" + a + " + " + b + " = " + result + "元");
	        }
	 
	    }
	 
	    public void callHelp (int a, int b)
	    {
	        new SuperCalculator().add(a, b, new doHomeWork());
	    }
}
