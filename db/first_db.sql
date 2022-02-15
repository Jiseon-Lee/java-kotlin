use test;	-- test라는 DB를 사용하겠다는 명령

-- 이메일 우편번호 주소1 주소2    
create table `member` (			-- 예약어를 쓰지 않기 위해 ``로 묶어서 해줌
	id varchar(20) primary key, 		-- 아이디
    pwd varchar(20) not null,			-- 암호
    name varchar(20) not null,			-- 이름
    birth char(10) not null,			-- 생년월일
    gender char(1) not null,			-- 성별
    cellphone varchar(13) not null,		-- 휴대폰
    email varchar(50) not null,			-- 이메일
    zipcode char(5) not null,			-- 우편번호
    addr1 varchar(50) not null,			-- 주소1
    addr2 varchar(100) not null,		-- 주소2
    ismail char(1) default 'y',			-- 수신여부
    joindate datetime default now(),	-- 가입일
    lastlogin datetime,					-- 마지막로그인일자
    isactive char(1) default 'y'		-- 회원상태(y: 활동중, n: 탈퇴회원)
);

insert into member (id, pwd, name, birth, gender, phone, email, zipcode, addr1, addr2) values ('test', '1111', '홍길동', '1986-05-15', 'm', '010-1234-5678', 'hong@test.com', '12345', '서울시 강남구 삼성동', '123-789');
-- insert into member ('test', '1111', '홍길동', '1986-05-15', 'm', '010-1234-5678', 'hong@test.com', '12345', '서울시 강남구 삼성동', '123-789', 'y', now(), null, 'y');

select * from member;

alter table member add point int unsigned default 0 after addr2;
-- 기존에 데이터가 들어있는 상황에서 컬럼을 추가할 때 not null 제약조건을 적용하려면 반드시 default값을 줘야 함
 
update member set name = '홍길순', gender = 'f' where id = 'test';
-- test 아이디를 가진 회원의 포인트를 1000포인트 추가시키는 update 작성

update member set point = point + 1000 where id = 'test';

update member set pwd = '1234' where name = '홍길순';

delete from member where id = 'test';

create table t_member_info (
	mi_id varchar(20) primary key,			-- 아이디
    mi_pw varchar(20) not null,				-- 비밀번호
    mi_name varchar(20) not null,			-- 이름
    mi_gender char(1) not null,				-- 성별
    mi_birth char(10) not null,				-- 생년월일
    mi_phone varchar(13) not null unique,	-- 전화번호
    mi_email varchar(50) not null unique,	-- 이메일
    mi_isad char(1) default 'y',			-- 광고수신여부
    mi_point int default 0,					-- 보유 포인트
    mi_date datetime default now(),			-- 가입일
    mi_lastlogin datetime,					-- 최종 로그인일자
    mi_status char(1) default 'a'			-- 상태
);

insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) values ('test1', '1111', '홍길동', 'm', '1988-05-15', '010-1234-5678', 'hong@test.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) values ('test2', '1111', '전우치', 'm', '1998-06-16', '010-1234-5679', 'jeon@test.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) values ('test3', '1111', '임꺽정', 'm', '1989-07-17', '010-1234-5680', 'lim@test.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) values ('test4', '1111', '하니', 'm', '1999-08-18', '010-1234-5681', 'hani@test.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) values ('asdf1', '1111', '김길동', 'm', '2001-08-02', '010-1234-5682', 'kim@naver.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) values ('asdf2', '1111', '이길동', 'm', '2002-09-03', '010-1234-5683', 'lee@naver.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) values ('asdf3', '1111', '고길동', 'm', '2003-07-15', '010-1234-5684', 'go@naver.com');
insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email) values ('asdf4', '1111', '최길동', 'm', '1987-06-23', '010-1234-5685', 'choi@naver.com');

select * from t_member_info;

-- 회원 정보들중 이름에 '길동'이 들어가고 포인트가 0인 데이터들을 모두 추출하는 select문 작성
select * from t_member_info where mi_name like '%길동%' and mi_point = 0;

-- 아이디가 'test1'이고 암호가 '1111'인 정보를 이용해 로그인 기능을 위한 select문 작성
-- 이름, 포인트만 추출
select mi_name, mi_point, mi_status 
from t_member_info 
where mi_id = 'test1' and mi_pw = '1111' and (mi_status = 'a' or mi_status = 'b');		-- 탈퇴한 회원인지 확인해야 함

select count(mi_id) a, count(mi_lastlogin) b, count(*) c
from t_member_info;

-- 모든 회원정보를 출력하는데 마지막 로그인이 null이면 '로그인전'으로 출력하고 컬럼은 'lastlogin'으로 나오게 select문 작성
select *, if(mi_lastlogin is null, '로그인전', mi_lastlogin) lastlogin,
ifnull(mi_lastlogin, '로그인전') lastlogin2
from t_member_info;
-- update t_member_info set mi_point = 1000;


create table t_member_addr (
	ma_idx int auto_increment primary key,	-- 일련번호
	mi_id varchar(20) not null,						-- 회원아이디
	ma_zip char(5) not null,				-- 우편번호
	ma_addr1 varchar(50) not null,			-- 주소1
	ma_addr2 varchar(50) not null,			-- 주소2
	ma_name varchar(50) not null,			-- 주소명
	ma_receiver varchar(50) not null,		-- 받는 사람
	ma_basic char(1) default 'y',			-- 기본주소여부
	ma_date datetime default now(),			-- 등록일
    constraint fk_member_addr_mi_id foreign key (mi_id) references t_member_info(mi_id) -- 외래키 지정
);

insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) values ('test1', '12345', '서울시 강남구 삼성1동', '111-22', '집', '홍길동', 'y');
insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) values ('test1', '12345', '서울시 강남구 삼성2동', '111-23', '본가', '홍길순', 'n');
insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) values ('test2', '12345', '서울시 서대문구 아현1동', '111-24', '회사', '전우치', 'y');
insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) values ('test2', '12345', '서울시 서대문구 아현2동', '111-25', '집', '전상태', 'n');
insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) values ('test3', '12345', '경기도 시흥시 월곶동', '111-26', '집', '임꺽정', 'y');
insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) values ('test4', '12345', '부산시 연제구 연산동', '111-27', '집', '하니', 'y');

select * from t_member_addr;

-- 회원정보 및 주소정보를 출력하는 select문
select a.*, b.ma_zip, b.ma_addr1, b.ma_addr2 
from t_member_info a inner join t_member_addr b on a.mi_id = b.mi_id;

select * from t_member_info a left join t_member_addr b on a.mi_id = b.mi_id;

-- 각 회원별 아이디와 이름, 주소의 개수를 출력하는 select 문
select a.mi_id, a.mi_name, count(b.ma_idx) cnt		-- 집계함수의 매개변수는 특별한 경우가 아니면 PK를 사용, alias 사용
from t_member_info a inner join t_member_addr b on a.mi_id = b.mi_id
group by a.mi_id, a.mi_name;		-- a.mi_id기준으로 묶고 그 다음 a.mi_name으로 묶음

-- 각 회원별 아이디와 이름, 주소의 개수를 출력하는 select 문2
select a.mi_id, a.mi_name, count(b.ma_idx) cnt
from t_member_info a left join t_member_addr b on a.mi_id = b.mi_id
group by a.mi_id, a.mi_name;
-- left join이므로 왼쪽에 있는 t_member_info 테이블의 레코드는 조건에 상관없이 무조건 출력

show index from t_member_info;
show index from t_member_addr;

create table t_member_point (
	mp_idx int auto_increment primary key,	-- 일련번호
	mi_id varchar(20) not null, 			-- 아이디
	mp_issu char(1) default 's',			-- 적립/사용여부(s : 적립, u : 사용)
	mp_point int default 0, 				-- 포인트
	mp_desc varchar(20) not null,			-- 적립/사용 내용(가입축하금, 상품구매(s), 구매후기, 상품구매(u))
	mp_num varchar(20),						-- 주문/후기 번호
	mp_date datetime default now(),			-- 적립/사용 일자
    constraint fk_member_point_mi_id foreign key (mi_id) references t_member_info(mi_id)
);

insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) values ('test1', 's', 1000, '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) values ('test2', 's', 1000, '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) values ('test3', 's', 1000, '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) values ('test4', 's', 1000, '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) values ('asdf1', 's', 1000, '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) values ('asdf2', 's', 1000, '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) values ('asdf3', 's', 1000, '가입축하금');
insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) values ('asdf4', 's', 1000, '가입축하금');

select * from t_member_point;

-- 컬럼 : c1 int , c2 varchar(10), c3 varchar(20)을 가진 tmp 테이블 생성
create table tmp ( c1 int primary key, c2 varchar(10), c3 varchar(20) );
insert into tmp values (1, 'test', 'qwerty');

drop procedure if exists sp_tmp_insert;		-- 프로시저를 잘못만들었을 경우 바로 삭제하기 위해서 (프로시저가 있으면 삭제)
delimiter $$
create procedure sp_tmp_insert(ic1 int, ic2 varchar(10), ic3 varchar(20))
begin
	insert into tmp values (ic1, ic2, ic3);
end $$
delimiter ;
call sp_tmp_insert(2, 'test2', 'qwerty2');
call sp_tmp_insert(3, 'test3', 'qwerty3');
call sp_tmp_insert(4, 'test4', 'qwerty4');

drop procedure if exists sp_tmp_update;		-- 프로시저를 잘못만들었을 경우 바로 삭제하기 위해서 (프로시저가 있으면 삭제)
delimiter $$
create procedure sp_tmp_update(ic1 int, ic2 varchar(10), ic3 varchar(20))
begin
	update tmp set c2 = ic2, c3 = ic3 where c1 = ic1;
end $$
delimiter ;
call sp_tmp_update(1, 'test1', 'qwerty1');

drop procedure if exists sp_tmp_delete;		-- 프로시저를 잘못만들었을 경우 바로 삭제하기 위해서 (프로시저가 있으면 삭제)
delimiter $$
create procedure sp_tmp_delete(ic1 int)
begin
	delete from tmp where c1 = ic1;
end $$
delimiter ;
call sp_tmp_delete(3);

drop procedure if exists sp_tmp_manage;		-- 프로시저를 잘못만들었을 경우 바로 삭제하기 위해서 (프로시저가 있으면 삭제)
delimiter $$
create procedure sp_tmp_manage(kind char(1), ic1 int, ic2 varchar(10), ic3 varchar(20))
begin
	if kind = 'i' then		-- insert이면
		insert into tmp values (ic1, ic2, ic3);		-- 실행문이 하나이므로 begin, end를 생략해도 문제없음
	elseif kind = 'u' then	-- update이면
		update tmp set c2 = ic2, c3 = ic3 where c1 = ic1;
	elseif kind = 'd' then	-- delete이면
		delete from tmp where c1 = ic1;
	end if;
end $$
delimiter ;
select * from tmp;
select * from tmp where c1 > 5;
select c1 + '10' from tmp;
call sp_tmp_manage('i', 5, 'test5', 'qwerty5');
call sp_tmp_manage('i', 6, 66, 666);
call sp_tmp_manage('i', '7', 777, 777);
call sp_tmp_manage('u', 4, 'test44', 'qwerty44');
call sp_tmp_manage('d', 2, '', '');

-- if문 테스트용 프로시저 sp_if_test
-- 점수를 score라는 매개변수로 받아와서 점수가 60이상이면 'D', 70이상이면 'C', 80이상이면 'B', 90이상이면 'A', 60미만이면 'F'로 출력되도록 작업
-- 단, 학점은 credit이라는 변수를 만들어 저장하고 그 값을 최후에 출력
-- 출력내용 : 점수 ==> ?? / 학점 ==> ?
drop procedure if exists sp_if_test;
delimiter $$
create procedure sp_if_test(score int)
begin
	declare credit char(1);
    if score >= 90 then
		set credit = 'A';
    elseif score >= 80 then
		set credit = 'B';
	elseif score >= 70 then
		set credit = 'C';
	elseif score >= 60 then
		set credit = 'D';
	else
		set credit = 'F';
	end if;
    select concat('점수 ==> ', score), concat('학점 ==> ', credit);
end $$
delimiter ;

call sp_if_test(100);
call sp_if_test(89);
call sp_if_test(70);
call sp_if_test(68);
call sp_if_test(39);

-- case문 이용 프로시저 sp_case_test
drop procedure if exists sp_case_test;
delimiter $$
create procedure sp_case_test(score int)
begin
	declare credit char(1);
    case
		when score >= 90 then
			set credit = 'A';
		when score >= 80 then
			set credit = 'B';
		when score >= 70 then
			set credit = 'C';
		when score >= 60 then
			set credit = 'D';
		else
			set credit = 'F';
	end case;
    select concat('점수 ==> ', score), concat('학점 ==> ', credit);
end $$
delimiter ;

call sp_case_test(100);
call sp_case_test(89);
call sp_case_test(70);
call sp_case_test(68);
call sp_case_test(39);

-- 1부터 100까지의 합을 구하여 출력하는 프로시저 sp_while_test() 제작
-- 출력내용 -> 1부터 100까지의 합 : 5050
-- 변수는 필요시 선언하여 사용하고, 선언과 동시에 초기화시켜 사용
drop procedure if exists sp_while_test;
delimiter $$
create procedure sp_while_test()
begin
	declare i int default 1;		-- 100까지 루프를 돌릴 때 사용할 변수
    declare sum int default 0;		-- 누적 합계를 저장할 변수
	while (i <= 100) do
		set sum = sum + i;
        set i = i + 1;
	end while;
    select concat('1부터 100까지의 합 : ', sum);
end $$
delimiter ;

call sp_while_test();

-- 1부터 100까지의 합을 구하여 출력하는 프로시저 sp_while_test2() 제작
-- 출력내용 -> 결과값 : ??
-- 단 7의 배수는 더하지 않고(iterate) 더한 값이 누적으로 1000이 넘으면 루프를 중지(leave)하고 출력
drop procedure if exists sp_while_test2;
delimiter $$
create procedure sp_while_test2()
begin
	declare i int default 0;		-- 100까지 루프를 돌릴 때 사용할 변수	iterate와 leave를 쓰기 위해 들어가자마자 1을 더해주기 위해 0부터 99까지 i를 돌림
    declare sum int default 0;		-- 누적 합계를 저장할 변수
	chkLabel:while (i < 100) do		-- iterate와 leave 사용을 위한 레이블 지정
		set i = i + 1;
		if i mod 7 = 0 then			-- 7의 배수일 경우 while로 돌아감
            iterate chkLabel;
        end if;
		set sum = sum + i;
        if sum >= 1000 then			-- sum이 1000이 넘으면 while문을 끝내고 출력	더하기 한 다음에 확인을 하고 빠져나감 이것 이후에 더할 경우 필요없는 검사를 하게됨
			leave chkLabel;
		end if;
	end while;
    select concat('결과값 : ', sum);
end $$
delimiter ;

call sp_while_test2();

-- 회원이 가입한지 며칠이 지났는지 출력하는 프로시저 sp_join_day()
-- 회원 아이디를 매개변수로 받아 해당 회원의 가입기간을 출력
-- 출력 -> ???님은 가입한지 ??일이 지났습니다.
drop procedure if exists sp_join_date;
delimiter $$
create procedure sp_join_date(uid varchar(20))
begin
	declare joinDate datetime;		-- 가입일을 저장할 변수
    declare curDate datetime;		-- 오늘 날짜를 저장할 변수
    declare dayCount int;			-- 가입기간(일단위)
    select mi_date into joinDate from t_member_info where mi_id = uid;
    -- 받아온 아이디를 이용하여 회원가입일을 joinDate변수에 저장
	set curDate = now();
    set dayCount = datediff(curDate, joinDate);
    -- joinDate부터 curDate까지의 기간을 일수로 리턴하여 dayCount변수에 저장
    select concat(uid, '님은 가입한지 ', dayCount, '일이 지났습니다.');
end $$
delimiter ;
call sp_join_date('test1');

-- 회원 주소록 테이블에 새로운 주소를 추가하는 프로시저 sp_member_addr_insert
-- 기본주소의 경우 회원 한명당 하나씩만 존재해야 함. 기본주소로 설정할 경우 기존에 있는 기본주소를 취소해야 함
drop procedure if exists sp_member_addr_insert;
delimiter $$
create procedure sp_member_addr_insert(miid varchar(20), mazip char(5), maaddr1 varchar(50), maaddr2 varchar(50), maname varchar(50), mareceiver varchar(50), mabasic char(1))
begin
	if mabasic = 'y' then	-- 추가하려는 주소가 기본주소일 경우 기존의 기본주소를 일반 주소로 변경해야 함
		update t_member_addr set ma_basic = 'n' where mi_id = miid and ma_basic = 'y';
	end if;
    
	insert into t_member_addr (mi_id, ma_zip, ma_addr1, ma_addr2, ma_name, ma_receiver, ma_basic) values (miid, mazip, maaddr1, maaddr2, maname, mareceiver, mabasic);
end $$
delimiter ;
call sp_member_addr_insert('asdf1', '23456', '부산시 연제구 양정동', '111-222', '집주소', '김우치', 'y');
call sp_member_addr_insert('asdf1', '56789', '부산시 연제구 양정4동', '111-333', '회사주소', '김우치', 'y');

select * from t_member_info;
select * from t_member_addr;
select * from t_member_point;

select * from t_member_info order by mi_date desc limit 5;	-- 최근 회원가입한 5명을 추출

-- 회원 포인트 사용 내역 추가 프로시저 sp_member_point_insert() 작업
drop procedure if exists sp_member_point_insert;
delimiter $$
create procedure sp_member_point_insert(miid varchar(20), mpissu char(1), mppoint int, mpdesc varchar(20), mpnum varchar(20))
begin
	declare pnt int default mppoint;
    if mpissu = 'u' then
		set pnt = mppoint * -1;
	end if;		-- 포인트 적립이 아닌 사용일 경우 사용된 포인트를 음수로 변경
    
	insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc, mp_num) values (miid, mpissu, mppoint, mpdesc, mpnum);
    
    update t_member_info set mi_point = mi_point + pnt where mi_id = miid;	-- 보유 포인트 변경
-- 	if mpissu = 's' then
-- 		update t_member_info set mi_point = mi_point + mppoint where mi_id = miid;
-- 	else
-- 		update t_member_info set mi_point = mi_point - mppoint where mi_id = miid;
-- 	end if;
end $$
delimiter ;
call sp_member_point_insert('test1', 's', 1500, '후기입력', '123');
delete from t_member_point where mp_idx = 9;

-- 회원 가입 프로시저 sp_member_info_insert()
-- 회원 가입시 가입축하금 자동 지급 부분도 함께 처리해야 함
drop procedure if exists sp_member_info_insert;
delimiter $$
create procedure sp_member_info_insert(miid varchar(20), mipw varchar(20), miname varchar(20), migender char(1), 
	mibirth char(10), miphone varchar(13), miemail varchar(50), miisad char(1), mipoint int)	-- point를 직접 받아와서 가입축하금이 바꼈을 때를 대비
begin
	insert into t_member_info (mi_id, mi_pw, mi_name, mi_gender, mi_birth, mi_phone, mi_email, mi_isad, mi_point) 
		value (miid, mipw, miname, migender, mibirth, miphone, miemail, miisad, mipoint);
	insert into t_member_point (mi_id, mp_issu, mp_point, mp_desc) values (miid, 's', mipoint, '가입축하금');
-- 	call sp_member_point_insert(miid, 's', 1000, '가입축하금', null);	-- 이렇게 할 경우 insert 2번, update가 한번 실행되는데 그것보다 t_member_info insert시 1000을 넣어주고 insert를 실행시키는 것이 좋음
end $$
delimiter ;
call sp_member_info_insert('test5', '1111', '허길동', 'm', '1999-09-09', '010-9876-5435', 'dong@test.com', 'n', 1000);

-- 회원 정보 변경 프로시저 sp_member_info_update()
-- 정보 변경(i), 비밀번호 변경(p), 회원 탈퇴(c) 및 휴면 계정(b) 변경
drop procedure if exists sp_member_info_update;
delimiter $$
create procedure sp_member_info_update(kind char(1), miid varchar(20), mipw varchar(20), miname varchar(20), mibirth char(10), 
	miphone varchar(13), miemail varchar(50), miisad char(1), mistatus char(1)) -- 바꿀값
begin
	if kind = 'i' then		-- 회원 정보 변경일 경우
		update t_member_info set mi_name = miname, mi_birth = mibirth, mi_phone = miphone, mi_email = miemail, mi_isad = miisad where mi_id = miid;
	elseif kind = 'p' then	-- 비밀번호 변경일 경우
		update t_member_info set mi_pw = mipw where mi_id = miid;
	else					-- 회원탈퇴나 휴면계정일 경우		-- 그럼 굳이 misstatus를 받아오지 않고 kind값으로 바꿔도 되지 않을까?
		update t_member_info set mi_status = mistatus where mi_id = miid;
	end if;
end $$
delimiter ;
call sp_member_info_update('i', 'test2', '', '전우치', '1998-06-16', '010-1111-2222', 'woochi@test.com', 'n', '');
call sp_member_info_update('p', 'test3', '1234', '', '', '', '', '', '');
call sp_member_info_update('c', 'test3', '', '', '', '', '', '', 'c');
