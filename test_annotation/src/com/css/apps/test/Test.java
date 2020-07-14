package com.css.apps.test;

import java.util.EnumMap;
/**
 * 枚举测试
 * @author yang
 *
 */
public class Test {

	public enum Color{
		RED("red",1),GREEN("green",2),BLACK("black",3),BLUE("blue",4),PINK("pink",5),YELLOW("yellow",6);
		private String name;
		private int index;
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.index+"-"+this.name;
		}
		private Color(String name,int index) {
			// TODO Auto-generated constructor stub
			this.name=name;
			this.index=index;
		}
		private Color() {
			// TODO Auto-generated constructor stub
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		

	}
	public static void main(String[] args) {
		System.out.println(Color.RED);
		Color[] values = Color.values();
		for (Color color : values) {
			System.out.println(color);
		}
		Test test=new Test();
		String url=test.getURL(DataBaseType.MYSQL);

	    System.out.println(url);
	}

	//定义数据库类型枚举
	public enum DataBaseType
	{
	    MYSQL,ORACLE,DB2,SQLSERVER
	}
	//某类中定义的获取数据库URL的方法以及EnumMap的声明
	private EnumMap<DataBaseType,String>urls=new EnumMap<DataBaseType,String>(DataBaseType.class);
	public Test()
	{
	    urls.put(DataBaseType.DB2,"jdbc:db2://localhost:5000/sample");
	    urls.put(DataBaseType.MYSQL,"jdbc:mysql://localhost/mydb");
	    urls.put(DataBaseType.ORACLE,"jdbc:oracle:thin:@localhost:1521:sample");
	    urls.put(DataBaseType.SQLSERVER,"jdbc:microsoft:sqlserver://sql:1433;Database=mydb");
	}
	//根据不同的数据库类型，返回对应的URL
	//@param type DataBaseType 枚举类新实例
	//@return
	public String getURL(DataBaseType type)
	{
	    return this.urls.get(type);
	}
	

}
