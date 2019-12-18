--19.12.08 SQL�� ����. �Խ��Ǳ� 
--���躼 ��� �̿Ͱ��� SQL������ ���ֺ�� �ִµ� ���⳪ ���̿� ��� ���� �ǰ���

--2)�Խ��Ǳ�(BOARD) ���̺� ����
--DROP TABLE BOARD;
CREATE TABLE BOARD(
	--(1)������       (2)��������          (3)��������
	NUM               NUMBER            PRIMARY KEY, 	--�۹�ȣ(PRIMARY KEY�� ����)
	ID               VARCHAR2(20)       NOT NULL,	 	--�ۼ���ID(���� �ʱ�� ��. ������ �����Ǹ� ������ �Ұ���=�ۼ��� Ȯ�κҰ�)
	TITLE            VARCHAR2(200)      NOT NULL,	 	--����
	CONTENTS         VARCHAR2(200)      NOT NULL,	 	--����
	INPUTDATE        DATE               DEFAULT SYSDATE,--�ۼ��ð� --�⺻������ ���� ����� sySDATE�� �Էµȴ�.
	HITS             NUMBER             DEFAULT 0,		--��ȸ�� --��ȸ���� �տ� ����ִ°͵� �����ϰԵɰſ���. --�Ű���� ��� ���� �Ű���� ���� ������ �Ѵ� � �ǰ���
	LIKES            NUMBER             DEFAULT 0		--��õ��
);
--2.5)�Խ��� �ۿ� ����� ������(�ֹι�ȣó�� ���� �����ϱ� ���� ����&������ ���� ����)
CREATE SEQUENCE BOARD_SEQ;
--��ȣ�� ���� �����Ҷ����� ������ �̷����ϴ�.
--���� �����϶��� from�� ����� �Ѵٰ� �Ͻ�.


--�Խ��� �� ���� ��                                                                                                        �۹�ȣ,�ۼ���ID,   ����,            ����,
--INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS) VALUES(BOARD_SEQ.NEXTVAL,'AAA','ȫ�浿���� ù���̴�!','�̸��� HONG' );
--INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS) VALUES(BOARD_SEQ.NEXTVAL,'AAA','�������','���뵵 ����');
--INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS) VALUES(BOARD_SEQ.NEXTVAL,'BBB','����� ù��','JAVA JAVA');
--INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS) VALUES(BOARD_SEQ.NEXTVAL,'BD123','�����̵� ù���̴�!','BD123');
--INSERT INTO BOARD (NUM, ID, TITLE,CONTENTS) VALUES(BOARD_SEQ.NEXTVAL,'jjong','�����̶� �̸�����','��Ŭ�Ŵ� �ڴ� �뼭�ʴ´�');
--.NEXTVAL = ������ȣ�� ������!! ��ȣ�� �ٲ�鼭 ����Ǵ� ������.


--������ ����
-- �Խ��� 1������ ������ oracle �� �����մϴ�.
-- UPDATE BOARD SET TITLE='oracle' WHERE NUM=1;
  
--�Խ��� 2�� ���� ��ȸ���� 10���� �����մϴ�.
-- UPDATE BOARD SET HITS=10,LIKES=5 WHERE NUM=2;

SELECT * FROM BOARD;
--���⼭ Ŀ�� ��ɱ��� �ϼž� ����� ����Ǿ� ��� ������� �����ְ� �˴ϴ�.
--SELECT���� ������ ���δٰ� �Ϸ�Ȱ� �ƴմϴ�!

--������ ��ȸ���� ������+1 ��Ű��
-- UPDATE BOARD SET HITS=HITS+1;

--2���۸� ��ȸ���� ������+1 ��Ű��
--UPDATE BOARD SET HITS=HITS+1 WHERE NUM=2;

--2���� ����
--DELETE BOARD WHERE NUM=2;
--2�������� �۵��� �����Ϸ��Ѵٸ�
--DELETE BOARD WHERE NUM>2;
--���� �Ǽ��� ������, �׷��� 2������ �ٽ� �츮�� �ʹٸ�?=>�ѹ����� Ȱ���ϸ� �˴ϴ�!
--ROLLBACK;--��, Ŀ���� �ϱ��������� ������ �����ϴٴ� ��, �׸��� ��� �͵��� �ѹ��Ҽ� �ִٴ� ���� �ƴϴ�.
--2������

select * from BOARD;
