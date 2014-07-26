-----------------------------------------------------
-- Export file for user USER001                    --
-- Created by Administrator on 2014/7/26, 10:57:28 --
-----------------------------------------------------

spool crm.log

prompt
prompt Creating table LG21
prompt ===================
prompt
create table LG21
(
  lg2101 NUMBER not null,
  lg2102 NVARCHAR2(10) not null,
  lg2103 NVARCHAR2(33) not null,
  lg2104 NVARCHAR2(33),
  lg2105 NVARCHAR2(3)
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
alter table LG21
  add constraint PK_LG21 primary key (LG2101)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table LG01
prompt ===================
prompt
create table LG01
(
  lg2101 NUMBER not null,
  lg0102 NVARCHAR2(31) not null,
  lg0103 NVARCHAR2(19) not null,
  lg0104 NVARCHAR2(50) not null,
  lg0105 NCHAR(12) not null,
  lg0106 NVARCHAR2(30) not null,
  lg0107 NVARCHAR2(20),
  lg0108 DATE not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
alter table LG01
  add constraint PK_LG01 primary key (LG2101)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG01
  add constraint FK_LG01_REFERENCE_LG21 foreign key (LG2101)
  references LG21 (LG2101);

prompt
prompt Creating table LG04
prompt ===================
prompt
create table LG04
(
  lg0401 NUMBER not null,
  lg0402 NVARCHAR2(20) not null,
  lg0403 NVARCHAR2(2) not null,
  lg0404 NUMBER(10,2) not null,
  lg0405 NUMBER(10,2) not null,
  lg0406 DATE not null,
  lg0407 DATE not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG04
  add constraint PK_LG04 primary key (LG0401)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table LG02
prompt ===================
prompt
create table LG02
(
  lg2101 NUMBER not null,
  lg0202 NVARCHAR2(31) not null,
  lg0203 NVARCHAR2(19) not null,
  lg0204 NVARCHAR2(50) not null,
  lg0205 NVARCHAR2(12) not null,
  lg0206 NVARCHAR2(30) not null,
  lg0401 NUMBER not null,
  lg0207 NVARCHAR2(2) not null,
  lg0208 DATE not null,
  lg0209 DATE not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
alter table LG02
  add constraint PK_LG02 primary key (LG2101)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG02
  add constraint FK_LG02_REFERENCE_LG04 foreign key (LG0401)
  references LG04 (LG0401);
alter table LG02
  add constraint FK_LG02_REFERENCE_LG21 foreign key (LG2101)
  references LG21 (LG2101);

prompt
prompt Creating table LG03
prompt ===================
prompt
create table LG03
(
  lg2101 NUMBER not null,
  lg0302 NVARCHAR2(31) not null,
  lg0303 NVARCHAR2(19) not null,
  lg0304 NVARCHAR2(50) not null,
  lg0305 NVARCHAR2(12) not null,
  lg0306 NVARCHAR2(30) not null,
  lg0401 NUMBER not null,
  lg0307 NVARCHAR2(2) not null,
  lg0308 DATE not null,
  lg0309 DATE not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG03
  add constraint PK_LG03 primary key (LG2101)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG03
  add constraint FK_LG03_REFERENCE_LG04 foreign key (LG0401)
  references LG04 (LG0401);
alter table LG03
  add constraint FK_LG03_REFERENCE_LG21 foreign key (LG2101)
  references LG21 (LG2101);

prompt
prompt Creating table LG05
prompt ===================
prompt
create table LG05
(
  lg0501 NUMBER not null,
  lg0502 NVARCHAR2(10) not null,
  lg0503 NVARCHAR2(20) not null,
  lg0504 NVARCHAR2(100) not null,
  lg0505 NUMBER(10,2) not null,
  lg0506 NUMBER(10,2) not null,
  lg0507 DATE not null,
  lg0508 DATE not null,
  lg0509 NVARCHAR2(2) not null,
  lg0510 NVARCHAR2(31) not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG05
  add constraint PK_LG05 primary key (LG0501)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table LG06
prompt ===================
prompt
create table LG06
(
  lg0601 NUMBER not null,
  lg2101 NUMBER not null,
  lg0501 NUMBER not null,
  lg0201 NUMBER,
  lg0602 NVARCHAR2(2) not null,
  lg0603 DATE not null,
  lg0604 DATE
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
alter table LG06
  add constraint PK_LG06 primary key (LG0601)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG06
  add constraint FK_LG06_REFERENCE_LG01 foreign key (LG2101)
  references LG01 (LG2101);
alter table LG06
  add constraint FK_LG06_REFERENCE_LG05 foreign key (LG0501)
  references LG05 (LG0501);

prompt
prompt Creating table LG07
prompt ===================
prompt
create table LG07
(
  lg0701 NUMBER not null,
  lg2101 NUMBER not null,
  lg0702 NVARCHAR2(20) not null,
  lg0703 NVARCHAR2(100) not null,
  lg0704 NUMBER(10,2) not null,
  lg0705 NUMBER not null,
  lg0706 DATE not null,
  lg0707 NVARCHAR2(2) not null,
  lg0708 DATE not null,
  lg0709 DATE not null,
  lg0710 DATE not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG07
  add constraint PK_LG07 primary key (LG0701)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG07
  add constraint FK_LG07_REFERENCE_LG03 foreign key (LG2101)
  references LG03 (LG2101);

prompt
prompt Creating table LG08
prompt ===================
prompt
create table LG08
(
  lg0801 NUMBER not null,
  lg2101 NUMBER not null,
  lg0701 NUMBER not null,
  lg0802 DATE not null,
  lg0803 DATE not null,
  lg0804 NVARCHAR2(2) not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG08
  add constraint PK_LG08 primary key (LG0801)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG08
  add constraint FK_LG08_REFERENCE_LG01 foreign key (LG2101)
  references LG01 (LG2101);
alter table LG08
  add constraint FK_LG08_REFERENCE_LG07 foreign key (LG0701)
  references LG07 (LG0701);

prompt
prompt Creating table LG09
prompt ===================
prompt
create table LG09
(
  lg0901 NUMBER not null,
  lg2101 NUMBER not null,
  lg0902 DATE not null,
  lg0903 DATE not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG09
  add constraint PK_LG09 primary key (LG0901)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG09
  add constraint FK_LG09_REFERENCE_LG03 foreign key (LG2101)
  references LG03 (LG2101);

prompt
prompt Creating table LG10
prompt ===================
prompt
create table LG10
(
  lg1001 NUMBER not null,
  lg0901 NUMBER not null,
  lg1002 NVARCHAR2(200) not null,
  lg1003 NVARCHAR2(2) not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG10
  add constraint PK_LG10 primary key (LG1001)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG10
  add constraint FK_LG10_REFERENCE_LG09 foreign key (LG0901)
  references LG09 (LG0901);

prompt
prompt Creating table LG11
prompt ===================
prompt
create table LG11
(
  lg1101 NUMBER not null,
  lg1001 NUMBER not null,
  lg1102 NVARCHAR2(30) not null,
  lg1103 NVARCHAR2(200)
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG11
  add constraint PK_LG11 primary key (LG1101)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG11
  add constraint FK_LG11_REFERENCE_LG10 foreign key (LG1001)
  references LG10 (LG1001);

prompt
prompt Creating table LG12
prompt ===================
prompt
create table LG12
(
  lg1201 NUMBER not null,
  lg1001 NUMBER not null,
  lg1101 NUMBER not null,
  lg1202 NVARCHAR2(2) not null,
  lg1203 NVARCHAR2(100)
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG12
  add constraint PK_LG12 primary key (LG1201)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG12
  add constraint FK_LG12_REFERENCE_LG10 foreign key (LG1001)
  references LG10 (LG1001);
alter table LG12
  add constraint FK_LG12_REFERENCE_LG11 foreign key (LG1101)
  references LG11 (LG1101);

prompt
prompt Creating table LG13
prompt ===================
prompt
create table LG13
(
  lg1301 NUMBER not null,
  lg1302 NVARCHAR2(10) not null,
  lg1303 VARCHAR2(10) not null,
  lg1304 NUMBER(10,2) not null,
  lg1305 NUMBER not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG13
  add constraint PK_LG13 primary key (LG1301)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table LG14
prompt ===================
prompt
create table LG14
(
  lg1401 NUMBER not null,
  lg2101 NUMBER not null,
  lg0301 NUMBER,
  lg1301 NUMBER,
  lg1402 DATE not null,
  lg1403 NVARCHAR2(2) not null,
  lg1404 DATE,
  lg1405 DATE,
  lg1406 NUMBER
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
alter table LG14
  add constraint PK_LG14 primary key (LG1401)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG14
  add constraint FK_LG14_REFERENCE_LG03 foreign key (LG0301)
  references LG03 (LG2101);
alter table LG14
  add constraint FK_LG14_REFERENCE_LG13 foreign key (LG1301)
  references LG13 (LG1301);

prompt
prompt Creating table LG15
prompt ===================
prompt
create table LG15
(
  lg1501 NUMBER not null,
  lg1502 NVARCHAR2(10) not null,
  lg1503 NVARCHAR2(2) not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG15
  add constraint PK_LG15 primary key (LG1501)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table LG16
prompt ===================
prompt
create table LG16
(
  lg1601 NUMBER not null,
  lg0201 NUMBER not null,
  lg0301 NUMBER not null,
  lg1501 NUMBER not null,
  lg1602 DATE not null,
  lg1603 NVARCHAR2(2) not null,
  lg1604 DATE not null,
  lg1605 DATE not null,
  lg1606 NUMBER(10,2) not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
alter table LG16
  add constraint PK_LG16 primary key (LG1601)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG16
  add constraint FK_LG16_REFERENCE_LG03 foreign key (LG0301)
  references LG03 (LG2101);
alter table LG16
  add constraint FK_LG16_REFERENCE_LG15 foreign key (LG1501)
  references LG15 (LG1501);

prompt
prompt Creating table LG17
prompt ===================
prompt
create table LG17
(
  lg1701 NUMBER not null,
  lg1702 NVARCHAR2(10) not null,
  lg1703 NVARCHAR2(2) not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG17
  add constraint PK_LG17 primary key (LG1701)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table LG18
prompt ===================
prompt
create table LG18
(
  lg1801 NUMBER not null,
  lg0101 NUMBER not null,
  lg0201 NUMBER,
  lg1701 NUMBER,
  lg1802 DATE not null,
  lg1803 DATE not null,
  lg1804 NVARCHAR2(2) not null,
  lg1805 NVARCHAR2(200)
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
alter table LG18
  add constraint PK_LG18 primary key (LG1801)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG18
  add constraint FK_LG18_REFERENCE_LG01 foreign key (LG0101)
  references LG01 (LG2101);
alter table LG18
  add constraint FK_LG18_REFERENCE_LG17 foreign key (LG1701)
  references LG17 (LG1701);

prompt
prompt Creating table LG19
prompt ===================
prompt
create table LG19
(
  lg1901 NUMBER not null,
  lg0101 NUMBER not null,
  lg0201 NUMBER not null,
  lg1801 NUMBER not null,
  lg1902 NVARCHAR2(2) not null,
  lg1903 DATE not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
alter table LG19
  add constraint PK_LG19 primary key (LG1901)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG19
  add constraint FK_LG19_REFERENCE_LG01 foreign key (LG0101)
  references LG01 (LG2101);

prompt
prompt Creating table LG20
prompt ===================
prompt
create table LG20
(
  lg2001 NUMBER not null,
  lg0101 NUMBER not null,
  lg0201 NUMBER,
  lg2002 NVARCHAR2(200) not null,
  lg2003 NVARCHAR2(200),
  lg2004 DATE not null,
  lg2005 DATE,
  lg2006 NUMBER,
  lg2007 NVARCHAR2(2)
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 8K
    minextents 1
    maxextents unlimited
  );
alter table LG20
  add constraint PK_LG20 primary key (LG2001)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table LG20
  add constraint FK_LG20_REFERENCE_LG01 foreign key (LG0101)
  references LG01 (LG2101);

prompt
prompt Creating table LG22
prompt ===================
prompt
create table LG22
(
  lg2201 NUMBER not null,
  lg0101 NUMBER not null,
  lg0201 NUMBER not null,
  lg2001 NUMBER not null,
  lg2202 NVARCHAR2(2) not null,
  lg2203 DATE not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255;
alter table LG22
  add constraint PK_LG22 primary key (LG2201)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255;
alter table LG22
  add constraint FK_LG22_REFERENCE_LG01 foreign key (LG0101)
  references LG01 (LG2101);
alter table LG22
  add constraint FK_LG22_REFERENCE_LG20 foreign key (LG2001)
  references LG20 (LG2001);

prompt
prompt Creating table SYSCODE
prompt ======================
prompt
create table SYSCODE
(
  fid    NUMBER not null,
  fname  NVARCHAR2(20) not null,
  fcode  NVARCHAR2(20) not null,
  fvalue NVARCHAR2(20) not null,
  pfcode NVARCHAR2(20) not null
)
tablespace USER001
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table SYSCODE
  add constraint PK_SYSCODE primary key (FID)
  using index 
  tablespace USER001
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating sequence S_AB01
prompt ========================
prompt
create sequence S_AB01
minvalue 1
maxvalue 9999999999999999999999999999
start with 241
increment by 1
cache 20;

prompt
prompt Creating sequence S_AC01
prompt ========================
prompt
create sequence S_AC01
minvalue 1
maxvalue 9999999999999999999999999999
start with 81
increment by 1
cache 20;

prompt
prompt Creating sequence S_AC02
prompt ========================
prompt
create sequence S_AC02
minvalue 1
maxvalue 9999999999999999999999999999
start with 61
increment by 1
cache 20;

prompt
prompt Creating sequence S_AC03
prompt ========================
prompt
create sequence S_AC03
minvalue 1
maxvalue 9999999999999999999999999999
start with 41
increment by 1
cache 20;

prompt
prompt Creating sequence S_AC04
prompt ========================
prompt
create sequence S_AC04
minvalue 1
maxvalue 9999999999999999999999999999
start with 41
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG01
prompt ========================
prompt
create sequence S_LG01
minvalue 1
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG02
prompt ========================
prompt
create sequence S_LG02
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG03
prompt ========================
prompt
create sequence S_LG03
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG04
prompt ========================
prompt
create sequence S_LG04
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG05
prompt ========================
prompt
create sequence S_LG05
minvalue 1
maxvalue 9999999999999999999999999999
start with 61
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG06
prompt ========================
prompt
create sequence S_LG06
minvalue 1
maxvalue 9999999999999999999999999999
start with 210
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG07
prompt ========================
prompt
create sequence S_LG07
minvalue 1
maxvalue 9999999999999999999999999999
start with 81
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG08
prompt ========================
prompt
create sequence S_LG08
minvalue 1
maxvalue 9999999999999999999999999999
start with 81
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG09
prompt ========================
prompt
create sequence S_LG09
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG10
prompt ========================
prompt
create sequence S_LG10
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG11
prompt ========================
prompt
create sequence S_LG11
minvalue 1
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG12
prompt ========================
prompt
create sequence S_LG12
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG13
prompt ========================
prompt
create sequence S_LG13
minvalue 1
maxvalue 9999999999999999999999999999
start with 141
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG14
prompt ========================
prompt
create sequence S_LG14
minvalue 1
maxvalue 9999999999999999999999999999
start with 81
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG15
prompt ========================
prompt
create sequence S_LG15
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG16
prompt ========================
prompt
create sequence S_LG16
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG17
prompt ========================
prompt
create sequence S_LG17
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG18
prompt ========================
prompt
create sequence S_LG18
minvalue 1
maxvalue 9999999999999999999999999999
start with 101
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG19
prompt ========================
prompt
create sequence S_LG19
minvalue 1
maxvalue 9999999999999999999999999999
start with 61
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG20
prompt ========================
prompt
create sequence S_LG20
minvalue 1
maxvalue 9999999999999999999999999999
start with 61
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG21
prompt ========================
prompt
create sequence S_LG21
minvalue 1
maxvalue 9999999999999999999999999999
start with 240
increment by 1
cache 20;

prompt
prompt Creating sequence S_LG22
prompt ========================
prompt
create sequence S_LG22
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_PC01
prompt ========================
prompt
create sequence S_PC01
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_PC02
prompt ========================
prompt
create sequence S_PC02
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_PC03
prompt ========================
prompt
create sequence S_PC03
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
cache 20;

prompt
prompt Creating sequence S_PS01
prompt ========================
prompt
create sequence S_PS01
minvalue 1
maxvalue 9999999999999999999999999999
start with 21
increment by 1
cache 20;

prompt
prompt Creating sequence S_SYS
prompt =======================
prompt
create sequence S_SYS
minvalue 1
maxvalue 9999999999999999999999999999
start with 110
increment by 1
cache 20;


spool off
