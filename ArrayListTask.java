	import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Iterator;
	import java.util.InputMismatchException;


	public class ArrayListTask {
			private static String[] newStringArray(int count,Scanner sc){
				String[]array=new String[count];
				System.out.println("Enter "+count+" Strings : ");
				for(int i=0;i<count;i++){
				array[i]=sc.next();	
				}
				return array;						
			}	
			private static List<String> createArrayList(){
				List<String> arrayList=new ArrayList<String>();
				int size=arrayList.size();
				return arrayList;
			}
			
			private  static ArrayList<String> addStrings(String[] stringArray){
				ArrayList<String>arrayList=new ArrayList<>();		
				for(int i = 0; i < stringArray.length; i++) {
					arrayList.add(stringArray[i]);
				}	
				return arrayList;		
			}
			
			private static List<Integer> addInteger(int[]intArray){
				List<Integer>arrayList=new ArrayList<Integer>();	
				for(int i=0;i<intArray.length;i++){
					arrayList.add(intArray[i]);
				}
				return arrayList;
			}
			
			private static List<ArrayListTask> addCustomObjects(){
				List<ArrayListTask>arrayList=new ArrayList<>();
				ArrayListTask newArrayList1=new ArrayListTask();	 
				ArrayListTask newArrayList2=new ArrayListTask();	 
			arrayList.add(newArrayList1);
				arrayList.add(newArrayList2);
				return arrayList;
			}
			
			private static List<Object> multipleObjects(int[]intArray,String[]stringArray1){
				ArrayList<Object> arrayList=new ArrayList<>(); 
				
				ArrayListTask newArrayList1=new ArrayListTask();
				ArrayListTask newArrayList2=new ArrayListTask();
				
				arrayList.add(newArrayList1);
				arrayList.add(newArrayList2);
				arrayList.add(stringArray1);
				arrayList.add(intArray);
				return arrayList;
			}
			
			
			private static int findIndex(ArrayList<String>arrayList,String search){	
				if(arrayList.isEmpty()){
					System.out.println("ArrayList is Null...Must Enter Values");
				}		
				int index=arrayList.indexOf(search);
				return index;
			}
			
			private static List<String> iteration(ArrayList<String>arrayList){   
			
				Iterator it=arrayList.iterator();
				System.out.println("Elements are :");
				while(it.hasNext()){
					System.out.println(it.next());
				}
				return arrayList;
			}
			
			private static String stringAtGivenIndex(ArrayList<String>arrayList,int index){	
				if(arrayList==null){
					System.out.println("ArrayList is Null...Must Enter Proper Input ");
				}
				String string=arrayList.get(index);
				return string;
			}	

			private static int[] firstLastPosition(ArrayList<String>arrayList,String new1){	
				if(arrayList==null){
					System.out.println("ArrayList is Null...Must Enter Proper Input ");
				}
				int firstPosition=arrayList.indexOf(new1);
				int lastPosition=arrayList.lastIndexOf(new1);
				return new int[]{firstPosition,lastPosition}; 
			}
			
			private static List<String> changeAtAny(ArrayList<String>arrayList, int index, String newString){	
				if(arrayList==null){
					System.out.println("ArrayList is Null...Must Enter Proper Input ");
				}
				arrayList.add(index,newString);	
				return arrayList;
			}
			
			private static List<String>threeToEight(ArrayList<String>arrayList,int indexBegin,int indexEnd){		
				if(arrayList==null){
					System.out.println("ArrayList is Null...Must Enter Proper Input ");
				}
			
				List<String>arrayList2=arrayList.subList(indexBegin,indexEnd);
				return arrayList2;
			}
			

			private static List<String> thirdArrayList1(ArrayList<String>arrayList1,ArrayList<String>arrayList2){
				if(arrayList1==null ||arrayList2==null){
					System.out.println("ArrayList is Null...Must Enter Proper Input ");
				}
				ArrayList<String>arrayList=new ArrayList<>();
				arrayList.addAll(arrayList1);
				arrayList.addAll(arrayList2);
				return arrayList;
			}
			
			/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			private static	List<Float> addFloatValues(float[]array){   
				List<Float>arrayList=new ArrayList<>();
				for(int i=0;i<array.length;i++){
					arrayList.add(array[i]);
				}
				if(arrayList==null){
					System.out.println("ArrayList is Null...! Must Enter values");
				}
				return arrayList;
			}
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			private static List<Long> addLongValues(long []longArray){
				List<Long>arrayList=new ArrayList<>();
				for(int i=0;i<longArray.length;i++){
					arrayList.add(longArray[i]);
				}
				return arrayList;
			}
			
			private static	List<Float> decimalValues1(List<Float>arrayList,int index){   
				arrayList.remove(index);
				int size=arrayList.size();
				return arrayList;
			}
			private static List<Float> decimalValues2(List<Float>arrayList,float number){   
				arrayList.remove(number);
				return arrayList;	
			}
			
			private static List<String> removePresent(ArrayList<String>arrayList1,List<String>arrayList2){   	
				arrayList1.removeAll(arrayList2);
				return arrayList1;  
			}
			
			private static List<String> removeNotPresent(List<String>arrayList1,List<String>arrayList2){

				arrayList1.retainAll(arrayList2);
				return arrayList1;
			}
			
			private static List<Long> removeAll(List<Long>arrayList){	
					arrayList.clear();
				return arrayList;
			}
			
			private static boolean stringPresentOrNot(ArrayList<String>arrayList,String string6){			
				boolean check=arrayList.contains(string6);
				
				return check;
			} 
			
			public static void main(String[]args){
					int choice=0;
					int count=0;
					Scanner sc=new Scanner(System.in);

				try{
				System.out.println("Enter your choice :");
				 choice=sc.nextInt();
				}
				catch(InputMismatchException ex){
				System.out.println("Choice Must be An Integer value.!");
			}
				
			switch(choice){
				
						
				case 1:
						List<String>arrayList=createArrayList();	
						System.out.println("ArrayList  is :"+arrayList);
						System.out.println("Size of the Array List is :"+arrayList.size());	
						break;
				
				case 2:	
				
						System.out.println("Enter the number of Strings you Want to print:");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						String[] array=newStringArray(count,sc);
						arrayList=addStrings(array);
						System.out.println("Size of the Array is :"+arrayList.size());
						System.out.println("Array List is :"+arrayList);
				
						break;
						
						
				case 3:
						System.out.println("Enter the number of Integers You Want to print :");
						 try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						int[]intArray=new int[count];
						System.out.println("Enter "+count+" Integers :");
						try{
						   for(int i=0;i<count;i++){
							  intArray[i]=sc.nextInt();
						   }
						}
						catch(InputMismatchException e){
							System.out.println("Enter only Integer");
						}
						List list=addInteger(intArray);
						System.out.println("ArrayList is :"+list);
						break;
				case 4:	
						
						list=addCustomObjects();	
						System.out.println("Size of the ArrayList is :"+list.size());
						System.out.println("ArrayList is :"+list);
						break;
						
				case 5:
						System.out.println("Enter the number of Integers You Want to print :");
						 try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						intArray=new int[count];
						System.out.println("Enter "+count+" Integers :");
						try{
						   for(int i=0;i<count;i++){
							  intArray[i]=sc.nextInt();
						   }
						}
						catch(InputMismatchException e){
							System.out.println("Enter only Integer");
						}
						
						System.out.println("Enter the number of Strings you want to print");
						try{
						count=sc.nextInt();
						}
						catch(InputMismatchException e){
							System.out.println("Count must be an integer");
						}
						String[]stringArray1=new String[count];
						
						for(int i=0;i<count;i++){
							stringArray1[i]=sc.nextLine();
						}
						List<Object>list3=multipleObjects(intArray,stringArray1);
						
						System.out.println("ArrayList is :"+list3);
						break;
				case 6:
						System.out.println("Enter the number of Strings you Want to print:");
						
						 try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						array=newStringArray(count,sc);
						ArrayList<String>arrayList5=addStrings(array);
						System.out.println("Enter the String you want to know the index of String  : ");
						String search=sc.next();
						
						int index1=findIndex(arrayList5,search);
						if(index1==-1){
							System.out.println("your String is not present in the arrayList");
						}
						else{
						System.out.println("Index is :"+index1);
						}
						
						break;
						
				case 7:
						System.out.println("Enter the number of Strings you Want to print:");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						array=newStringArray(count,sc);
						arrayList5=addStrings(array);
						arrayList=iteration(arrayList5);
						System.out.println(arrayList);
						break;
						
				case 8:
						System.out.println("Enter the number of Strings you Want to print:");
						 try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						array=newStringArray(count,sc);
						arrayList5=addStrings(array);
						System.out.println("Enter the index you want to print the String :");
						int index=sc.nextInt();
						if(index<arrayList5.size()){
						String string1=stringAtGivenIndex(arrayList5,index);
						System.out.println("value is :"+string1);
						}
						else{
							System.out.println("Index value Must Be less than arrayList size");
						}
						break;
						
				case 9:
					
						System.out.println("Enter the number of Strings you Want to print:");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						array=newStringArray(count,sc);
						arrayList5=addStrings(array);
						System.out.println("Enter the String :");
						String new1=sc.next();	
						int[] answer=firstLastPosition(arrayList5,new1);	
						if(answer[0]!=answer[1]){
						System.out.println("First Position of the String is :"+answer[0]);
						System.out.println("Last Position of the String is :"+answer[1]);
						}
						else if(answer[0]==-1){
							System.out.println("Your String is not present in the arrayList");
						}
						else {
							System.out.println("your String is not a duplicate ");
							System.out.println("First and last Position of the String is :"+answer[0]);
						}
						
						break;
						
				case 10:
						System.out.println("Enter the number of Strings you Want to print:");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						array=newStringArray(count,sc);
						arrayList5=addStrings(array);
						System.out.println("Enter the index :");
						index=sc.nextInt();
						sc.nextLine();
						System.out.println("Enter the String :");
						String newString=sc.nextLine();
						if(index<=arrayList5.size()){
						arrayList=changeAtAny(arrayList5,index,newString);
						System.out.println("After Replace :"+arrayList);
						}
						else{
							System.out.println("Index Must Be Less than ArrayList size ");
						}
						break;
						
				case 11:
						System.out.println("Enter the number of Strings you Want to print:");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						array=newStringArray(count,sc);
						arrayList5=addStrings(array);
						System.out.println("Enter the Starting Index :");
						int indexBegin=sc.nextInt();
						System.out.println("Enter the Ending Index :");
						int indexEnd=sc.nextInt();
						if((indexBegin<indexEnd)&&(indexEnd<arrayList5.size())){
						arrayList=threeToEight(arrayList5,indexBegin,indexEnd);
						}
						else{
						System.out.println("IndexBegin value less than IndexEnd value");
						System.out.println("Index value must be less than arrayList Size");
						}
						break;
						
				
				case 12:
						System.out.println("Enter the number of Strings you Want to print:");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						array=newStringArray(count,sc);
						System.out.println("Enter the size of the 2 nd array");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						System.out.println("Enter "+count+" Strings ;");
						String[]array2 = new String[count];
						for(int i = 0; i < count; i++) {
							array2[i] = sc.next();
						}
						ArrayList<String>arrayList1=addStrings(array);
						ArrayList<String>arrayList2=addStrings(array2);
						list = thirdArrayList1(arrayList1,arrayList2);
						System.out.println("arraylist3 is :"+list);
						break;
						
				case 13:
						System.out.println("Enter the number of Strings you Want to print:");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						array=newStringArray(count,sc);
						System.out.println("Enter the size of the second array");
						try{
					   count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						System.out.println("Enter "+count+" Strings ;");
						array2 = new String[count];
						for(int i = 0; i < count; i++) {
							array2[i] = sc.next();
						}
						arrayList1=addStrings(array);
						arrayList2=addStrings(array2);
						list = thirdArrayList1(arrayList2,arrayList1);
						System.out.println("Size of the Third array list is :"+list.size());
						System.out.println("arraylist3 is :"+list);
						break;
						
				case 22:
						System.out.println("Enter the number of float values you want :");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						float[] floatArray=new float[count];
						System.out.println("Enter "+ count+" values ");
						for(int i=0;i<count;i++){
							floatArray[i]=sc.nextFloat();
						}
						list=addFloatValues(floatArray);
						break;
				case 14:
						System.out.println("Enter the number of long values you want :");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						floatArray=new float[count];
						System.out.println("Enter "+ count+" values ");
						for(int i=0;i<count;i++){
							floatArray[i]=sc.nextFloat();
						}
						List<Float>arrayList7=addFloatValues(floatArray);
						System.out.println("Enter the Index you want to delete :");
						 index=sc.nextInt();
						 if(index<arrayList7.size()){
						List<Float> arrayListLong=decimalValues1(arrayList7,index);
						System.out.println("size of the list is :"+arrayListLong.size());
						System.out.println("After Removed one of the value"+arrayListLong);
						 }
						 else{
						 System.out.println("Index Value Must Be Less than Arraylist size");
						 }
						 break;
			
				case 15:
						System.out.println("Enter the number of float values you want :");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						floatArray=new float[count];
						System.out.println("Enter "+ count+" values ");
						try{
						for(int i=0;i<count;i++){
							floatArray[i]=sc.nextFloat();
						}
						}
						catch(InputMismatchException ex){
							System.out.println("Value must be Float");
						}
						arrayList7=addFloatValues(floatArray);
						float number=0;
						try{
						System.out.println("Enter the Number");
						 number=sc.nextFloat();
						}
						catch(InputMismatchException ex){
							System.out.println("Number must be float");
						}
						try{
						 list=decimalValues2(arrayList7,number);
						
						
						System.out.println(list);
						
						}
						catch(IndexOutOfBoundsException e){
							System.out.println("ArrayList value Must be greater than 3");
						}
						break;
						
				
				case 17:
						System.out.println("Enter the number of Strings you Want to print:");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						array=newStringArray(count,sc);
						
						System.out.println("Enter the size of the second array");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						System.out.println("Enter "+count+" Strings ;");
						array2=newStringArray(count,sc);
						
						arrayList1=addStrings(array);
						arrayList2=addStrings(array2);
						list=removePresent(arrayList1,arrayList2);   
						System.out.println("Array List is :"+list);
						System.out.println("Size of the Arraylist is :"+list.size());
						break;
						
				 
						
				case 18:
						System.out.println("Enter the number of Strings you Want to print:");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						array=newStringArray(count,sc);
						
						System.out.println("Enter the size of the second array");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						System.out.println("Enter "+count+" Strings ;");
						array2=newStringArray(count,sc);
						
						arrayList1=addStrings(array);
						arrayList2=addStrings(array2);
						list = thirdArrayList1(arrayList2,arrayList1);
						arrayList=removeNotPresent(arrayList1,arrayList2);   
						System.out.println("ArrayList is :"+arrayList);
						System.out.println("Size of the ArrayList is :"+arrayList.size());
						break;
						
				case 23:
						System.out.println("Enter the number of float values you want :");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						long[] longArray=new long[count];
						System.out.println("Enter "+ count+" values ");
						for(int i=0;i<count;i++){
							longArray[i]=sc.nextLong();
						}
						list=addLongValues(longArray);
						break;
					
				case 19:
						
						System.out.println("Enter the number of long values you want :");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						longArray=new long[count];
						System.out.println("Enter "+ count+" values ");
						for(int i=0;i<count;i++){
							longArray[i]=sc.nextLong();
						}
						List<Long>list2=addLongValues(longArray);
						List<Long> list1=removeAll(list2);
						System.out.println("After Removing All Elements in the ArrayList is:"+list1);
				
				case 20:
						System.out.println("Enter the number of Strings you Want to print:");
						try{
						 count=sc.nextInt();
						}catch(InputMismatchException ex){
							System.out.println("Warning..!Count Must be Integer");
						}
						array=newStringArray(count,sc);
						arrayList5=addStrings(array);
						System.out.println("Enter the String :");
						String newString1=sc.next();
						
						boolean check=stringPresentOrNot(arrayList5,newString1);
						System.out.println(check);
						if(check){
							System.out.println("Given String is present in the arrayList");
						}
						else {
								System.out.println("Given String is not present in the Array List ");
						}		
						
						break; 
			
				default:
						System.out.println("No program for your choice");
					
			
			}
		}
	}
				