package asdf;
//성적 - 이름, 국어, 영어,수학, 총점, 평균
//get /set 함수, 총점 계산, 평균계산 함수(소수점 이하 2자리에서 반올림)
// 클래스 내부에 있는 데이터를 display 함수로 출력
// main class에서 
//클래스 배열을 만들고 5명의 데이터를 입력
//국어 , 영어, 수학의 반 합계와 반 평균도 구해라
//개인별 합계를 더하여 반합계를 구하라
//반 평균을 구해서 출력해라

import java.util.*;

public class hw {

	public static void main(String[] args) {
		Manager s = new Manager(); 
		Scanner scan = new Scanner(System.in); 
		int count; 
		boolean chk = false; 
		Manager[] arr = new Manager[6]; 
		for(int i =0; i<arr.length; i++) { 
			arr[i] = new Manager(); 
		} //배열 초기화
		
		while(true) {
			System.out.println("메뉴입력 || 1. 입력 2. 출력 3. 종료 ||");
			int order=scan.nextInt();
			if(order==1&&chk==false) {
				for(int i=1;i<arr.length;i++) {
					System.out.print("이름: ");
					arr[i].setName(scan.next());
					System.out.print("국어: ");
					arr[i].setKor(scan.nextInt());
					System.out.print("수학: ");
					arr[i].setMath(scan.nextInt());
					System.out.print("영어: ");
					arr[i].setEng(scan.nextInt());
					System.out.print("========"+i+"번째 입력 완료=======\n");
				}
				chk=true;
			}else if(order==1&& chk==true) {
				System.out.println("입력된 데이터가 존재합니다. 출력바랍니다.");
			}else if(order==2&&chk==true) {
				for(int i=1;i<arr.length;i++) {
					int total=0;
					total=arr[i].getEng()+arr[i].getKor()+arr[i].getMath();
					float avg=total/3;
					int ban_total=0;
					float ban_avg=0;
					ban_total += total;
					ban_avg += avg /5;
					
					System.out.println("이름 : "+arr[i].getName());
					System.out.println("국어 : "+arr[i].getKor());
					System.out.println("수학 : "+arr[i].getMath());
					System.out.println("영어 : "+arr[i].getEng());
					System.out.println("총점 : "+total);
					System.out.println("평균 : "+(int)avg);
					System.out.print("========"+i+"번째 출력 완료=======\n");
					System.out.println("반 총점 : "+ban_total);
					System.out.println("반 평균: " +ban_avg);
				}
				chk=false;
			}else if(order==2 && chk ==false) System.out.println("입력된 데이터가 없습니다. 입력하세요");
			else if(order==3) {
				System.out.println("종료");
				break;
			}
		}
	}

}
