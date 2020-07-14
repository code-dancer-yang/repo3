package com.css.apps.test;

public enum Action {
	//ö�ٳ���
	SUCCESS("success",0),
	ERROR("error",-1),
	;
	//ö�ٳ�Ա����
	private String message;
	private int code;
	//�������Ĺ��췽�� 
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
	//���Ǹ���ķ���
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.code+"-"+this.message;
	}
	//�Զ��巽��
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
