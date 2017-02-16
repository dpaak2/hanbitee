--seq,id,name,title,content,regdate(2017-02-15),readCount--
--CREATE SEQUENCE
CREATE SEQUENCE art_seq
START WITH 5
INCREMENT BY 1
NOCACHE
NOCYCLE;

--CREATE TABLE Article
CREATE TABLE Article(
	art_seq DECIMAL,
	id VARCHAR2(10),
	name VARCHAR2(10),
	title VARCHAR2(10),
	content VARCHAR2(100),
	regdate VARCHAR2(10),
	readCount DECIMAL,
	PRIMARY KEY(id)
	
)
SELECT * FROM MEMBER;
--INSERT
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'hong', '홍길동', '안녕', '안녕하세요? 홍길동 입니다.', '2017-02-15',1)
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'kim', '김유신', 'aaa', '안녕하세요? 홍길동 입니다.', '2017-02-15',1)
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'lee', '홍길동', '안녕', '안녕하세요? 홍길동 입니다.', '2017-02-15',1)
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'choi', '홍길동', '안녕', '안녕하세요? 홍길동 입니다.', '2017-02-15',1)
INSERT INTO Article (art_seq, id, name, title, content, regdate, readCount)
VALUES(art_seq.NEXTVAL, 'yoo', '홍길동', '안녕', '안녕하세요? 홍길동 입니다.', '2017-02-15',1)
--READ ALL
SELECT * FROM Article;
--READ SOME
SELECT * FROM Article WHERE id = 'hong';
--READ ONE
SELECT * FROM Article WHERE art_seq=5;
--UPDATE
UPDATE Article SET content = '자유게시판' WHERE id='hong';
--DELETE
DELETE FROM Article WHERE id = 'hong';