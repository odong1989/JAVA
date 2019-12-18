--글번호(PRIMARY KEY로 설정)
--작성자ID(참조 않기로 함. 계정이 삭제되면 참조도 불가능=작성자 확인불가)
--제목
--내용
--작성시간 --기본값으로 가입 당시의 sySDATE로 입력된다.
--조회수 --조회수로 앞에 띄워주는것도 가능하게될거에요. --신고수의 경우 일정 신고수면 글을 못쓰게 한다 등도 되겟죠
--추천수

CREATE TABEL board(
--(1)칼럼명 		(2)자료형			(3)제약조건
   NUM			NUMBER			PRIMARY KEY,
   ID			VARCHAR2(50),	
   TITLE		VARCHAR2(100),
   CONTENTES	VARCHAR2(200),
   INPUTDATE	DATE			DEFAULT SYSDATE,
   HITS			NUMBER			DEFAULT 0,
   LIKES		NUMBER			DEFAULT 0
);

CREATE SEQUENCE BOARD_SEQ;
