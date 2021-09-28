
package hashmapprogram;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class HashMapTask{
		static Scanner sc=new Scanner(System.in);
		public static int integerInput(){
			int integer=0;
		try{
		 integer=sc.nextInt();
		}
		catch(InputMismatchException e){
		System.out.println("Enter Valid Input");
		}
		return integer;
		
	}
	public static String stringInput(){
		
		return sc.nextLine();
	}
	
	private static Map<Integer,String> createHashMap(){
			Map<Integer,String>hashMap=new HashMap<>();	
			return hashMap;		
	}

	private static Map<Integer,String> addIntegerStrings(){
			System.out.println("Enter the count for keys and values :");
			int count=integerInput();
			Map<Integer,String>hashMap=new HashMap<>();
			for(int i=0;i<count;i++){
				System.out.println("Enter the key :");
				int key=integerInput();
				System.out.println("Enter the Value");
				String value=stringInput();
				hashMap.put(key,value);
			}
			return hashMap;
		
	} 
	private static Map<String,String> addStrings(){
			System.out.println("Enter the count for keys and values :");
			int count=integerInput();
			Map<String,String>hashMap=new HashMap<>();
			for(int i=0;i<count;i++){
				System.out.println("Enter the key :");
				String key=stringInput();
				System.out.println("Enter the Value");
				String value=stringInput();
				hashMap.put(key,value);
				}
				return hashMap;
		
	}
	private static Map<Integer,Integer> addIntegers(){
			System.out.println("Enter the count for keys and values :");
			int count=integerInput();
			Map<Integer,Integer>hashMap=new HashMap<>();
			for(int i=0;i<count;i++){
				System.out.println("Enter the key :");
				int key=integerInput();
				System.out.println("Enter the Value");
				int value=integerInput();
				hashMap.put(key,value);
				}
				return hashMap;
	}
	private static Map<String,Integer> addStringInteger(){
			System.out.println("Enter the count for keys and values :");
			int count=integerInput();
			Map<String,Integer>hashMap=new HashMap<>();
			for(int i=0;i<count;i++){
				System.out.println("Enter the key :");
				String key=stringInput();
				System.out.println("Enter the Value");
				int  value=integerInput();
				hashMap.put(key,value);
				}
				return hashMap;
	}
	
 private static List<Student>studentDetails(){
		List<Student> list =new ArrayList<>();
		System.out.println("Enter the Student ID: "); 
		int  id = integerInput();
		System.out.println("Enter the Name: ");
		String name= stringInput();
		System.out.println("Enter the City: ");
		String city=stringInput();
		Student st = new Student();
		st.setId(id);
		st.setName(name);
		st.setCity(city);
		list.add(st);
		return list;
	}
	private static Map<String,List>stringObject(){
		System.out.println("Enter the number of pairs: ");
		int count=integerInput();
		Map<String,List> hashMap = new HashMap<>();
		for(int i=0;i<count;i++) {
		System.out.println("Enter key: ");
		String key = stringInput();
		System.out.println("Enter value: ");
		List value =studentDetails();
		hashMap.put(key,value);
		}
	
		return hashMap;	
	}
	private static Map<String,Integer> stringWithNull(Map<String,Integer>hashMap){
			hashMap.put("c",null);
			return hashMap;
		
	}
	private static Map<String,Integer> nullKeyValue(Map<String,Integer>hashMap){
			
		    hashMap.put(null,null);
			return hashMap;
	}
	public static boolean keyExists(Map<String,String>hashMap,String key){
			boolean check=hashMap.containsKey(key);
			return check ;
	}
	
	private static boolean valueExists(Map<String,String>hashMap,String value){
		if(hashMap==null){
			System.out.println("HashMap is Null ");
		}
			boolean check=hashMap.containsValue(value);
			return check;
	}
 	private static Map<String,String> replaceAllValues(Map<String,String>hashMap,String newValue){
			hashMap.replaceAll((oldKey,oldValue)->oldValue+newValue);
			return hashMap;
	}
	private static String valueOfExistingKey(Map<String,String>hashMap,String key){	  
			String value=hashMap.get(key);
			return value;
	}
	
	private static String valueOfNonExistingKey(Map<String,String>hashMap,String key){		
			String value=hashMap.get(key);
			return value;
	}
	
	private static String returnZoho(Map <String,String>hashMap,String key){
			String value=hashMap.getOrDefault(key,"zoho");
			return value;
	}
	
	private static Map<String,String> removeExistingKey(Map <String,String>hashMap,String key){		
			hashMap.remove(key);		
			return hashMap;
		
	}
	
	private static Map<String,String> removeExistingKeyIfValueMatch(Map <String,String>hashMap,String key,String value){	
			hashMap.remove(key,value);	
			return hashMap;
	}
	
	private static Map<String,String> replaceExistingKey(Map <String,String>hashMap,String key,String value){	
		hashMap.replace(key,value);
		return hashMap;
	}
	private static Map<String,String> replaceExistingKeyIfValueMatch(Map <String,String>hashMap,String key,String oldValue,String newValue){			
			hashMap.replace(key,oldValue,newValue);		
			return hashMap;
	}
	private static Map<String,String> oneToAnotherHashMap(Map <String,String>hashMap1,Map <String,String>hashMap2){
			hashMap2.putAll(hashMap1);
			return hashMap2;
	}
	
	private static Map<Integer,String> iterateOverHashMap(Map <Integer,String>hashMap){	
		Iterator<HashMap.Entry<Integer, String>> it = hashMap.entrySet().iterator();  
			while(it.hasNext())
			{
             HashMap.Entry<Integer, String> entry = it.next();
             System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		return hashMap;
	}
	
	private static Map<String,String> removeAllEntries(Map <String,String>hashMap){
	
		hashMap.clear();	
		return hashMap;
	}
	public static void main(String[]args){
		
		
		System.out.println("Enter Your Choice :");
		int  choice=integerInput();;
		
		
		switch(choice){
			
			case 1:
			  Map hashMap=createHashMap();
			  System.out.println("HashMap is :"+hashMap);
			  System.out.println("Size of the HashMap is :"+hashMap.size());
			  break;
			
			case 2:
				Map<Integer,String>hashMap2=addIntegerStrings();
				System.out.println("HashMap is :"+hashMap2);
				System.out.println("Size of the hashMap is :"+hashMap2.size());
			   break;
			case 3:
				Map<String,String>hashMap3=addStrings();
				System.out.println("HashMap is :"+hashMap3);
				System.out.println("Size of the hashMap is :"+hashMap3.size());
			case 4:
				Map<Integer,Integer>hashMap4=addIntegers();
				System.out.println("HashMap is :"+hashMap4);
				System.out.println("Size of the hashMap is :"+hashMap4.size());
				break;
			
			case 5:
				Map<String,List>hashMap5=stringObject();
				System.out.println("Size of the Hash Map is :"+hashMap5.size());
				System.out.println("Hash Map is :"+hashMap5);
				break;
			
			case 6:
				Map<String,Integer>hashMap6=addStringInteger();
				hashMap=stringWithNull(hashMap6);
				System.out.println("Size of thee HashMap is :"+hashMap.size());
				System.out.println("Hash Map is :"+hashMap);
				break;
			
			case 7:
				Map<String,Integer>hashMap7=addStringInteger();
				hashMap7=nullKeyValue(hashMap7);
				System.out.println("Size of thee HashMap is :"+hashMap7.size());
				System.out.println("Hash Map is :"+hashMap7);
				break;
			
			case 8:
				Map<String,String>hashMap8=addStrings();
			
				System.out.println("Enter the key :");
				String key=sc.nextLine();
			
				boolean check=keyExists(hashMap8,key);
				if(check){
				System.out.println("map contains Key");
				}
				else
				{
				System.out.println("value not contains key");
				}
				break;
			
			case 9:
				Map<String,String>hashMap9=addStrings();
				System.out.println("Enter the Value :");
				String value=sc.next();
				check=valueExists(hashMap9,value);
				if(check){
				System.out.println("map contains value");
				}
				else
				{
				System.out.println("value not contains value");
				}
				break;
				
			case 10:
				Map<String,String>hashMap10=addStrings();
				System.out.println("Enter the key");
				String key10=stringInput();
				hashMap=replaceAllValues(hashMap10,key10);
				System.out.println("Size of thee HashMap is :"+hashMap10.size());
				System.out.println("Hash Map is :"+hashMap10);
				break;
			
			case 11:
				Map<String,String>hashMap11=addStrings();
				System.out.println("Enter the Key");
				String key11=stringInput();
				String valueNew=valueOfExistingKey(hashMap11,key11);
				System.out.println("Existing key value is :"+valueNew);
				
				break;
				
			case 12:
				Map<String,String>hashMap12=addStrings();
				System.out.println("Enter the Key");
				String key12=stringInput();
				valueNew=valueOfNonExistingKey(hashMap12,key12);
				System.out.println("Non Existing key value is  :"+valueNew);
				break;
				
			case 13:
				Map<String,String>hashMap13=addStrings();
				System.out.println("Enter the Key");
				String key13=stringInput();
				valueNew=returnZoho(hashMap13,key13);
				System.out.println("Value is :"+valueNew);
				break;
			
			case 14:
				Map<String,String>hashMap14=addStrings();
				System.out.println("HashMap before remove :"+hashMap14);
				System.out.println("Size of the hashMap Before Remove :"+hashMap14.size());
				System.out.println("Enter the Key");
				String key14=stringInput();
				hashMap14=removeExistingKey(hashMap14,key14);
				System.out.println("Size of the HashMap After Remove :"+hashMap14.size());
				System.out.println("Hash Map After Remove :"+hashMap14);
				break;
				
			case 15:
				Map<String,String>hashMap15=addStrings();
				System.out.println("Enter the key");
				String key15=stringInput();
				System.out.println("Enter the old value");
				String oldValue15=stringInput();
			
				hashMap15=removeExistingKeyIfValueMatch(hashMap15,key15,oldValue15);
				System.out.println("Size of thee HashMap is :"+hashMap15.size());
				System.out.println("Hash Map is :"+hashMap15);
				break;
				
			case 16:
				Map<String,String>hashMap16=addStrings();
				System.out.println("Enter the key");
				String key16=stringInput();
				System.out.println("Enter the new value");
				String value16=stringInput();
		
				hashMap16=replaceExistingKey(hashMap16,key16,value16);
				System.out.println("Size of thee HashMap is :"+hashMap16.size());
				System.out.println("Hash Map is :"+hashMap16);
				break;
			
			case 17:
				Map<String,String>hashMap17=addStrings();
				System.out.println("Enter the key");
				String key17=stringInput();
				System.out.println("Enter the old value");
				String value17=stringInput();
				System.out.println("Enter the old value");
				String newValue17=stringInput();
				hashMap17=replaceExistingKeyIfValueMatch(hashMap17,key17,value17,newValue17);
				System.out.println("Size of thee HashMap is :"+hashMap17.size());
				System.out.println("Hash Map is :"+hashMap17);
				break;
				
			case 18:
				Map<String,String>firstHashMap=addStrings();
				Map<String,String>secondHashMap=addStrings();
				Map<String,String>hashMap18=oneToAnotherHashMap(firstHashMap,secondHashMap);
				System.out.println("Size of thee HashMap is :"+hashMap18.size());
				System.out.println("Hash Map is :"+hashMap18);
				break;
				
			case 19:
				Map<Integer,String>hashMap19=addIntegerStrings();
				hashMap=iterateOverHashMap(hashMap19);
				System.out.println("Size of thee HashMap is :"+hashMap.size());
				System.out.println("Hash Map is :"+hashMap);
				break;
				
			case 20:
				
				Map<String,String>hashMap20=addStrings();
				hashMap20=removeAllEntries(hashMap20);
				System.out.println("After remove all entries Size of the HashMap is :"+hashMap20.size());
				System.out.println("After Remove all entries in a Hash Map is :"+hashMap20);
				break;
				
				default:
					System.out.println("No program for your choice");
		}
	sc.close();
	}
	

	
}