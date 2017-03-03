DROP SEQUENCE art_seq;
DROP TABLE Article;
--seq,pat_id,name,title,content,regdate(2017-02-15),read_count--
--CREATE SEQUENCE
CREATE SEQUENCE art_seq
START WITH 1
INCREMENT BY 1
NOCACHE
NOCYCLE;

--CREATE TABLE Article
CREATE TABLE Article(
	art_seq DECIMAL NOT NULL PRIMARY KEY ,
	pat_id VARCHAR2(10),
	title VARCHAR2(10),
	content VARCHAR2(100),
	regdate VARCHAR2(10),
	read_count DECIMAL,
	FOREIGN KEY(pat_id) REFERENCES Patient(pat_id));
SELECT * FROM Article;
--INSERT
INSERT INTO Article (art_seq, pat_id, title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pahn', '대한 ', '대한 피가 얼마나 할지니, 같지 온갖 이것은 있는가? ', '2017-02-15',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pahn',  '사람 ', '사람은 인간이 튼튼하며', '2017-02-18',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pahn',  '쓸쓸한 ', '쓸쓸한 무엇을 이상의 위하여 황금시대다.', '2017-02-16',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pkim', '소금 ', '소금이라 구하기 타오르고 봄바람이다.', '2017-02-17',1);
INSERT INTO Article (art_seq, pat_id,  title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pkim',  '끝에 ', '끝에 할지라도 황금시대를 물방아 못할 있다. .', '2017-02-19',1);
INSERT INTO Article (art_seq, pat_id,  title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pkim',  '수', '수 끝까지 방황하고', '2017-02-20',1);
INSERT INTO Article (art_seq, pat_id,  title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'plee', '안녕', '안녕하세요? 홍길동 입니다.', '2017-02-21',1);
INSERT INTO Article (art_seq, pat_id,  title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'plee', '안녕', '안녕하세요? 홍길동 입니다.', '2017-02-22',1);
INSERT INTO Article (art_seq, pat_id,  title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'plee','안녕', '안녕하세요? 홍길동 입니다.', '2017-03-01',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'plee',  '잘가', 'good-bye', '2017-03-02',1);
INSERT INTO Article (art_seq, pat_id,title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pjeong', '무엇이','무엇이 인생에 아니한 바이며, 꾸며 ?', '2017-03-03',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pjeong', '그것은','그것은 인생에 너의 길을 것은 것이다.', '2017-03-04',1);
INSERT INTO Article (art_seq, pat_id, name, title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pjeong', '큐', '청춘','청춘에서만 찬미를 착목한는 찾아다녀도', '2017-03-05',1);
INSERT INTO Article (art_seq, pat_id,  title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pjeong', '품고 ','품고 지혜는 보내는 이상은 실현에 황금시대다. ', '2017-03-06',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pjeong',  '아니한','구하지 얼음과 인간의 두기 위하여서 있으랴?', '2017-03-10',1);
INSERT INTO Article (art_seq, pat_id, name, title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'pjeong', '하이', '공자','동력은 얼음과 찾아다녀도', '2017-03-10',1);
INSERT INTO Article (art_seq, pat_id,  title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'poh', '사랑','사랑의 크고 살 그들의 운다.', '2017-03-11',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'poh',  '찾아',' 찾아 뛰노는 하는 대중을 생생하며', '2017-03-12',1);
INSERT INTO Article (art_seq, pat_id, title, content, regdate, read_count)
VALUES(art_seq.NEXTVAL, 'poh',  '얼음',' 얼음과 인간의 두기 위하여서 있으랴?', '2017-03-13',1);
--READ ALL
SELECT * FROM Article;
--READ SOME
SELECT * FROM Article WHERE pat_id = 'hong';
--READ ONE
SELECT * FROM Article WHERE art_seq=5;
--UPDATE
UPDATE Article SET content = '자유게시판' WHERE pat_id='hong';
SELECT COUNT(*) AS count FROM Article;
--DELETE
DELETE FROM Article WHERE pat_id = 'hong';
SELECT art_seq,pat_id,title,content,regdate,read_count FROM Article WHERE title LIKE '%안%';
SELECT art_seq,pat_id,title,content,regdate,read_count FROM ARTICLE;
SELECT art_seq,pat_id,title,content,regdate,read_count FROM Article WHERE  art_seq='5' LIKE TITLE= '안%' ;


SELECT art_seq, pat_id, title, content, regdate, read_count FROM article;