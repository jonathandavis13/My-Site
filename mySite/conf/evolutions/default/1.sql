# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table job (
  company                   varchar(255) not null,
  start_date                timestamp,
  end_date                  timestamp,
  summary                   varchar(255),
  month_length              double,
  location                  varchar(255),
  constraint pk_job primary key (company))
;

create table skill (
  name                      varchar(255) not null,
  constraint pk_skill primary key (name))
;

create table user (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_user primary key (email))
;

create sequence job_seq;

create sequence skill_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists job;

drop table if exists skill;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists job_seq;

drop sequence if exists skill_seq;

drop sequence if exists user_seq;

