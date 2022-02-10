CREATE sequence IF NOT EXISTS dummy.book_id_seq
    INCREMENT BY 1
    MINVALUE 1
    START WITH 1
;

CREATE TABLE IF NOT EXISTS dummy.books (
    book_id INTEGER NOT NULL DEFAULT nextval('dummy.book_id_seq'::regclass) ,
    genre VARCHAR,
    title VARCHAR,
    author VARCHAR,
    price numeric(3,2)
);