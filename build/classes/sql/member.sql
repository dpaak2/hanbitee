SELECT*FROM tab;

CREATE TABLE  Member(
        id VARCHAR2(10) PRIMARY KEY,
        name VARCHAR2(10),
        ssn VARCHAR2(10),
        password VARCHAR2(10),
        profileImg VARCHAR2(20),
        phone VARCHAR2(13),
        email VARCHAR2(20),
        rank VARCHAR2(2)
);
select count(*) from Member;
INSERT INTO Member(id,name,ssn,email,phone,password,profileImg,rank)
values('hong','홍길동',
'800101-1','hong@test.com',
'010-1234-5678','1',
'default.jpg','C');

UPDATE MEMBER SET id,name,ssn,email,phone,password,profileImg,rank
select * from member where id='hong';
select password from MEMBER where id='hong' ;