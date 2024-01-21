import java.util.Scanner;

public class Main {
	
	static int N;
	static int M;
	static int[] nums;
	static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		nums = new int[M]; // 출력할 배열, 크기는 M
		visit = new boolean[N+1]; // 자연수 사용 여부를 체크할 배열
		
		sequance(0);
		
		
	}//main
	
	public static void sequance(int idx) {
		// 기저파트
		if(idx==M) {
			for(int i=0; i<M; i++) {
				System.out.print(nums[i] + " ");
			}
			System.out.println();
			return;
		}
		
		// 재귀파트
		// i : 자연수 사용여부 배열을 돎
		// idx : 출력할 배열의 index
		for(int i=1; i <= N; i++) {
			if(!visit[i]) {
				nums[idx] = i; // idx번째 배열에 i를 저장 
				
				visit[i] = true; // 방문했음을 표시 
				sequance(idx+1); // 다음 배열로 넘어감
				
				visit[i] = false; // 방문하고 돌아오면 다시 초기화 
			}
		}
		
		
		
	}// sequance
	
	
}