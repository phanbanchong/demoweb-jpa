CREATE TABLE customer (
	id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
	first_name varchar NULL,
	last_name varchar NULL,
	email varchar NULL,
	CONSTRAINT customer_pk PRIMARY KEY (id)
)