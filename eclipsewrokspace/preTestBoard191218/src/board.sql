--�۹�ȣ(PRIMARY KEY�� ����)
--�ۼ���ID(���� �ʱ�� ��. ������ �����Ǹ� ������ �Ұ���=�ۼ��� Ȯ�κҰ�)
--����
--����
--�ۼ��ð� --�⺻������ ���� ����� sySDATE�� �Էµȴ�.
--��ȸ�� --��ȸ���� �տ� ����ִ°͵� �����ϰԵɰſ���. --�Ű���� ��� ���� �Ű���� ���� ������ �Ѵ� � �ǰ���
--��õ��

CREATE TABEL board(
--(1)Į���� 		(2)�ڷ���			(3)��������
   NUM			NUMBER			PRIMARY KEY,
   ID			VARCHAR2(50),	
   TITLE		VARCHAR2(100),
   CONTENTES	VARCHAR2(200),
   INPUTDATE	DATE			DEFAULT SYSDATE,
   HITS			NUMBER			DEFAULT 0,
   LIKES		NUMBER			DEFAULT 0
);

CREATE SEQUENCE BOARD_SEQ;
