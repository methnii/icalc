import java.util.*;
class coursework5{
	public static void main(String args[]){	
		Scanner input=new Scanner(System.in);
		L1:while (true)
		{
		
		System.out.println("                                         __   ______             __");
            System.out.println("                                        |  \\ /      \\           |  \\");
            System.out.println("                                         \\$$|  $$$$$$\\  ______  | $$  _______");
            System.out.println("                                        |  \\| $$   \\$$ |      \\ | $$ /       \\");
            System.out.println("                                        | $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
            System.out.println("                                        | $$| $$   __  /      $$| $$| $$");
            System.out.println("                                        | $$| $$__/  \\|  $$$$$$$| $$| $$_____");
            System.out.println("                                        | $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
            System.out.println("                                         \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$");
            System.out.println(" ");
			System.out.println("   _   _                       _                       _____                                      _");
            System.out.println("  | \\ | |                     | |		      / ____|                                    | |");
            System.out.println("  |  \\| |  _   _   _ __ ___   | |__     ___   _ __   | |       ___    _ __  __   __  ___   _ __  | |_   ___   _ __");
            System.out.println("  | .   | | | | | | '_ ' _ \\  | '_ \\   / _ \\ | '__|  | |      / _ \\  | '_ \\ \\ \\ / / / _ \\ | '__| | __| / _ \\ | '__|");
            System.out.println("  | |\\  | | |_| | | | | | | | | |_) | |  __/ | |     | |____ | (_) | | | | | \\ v / |  __/ | |    | |_ |  __/ | |");
            System.out.println("  |_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|      \\_____| \\___/  |_| |_|  \\_/   \\___| |_|     \\__| \\___| |_|");
            System.out.println("==================================================================================================================================");
            System.out.println("\n\n\n");
		
		
				System.out.println("(01) Decimal converter\n");
				System.out.println("(02) Binary converter\n");
				System.out.println("(03) Octal converter\n");
				System.out.println("(04) Hexadecimal converter\n");
				System.out.println("(05) Roman number converter\n");
				
				System.out.print("Enter an option ->");
				int num=input.nextInt();
				char yn;
				char yn2;
		
		
						L2:while (true){
						switch(num){	
						case 1 :
						
						
						
							
						
						System.out.println("+-------------------------------------------------+");
						System.out.println("|		Decimal Converter		  |");
						System.out.println("+-------------------------------------------------+\n\n");
				
						
						System.out.print("Enter a decimal number: ");
						int maindecimalnumber=input.nextInt();
						
        
       
						if (maindecimalnumber < 0) {
								System.out.println("Invalid input....");
								 System.out.print("Do you want to input number again (Y/N)->");
								 yn = input.next().charAt(0);
								 if (yn=='Y')
								 {
									 continue L2;
								 }else{
									 break L2;
								 }
						
						}
						
							String binaryString = "";
							int decimalnumber =maindecimalnumber;
						do 
						{
							int remainder=decimalnumber%2;
							 binaryString=remainder+binaryString; 
							decimalnumber=decimalnumber/2;
						}while (decimalnumber>0);
						
							 System.out.println("Binary number : " + binaryString);
							 
							String octalString = "";
							decimalnumber = maindecimalnumber;
							
							
						do 
						{
							int remainder=decimalnumber%8;
							 octalString=remainder+octalString; 
							decimalnumber=decimalnumber/8;
						}while (decimalnumber>0);
						
							 System.out.println("octal number : " + octalString);
							
						
						String hexadString = "";
						decimalnumber = maindecimalnumber;
							 
							 
							 
						do 
						{
							int remainder=decimalnumber%16;
							if (remainder < 10) {
									hexadString = (char) (remainder + '0') + hexadString;
								} else {
									hexadString = (char) (remainder - 10 + 'A') + hexadString;
								}
							        
								decimalnumber=decimalnumber/16;
						}while (decimalnumber>0);
						
							 System.out.println("Hexadecimal number : " + hexadString);
							
                              System.out.print("Do you want to go to homepage (Y/N)->");
								yn = input.next().charAt(0);
								if (yn=='Y')
								 {
									 continue L1;
								 }else{
									 break L1;
								 }
                           
						
				  
					  
						
						
						case 2 :
						L3: while (true){
						System.out.println("+-------------------------------------------------+");
						System.out.println("|		Binary Converter		  |");
						System.out.println("+-------------------------------------------------+\n\n");
						
						System.out.print("Enter an binary number : ");
						int binarynm=input.nextInt();
						
						
						
						int count=0;
						int binaryvaluelast=0;
						int binarynmtwo=0;
						
						do
						{
								
								binarynmtwo=binarynm%10;
								binarynm=binarynm/10;
								int binaryvalue=(int)Math.pow(2,count);
								 binaryvaluelast = binaryvaluelast + binarynmtwo * binaryvalue;
								count++;
						} while (binarynm>0);
						
							System.out.println("Binary number : "+binaryvaluelast);
							
							String octalString1 = "";
							decimalnumber = binaryvaluelast;
								
						
						
						do 
						{
							int remainder=decimalnumber%8;
							 octalString1=remainder+octalString1; 
							decimalnumber=decimalnumber/8;
						}while (decimalnumber>0);
						
							 System.out.println("octal number : " + octalString1);
							
						
						String hexadString1 = "";
						decimalnumber = binaryvaluelast;
							 
							 
							 
						do 
						{
							int remainder=decimalnumber%16;
							if (remainder < 10) {
									hexadString1 = (char) (remainder + '0') + hexadString1;
								} else {
									hexadString1 = (char) (remainder - 10 + 'A') + hexadString1;
								}
							        
								decimalnumber=decimalnumber/16;
						}while (decimalnumber>0);
						
							 System.out.println("Hexadecimal number : " + hexadString1);
							  System.out.print("Do you want to go to homepage (Y/N)->");
								yn = input.next().charAt(0);
								if (yn=='Y')
								 {
									 continue L1;
								 }else{
									 break L1;
								 }
					 }
							
						
					
					
						case 3 :
						L3: while (true){
						System.out.println("+-------------------------------------------------+");
						System.out.println("|		Octal Converter		  	  |");
						System.out.println("+-------------------------------------------------+\n\n");
						
						System.out.print("Enter an octal number : ");
						int octalnum=input.nextInt();
						
						
							
							int toctalnum=octalnum;
							int exponent=0;
							int decimalvalue=0;
							
							
							for (int i = toctalnum ; i!=0 ; i/=10)
							{
								int remainder =i % 10;
								decimalvalue += remainder * ((int)Math.pow(8,exponent));
								exponent++;	
							}
							
							System.out.println("Decimal value : " +decimalvalue );
							int decimalvalue1 = decimalvalue;
							 
							
							
							String binaryString2 = "";
							do 
							{
							int remainder=decimalvalue%2;
							 binaryString2=remainder+binaryString2; 
							decimalvalue=decimalvalue/2;
							
							
							}while (decimalvalue>0);
						
							System.out.println("Binary number : " + binaryString2);
							
							
							String hexadString2 = "";
							do 
							{
							int remainder=decimalvalue1%16;
							if (remainder < 10) {
									hexadString2 = (char) (remainder + '0') + hexadString2;
								} else {
									hexadString2 = (char) (remainder - 10 + 'A') + hexadString2;
								}
							        
							decimalvalue1=decimalvalue1/16;
							}while (decimalvalue1>0);
						
							System.out.println("Hexadecimal number : " + hexadString2);
							 System.out.print("Do you want to go to homepage (Y/N)->");
								yn = input.next().charAt(0);
								if (yn=='Y')
								 {
									 continue L1;
								 }else{
									 break L1;
								 }
					 
							
						}
						
						
						
						
						
						
						
						
						
						case 4:
						L4:while (true){
                    
                        System.out.println("+-----------------------------------------------+");
                        System.out.println("|           HexaDecimal Converter               |");
                        System.out.println("+-----------------------------------------------+\n\n\n");
                        System.out.print("Enter a Hexadecimal number: ");
                        String hexNumber = input.next();
                        int decimalNumber3 = 0;
                        
                        
                        for (int i = 0; i < hexNumber.length(); i++) {
                            char hexChar = hexNumber.charAt(i);
                            int digit;
                            if (hexChar >= '0' && hexChar <= '9') {
                                digit = hexChar - '0';
                            } else if (hexChar >= 'A' && hexChar <= 'F') {
                                digit = hexChar - 'A' + 10;
                            } else if (hexChar >= 'a' && hexChar <= 'f') {
                                digit = hexChar - 'a' + 10;
                            } else {
								break;
                            }
                           decimalNumber3 = decimalNumber3 * 16 + digit;
                        }
   
                        System.out.println("Decimal number: " + decimalNumber3);
                        
                        
                        
                        String binaryResult = "";
                        int tempDecimal7 = decimalNumber3;
                        while (tempDecimal7 != 0) {
                            binaryResult = (tempDecimal7 % 2) + binaryResult;
                            tempDecimal7 /= 2;
                        }
                        System.out.println("Binary number: " + binaryResult);
                        
                        
                        
                        String octalResult = "";
                        int tempDecimal8 = decimalNumber3;
                        while (tempDecimal8 != 0) {
                            octalResult = (tempDecimal8 % 8) + octalResult;
                            tempDecimal8 /= 8;
                        }
                        System.out.println("Octal number: " + octalResult + "\n\n");
                       
                         System.out.print("Do you want to go to homepage (Y/N)->");
								yn = input.next().charAt(0);
								if (yn=='Y')
								 {
									 continue L1;
								 }else{
									 break L1;
								 }
					 }
                        
                        
                  
						
       
							
						
						
						
						
						
						
						
						case 5 :
						
						System.out.println("+-------------------------------------------------+");
						System.out.println("|		Roman Number Converter		  |");
						System.out.println("+-------------------------------------------------+\n\n");
						
						 System.out.println("    [01] Decimal Number to Roman Number Converter");
						System.out.println("    [02] Roman Number to Decimal Number Converter\n\n\n");
						System.out.print("Enter Option -> ");
						int option1 = input.nextInt();
						switch (option1) {
                        case 1:
                        L51:while (true){    
                                System.out.println("+--------------------------------------------------------------------------+");
                                System.out.println("|           Decimal Number to Roman Number Converter                       |");
                                System.out.println("+--------------------------------------------------------------------------+\n\n\n");
                                System.out.print("Enter an Decimal number: ");
                                int decimal = input.nextInt();
                                
                                String roman = "";
                                while (decimal>=1000)
									{
										roman+="M";
										decimal-=1000;
									}
								
									if (decimal>=900)
									{
										roman+="CM";
										decimal-=900;
									
									}else if (decimal >=500)
								
									{
										roman+="D";
										decimal-=500;
									
									}else if (decimal >= 400)
									{
										roman+="CD";
										decimal-=400;
									}	
								
								while (decimal >= 100)
									{
										roman+="C";
										decimal-=100;
									}	
								
									if (decimal >= 90)
									{
										roman+="XC";
										decimal-=90;
									
									}else if (decimal >= 50)
									{
										roman+="L";
										decimal-=50;
									}else if (decimal >=40)
									{
										roman+="XL";
										decimal-=40;
									}
								
								while (decimal >= 10) {
                                        roman += "X";
                                        decimal -= 10;
                                    }
                                    if (decimal >= 9) {
                                        roman += "IX";
                                        decimal -= 9;
                                    } else if (decimal >= 5) {
                                        roman += "V";
                                        decimal -= 5;
                                    } else if (decimal >= 4) {
                                        roman += "IV";
                                        decimal -= 4;
                                    }
                                    while (decimal >= 1) {
                                        roman += "I";
                                        decimal -= 1;
                                    }
                                    System.out.println("Roman numeral: " + roman + "\n\n");						
								 System.out.print("Do you want to go to homepage (Y/N)->");
								yn = input.next().charAt(0);
								if (yn=='Y')
								 {
									 continue L1;
								 }else{
									 break L1;
								 }
					 }
							
							
							 case 2:
                            L52:while (true){
                                System.out.println("+-----------------------------------------------------------------------------+");
                                System.out.println("|           Roman Number to Decimal Number Converter                   		  |");
                                System.out.println("+------------------------------------------------------------------------------+\n\n\n");
                                System.out.print("Enter a Roman number: ");
                                input.nextLine();
                                String romanNumber = input.nextLine();
                                
                                int decimalNumber = 0;
                                int previousValue = 0;
                                for (int i = romanNumber.length() - 1; i >= 0; i--) {
                                    char romanChar = romanNumber.charAt(i);
                                    int value = 0;
                                    switch (romanChar) {
                                        case 'I':
                                            value = 1;
                                            break;
                                        case 'V':
                                            value = 5;
                                            break;
                                        case 'X':
                                            value = 10;
                                            break;
                                        case 'L':
                                            value = 50;
                                            break;
                                        case 'C':
                                            value = 100;
                                            break;
                                        case 'D':
                                            value = 500;
                                            break;
                                        case 'M':
                                            value = 1000;
                                            break;
                                       
                                    }
                                    if (value < previousValue) {
                                        decimalNumber -= value;
                                    } else {
                                        decimalNumber += value;
                                    }
                                    previousValue = value;
                                }
                                System.out.println("Decimal number: " + decimalNumber + "\n\n");
                                 System.out.print("Do you want to go to homepage (Y/N)->");
								yn = input.next().charAt(0);
								if (yn=='Y')
								 {
									 continue L1;
								 }else{
									 break L1;
								 }
					 }

			
		
		
					}
				}
					
				
			}	
					
					
		}					
		
		
	}
}	
