
public class Main {
	
	public static void main(String[] args){
		
		LetterPrinters letterPrinter = new LetterPrinters();
		
		String banner = args[0];
		String symbol = args[1];
		String timeString = args[2];
		int time = Integer.parseInt(timeString);
		
		int gridRowNumber = 8;
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int c=0; c<gridRowNumber; c++){
			for(int d=0; d<banner.length(); d++){
				char check = banner.charAt(d);
				String stringToCheck = Character.toString(check);
				boolean lastLetter = false;
				if((int)check == 87){
					
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printW(stringToCheck, c, lastLetter, "W", time);
						}
						else{
							letterPrinter.printW(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printW(stringToCheck, c, lastLetter, "W", time);
						}
						else{
							letterPrinter.printW(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					
					
				}
				else if((int)check == 65){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printA(stringToCheck, c, lastLetter, "A", time);
						}
						else{
							letterPrinter.printA(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printA(stringToCheck, c, lastLetter, "A", time);
						}
						else{
							letterPrinter.printA(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				
				else if((int)check == 67){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printC(stringToCheck, c, lastLetter, "C", time);
						}
						else{
							letterPrinter.printC(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printC(stringToCheck, c, lastLetter, "C", time);
						}
						else{
							letterPrinter.printC(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 66){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printB(stringToCheck, c, lastLetter, "B", time);
						}
						else{
							letterPrinter.printB(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printB(stringToCheck, c, lastLetter, "B", time);
						}
						else{
							letterPrinter.printB(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 68){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printD(stringToCheck, c, lastLetter, "D", time);
						}
						else{
							letterPrinter.printD(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printD(stringToCheck, c, lastLetter, "D", time);
						}
						else{
							letterPrinter.printD(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 69){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printE(stringToCheck, c, lastLetter, "E", time);
						}
						else{
							letterPrinter.printE(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printE(stringToCheck, c, lastLetter, "E", time);
						}
						else{
							letterPrinter.printE(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 70){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printF(stringToCheck, c, lastLetter, "F", time);
						}
						else{
							letterPrinter.printF(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printF(stringToCheck, c, lastLetter, "F", time);
						}
						else{
							letterPrinter.printF(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 71){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printG(stringToCheck, c, lastLetter, "G", time);
						}
						else{
							letterPrinter.printG(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printG(stringToCheck, c, lastLetter, "G", time);
						}
						else{
							letterPrinter.printG(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 72){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printH(stringToCheck, c, lastLetter, "H", time);
						}
						else{
							letterPrinter.printH(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printH(stringToCheck, c, lastLetter, "H", time);
						}
						else{
							letterPrinter.printH(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 73){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printI(stringToCheck, c, lastLetter, "I", time);
						}
						else{
							letterPrinter.printI(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printI(stringToCheck, c, lastLetter, "I", time);
						}
						else{
							letterPrinter.printI(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 74){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printJ(stringToCheck, c, lastLetter, "J", time);
						}
						else{
							letterPrinter.printJ(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printJ(stringToCheck, c, lastLetter, "J", time);
						}
						else{
							letterPrinter.printJ(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 75){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printK(stringToCheck, c, lastLetter, "K", time);
						}
						else{
							letterPrinter.printK(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printK(stringToCheck, c, lastLetter, "K", time);
						}
						else{
							letterPrinter.printK(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 76){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printL(stringToCheck, c, lastLetter, "L", time);
						}
						else{
							letterPrinter.printL(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printL(stringToCheck, c, lastLetter, "L", time);
						}
						else{
							letterPrinter.printL(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 77){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printM(stringToCheck, c, lastLetter, "M", time);
						}
						else{
							letterPrinter.printM(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printM(stringToCheck, c, lastLetter, "M", time);
						}
						else{
							letterPrinter.printM(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 78){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printN(stringToCheck, c, lastLetter, "N", time);
						}
						else{
							letterPrinter.printN(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printN(stringToCheck, c, lastLetter, "N", time);
						}
						else{
							letterPrinter.printN(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 79){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printO(stringToCheck, c, lastLetter, "O", time);
						}
						else{
							letterPrinter.printO(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printO(stringToCheck, c, lastLetter, "O", time);
						}
						else{
							letterPrinter.printO(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 80){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printP(stringToCheck, c, lastLetter, "P", time);
						}
						else{
							letterPrinter.printP(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printP(stringToCheck, c, lastLetter, "P", time);
						}
						else{
							letterPrinter.printP(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 81){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printQ(stringToCheck, c, lastLetter, "Q", time);
						}
						else{
							letterPrinter.printQ(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printQ(stringToCheck, c, lastLetter, "Q", time);
						}
						else{
							letterPrinter.printQ(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 82){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printR(stringToCheck, c, lastLetter, "R", time);
						}
						else{
							letterPrinter.printR(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printR(stringToCheck, c, lastLetter, "R", time);
						}
						else{
							letterPrinter.printR(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 83){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printS(stringToCheck, c, lastLetter, "S", time);
						}
						else{
							letterPrinter.printS(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printS(stringToCheck, c, lastLetter, "S", time);
						}
						else{
							letterPrinter.printS(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 84){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printT(stringToCheck, c, lastLetter, "T", time);
						}
						else{
							letterPrinter.printT(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printT(stringToCheck, c, lastLetter, "T", time);
						}
						else{
							letterPrinter.printT(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 85){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printU(stringToCheck, c, lastLetter, "U", time);
						}
						else{
							letterPrinter.printU(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printU(stringToCheck, c, lastLetter, "U", time);
						}
						else{
							letterPrinter.printU(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 86){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printV(stringToCheck, c, lastLetter, "V", time);
						}
						else{
							letterPrinter.printV(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printV(stringToCheck, c, lastLetter, "V", time);
						}
						else{
							letterPrinter.printV(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 88){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printX(stringToCheck, c, lastLetter, "X", time);
						}
						else{
							letterPrinter.printX(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printX(stringToCheck, c, lastLetter, "X", time);
						}
						else{
							letterPrinter.printX(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 89){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printY(stringToCheck, c, lastLetter, "Y", time);
						}
						else{
							letterPrinter.printY(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printY(stringToCheck, c, lastLetter, "Y", time);
						}
						else{
							letterPrinter.printY(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
				else if((int)check == 90){
					if(d == banner.length()-1){
						lastLetter = true;
						if(symbol.equals("own")){
							letterPrinter.printZ(stringToCheck, c, lastLetter, "Z", time);
						}
						else{
							letterPrinter.printZ(stringToCheck, c, lastLetter, symbol, time);
						}
					}
					else{
						if(symbol.equals("own")){
							letterPrinter.printZ(stringToCheck, c, lastLetter, "Z", time);
						}
						else{
							letterPrinter.printZ(stringToCheck, c, lastLetter, symbol, time);
						}
					}
				}
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
}
