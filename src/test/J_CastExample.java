package test;

public class J_CastExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short a=100;
    	long b=a;//��������ת��    	
    	System.out.print("����ת����������"+a+"��ɳ�����"+b+"\n");  
    	
        b=123456789L;
        a=(short)b;//��ʽ����ת����ǿ������ת��       
        System.out.print("����ת����������"+b+"��ɶ�����"+a);
        
	}//����J_CastExample����
}//��one����