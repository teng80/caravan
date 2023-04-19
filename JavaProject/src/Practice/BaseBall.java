package Practice;

import java.util.Scanner;

public class BaseBall {

	static final int COUNT = 3;
	
	public static void main(String[] args) {

		int iRoc1, iRoc2, iStrike = 0, iBall = 0, iOut = 0;
		int[] iAnswer = new int[COUNT];
		int[] iInput = new int[COUNT];
		boolean bRepeat, bOut = true;
		int iInputCount = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<COUNT; i++)
		{
			while(true)				//���� �ݺ����� �ʰ�
			{
				bRepeat = false;
				iAnswer[i] = (int)(10*Math.random());		//0~9���� ������
				if ( iAnswer[i] == 0)
				{
					iAnswer[i]++;			//0�� ������ ������ 1�� �ٲ�
				}
				
				for(int j=0; j<i; j++)
				{	
					if(iAnswer[j] == iAnswer[i])
					{
						bRepeat = true;
						break;
					}
				}
				if(bRepeat) continue;
				else break;
			}		
		}
	/*
		for(int i=0; i<COUNT; i++)
		{
			System.out.printf("%d ", iAnswer[i]);
		}
		System.out.println();
		*/
		while(true)
		{
			System.out.println("���� 3���� �Է��ϼ���: ");
			for(iRoc1=0; iRoc1<COUNT; iRoc1++)
				iInput[iRoc1] = sc.nextInt();
				iInputCount++;
			
			for(iRoc1=0; iRoc1<COUNT; iRoc1++)
			{
				for(iRoc2=0; iRoc2<COUNT; iRoc2++)
				{
					if(iAnswer[iRoc1] == iInput[iRoc2])
					{
						if(iRoc1 == iRoc2)    iStrike++;	//���� ���� �ڸ��� ������
						else 				  iBall++;		//���ڴ� ������ �ڸ��� �ٸ���
						bOut = false;
					}	   
				}
				if ( bOut ) 
				{
					iOut++;
				}
			}	
			
			System.out.printf("%d Strike %d Ball %d Out�Դϴ�\n", iStrike, iBall, iOut);
			
			if(iStrike == COUNT)
			{
				System.out.print("������ ");
				for(int i=0; i<COUNT; i++)
				{			
					if(i == COUNT-1)
						System.out.printf("%d", iAnswer[i]);
					else
						System.out.printf("%d ", iAnswer[i]);
				}	
		
				System.out.printf("�Դϴ�\n"); 		
				System.out.printf("�� %d�� ���� �Է��Ͽ����ϴ�.\n", iInputCount);
				sc.close();
				break; 
			}
			iStrike = 0;
			iBall = 0;
			iOut = 0;
			bOut = true;
		} 		
		iInputCount = 0;	
	}

}
