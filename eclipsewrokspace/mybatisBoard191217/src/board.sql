--19.12.08 SQL문 복붙. 게시판글 
--시험볼 경우 이와같은 SQL파일이 텅텅비어 있는데 여기나 종이에 적어서 내면 되겠죠

--2)게시판글(BOARD) 테이블 생성
--DROP TABLE BOARD;
CREATE TABLE BOARD(
	--(1)변수명       (2)데이터형          (3)제약조건
	NUM               NUMBER            PRIMARY KEY, 	--글번호(PRIMARY KEY로 설정)
	ID               VARCHAR2(20)       NOT NULL,	 	--작성자ID(참조 않기로 함. 계정이 삭제되면 참조도 불가능=작성자 확인불가)
	TITLE            VARCHAR2(200)      NOT NULL,	 	--제목
	CONTENTS         VARCHAR2(200)      NOT NULL,	 	--내용
	INPUTDATE        DATE               DEFAULT SYSDATE,--작성시간 --기본값으로 가입 당시의 sySDATE로 입력된다.
	HITS             NUMBER             DEFAULT 0,		--조회수 --조회수로 앞에 띄워주는것도 가능하게될거에요. --신고수의 경우 일정 신고수면 글을 못쓰게 한다 등도 되겟죠
	LIKES            NUMBER             DEFAULT 0		--추천수
);
--2.5)게시판 글에 사용할 시퀀스(주민번호처럼 글을 구별하기 위한 랜덤&유일한 숫자 생성)
CREATE SEQUENCE BOARD_SEQ;
--번호는 새로 시작할때마다 증감이 이뤄집니다.
--값만 먼저일때는 from시 듀얼을 한다고 하심.


--게시판 글 저장 예                                                                                                        글번호,작성자ID,   제목,            내용,
--INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS) VALUES(BOARD_SEQ.NEXTVAL,'AAA','홍길동님의 첫글이다!','이멜은 HONG' );
--INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS) VALUES(BOARD_SEQ.NEXTVAL,'AAA','제목없어','내용도 없어');
--INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS) VALUES(BOARD_SEQ.NEXTVAL,'BBB','언년이 첫글','JAVA JAVA');
--INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS) VALUES(BOARD_SEQ.NEXTVAL,'BD123','복돌이도 첫글이다!','BD123');
--INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS) VALUES(BOARD_SEQ.NEXTVAL,'jjong','쫑쫑이란 이름으로','태클거는 자는 용서않는다');
--.NEXTVAL = 다음번호를 내놔라!! 번호가 바뀌면서 저장되는 이유죠.


--데이터 수정
-- 게시판 1번글의 제목을 oracle 로 수정합니다.
-- UPDATE BOARD SET TITLE='oracle' WHERE NUM=1;
  
--게시판 2번 글의 조회수를 10으로 변경합니다.
-- UPDATE BOARD SET HITS=10,LIKES=5 WHERE NUM=2;

SELECT * FROM BOARD;
--여기서 커밋 명령까지 하셔야 제대로 적용되어 모든 사람들이 볼수있게 됩니다.
--SELECT에서 내눈에 보인다고 완료된거 아닙니다!

--모든글의 조회수를 기존값+1 시키기
-- UPDATE BOARD SET HITS=HITS+1;

--2번글만 조회수를 기존값+1 시키기
--UPDATE BOARD SET HITS=HITS+1 WHERE NUM=2;

--2번글 삭제
--DELETE BOARD WHERE NUM=2;
--2번이후의 글들을 삭제하려한다면
--DELETE BOARD WHERE NUM>2;
--만약 실수로 지웠고, 그래서 2번글을 다시 살리고 싶다면?=>롤백명령을 활용하면 됩니다!
--ROLLBACK;--단, 커밋을 하기전까지만 적용이 가능하다는 점, 그리고 모든 것들을 롤백할수 있다는 것은 아니다.
--2번글을

select * from BOARD;
