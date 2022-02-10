CREATE SCHEMA IF NOT EXISTS dummy;

SET search_path TO dummy, public;

CREATE sequence IF NOT EXISTS dummy.location_id_seq
    INCREMENT BY 1
    MINVALUE 1
    START WITH 1
;

CREATE TABLE IF NOT EXISTS dummy.location (
    location_id INTEGER NOT NULL DEFAULT nextval('dummy.location_id_seq'::regclass) ,
    country VARCHAR,
    state VARCHAR,
    county VARCHAR,
    CONSTRAINT location_pkey PRIMARY KEY (location_id)
);


