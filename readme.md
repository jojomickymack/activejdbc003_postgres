## activejdbc004_postgres

this is a 'hello world' project using gradle to load dependencies for activejdbc using postgres. The steps below explain how to create the expected database.


create user jdbc_user with password 'password123';

alter user jdbc_user createdb;

create database java_database;

grant all privileges on database java_database to jdbc_user;

\c java_database

create table cats(id serial primary key, name text, color text);

grant all privileges on all tables in schema public to jdbc_user;  
grant all privileges on all sequences in schema public to jdbc_user;
