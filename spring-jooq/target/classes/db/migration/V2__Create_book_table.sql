CREATE sequence IF NOT EXISTS book_id_seq
    INCREMENT BY 1
    MINVALUE 1
    START WITH 1
;

CREATE TABLE IF NOT EXISTS books (
    book_id INTEGER NOT NULL DEFAULT nextval('book_id_seq'::regclass) ,
    genre VARCHAR,
    title VARCHAR,
    author VARCHAR,
    price numeric(3,2)
);