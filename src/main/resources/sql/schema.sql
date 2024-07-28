CREATE SEQUENCE IF NOT EXISTS your_sequence_name
    START WITH 1
    INCREMENT BY 1
    MINVALUE 1
    NOMAXVALUE
    NOCYCLE
    CACHE 10
    ORDER;

CREATE TABLE tbl_user (
    id INT DEFAULT nextval('your_sequence_name'),
    name VARCHAR(100)
);