class Main {
	public static final int MAX_N = 1000;
	public static final Scanner scanner = new Scanner(System.in);
	
  public static void main(String[] args) {
		int n = scanner.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		// 어레이 리스트에 원소를 입력받아 보세요
		for(int i=0;i<n;i++){
			arr.add(scanner.nextInt());
		}
		for(int j=n-1;j>=0;j--){					//★j는 n-1 부터여야한다 글고 0될때까지다!!!! 이상한거에서 헷갈리지 말기!!!!!!!!!!!!!!!!!!!!!!!!!!!
        	if(j<n-1){
            System.out.print(" ");
            }
			System.out.print(arr.get(j));
		}

  }
}
