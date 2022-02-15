drop table t_member;
select * from t_member order by m_idx;

-- 회원 테이블(t_member) 작성
create table t_member (
	m_idx int auto_increment unique,		-- 일련번호
    m_id varchar(20) primary key,			-- 아이디
    m_pwd varchar(20) not null,				-- 암호
    m_name varchar(10) not null,			-- 이름
    m_date datetime default now()			-- 가입일
);

-- 회원 테이블에 회원 가입 프로시저(sp_member_insert) 작성
-- - 매개변수로 데이터들을 받아와 t_member테이블에 저장하는 프로시저 제작
-- - 회원 15명의 정보를 루프 문을 이용 sp_member_insert를 실행하여 입력 후 select하여 결과 화면 캡쳐 : sp_member_loop 프로시저로 만들어 작업 (아이디는 test1 ~ test15, 기타 정보는 마음대로 입력하면 됨)
drop procedure if exists sp_member_insert;
delimiter $$
create procedure sp_member_insert(mid varchar(20), mpwd varchar(20), mname varchar(10))
begin
	insert into t_member (m_id, m_pwd, m_name) values (mid, mpwd, mname);
end $$
delimiter ;

drop procedure if exists sp_member_loop;
delimiter $$
create procedure sp_member_loop()	-- 15명의 정보를 입력하는 프로시저
begin
	declare i int default 1;
	while (i <= 15) do
		call sp_member_insert(concat('test', i), '1111' + i, concat('홍길동', i));
        set i = i + 1;
    end while;
end $$
delimiter ;
call sp_member_loop();

-- 회원 테이블에 회원정보 수정 프로시저(sp_member_update) 작성
-- - 매개변수로 값을 받아와 t_member테이블의 정보를 수정하는 프로시저 제작
-- - 회원정보를 sp_member_update를 이용하여 m_idx 초반 5명은 가입 일을 이전달(1월)로 후반 5명은 다음달 (3월)로 변경 후 select하여 결과 화면 캡쳐
drop procedure if exists sp_member_update;
delimiter $$
create procedure sp_member_update(midx int, clm varchar(5), val varchar(20))
begin
	if clm = 'id' then
		update t_member set m_id = val where m_idx = midx;
	elseif clm = 'pwd' then
		update t_member set m_pwd = val where m_idx = midx;
	elseif clm = 'name' then
		update t_member set m_name = val where m_idx = midx;
	elseif clm = 'date' then
		update t_member set m_date = val where m_idx = midx;
    end if;
end $$
delimiter ;
-- 초반 5명 가입일을 이전달(1월)로 변경
call sp_member_update(1, 'date', adddate((select m_date from t_member where m_idx = 1), interval -1 month));
call sp_member_update(2, 'date', adddate((select m_date from t_member where m_idx = 2), interval -1 month));
call sp_member_update(3, 'date', adddate((select m_date from t_member where m_idx = 3), interval -1 month));
call sp_member_update(4, 'date', adddate((select m_date from t_member where m_idx = 4), interval -1 month));
call sp_member_update(5, 'date', adddate((select m_date from t_member where m_idx = 5), interval -1 month));
-- 후반 5명 가입일을 다음달(3월)로 변경
call sp_member_update(11, 'date', adddate((select m_date from t_member where m_idx = 11), interval 1 month));
call sp_member_update(12, 'date', adddate((select m_date from t_member where m_idx = 12), interval 1 month));
call sp_member_update(13, 'date', adddate((select m_date from t_member where m_idx = 13), interval 1 month));
call sp_member_update(14, 'date', adddate((select m_date from t_member where m_idx = 14), interval 1 month));
call sp_member_update(15, 'date', adddate((select m_date from t_member where m_idx = 15), interval 1 month));

-- 각 월별 회원 가입자 수를 구하는 쿼리 작성
-- - 해당 연월과 가입자 수를 추출
select left(m_date, 7) '가입 연월', count(*) '가입자 수' from t_member group by left(m_date, 7);

-- 가장 최근 가입한 10명을 추출하는 쿼리 작성
select * from t_member order by m_idx desc limit 10;

-- ---------------------------------------------------

select * from t_member order by m_idx;