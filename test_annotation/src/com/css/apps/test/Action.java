package com.css.apps.test;

public enum Action {
	//枚举常量
	SUCCESS("success",0),
	ERROR("error",-1),
	;
	//枚举成员变量
	private String message;
	private int code;
	//带参数的构造方法 
	private Action(String message,int code) {
		// TODO Auto-generated constructor stub'
		this.message=message;
		this.code=code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	//覆盖父类的方法
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.code+"-"+this.message;
	}
	//自定义方法
	public static String getMessage(int code){
		for (Action action : Action.values()) {
			if(action.getCode()==code){
				return action.message;
			}
		}
		return null;
		
	}
  public static void main(String[] args) {
	System.out.println();
}


}
