package test;

public class J_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;//�������i��������ֵ0
		aBreakBlock:
		{
			System.out.println("��break���֮ǰ");
			if(i<=0)
				break aBreakBlock;
			System.out.println("��if��break���֮��");
		}//����aBreakBlock����
		System.out.println("��aBreakBlock����֮��");

	}//����main����

}//��J_Break����
