
public class LetterPrinters {
	
	public void printA(String S, int line, boolean lastLetter, String symbol, int time){ 
	
	int rowNumber = line;
	
	try{
		if(rowNumber==0){
			for(int d=0;d<8;d++){
				if(d==0){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==1){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==2){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==3){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==4){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==5){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==6){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==7){
					if(lastLetter){
						System.out.println(" ");
						Thread.sleep(time);
					}
					else{
						System.out.print("  ");
						Thread.sleep(time);
					}
				}
			}
		}
		else if(rowNumber==1){
			for(int d=0;d<8;d++){
				if(d==0){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==1){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==2){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==3){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==4){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==5){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==6){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==7){
					if(lastLetter){
						System.out.println(" ");
						Thread.sleep(time);
					}
					else{
						System.out.print("  ");
						Thread.sleep(time);
					}
				}
			}
		}
		else if(rowNumber==2){
			for(int d=0;d<8;d++){
				if(d==0){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==1){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==2){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==3){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==4){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==5){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==6){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==7){
					if(lastLetter){
						System.out.println(" ");
						Thread.sleep(time);
					}
					else{
						System.out.print("  ");
						Thread.sleep(time);
					}
				}
			}
		}
		else if(rowNumber==3){
			for(int d=0;d<8;d++){
				if(d==0){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==1){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==2){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==3){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==4){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==5){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==6){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==7){
					if(lastLetter){
						System.out.println(symbol);
						Thread.sleep(time);
					}
					else{
						System.out.print(symbol+" ");
						Thread.sleep(time);
					}
				}
			}
		}
		else if(rowNumber==4){
			for(int d=0;d<8;d++){
				if(d==0){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==1){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==2){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==3){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==4){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==5){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==6){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==7){
					if(lastLetter){
						System.out.println(symbol);
						Thread.sleep(time);
					}
					else{
						System.out.print(symbol+" ");
						Thread.sleep(time);
					}
				}
			}
		}
		else if(rowNumber==5){
			//System.out.println(rowNumber);
			for(int d=0;d<8;d++){
				if(d==0){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==1){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==2){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==3){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==4){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==5){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==6){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==7){
					if(lastLetter){
						System.out.println(symbol);
						Thread.sleep(time);
					}
					else{
						System.out.print(symbol+" ");
						Thread.sleep(time);
					}
				}
			}
		}
		else if(rowNumber==6){
			for(int d=0;d<8;d++){
				if(d==0){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==1){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==2){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==3){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==4){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==5){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==6){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==7){
					if(lastLetter){
						System.out.println(symbol);
						Thread.sleep(time);
					}
					else{
						System.out.print(symbol+" ");
						Thread.sleep(time);
					}
				}
			}
		}
		else{
			for(int d=0;d<8;d++){
				if(d==0){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==1){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==2){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==3){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==4){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==5){
					System.out.print(" ");
					Thread.sleep(time);
				}
				else if(d==6){
					System.out.print(symbol);
					Thread.sleep(time);
				}
				else if(d==7){
					if(lastLetter){
						System.out.println(symbol);
						Thread.sleep(time);
					}
					else{
						System.out.print(symbol+" ");
						Thread.sleep(time);
					}
				}
			}
		}	
	}
	catch(InterruptedException e){
		e.printStackTrace();
	}
}    

	public void printB(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print(" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print(" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print(" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print(" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print(" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				//System.out.println(rowNumber);
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print(" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print(" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print(" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printC(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				//System.out.println(rowNumber);
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void printD(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println("  ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println("  ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println("  ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println("  ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printE(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printF(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printG(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printH(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printI(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==7){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printJ(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==7){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printK(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==7){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printL(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==7){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	public void printM(String S, int line, boolean lastLetter, String symbol, int time){ 
		
	 	int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				//System.out.println(rowNumber);
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printN(String S, int line, boolean lastLetter, String symbol, int time){ 
		
	 	int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				//System.out.println(rowNumber);
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printW(String S, int line, boolean lastLetter, String symbol, int time){ 
		
	 	int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				//System.out.println(rowNumber);
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printO(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void printP(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void printQ(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void printR(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void printS(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void printT(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==7){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
		
	public void printU(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void printV(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void printX(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void printY(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void printZ(String S, int line, boolean lastLetter, String symbol, int time){ 
		
		int rowNumber = line;
		
		try{
			if(rowNumber==0){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
				//System.out.println();
			}
			else if(rowNumber==1){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==2){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==3){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==4){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==5){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else if(rowNumber==6){
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(" ");
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(" ");
							Thread.sleep(time);
						}
						else{
							System.out.print("  ");
							Thread.sleep(time);
						}
					}
				}
			}
			else{
				for(int d=0;d<8;d++){
					if(d==0){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==1){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==2){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==3){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==4){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==5){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==6){
						System.out.print(symbol);
						Thread.sleep(time);
					}
					else if(d==7){
						if(lastLetter){
							System.out.println(symbol);
							Thread.sleep(time);
						}
						else{
							System.out.print(symbol+" ");
							Thread.sleep(time);
						}
					}
				}
			}	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
