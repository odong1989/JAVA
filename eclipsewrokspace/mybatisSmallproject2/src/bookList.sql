DROP TABLE BOOKLIST;
DROP SEQUENCE BOOKLIST_SEQ;
CREATE TABLE BOOKLIST(
--(1)Į����		(2)�ڷ���			(3)��������
 BOOKCODE		NUMBER			PRIMARY KEY, --�ڵ�
 BOOKNAME		VARCHAR2(100)  	NOT NULL,			  --������ 	
 BOOKKINDS		VARCHAR2(100)	NOT NULL,             --��������(�濵����, ������)
 BOOKFORMAT	    VARCHAR2(20)	NOT NULL,			  --��������(����å,����å,pdf��)	
 SELLMARKETS	VARCHAR2(100)	NOT NULL,             --�Ǹż��� �̸���(�˶��,����Ͻ�,yes24��)
 SELLS			NUMBER			DEFAULT 0			  --�Ǹŷ�			
);

CREATE SEQUENCE BOOKLIST_SEQ;