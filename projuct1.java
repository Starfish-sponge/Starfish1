package composition;

import java.util.Random;

public class projuct1 {
	static Random ran=new Random();
	static int[] array1 = new int[50];//��ż�����
	static String[] array2 =new String[50];//�����ʽ
	
	//�Ӽ�������
	private static void compute() {
		int r1,r2,m,sum;
		String ov;
		boolean bl; 
		for (int i=0;i<50;i++) {
			bl=false;
			while(bl==false) {
				r1= ran.nextInt(101);
				r2= ran.nextInt(101);
				m=ran.nextInt(2);
				if (m==1) {
					ov="+";
					sum=r1+r2;
					array1[i]=sum;
					array2[i]=r1+ov+r2;
					if (sum<=100) {
						bl=true;
					}
					else {bl= false;}
				}
				else {
					ov="-";
					sum=r1-r2;
					array1[i]=sum;
					array2[i]=r1+ov+r2;
					if (sum>=0) {
						bl=true;
					}else {bl=false;}
				}
			}
		}
	}
	//��Ŀ���ɹ���
	private static void Print() {
		System.out.print("���ɵ���ʽΪ:\n");
		for(int i=0;i<array1.length;i++) {
			System.out.print((i+1)+":"+array2[i]+"="+"\t");
			if((i+1)%5==0) {
				System.out.print("\n");
			}
		}
		
	}
	//���������
	private static void Result() {
		System.out.print("������Ϊ:\n");
		for (int i=0;i<array1.length;i++) {
			System.out.print((i+1)+":"+array1[i]+"\t");
			if ((i+1)%5==0) {
				System.out.print("\n");
			}
		}
	}
	

	
	public static void main(String[] args) {
		compute();
		Print();
		Result();
	}

}
