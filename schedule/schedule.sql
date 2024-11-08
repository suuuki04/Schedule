# 테이블 생성하는 쿼리
CREATE TABLE Schedule
(
    id       integer     not null primary key,
    username varchar(50) not null,
    password varchar(50) not null,
    title    varchar(50) not null,
    content  varchar(300),
    createAt date        not null,
    updateAt date        not null
);
# 일정 생성하는 쿼리
INSERT INTO Schedule(id, username, password, title,content,createAt, updateAt)
values (1, '작성자이름', '비밀번호', '제목', '내용', '2024 - 11 - 02', '2024 - 11 - 04'));

# 전체 일정 조회하는 쿼리
SELECT *
FROM Schedule;


# 선택 일정 조회하는 쿼리
SELECT *
FROM Schedule WEHRE username '작성자 이름';


# 선택 일정 수정하는 쿼리
UPDATE Schedule
SET TITLE = ‘수정제목’
WHERE id = 1;

# 선택 일정 삭제하는 쿼리
DELETE Schedule
WHERE id = 1;
