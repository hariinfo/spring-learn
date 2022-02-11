CREATE SCHEMA IF NOT EXISTS dummy;

SET search_path TO dummy, public;

create sequence patient_registration_id_seq
increment 1
start 10
minvalue 10;

create table patient (
patient_id integer not null CONSTRAINT PATIENT_PKEY PRIMARY KEY  default nextval('patient_registration_id_seq'),
first_name varchar not null,
last_name varchar not null
);


