DROP TABLE BOOKLIST;
DROP SEQUENCE BOOKLIST_SEQ;
CREATE TABLE BOOKLIST(
--(1)Į����		(2)�ڷ���			(3)��������
 BOOKCODE		NUMBER			PRIMARY KEY, --�ڵ�
 BOOKNAME		VARCHAR2(100)  	NOT NULL,			  --������ 	
 BOOKFORMAT	    VARCHAR2(20)	NOT NULL,			  --��������(����å,����å,pdf��)	
 SAlES			NUMBER			DEFAULT 0,			  --�Ǹŷ�			
 BOOKKINDS		VARCHAR2(100)	NOT NULL             --��������(�濵����, ������) hashmap �ǽ�
 );

CREATE SEQUENCE BOOKLIST_SEQ;