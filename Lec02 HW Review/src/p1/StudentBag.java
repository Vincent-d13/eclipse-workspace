package p1;

import java.util.Arrays;

public class StudentBag {
	
	private Student[] a;
	private int nElems;
	private int maxSize;
	
	private static String[] nameArr = new String [1000];
	private static int count = 0;
	
	public StudentBag(int maxSize) {
		a = new Student[maxSize];
		nElems = 0;
		this.maxSize = maxSize;
		
		
	}
	
	public static String[] get20Names() {
		int n = 0;
		String [] temp = new String[20];
		for (int i=0; i < 20; i++) {
			String randomName = nameArr[(int)(Math.random() * count)];
			temp[n++] = randomName;
			
		}
		return temp;
	}
	
	public long sequentialSearchByName (String name) {
		long startTime = System.nanoTime();
		for (int i = 0; i< nElems; i++) {
			if (a[i].getName().equals(name)) {
				return System.nanoTime() - startTime;
			}
		}
		return 0;
	}
	
	public long sequentialSearchByNameAverageTimeSpent() {
		long totalTime = 0;
		for (int i = 0; i < 20; i++) {
			totalTime += sequentialSearchByName(nameArr[i]);
			
		}
		return totalTime / 20;
	}
	
	
	public long binSearch(String name) {
		long startTime = System.nanoTime();
		int low = 0;
		int high = nElems - 1;
		Student [] temp = sort();
		while (high >= low ) {
			int mid = (low + high) / 2;
			if(temp[mid].getName().equals(name)) {
				return mid;
				
			}else if ( temp[mid].getName().compareTo(name) > 0) {
				high = mid - 1;
				
			}else {
				low = mid + 1;
			}
					
		}
		return System.nanoTime() - startTime;
	}
	
	public Student[] sort() {
		Student[] temp = Arrays.copyOf(a, nElems);
		Arrays.sort(temp);
		return temp;
	}
	
	public void fill(int n) {
		long startTime = System.nanoTime(); //could also check milliseconds System.currentTimeMillis()
		if ( n<= maxSize) {
			for (int i = 0; i < n; i++) {
				String names = getName();
				nameArr[count++] = names;
				Student s = new Student(names, getAge(), getGpa());
				a[nElems++] = s;
			} 
		} else {
			System.out.println("Array size to small");
		}
		System.out.println("Runtime to fill " + (System.nanoTime() - startTime));
	}

	public void display () {
		for (int i =0; i < nElems; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
	}
	
	private double getGpa() {
		return Math.random() * 4;
	}

	private int getAge() {
		return 18 + (int)(Math.random() * 23); // 40 -18 + 1 small numb - big answer goes inside *review
	}

	private String getName() {
		int randomNumber =  65 + (int)(Math.random() * 26);
		char capLetter = (char)(randomNumber);
		String lowerCaseLetters = "";
		for (int i=0; i < 4; i++	) {
			 lowerCaseLetters += (char)(97 + (int)(Math.random() * 26));
		}
		return capLetter + lowerCaseLetters; // create 5 random and make char at 0 upper case
	}
	
	public void resetNElems () {
		nElems = 0;
	}
	
	public void bubbleSort(){
	       int n= nElems;
	       Student s;
	       for(int j=0;j< n-1 ;j++){
	         for(int i=j+1;i<n; i++){
	           if(a[i].getName().compareTo(a[j].getName())>0){
	             s=a[i];
	             a[i] = a[j];
	             a[j]=s;
	           }
	         }
	       }
	      System.out.println("Bubble Sort done on the basis of name ");
	    }
	
	  public void selectionSort(){//selection sort
		    int n= nElems;
		    Student s;

		    for(int i=0;i<n-1;i++){
		      int lowestIndex=i;
		      s=a[i];
		      for(int j=i+1;j<n;j++){
		        if(a[j].getName().compareTo(s.getName())<0){
		          s=a[j];
		          lowestIndex=j;
		        }
		      }
		      if(lowestIndex!=i){
		         Student temp=a[lowestIndex];
		         a[lowestIndex]=a[i];
		         a[i]=temp;
		      }
		    }
		      System.out.println("sorted by selection sort");


		    }
	  
	  public void insertionSort(){
		    int length= nElems;
		    for(int i=0;i<length-1;i++){
		      for(int j=i+1;j>0;j--){
		        if(a[j].getName().compareTo(a[j-1].getName())<0){
		          Student temp = a[j];
		          a[j]=a[j-1];
		          a[j-1]=temp;
		        }
		      }
		    }

}
}
