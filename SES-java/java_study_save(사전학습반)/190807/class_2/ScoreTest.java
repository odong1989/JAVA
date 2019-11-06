class ScoreTest 
{
	public static void main(String[] args) 
	{
		int kor, eng, mat;//각 과목점수
		int tot;		  //총점
		double avg;		  //평균

		kor = 100;
		eng = 90;
		mat = 94;

		//여기서 계산
		tot= kor+eng+mat;
		/*방법1 : 나누는 숫자를 실수형으로 하여 자동으로 결과값도 실수형으로 만들어지게 하기. */	
		avg = tot / 3.0; // tot / 3;으로 3.0이 아니라 3으로 나누면 double형처럼 소수점 이하를 감안않는다.
				    	 //소수점까지 정확한 계산 원하면 나누는 숫자에 3.0 식으로 붙이는 게 좋다.

		/*방법2 : 강제 형변환하기*/
		avg = (double)tot / 3 //강제형변환이다. 
							   //강제형변환은 작은형->큰형 , 큰형->작은형 이든 어떤 변환을 하든 상관없다.
		
		//계산 끝
		
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);

	}
}
