use test;

set global log_bin_trust_function_creators = 1;
-- 함수 생성을 위해 현재 로그인한 사용자에게 함수 생성 권한을 줌 (1 = true)

-- 두 개의 정수를 받아 두 정수의 합을 리턴하는 함수 fn_add() 생성 및 실행
drop function if exists fn_add;
delimiter $$
create function fn_add(n1 int, n2 int) returns int
begin
	declare result int;
    set result = n1 + n2;
	return result;
end $$
delimiter ;
select fn_add(10, 20);

-- 회원 아이디를 매개변수로 받아 해당 회원의 나이를 계산하여 리턴하는 fn_get_age() 함수 생성
drop function if exists fn_get_age;
delimiter $$
create function fn_get_age(miid varchar(20)) returns int
begin
	declare mibirth varchar(10);
    select mi_birth into mibirth from t_member_info where mi_id = miid;
    set mibirth = left(mibirth, 4);
	return year(now()) - mibirth;
end $$
delimiter ;
select fn_get_age('test1');

select * from t_member_info;