package ghm;

import java.util.Random;
public class Ab {
	public static void main(String[] args) {
		int[] first=new int [50];
		int[] second=new int [50];
		int[] chars=new int [50];//chars�����洢�������0���������1����ӷ�
		printHeader();
		generateEquations(first,second,chars);
		printExercise(first,second,chars);
		printCalculations(first,second,chars);

	}
	static void  printHeader() {
		System.out.println("���������ʮ��100���ڵļӼ�����ʽ��ϰ�⣺");
		System.out.println("ÿ�����г���ɵõ�һ��50�����ϰ�⼯��");
	}
	static void generateEquations(int[] first,int[] second,int[] chars) {
		
		Random r=new Random();
		for(int i=0;i<50;i++) {
			first[i]=r.nextInt(101);
			second[i]=r.nextInt(101);
			chars[i]=r.nextInt(2);
			if(chars[i]==0) {
				if(first[i]-second[i]<0){
					i--;
					continue;
				}		
			}
			else {
				if(first[i]+second[i]>100) {
					i--;
					continue;
				}
				
			}
			int flag=0;
			for(int j=i-1;j>=0;j--) {
				if(first[i]==first[j]&&second[i]==second[j]&&chars[i]==chars[j]) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				i--;
				continue;
			}
		}
	}
	static void printExercise(int[] first,int[] second,int[] chars) {
		for(int i=0;i<50;i++) {
			if(chars[i]==0) {
				System.out.print(""+first[i]+"-"+second[i]+"   ");
			}
			else{
				System.out.print(""+first[i]+"+"+second[i]+"   ");
			}
			if(i%5==0) {
				System.out.println("");
			}
		}
	}
	static void printCalculations(int[] first,int[] second,int[] chars) {
		for(int i=0;i<50;i++) {
			if(chars[i]==0) {
				System.out.print(first[i]-second[i]+"   ");
			}
			else{
				System.out.print(first[i]+second[i]+"   ");
			}
			if(i%5==0) {
				System.out.println("");
			}
		}
	}
}