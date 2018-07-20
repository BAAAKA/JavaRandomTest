import java.util.Random;

public class random {
	Random rand = new Random();
	int[] oneToTen=new int[10];
	double all=1000000;
	public random(){
		go();
		prints();
		}
		public void go(){
			oneToTen[0]=0;
			System.out.println("0: 0");
			for(int i=0; i<all; i++){
				int number=rand.nextInt(10)+1;
				System.out.println(number);
				switch(number){
				case 1: oneToTen[0]+=1; break;
				case 2: oneToTen[1]+=1; break;
				case 3: oneToTen[2]+=1; break;
				case 4: oneToTen[3]+=1; break;
				case 5: oneToTen[4]+=1; break;
				case 6: oneToTen[5]+=1; break;
				case 7: oneToTen[6]+=1; break;
				case 8: oneToTen[7]+=1; break;
				case 9: oneToTen[8]+=1; break;
				case 10: oneToTen[9]+=1; break;
				}
				
					
			}
		}
		public void prints(){
			double percent=0;
			for(int i=0; i<oneToTen.length; i++){
				int i2=i+1;
				double inttodouble=oneToTen[i];
				percent=inttodouble*100/all;
				System.out.println("There were "+ all + " numbers" );
				System.out.println("Number: " + i2 + " has " + oneToTen[i] + " ,Thats " + percent + "% of them all");
			}
		}
}
