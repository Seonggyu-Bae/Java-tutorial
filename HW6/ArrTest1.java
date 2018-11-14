class ArrTest1{
	public static void main(String [] args){
		double [] arr = new double[10];
		initArr(arr);
		printArr(arr);
		System.out.printf("합: %.2f\n", sumArr(arr));
		System.out.printf("최댓값: %.2f\n", maxEltOfArr(arr));
		System.out.printf("최댓값의 인덱스: %d\n", indOfMax(arr));
		shuffle(arr);
		System.out.println("셔플후: ");
		printArr(arr);
		
		System.out.println("오른쪽으로 1칸 로테이션: ");
		rotateR1(arr); //오른쪽으로 1칸 로테이션
		printArr(arr);
		
		System.out.println("오른쪽으로 3칸 로테이션: ");
		rotateRI(arr, 3);//오른쪽으로 3칸 로테이션
		printArr(arr);
		
		System.out.println("왼쪽으로 1칸 로테이션: ");
		rotateL1(arr);//왼쪽으로 1칸 로테이션
		printArr(arr);
		
		System.out.println("왼쪽으로 4칸 로테이션: ");
		rotateLI(arr, 4);//왼쪽으로 4칸 로테이션
		printArr(arr);
		
		System.out.println("오름차순 정렬: ");
		ascending(arr);//오름차순 정렬
		printArr(arr);
		
		System.out.println("내림차순 정렬: ");
		descending(arr);//내림차순 정렬
		printArr(arr);
		
	}
	//내림차순 정렬
	static void descending(double [] arr){
	//앞에 위치한 원소가 뒤에 위치한 원소가 더 작다면 위치 교환
		double tmp;
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i]<arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	//오름차순 정렬
	static void ascending(double [] arr){
	//앞에 위치한 원소가 뒤에 위치한 원소가 더 크다면 위치 교환
		double tmp;
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i]>arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	//왼쪽으로 한칸 로테이션
	static void rotateL1(double [] arr){
		double tmp = arr[0];//첫번째 원소는 임시로 보관
		for(int i=1; i<arr.length; i++){
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = tmp;//마지막 자리에 보관해둔 첫번째 원소 저장
	}
	
	//왼쪽으로 i칸 로테이션
	static void rotateLI(double [] arr, int rot){
		for(int i=0; i<rot; i++) rotateL1(arr);
	}
	
	
	
	static void rotateRI(double [] arr, int rot){
		for(int i=0; i<rot; i++) rotateR1(arr);
	}
	
	static void rotateR1(double [] arr){
		double tmp = arr[arr.length-1];
		for(int i=arr.length-1; i>0; i--){
			arr[i]= arr[i-1];
		}
		arr[0] =tmp;
	}
	
	static void shuffle(double [] dA){
		int r;
		double tmp;
		//
		for(int i=0; i<dA.length; i++){
			//dA[i] <-> dA[??랜덤인덱스]
			r = (int)(Math.random()*dA.length);
			//dA[i] 3 <-> dA[r]7.2
			tmp = dA[i];//3
			dA[i] = dA[r];	//7.2
			dA[r] = tmp; //3
			
		}
	}
	
	
	
	static int indOfMax(double [] arr){
		double max = arr[0];
		int index=0;
		
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	
	
	static double maxEltOfArr(double [] arr){
		double max = arr[0];
		for(int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	static double sumArr(double [] arr){
		double sum=0;
		for(int i=0; i<arr.length; i++)
			sum += arr[i]; 
		
		return sum;
	}
	static void initArr(double [] arr){
		for(int i=0; i<arr.length; i++)
			arr[i] = Math.random()*10;
	}
	static void printArr(double [] arr){
		for(int i=0; i<arr.length; i++)
			System.out.format("%.2f\t", arr[i]);
			
		System.out.println();	
	}
	
}







